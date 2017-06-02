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
import fi.metatavu.linkedevents.client.model.OfferDescription;
import fi.metatavu.linkedevents.client.model.OfferInfoUrl;
import fi.metatavu.linkedevents.client.model.OfferPrice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * information record for this event. The prices are not in a structured format and the format depends on information source. An exception to this is the case of free event. These are indicated using is_free flag, which is searchable.
 */
@ApiModel(description = "information record for this event. The prices are not in a structured format and the format depends on information source. An exception to this is the case of free event. These are indicated using is_free flag, which is searchable.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T10:07:32.014+03:00")
public class Offer {
  @JsonProperty("price")
  private OfferPrice price = null;

  @JsonProperty("info_url")
  private OfferInfoUrl infoUrl = null;

  @JsonProperty("description")
  private OfferDescription description = null;

  @JsonProperty("is_free")
  private Boolean isFree = null;

  public Offer price(OfferPrice price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "")
  public OfferPrice getPrice() {
    return price;
  }

  public void setPrice(OfferPrice price) {
    this.price = price;
  }

  public Offer infoUrl(OfferInfoUrl infoUrl) {
    this.infoUrl = infoUrl;
    return this;
  }

   /**
   * Get infoUrl
   * @return infoUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public OfferInfoUrl getInfoUrl() {
    return infoUrl;
  }

  public void setInfoUrl(OfferInfoUrl infoUrl) {
    this.infoUrl = infoUrl;
  }

  public Offer description(OfferDescription description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public OfferDescription getDescription() {
    return description;
  }

  public void setDescription(OfferDescription description) {
    this.description = description;
  }

  public Offer isFree(Boolean isFree) {
    this.isFree = isFree;
    return this;
  }

   /**
   * Whether the event is of free admission
   * @return isFree
  **/
  @ApiModelProperty(example = "null", value = "Whether the event is of free admission")
  public Boolean getIsFree() {
    return isFree;
  }

  public void setIsFree(Boolean isFree) {
    this.isFree = isFree;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(this.price, offer.price) &&
        Objects.equals(this.infoUrl, offer.infoUrl) &&
        Objects.equals(this.description, offer.description) &&
        Objects.equals(this.isFree, offer.isFree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, infoUrl, description, isFree);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offer {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    infoUrl: ").append(toIndentedString(infoUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isFree: ").append(toIndentedString(isFree)).append("\n");
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

