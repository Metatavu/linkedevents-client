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
 * Price of the event. These are not bare numbers but instead descriptions of the pricing scheme.
 */
@ApiModel(description = "Price of the event. These are not bare numbers but instead descriptions of the pricing scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-29T14:33:12.803+03:00")
public class OfferPrice {
  @JsonProperty("fi")
  private String fi = null;

  @JsonProperty("sv")
  private String sv = null;

  @JsonProperty("en")
  private String en = null;

  public OfferPrice fi(String fi) {
    this.fi = fi;
    return this;
  }

   /**
   * Finnish translation for the price information
   * @return fi
  **/
  @ApiModelProperty(value = "Finnish translation for the price information")
  public String getFi() {
    return fi;
  }

  public void setFi(String fi) {
    this.fi = fi;
  }

  public OfferPrice sv(String sv) {
    this.sv = sv;
    return this;
  }

   /**
   * Swedish translation for the price information
   * @return sv
  **/
  @ApiModelProperty(value = "Swedish translation for the price information")
  public String getSv() {
    return sv;
  }

  public void setSv(String sv) {
    this.sv = sv;
  }

  public OfferPrice en(String en) {
    this.en = en;
    return this;
  }

   /**
   * English translation for the price information
   * @return en
  **/
  @ApiModelProperty(value = "English translation for the price information")
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
    OfferPrice offerPrice = (OfferPrice) o;
    return Objects.equals(this.fi, offerPrice.fi) &&
        Objects.equals(this.sv, offerPrice.sv) &&
        Objects.equals(this.en, offerPrice.en);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fi, sv, en);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPrice {\n");
    
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

