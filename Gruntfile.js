/*global module:false*/

const fs = require('fs');

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  function bumpVersion(version) {
    const parts = version.split('.');
    parts[2] = parseInt(parts[2]) + 1;
    return parts.join('.');
  }
  
  const SWAGGER_VERSION = "2.2.3";
  const PHP_CLIENT_VERSION = require(__dirname + '/php-generated/linkedevents-client-php/composer.json').version;
  const NEXT_PHP_CLIENT_VERSION = bumpVersion(PHP_CLIENT_VERSION);
  
  grunt.registerMultiTask('json-update', 'Updates JSON -file', function () {
    const json = JSON.parse(fs.readFileSync(this.data.file));
    fs.writeFileSync(this.data.file, JSON.stringify(Object.assign(json, this.data.fields), null, 2));
  });
  
  grunt.initConfig({
    'clean': {
      'java-cruft': [
        'java-generated/docs', 
        'java-generated/gradle', 
        'java-generated/build.gradle',
        'java-generated/build.sbt',
        'java-generated/git_push.sh',
        'java-generated/gradle.properties',
        'java-generated/gradlew',
        'java-generated/gradlew.bat',
        'java-generated/LICENSE',
        'java-generated/README.md',
        'java-generated/settings.gradle',
        'java-generated/src/test',
        'java-generated/src/main/AndroidManifest.xml',
        'java-generated/src/main/java/io',
        'java-generated/src/main/java/fi/metatavu/linkedevents/auth',
        'java-generated/src/main/java/fi/metatavu/linkedevents/*.java'
      ],
      'java-sources': ['java-generated/src']
    },
    'copy': {
      'java-extras': {
        src: '**',
        dest: 'java-generated',
        cwd: 'java-extras',
        expand: true
      },
      'javascript-extras': {
        src: '**',
        dest: 'javascript-generated',
        cwd: 'javascript-extras',
        expand: true
      }
    },
    'curl': {
      'swagger-codegen':  {
        src: `http://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/${SWAGGER_VERSION}/swagger-codegen-cli-${SWAGGER_VERSION}.jar`,
        dest: 'swagger-codegen-cli.jar'
      }
    },
    'shell': {
      'java-generate-client': {
        command : 'mv java-generated/pom.xml java-generated/pom.xml.before && ' +
          'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./linked-events.swagger.yaml ' +
          '-l java ' +
          '--api-package fi.metatavu.linkedevents.client ' +
          '--model-package fi.metatavu.linkedevents.client.model ' +
          '--group-id fi.metatavu.linkedevents ' +
          '--artifact-id linkedevents-client ' +
          '--artifact-version `cat java-generated/pom.xml.before|grep version -m 1|sed -e \'s/.*<version>//\'|sed -e \'s/<.*//\'` ' +
          '--template-dir java-templates ' +
          '--library jersey2 ' +
          '--additional-properties dateLibrary=special ' +
          '--type-mappings DateTime="@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor" ' +
          '-o java-generated/'
      },
      'java-install': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'java-generated'
          }
        }
      },
      'java-release': {
        command : 'git add src pom.xml && git commit -m "Generated source" && git push && mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'java-generated'
          }
        }
      },
      'php-generate-client': {
        command : 'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./linked-events.swagger.yaml ' +
          '-l php ' +
          '--template-dir php-templates ' +
          '-o php-generated ' +
          '--additional-properties packagePath=linkedevents-client-php,composerVendorName=metatavu,composerProjectName=linkedevents-php-client,variableNamingConvention=camelCase,invokerPackage=Metatavu\\\\LinkedEvents,apiPackage=Client,modelPackage=Model,artifactVersion=' + NEXT_PHP_CLIENT_VERSION
      },
      'php-client-publish': {
        command : 'sh git_push.sh',
        options: {
          execOptions: {
            cwd: 'php-generated/linkedevents-client-php'
          }
        }
      },
      'javascript-generate': {
        command : 'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./linked-events.swagger.yaml ' +
          '-l javascript ' +
          '-o javascript-generated/ ' +
          '--additional-properties usePromises=true,projectName=linkedevents-client,projectVersion='  + require('./javascript-generated/package.json').version
      },
      'javascript-bump-version': {
        command: 'npm version patch',
        options: {
          execOptions: {
            cwd: 'javascript-generated'
          }
        }
      },
      'javascript-push': {
        command : 'git add . && git commit -m "Generated javascript source" ; git push',
        options: {
          execOptions: {
            cwd: 'javascript-generated'
          }
        }
      },
      'javascript-publish': {
        command : 'npm publish',
        options: {
          execOptions: {
            cwd: 'javascript-generated'
          }
        }
      }
    },
    'json-update': {
      'php-composer': {
        'file': 'php-generated/linkedevents-client-php/composer.json',
        'license': 'LGPLv3'
      },
      'javascript-package': {
        'file': 'javascript-generated/package.json',
        'fields': {
          "author": "Metatavu Oy",
          "license": "AGPL-3.0",
          "repository": {
            "type": "git",
            "url": "git://github.com/Metatavu/linkedevents-client.git"
          }
        }
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('javagen', [ 'clean:java-sources', 'shell:java-generate-client', 'clean:java-cruft', 'copy:java-extras', 'shell:java-install']);
  grunt.registerTask('java', [ 'javagen', 'shell:java-release' ]);
  grunt.registerTask('php', [ 'shell:php-generate-client', 'json-update:php-composer', 'shell:php-client-publish' ]);
  grunt.registerTask('javascriptgen', [ 'shell:javascript-generate', 'json-update:javascript-package', 'copy:javascript-extras']);
  grunt.registerTask('javascript', [ 'javascriptgen', 'shell:javascript-bump-version', 'shell:javascript-push', 'shell:javascript-publish']);
  
  grunt.registerTask('default', ['download-dependencies', 'java', 'php', 'javascript']);
  
};