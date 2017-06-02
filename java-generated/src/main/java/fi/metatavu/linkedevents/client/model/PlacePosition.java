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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * geographic position of the place specified using subset of GeoJSON
 */
@ApiModel(description = "geographic position of the place specified using subset of GeoJSON")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T10:09:35.568+03:00")
public class PlacePosition {
  @JsonProperty("coordinates")
  private List<BigDecimal> coordinates = new ArrayList<BigDecimal>();

  /**
   * interpretation of the coordinates property. Only point is supported in this version
   */
  public enum TypeEnum {
    POINT("Point");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  public PlacePosition coordinates(List<BigDecimal> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public PlacePosition addCoordinatesItem(BigDecimal coordinatesItem) {
    this.coordinates.add(coordinatesItem);
    return this;
  }

   /**
   * coordinates in format specified by type property
   * @return coordinates
  **/
  @ApiModelProperty(example = "null", value = "coordinates in format specified by type property")
  public List<BigDecimal> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<BigDecimal> coordinates) {
    this.coordinates = coordinates;
  }

  public PlacePosition type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * interpretation of the coordinates property. Only point is supported in this version
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "interpretation of the coordinates property. Only point is supported in this version")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacePosition placePosition = (PlacePosition) o;
    return Objects.equals(this.coordinates, placePosition.coordinates) &&
        Objects.equals(this.type, placePosition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacePosition {\n");
    
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

