/*global module:false*/

var fs = require('fs');

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  grunt.initConfig({
    'clean': {
      'cruft': [
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
      'sources': ['java-generated/src']
    },
    'copy': {
      'java-extras': {
        src: '**',
        dest: 'java-generated',
        cwd: 'java-extras',
        expand: true
      }
    },
    'curl': {
      'swagger-codegen':  {
        src: 'http://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.2.2/swagger-codegen-cli-2.2.2.jar',
        dest: 'swagger-codegen-cli.jar'
      }
    },
    'shell': {
      'generate-java-client': {
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
          '--additional-properties dateLibrary=java8 ' +
          '-o java-generated/'
      },
      'install': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'java-generated'
          }
        }
      },
      'release': {
        command : 'git add src pom.xml && git commit -m "Generated source" && git push && mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'java-generated'
          }
        }
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('default', ['download-dependencies', 'clean:sources', 'shell:generate-java-client', 'clean:cruft', 'copy:java-extras', 'shell:install', 'shell:release' ]);
  
};
