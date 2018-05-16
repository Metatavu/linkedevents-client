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
 * Links to entities that the event publisher considers related to this event. Eg. links to catering service available during theatrical production. The links will most likely point to unstructured content, ie. web pages suitable for human viewing.
 */
@ApiModel(description = "Links to entities that the event publisher considers related to this event. Eg. links to catering service available during theatrical production. The links will most likely point to unstructured content, ie. web pages suitable for human viewing.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-16T12:41:25.889+03:00")
public class Eventlink {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("language")
  private String language = null;

  public Eventlink name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name describing contents of the link
   * @return name
  **/
  @ApiModelProperty(value = "Name describing contents of the link")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Eventlink link(String link) {
    this.link = link;
    return this;
  }

   /**
   * link to an external related entity
   * @return link
  **/
  @ApiModelProperty(value = "link to an external related entity")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Eventlink language(String language) {
    this.language = language;
    return this;
  }

   /**
   * language of the content behind the link
   * @return language
  **/
  @ApiModelProperty(value = "language of the content behind the link")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eventlink eventlink = (Eventlink) o;
    return Objects.equals(this.name, eventlink.name) &&
        Objects.equals(this.link, eventlink.link) &&
        Objects.equals(this.language, eventlink.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, link, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eventlink {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

