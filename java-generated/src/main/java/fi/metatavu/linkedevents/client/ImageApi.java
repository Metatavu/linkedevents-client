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

package fi.metatavu.linkedevents.client;

import fi.metatavu.linkedevents.client.model.*;

import java.io.File;
import fi.metatavu.linkedevents.client.model.Image;
import fi.metatavu.linkedevents.client.model.ImageUrl;
import fi.metatavu.linkedevents.client.model.InlineResponse2001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-16T12:41:25.889+03:00")
public class ImageApi {

  private ApiClient client;
  private String baseUrl;

  public ImageApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Create a new image
   * There are two ways to create an image object. The image file can be posted as a multipart request, but the endpoint also accepts a simple JSON object with an external url in the url field. This allows using external images for events without saving them on the API server.
   * @param imageFile  (optional)
   * @param imageObject  (optional)
   */
  public ApiResponse<Image> imageCreate(File imageFile, ImageUrl imageObject) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
    if (imageFile != null)
      formParams.put("image_file", imageFile);
    
    String requestPath = String.format("%s/image/", baseUrl);
      
    ResultType<Image> resultType = new ResultType<Image>() {};
    return client.doPOSTRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Returns a list of images
   * Image endpoint returns images that are used for events, places or organizers. 
   * @param page request particular page in paginated results (optional)
   * @param pageSize request that server delivers page_size results in response (optional)
   * @param include Embed given reference-type fields directly into the response, otherwise they are returned as URI references. (optional)
   * @param sort return the results in ascending or descending order by the named field. sorting is only supported for some string, integer and datetime fields. (optional)
   */
  public ApiResponse<InlineResponse2001> imageList(Integer page, Integer pageSize, List<String> include, String sort) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (page != null)
    queryParams.put("page", page);
if (pageSize != null)
    queryParams.put("page_size", pageSize);
if (include != null)
    queryParams.put("include", include);
if (sort != null)
    queryParams.put("sort", sort);
    
        
    String requestPath = String.format("%s/image/", baseUrl);
      
    ResultType<InlineResponse2001> resultType = new ResultType<InlineResponse2001>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Return information for single image
   * 
   * @param id The id for the image (required)
   */
  public ApiResponse<Image> imageRetrieve(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/image/{id}/"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<Image> resultType = new ResultType<Image>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Update an image
   * Images can be updated if the user has appropriate access permissions. The original implementation behaves like PATCH, ie. if some field is left out from the PUT call, its value is retained in database. In order to ensure consistent behaviour, users should always supply every field in PUT call.
   * @param id Identifier for the image to be updated (required)
   * @param imageObject Image object that should replace the existing image, note that some implementations may retain unspecified fields at their original values. (optional)
   */
  public ApiResponse<Image> imageUpdate(String id, Image imageObject) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/image/{id}/"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<Image> resultType = new ResultType<Image>() {};
    return client.doPUTRequest(requestPath, resultType, queryParams, formParams);
  }
  
}
