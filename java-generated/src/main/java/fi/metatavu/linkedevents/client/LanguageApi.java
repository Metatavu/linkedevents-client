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

import fi.metatavu.linkedevents.client.model.InlineResponse2005;
import fi.metatavu.linkedevents.client.model.Language;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T10:09:35.568+03:00")
public class LanguageApi {

  private ApiClient client;
  private String baseUrl;

  public LanguageApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Return a list of languages used for describing events
   * The returned list describes languages used for describing events in this Linked events instance
   */
  public ApiResponse<InlineResponse2005> languageList() {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/language/", baseUrl);
      
    ResultType<InlineResponse2005> resultType = new ResultType<InlineResponse2005>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Return information for single language
   * Can be used to retrieve translations for a single language
   * @param id  (required)
   */
  public ApiResponse<Language> languageRetrieve(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/language/{id}/"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<Language> resultType = new ResultType<Language>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  
}
