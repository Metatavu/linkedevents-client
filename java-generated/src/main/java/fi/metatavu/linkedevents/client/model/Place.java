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
import fi.metatavu.linkedevents.client.model.Image;
import fi.metatavu.linkedevents.client.model.PlaceAddressLocality;
import fi.metatavu.linkedevents.client.model.PlaceCustomData;
import fi.metatavu.linkedevents.client.model.PlaceDescription;
import fi.metatavu.linkedevents.client.model.PlaceInfoUrl;
import fi.metatavu.linkedevents.client.model.PlaceName;
import fi.metatavu.linkedevents.client.model.PlacePosition;
import fi.metatavu.linkedevents.client.model.PlaceStreetAddress;
import fi.metatavu.linkedevents.client.model.PlaceTelephone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Places describe physical locations for events and means for contacting people responsible for these locations. Place definitions come from organizations publishing events (field \&quot;publisher\&quot;) and can thus have slightly different semantics between places sourced from different organizations.
 */
@ApiModel(description = "Places describe physical locations for events and means for contacting people responsible for these locations. Place definitions come from organizations publishing events (field \"publisher\") and can thus have slightly different semantics between places sourced from different organizations.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-16T12:41:25.889+03:00")
public class Place {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("custom_data")
  private List<PlaceCustomData> customData = null;

  @JsonProperty("name")
  private PlaceName name = null;

  @JsonProperty("images")
  private List<Image> images = null;

  @JsonProperty("origin_id")
  private String originId = null;

  @JsonProperty("created_time")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor createdTime = null;

  @JsonProperty("last_modified_time")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor lastModifiedTime = null;

  @JsonProperty("info_url")
  private PlaceInfoUrl infoUrl = null;

  @JsonProperty("description")
  private PlaceDescription description = null;

  @JsonProperty("position")
  private PlacePosition position = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("telephone")
  private PlaceTelephone telephone = null;

  @JsonProperty("contact_type")
  private String contactType = null;

  @JsonProperty("street_address")
  private PlaceStreetAddress streetAddress = null;

  @JsonProperty("address_locality")
  private PlaceAddressLocality addressLocality = null;

  @JsonProperty("address_region")
  private String addressRegion = null;

  @JsonProperty("postal_code")
  private String postalCode = null;

  @JsonProperty("post_office_box_num")
  private String postOfficeBoxNum = null;

  @JsonProperty("address_country")
  private String addressCountry = null;

  @JsonProperty("deleted")
  private Boolean deleted = null;

  @JsonProperty("data_source")
  private String dataSource = null;

  @JsonProperty("publisher")
  private String publisher = null;

  public Place id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Consists of source prefix and source specific identifier. These should be URIs uniquely identifying the place, and preferably also well formed http-URLs pointing to more information about the place.
   * @return id
  **/
  @ApiModelProperty(value = "Consists of source prefix and source specific identifier. These should be URIs uniquely identifying the place, and preferably also well formed http-URLs pointing to more information about the place.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Place customData(List<PlaceCustomData> customData) {
    this.customData = customData;
    return this;
  }

  public Place addCustomDataItem(PlaceCustomData customDataItem) {
    if (this.customData == null) {
      this.customData = new ArrayList<PlaceCustomData>();
    }
    this.customData.add(customDataItem);
    return this;
  }

   /**
   * Key value field for custom data. FIXME: is there 6Aika-wide use case for this?
   * @return customData
  **/
  @ApiModelProperty(value = "Key value field for custom data. FIXME: is there 6Aika-wide use case for this?")
  public List<PlaceCustomData> getCustomData() {
    return customData;
  }

  public void setCustomData(List<PlaceCustomData> customData) {
    this.customData = customData;
  }

  public Place name(PlaceName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public PlaceName getName() {
    return name;
  }

  public void setName(PlaceName name) {
    this.name = name;
  }

  public Place images(List<Image> images) {
    this.images = images;
    return this;
  }

  public Place addImagesItem(Image imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<Image>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")
  public List<Image> getImages() {
    return images;
  }

  public void setImages(List<Image> images) {
    this.images = images;
  }

  public Place originId(String originId) {
    this.originId = originId;
    return this;
  }

   /**
   * Place identifier in the originating system, these should be in same format as id but variations are more likely than with id.
   * @return originId
  **/
  @ApiModelProperty(value = "Place identifier in the originating system, these should be in same format as id but variations are more likely than with id.")
  public String getOriginId() {
    return originId;
  }

  public void setOriginId(String originId) {
    this.originId = originId;
  }

  public Place createdTime(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Creation time for the place entry.
   * @return createdTime
  **/
  @ApiModelProperty(value = "Creation time for the place entry.")
  public @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor createdTime) {
    this.createdTime = createdTime;
  }

  public Place lastModifiedTime(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * Time this place was modified in the datastore behind the API (not necessarily in the originating system)
   * @return lastModifiedTime
  **/
  @ApiModelProperty(value = "Time this place was modified in the datastore behind the API (not necessarily in the originating system)")
  public @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public Place infoUrl(PlaceInfoUrl infoUrl) {
    this.infoUrl = infoUrl;
    return this;
  }

   /**
   * Get infoUrl
   * @return infoUrl
  **/
  @ApiModelProperty(value = "")
  public PlaceInfoUrl getInfoUrl() {
    return infoUrl;
  }

  public void setInfoUrl(PlaceInfoUrl infoUrl) {
    this.infoUrl = infoUrl;
  }

  public Place description(PlaceDescription description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public PlaceDescription getDescription() {
    return description;
  }

  public void setDescription(PlaceDescription description) {
    this.description = description;
  }

  public Place position(PlacePosition position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public PlacePosition getPosition() {
    return position;
  }

  public void setPosition(PlacePosition position) {
    this.position = position;
  }

  public Place email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Contact email for the place, note that this is NOT multilingual
   * @return email
  **/
  @ApiModelProperty(value = "Contact email for the place, note that this is NOT multilingual")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Place telephone(PlaceTelephone telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  @ApiModelProperty(value = "")
  public PlaceTelephone getTelephone() {
    return telephone;
  }

  public void setTelephone(PlaceTelephone telephone) {
    this.telephone = telephone;
  }

  public Place contactType(String contactType) {
    this.contactType = contactType;
    return this;
  }

   /**
   * FIXME: this seems unused in Helsinki data. Does any 6Aika city have use for describing contact type?
   * @return contactType
  **/
  @ApiModelProperty(value = "FIXME: this seems unused in Helsinki data. Does any 6Aika city have use for describing contact type?")
  public String getContactType() {
    return contactType;
  }

  public void setContactType(String contactType) {
    this.contactType = contactType;
  }

  public Place streetAddress(PlaceStreetAddress streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Get streetAddress
   * @return streetAddress
  **/
  @ApiModelProperty(value = "")
  public PlaceStreetAddress getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(PlaceStreetAddress streetAddress) {
    this.streetAddress = streetAddress;
  }

  public Place addressLocality(PlaceAddressLocality addressLocality) {
    this.addressLocality = addressLocality;
    return this;
  }

   /**
   * Get addressLocality
   * @return addressLocality
  **/
  @ApiModelProperty(value = "")
  public PlaceAddressLocality getAddressLocality() {
    return addressLocality;
  }

  public void setAddressLocality(PlaceAddressLocality addressLocality) {
    this.addressLocality = addressLocality;
  }

  public Place addressRegion(String addressRegion) {
    this.addressRegion = addressRegion;
    return this;
  }

   /**
   * Larger region for address (like states), not typically used in Finland
   * @return addressRegion
  **/
  @ApiModelProperty(value = "Larger region for address (like states), not typically used in Finland")
  public String getAddressRegion() {
    return addressRegion;
  }

  public void setAddressRegion(String addressRegion) {
    this.addressRegion = addressRegion;
  }

  public Place postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code of the location (as used by traditional mail)
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code of the location (as used by traditional mail)")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Place postOfficeBoxNum(String postOfficeBoxNum) {
    this.postOfficeBoxNum = postOfficeBoxNum;
    return this;
  }

   /**
   * PO box for traditional mail, in case mail is not delivered to the building
   * @return postOfficeBoxNum
  **/
  @ApiModelProperty(value = "PO box for traditional mail, in case mail is not delivered to the building")
  public String getPostOfficeBoxNum() {
    return postOfficeBoxNum;
  }

  public void setPostOfficeBoxNum(String postOfficeBoxNum) {
    this.postOfficeBoxNum = postOfficeBoxNum;
  }

  public Place addressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
    return this;
  }

   /**
   * Country for the place, NOT multilingual
   * @return addressCountry
  **/
  @ApiModelProperty(value = "Country for the place, NOT multilingual")
  public String getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }

  public Place deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * This place entry is not used anymore, but old events still reference it. This might be because of duplicate removal.
   * @return deleted
  **/
  @ApiModelProperty(value = "This place entry is not used anymore, but old events still reference it. This might be because of duplicate removal.")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Place dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Identifies the source for data, this is specific to API provider. This is useful for API users, as any data quality issues are likely to be specific to data source and workarounds can be applied as such.
   * @return dataSource
  **/
  @ApiModelProperty(value = "Identifies the source for data, this is specific to API provider. This is useful for API users, as any data quality issues are likely to be specific to data source and workarounds can be applied as such.")
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public Place publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Organization that provided the event that this place is associated with
   * @return publisher
  **/
  @ApiModelProperty(value = "Organization that provided the event that this place is associated with")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Place place = (Place) o;
    return Objects.equals(this.id, place.id) &&
        Objects.equals(this.customData, place.customData) &&
        Objects.equals(this.name, place.name) &&
        Objects.equals(this.images, place.images) &&
        Objects.equals(this.originId, place.originId) &&
        Objects.equals(this.createdTime, place.createdTime) &&
        Objects.equals(this.lastModifiedTime, place.lastModifiedTime) &&
        Objects.equals(this.infoUrl, place.infoUrl) &&
        Objects.equals(this.description, place.description) &&
        Objects.equals(this.position, place.position) &&
        Objects.equals(this.email, place.email) &&
        Objects.equals(this.telephone, place.telephone) &&
        Objects.equals(this.contactType, place.contactType) &&
        Objects.equals(this.streetAddress, place.streetAddress) &&
        Objects.equals(this.addressLocality, place.addressLocality) &&
        Objects.equals(this.addressRegion, place.addressRegion) &&
        Objects.equals(this.postalCode, place.postalCode) &&
        Objects.equals(this.postOfficeBoxNum, place.postOfficeBoxNum) &&
        Objects.equals(this.addressCountry, place.addressCountry) &&
        Objects.equals(this.deleted, place.deleted) &&
        Objects.equals(this.dataSource, place.dataSource) &&
        Objects.equals(this.publisher, place.publisher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customData, name, images, originId, createdTime, lastModifiedTime, infoUrl, description, position, email, telephone, contactType, streetAddress, addressLocality, addressRegion, postalCode, postOfficeBoxNum, addressCountry, deleted, dataSource, publisher);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Place {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    infoUrl: ").append(toIndentedString(infoUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    addressLocality: ").append(toIndentedString(addressLocality)).append("\n");
    sb.append("    addressRegion: ").append(toIndentedString(addressRegion)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postOfficeBoxNum: ").append(toIndentedString(postOfficeBoxNum)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
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

