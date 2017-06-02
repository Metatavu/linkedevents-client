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
import fi.metatavu.linkedevents.client.model.ImageName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Images are used as pictures for events, places and organizers.
 */
@ApiModel(description = "Images are used as pictures for events, places and organizers.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T10:07:32.014+03:00")
public class Image {
  @JsonProperty("name")
  private ImageName name = null;

  @JsonProperty("publisher")
  private String publisher = null;

  @JsonProperty("created_time")
  private OffsetDateTime createdTime = null;

  @JsonProperty("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("last_modified_by")
  private String lastModifiedBy = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("cropping")
  private String cropping = null;

  public Image name(ImageName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public ImageName getName() {
    return name;
  }

  public void setName(ImageName name) {
    this.name = name;
  }

  public Image publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * The organization responsible for the image.
   * @return publisher
  **/
  @ApiModelProperty(example = "null", value = "The organization responsible for the image.")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public Image createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Creation time for the image.
   * @return createdTime
  **/
  @ApiModelProperty(example = "null", value = "Creation time for the image.")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public Image lastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * Time this image was modified in the datastore behind the API (not necessarily in the originating system)
   * @return lastModifiedTime
  **/
  @ApiModelProperty(example = "null", value = "Time this image was modified in the datastore behind the API (not necessarily in the originating system)")
  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public Image createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * URL reference to the user that created this record (user endpoint)
   * @return createdBy
  **/
  @ApiModelProperty(example = "null", value = "URL reference to the user that created this record (user endpoint)")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Image lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * URL reference to the user that last modfied this record (user endpoint)
   * @return lastModifiedBy
  **/
  @ApiModelProperty(example = "null", value = "URL reference to the user that last modfied this record (user endpoint)")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public Image url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The image file URL.
   * @return url
  **/
  @ApiModelProperty(example = "null", required = true, value = "The image file URL.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Image cropping(String cropping) {
    this.cropping = cropping;
    return this;
  }

   /**
   * Cropping data for the image.
   * @return cropping
  **/
  @ApiModelProperty(example = "null", value = "Cropping data for the image.")
  public String getCropping() {
    return cropping;
  }

  public void setCropping(String cropping) {
    this.cropping = cropping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.name, image.name) &&
        Objects.equals(this.publisher, image.publisher) &&
        Objects.equals(this.createdTime, image.createdTime) &&
        Objects.equals(this.lastModifiedTime, image.lastModifiedTime) &&
        Objects.equals(this.createdBy, image.createdBy) &&
        Objects.equals(this.lastModifiedBy, image.lastModifiedBy) &&
        Objects.equals(this.url, image.url) &&
        Objects.equals(this.cropping, image.cropping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, publisher, createdTime, lastModifiedTime, createdBy, lastModifiedBy, url, cropping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    cropping: ").append(toIndentedString(cropping)).append("\n");
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

