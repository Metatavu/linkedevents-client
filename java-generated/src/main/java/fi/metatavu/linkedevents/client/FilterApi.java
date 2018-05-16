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

import fi.metatavu.linkedevents.client.model.InlineResponse2002;
import fi.metatavu.linkedevents.client.model.InlineResponse2003;
import fi.metatavu.linkedevents.client.model.InlineResponse2004;
import fi.metatavu.linkedevents.client.model.Keyword;
import fi.metatavu.linkedevents.client.model.KeywordSet;
import fi.metatavu.linkedevents.client.model.Place;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-16T12:41:25.889+03:00")
public class FilterApi {

  private ApiClient client;
  private String baseUrl;

  public FilterApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Creates new keyword
   * Endpoint for creating new keywords
   * @param keywordObject  (optional)
   */
  public ApiResponse<Keyword> keywordCreate(Keyword keywordObject) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/keyword/", baseUrl);
      
    ResultType<Keyword> resultType = new ResultType<Keyword>() {};
    return client.doPOSTRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Delete a keyword
   * Deletes a keyword
   * @param id Identifier for the keyword to be deleted (required)
   */
  public ApiResponse<Object> keywordDelete(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/keyword/{id}/"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<Object> resultType = new ResultType<Object>() {};
    return client.doDELETERequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Returns a list of keywords used for describing events
   * &lt;h2 id&#x3D;\&quot;using-keyword-endpoint\&quot;&gt;Using the keyword endpoint&lt;/h2&gt; &lt;p&gt;Here, categories for events are listed. Events in each category can be found at the &lt;code&gt;event&lt;/code&gt; endpoint using the query parameter &lt;code&gt;keyword&lt;/code&gt;. The common keywords used in all events originate from the &lt;a href&#x3D;\&quot;https://finto.fi/yso/en/\&quot;&gt;general Finnish ontology (yso)&lt;/a&gt;, hence the format &lt;code&gt;yso:p4354&lt;/code&gt;. Default ordering is decreasing order by the number of events found.&lt;/p&gt; &lt;h4 id&#x3D;\&quot;keyword-text\&quot;&gt;Keyword text&lt;/h4&gt; &lt;p&gt;To find keywords that contain a specific string, use the query parameter &lt;code&gt;text&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;keyword/?text&#x3D;lapset &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?text&#x3D;lapset\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;keyword-source\&quot;&gt;Keyword source&lt;/h4&gt; &lt;p&gt;Will restrict keywords to a specific data source.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;keyword/?data_source&#x3D;yso &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?data_source&#x3D;yso\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;showing-all-keyword\&quot;&gt;Showing all keywords&lt;/h4&gt; &lt;p&gt;By default, only those keywords which have listed events are displayed. You may display keywords with zero &lt;code&gt;n_events&lt;/code&gt; with the     query parameter &lt;code&gt;show_all_keywords&lt;/code&gt;.&lt;/p&gt; 
   * @param page request particular page in paginated results (optional)
   * @param pageSize request that server delivers page_size results in response (optional)
   * @param include Embed given reference-type fields directly into the response, otherwise they are returned as URI references. (optional)
   * @param showAllKeywords Show all keywords, including those that are not associated with any events. Otherwise such keywords are hidden. When show_all_keywords is specified, no other filter is applied, **except** \&quot;filter\&quot; (match for keywords beginning with string) (optional)
   * @param dataSource Search for keywords (**note**: NOT events) that come from the specified data source (see data source in keyword definition). (optional)
   * @param text Search for keywords (**note**: NOT events) that contain the given string. This applies even when show_all_keywords is specified. (optional)
   * @param sort Sort the returned keywords in the given order. Possible sorting criteria are &#39;n_events&#39;, &#39;id&#39;, &#39;name&#39;, &#39;data_source&#39;. The default ordering is &#39;-data_source&#39;, &#39;-n_events&#39;. (optional)
   */
  public ApiResponse<InlineResponse2002> keywordList(Integer page, Integer pageSize, List<String> include, Boolean showAllKeywords, String dataSource, String text, String sort) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (page != null)
    queryParams.put("page", page);
if (pageSize != null)
    queryParams.put("page_size", pageSize);
if (include != null)
    queryParams.put("include", include);
if (showAllKeywords != null)
    queryParams.put("show_all_keywords", showAllKeywords);
if (dataSource != null)
    queryParams.put("data_source", dataSource);
if (text != null)
    queryParams.put("text", text);
if (sort != null)
    queryParams.put("sort", sort);
    
        
    String requestPath = String.format("%s/keyword/", baseUrl);
      
    ResultType<InlineResponse2002> resultType = new ResultType<InlineResponse2002>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Return information for single keyword
   * 
   * @param id Same as id in keyword schema (required)
   */
  public ApiResponse<Keyword> keywordRetrieve(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/keyword/{id}/"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<Keyword> resultType = new ResultType<Keyword>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Return as list of keyword_sets for grouping keywords
   * Unlike other endpoints, keyword_sets do not support filtering. It is expected that the full result set will remain small enough.
   * @param page request particular page in paginated results (optional)
   * @param pageSize request that server delivers page_size results in response (optional)
   * @param include Embed given reference-type fields directly into the response, otherwise they are returned as URI references. (optional)
   */
  public ApiResponse<InlineResponse2003> keywordSetList(Integer page, Integer pageSize, List<String> include) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (page != null)
    queryParams.put("page", page);
if (pageSize != null)
    queryParams.put("page_size", pageSize);
if (include != null)
    queryParams.put("include", include);
    
        
    String requestPath = String.format("%s/keyword_set/", baseUrl);
      
    ResultType<InlineResponse2003> resultType = new ResultType<InlineResponse2003>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Return information about single keyword_set
   * 
   * @param id Same as id in keyword_set schema (required)
   */
  public ApiResponse<KeywordSet> keywordSetRetrieve(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/keyword_set/{id}"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<KeywordSet> resultType = new ResultType<KeywordSet>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Update a keyword
   * Keywords can be updated if the user has appropriate access permissions.
   * @param id Identifier for the keyword to be updated (required)
   * @param keywordObject Keyword object that should replace the existing keyword (optional)
   */
  public ApiResponse<Keyword> keywordUpdate(String id, Keyword keywordObject) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/keyword/{id}/"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<Keyword> resultType = new ResultType<Keyword>() {};
    return client.doPUTRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Creates new place
   * Endpoint for creating new places
   * @param placeObject  (optional)
   */
  public ApiResponse<Place> placeCreate(Place placeObject) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/place/", baseUrl);
      
    ResultType<Place> resultType = new ResultType<Place>() {};
    return client.doPOSTRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Delete a place
   * Deletes a place
   * @param id Identifier for the place to be deleted (required)
   */
  public ApiResponse<Object> placeDelete(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/place/{id}/"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<Object> resultType = new ResultType<Object>() {};
    return client.doDELETERequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Returns list of places used for describing events
   * &lt;h2 id&#x3D;\&quot;using-place-endpoint\&quot;&gt;Using the place endpoint&lt;/h2&gt; &lt;p&gt;Here, locations for events are listed. Events in each location can be found at the &lt;code&gt;event&lt;/code&gt; endpoint using the query parameter &lt;code&gt;location&lt;/code&gt;. Most locations     originate from the &lt;a href&#x3D;\&quot;https://servicemap.hel.fi\&quot;&gt;Helsinki service point registry (tprek)&lt;/a&gt;, hence the id format &lt;code&gt;tprek:28473&lt;/code&gt;. An easy way to locate service points is         to browse our &lt;a href&#x3D;\&quot;https://servicemap.hel.fi\&quot;&gt;Service Map&lt;/a&gt;, which uses the same location ids, e.g. &lt;code&gt;servicemap.hel.fi/unit/28473&lt;/code&gt;.&lt;/p&gt; &lt;h4 id&#x3D;\&quot;district\&quot;&gt;District&lt;/h4&gt; &lt;p&gt;To restrict the retrieved places to city district(s), use the query parameter &lt;code&gt;division&lt;/code&gt;, separating values by commas if you wish to query for several divisions.&lt;/p&gt; &lt;p&gt;City of Helsinki neighborhoods (kaupunginosa), districts (peruspiiri) and subdistricts (osa-alue) are supported.     &lt;a href&#x3D;\&quot;http://kartta.hel.fi/?setlanguage&#x3D;en&amp;e&#x3D;25498873&amp;n&#x3D;6674660&amp;r&#x3D;16&amp;w&#x3D;***&amp;l&#x3D;Karttasarja%2Ckaupunginosat%2Cosaalueet_WFS%2Cperuspiiri_WFS&amp;o&#x3D;100%2C100%2C100%2C100&amp;swtab&#x3D;kaikki\&quot;&gt;         Check the divisions on the Helsinki map service.&lt;/a&gt; &lt;/p&gt; &lt;p&gt;You may query either by specific OCD division type &lt;code&gt;peruspiiri:malmi&lt;/code&gt;, or by division name &lt;code&gt;malmi&lt;/code&gt;. The latter query checks all divisions with the name, regardless of division type.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;place/?division&#x3D;malmi &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?division&#x3D;malmi\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;ordering\&quot;&gt;Ordering&lt;/h4&gt; &lt;p&gt;Default ordering is decreasing order by the number of events found.     You may also order results by &lt;code&gt;name&lt;/code&gt;, &lt;code&gt;street_address&lt;/code&gt; or &lt;code&gt;postal_code&lt;/code&gt;.     For example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;place/?sort&#x3D;name &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?sort&#x3D;name\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;showing-all-places\&quot;&gt;Showing all places&lt;/h4&gt; &lt;p&gt;By default, only those locations which have listed events are displayed. You may display locations with zero &lt;code&gt;n_events&lt;/code&gt; with the     query parameter &lt;code&gt;show_all_places&lt;/code&gt;.&lt;/p&gt; 
   * @param page request particular page in paginated results (optional)
   * @param pageSize request that server delivers page_size results in response (optional)
   * @param showAllPlaces Show all places, including those that are not hosting any events. Otherwise such places are hidden. When show_all_places is specified, no other filter is applied. (optional)
   * @param division You may filter places by specific OCD division id, or by division name. The latter query checks all divisions with the name, regardless of division type. (optional)
   * @param dataSource Search for places that come from specified data source (optional)
   * @param text  (optional)
   * @param sort Sort the returned places in the given order. Possible sorting criteria are &#39;n_events&#39;, &#39;id&#39;, &#39;name&#39;, &#39;street_address&#39; and &#39;postal_code&#39;. The default ordering is &#39;-n_events&#39;. (optional)
   */
  public ApiResponse<InlineResponse2004> placeList(Integer page, Integer pageSize, Boolean showAllPlaces, String division, String dataSource, String text, String sort) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (page != null)
    queryParams.put("page", page);
if (pageSize != null)
    queryParams.put("page_size", pageSize);
if (showAllPlaces != null)
    queryParams.put("show_all_places", showAllPlaces);
if (division != null)
    queryParams.put("division", division);
if (dataSource != null)
    queryParams.put("data_source", dataSource);
if (text != null)
    queryParams.put("text", text);
if (sort != null)
    queryParams.put("sort", sort);
    
        
    String requestPath = String.format("%s/place/", baseUrl);
      
    ResultType<InlineResponse2004> resultType = new ResultType<InlineResponse2004>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Return information for single place
   * 
   * @param id Id as defined in place model (required)
   */
  public ApiResponse<Place> placeRetrieve(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/place/{id}/"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<Place> resultType = new ResultType<Place>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Update a place
   * Place can be updated if the user has appropriate access permissions.
   * @param id Identifier for the place to be updated (required)
   * @param placeObject Place object that should replace the existing place. (optional)
   */
  public ApiResponse<Place> placeUpdate(String id, Place placeObject) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/place/{id}/"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<Place> resultType = new ResultType<Place>() {};
    return client.doPUTRequest(requestPath, resultType, queryParams, formParams);
  }
  
}
