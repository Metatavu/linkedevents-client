/*
 * Linked Events information API
 * Linked Events provides categorized data on events and places using JSON-LD format.  Events can be searched by date and location. Location can be exact address or larger area such as neighbourhood or borough  JSON-LD format is streamlined using include mechanism. API users can request that certain fields are included directly into the result, instead of being hyperlinks to objects.  Several fields are multilingual. These are implemented as object with each language variant as property. In this specification each multilingual field has (fi,sv,en) property triplet as example.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fi.metatavu.linkedevents.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Translation for the language name. Properties shown here are examples, it is suggested that every language supported has its name translated to every other language. Users of the API cannot rely on any translations being present.
 */
@ApiModel(description = "Translation for the language name. Properties shown here are examples, it is suggested that every language supported has its name translated to every other language. Users of the API cannot rely on any translations being present.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-29T10:50:40.740+03:00")
public class LanguageName {
  @JsonProperty("fi")
  private String fi = null;

  @JsonProperty("sv")
  private String sv = null;

  @JsonProperty("en")
  private String en = null;

  public LanguageName fi(String fi) {
    this.fi = fi;
    return this;
  }

   /**
   * Name of the language in Finnish
   * @return fi
  **/
  @ApiModelProperty(value = "Name of the language in Finnish")
  public String getFi() {
    return fi;
  }

  public void setFi(String fi) {
    this.fi = fi;
  }

  public LanguageName sv(String sv) {
    this.sv = sv;
    return this;
  }

   /**
   * Name of the language in Swedish
   * @return sv
  **/
  @ApiModelProperty(value = "Name of the language in Swedish")
  public String getSv() {
    return sv;
  }

  public void setSv(String sv) {
    this.sv = sv;
  }

  public LanguageName en(String en) {
    this.en = en;
    return this;
  }

   /**
   * Name of the language in English
   * @return en
  **/
  @ApiModelProperty(value = "Name of the language in English")
  public String getEn() {
    return en;
  }

  public void setEn(String en) {
    this.en = en;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageName languageName = (LanguageName) o;
    return Objects.equals(this.fi, languageName.fi) &&
        Objects.equals(this.sv, languageName.sv) &&
        Objects.equals(this.en, languageName.en);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fi, sv, en);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageName {\n");
    
    sb.append("    fi: ").append(toIndentedString(fi)).append("\n");
    sb.append("    sv: ").append(toIndentedString(sv)).append("\n");
    sb.append("    en: ").append(toIndentedString(en)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

