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
 * Further description of the pricing
 */
@ApiModel(description = "Further description of the pricing")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-29T14:33:12.803+03:00")
public class OfferDescription {
  @JsonProperty("fi")
  private String fi = null;

  @JsonProperty("sv")
  private String sv = null;

  @JsonProperty("en")
  private String en = null;

  public OfferDescription fi(String fi) {
    this.fi = fi;
    return this;
  }

   /**
   * Finnish price description
   * @return fi
  **/
  @ApiModelProperty(value = "Finnish price description")
  public String getFi() {
    return fi;
  }

  public void setFi(String fi) {
    this.fi = fi;
  }

  public OfferDescription sv(String sv) {
    this.sv = sv;
    return this;
  }

   /**
   * Swedish price description
   * @return sv
  **/
  @ApiModelProperty(value = "Swedish price description")
  public String getSv() {
    return sv;
  }

  public void setSv(String sv) {
    this.sv = sv;
  }

  public OfferDescription en(String en) {
    this.en = en;
    return this;
  }

   /**
   * English price description
   * @return en
  **/
  @ApiModelProperty(value = "English price description")
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
    OfferDescription offerDescription = (OfferDescription) o;
    return Objects.equals(this.fi, offerDescription.fi) &&
        Objects.equals(this.sv, offerDescription.sv) &&
        Objects.equals(this.en, offerDescription.en);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fi, sv, en);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDescription {\n");
    
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

