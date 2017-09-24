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

import fi.metatavu.linkedevents.client.model.Event;
import fi.metatavu.linkedevents.client.model.InlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T10:41:37.725+03:00")
public class EventApi {

  private ApiClient client;
  private String baseUrl;

  public EventApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Create a new event
   * 
   * @param eventObject  (optional)
   */
  public ApiResponse<Event> eventCreate(Event eventObject) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/event/", baseUrl);
      
    ResultType<Event> resultType = new ResultType<Event>() {};
    return client.doPOSTRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Delete an event
   * Deletes an event
   * @param id Identifier for the event to be deleted (required)
   */
  public ApiResponse<Object> eventDelete(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/event/{id}/"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<Object> resultType = new ResultType<Object>() {};
    return client.doDELETERequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Return a list of events
   * &lt;h2 id&#x3D;\&quot;filtering-retrieved-events\&quot;&gt;Filtering retrieved events&lt;/h2&gt; &lt;p&gt;Query parameters can be used to filter the retrieved events by the following criteria.&lt;/p&gt; &lt;h3 id&#x3D;\&quot;event-time\&quot;&gt;Event time&lt;/h3&gt; &lt;p&gt;Use &lt;code&gt;start&lt;/code&gt; and &lt;code&gt;end&lt;/code&gt; to restrict the date range of returned events. Any events that intersect with the given date range will be returned.&lt;/p&gt; &lt;p&gt;The parameters &lt;code&gt;start&lt;/code&gt; and &lt;code&gt;end&lt;/code&gt; can be given in the following formats:&lt;/p&gt; &lt;ul&gt; &lt;li&gt;ISO 8601 (including the time of day)&lt;/li&gt; &lt;li&gt;yyyy-mm-dd&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;In addition, &lt;code&gt;today&lt;/code&gt; can be used as the value.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?start&#x3D;2014-01-15&amp;amp;end&#x3D;2014-01-20 &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?start&#x3D;2014-01-15&amp;amp;end&#x3D;2014-01-20\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h3 id&#x3D;\&quot;event-location\&quot;&gt;Event location&lt;/h3&gt; &lt;h4 id&#x3D;\&quot;bounding-box\&quot;&gt;Bounding box&lt;/h4&gt; &lt;p&gt;To restrict the retrieved events to a geographical region, use the query parameter &lt;code&gt;bbox&lt;/code&gt; in the format&lt;/p&gt; &lt;pre&gt;&lt;code&gt;bbox&#x3D;west,south,east,north &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;Where &lt;code&gt;west&lt;/code&gt; is the longitude of the rectangle&#39;s western boundary, &lt;code&gt;south&lt;/code&gt; is the latitude of the rectangle&#39;s southern boundary, and so on.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?bbox&#x3D;24.9348,60.1762,24.9681,60.1889 &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?bbox&#x3D;24.9348,60.1762,24.9681,60.1889\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;specific-location\&quot;&gt;Specific location&lt;/h4&gt; &lt;p&gt;To restrict the retrieved events to a known location(s), use the query parameter &lt;code&gt;location&lt;/code&gt;, separating values by commas if you wish to query for several locations.&lt;/p&gt; &lt;p&gt;Location ids are found at the &lt;code&gt;place&lt;/code&gt; endpoint, which lists the locations in decreasing number of events found. Most locations originate from the Helsinki service point registry (tprek), hence the format &lt;code&gt;tprek:28473&lt;/code&gt;. An easy way to locate service points is to browse &lt;code&gt;servicemap.hel.fi&lt;/code&gt;, which uses the same location ids, e.g. &lt;code&gt;servicemap.hel.fi/unit/28473&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?location&#x3D;tprek:28473 &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?location&#x3D;tprek:28473\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;district\&quot;&gt;District&lt;/h4&gt; &lt;p&gt;To restrict the retrieved events to city district(s), use the query parameter &lt;code&gt;division&lt;/code&gt;, separating values by commas if you wish to query for several divisions.&lt;/p&gt; &lt;p&gt;City of Helsinki neighborhoods (kaupunginosa), districts (peruspiiri) and subdistricts (osa-alue) are supported.     &lt;a href&#x3D;\&quot;http://kartta.hel.fi/?setlanguage&#x3D;en&amp;e&#x3D;25498873&amp;n&#x3D;6674660&amp;r&#x3D;16&amp;w&#x3D;***&amp;l&#x3D;Karttasarja%2Ckaupunginosat%2Cosaalueet_WFS%2Cperuspiiri_WFS&amp;o&#x3D;100%2C100%2C100%2C100&amp;swtab&#x3D;kaikki\&quot;&gt;         Check the divisions on the Helsinki map service.&lt;/a&gt; &lt;/p&gt; &lt;p&gt; You may query either by specific OCD division type &lt;code&gt;peruspiiri:malmi&lt;/code&gt;, or by division name &lt;code&gt;malmi&lt;/code&gt;. The latter query checks all divisions with the name, regardless of division type.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?division&#x3D;malmi &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?division&#x3D;malmi\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h3 id&#x3D;\&quot;event-category\&quot;&gt;Event category&lt;/h3&gt; &lt;p&gt;To restrict the retrieved events by category, use the query parameter &lt;code&gt;keyword&lt;/code&gt;, separating values by commas if you wish to query for several locations.&lt;/p&gt; &lt;p&gt;Keyword ids are found at the &lt;code&gt;keyword&lt;/code&gt; endpoint, which lists the keywords in decreasing number of events found. The common keywords used in all events originate from the general Finnish ontology (yso), hence the format &lt;code&gt;yso:p4354&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?keyword&#x3D;yso:p4354 &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?keyword&#x3D;yso:p4354\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h3 id&#x3D;\&quot;event-text\&quot;&gt;Event text&lt;/h3&gt; &lt;p&gt;To find out events that contain a specific string in any of the text fields, use the query parameter &lt;code&gt;text&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?text&#x3D;shostakovich &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?text&#x3D;shostakovich\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h2 id&#x3D;\&quot;getting-detailed-data\&quot;&gt;Getting detailed data&lt;/h2&gt; &lt;p&gt;In the default case, keywords, locations, and other fields that refer to separate resources are only displayed as simple references.&lt;/p&gt; &lt;p&gt;If you want to include the complete data from related resources in the current response, use the keyword &lt;code&gt;include&lt;/code&gt;. For example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?include&#x3D;location,keywords &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?include&#x3D;location,keywords\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt;
   * @param include Embed given reference-type fields directly into the response, otherwise they are returned as URI references. (optional)
   * @param text Search (case insensitive) through all multilingual text fields (name, description, short_description, info_url) of an event (every language). Multilingual fields contain the text that users are expected to care about, thus multilinguality is useful discriminator. (optional)
   * @param lastModifiedSince Search for events that have been modified since or at this time. (optional)
   * @param start Search for events beginning or ending after this time. Dates can be specified using ISO 8601 (\&quot;2016-01-12\&quot;) and additionally \&quot;today\&quot;. (optional)
   * @param end Search for events beginning or ending before this time. Dates can be specified using ISO 8601 (\&quot;2016-01-12\&quot;) and additionally \&quot;today\&quot;. (optional)
   * @param bbox Search for events that are within this bounding box. Decimal coordinates are given in order west, south, east, north. Period is used as decimal separator. (optional)
   * @param dataSource Search for events that come from the specified source system (optional)
   * @param location Search for events in given locations as specified by id. Multiple ids are separated by comma (optional)
   * @param division You may filter places by specific OCD division id, or by division name. The latter query checks all divisions with the name, regardless of division type. (optional)
   * @param keyword Search for events with given keywords as specified by id. Multiple ids are separated by comma (optional)
   * @param recurring Search for events based on whether they are part of recurring event set. &#39;super&#39; specifies recurring, while &#39;sub&#39; is non-recurring. (optional)
   * @param minDuration Search for events that are longer than given time in seconds (optional)
   * @param maxDuration Search for events that are shorter than given time in seconds (optional)
   * @param publisher Search for events published by the given organization (optional)
   * @param sort Sort the returned events in the given order. Possible sorting criteria are &#39;start_time&#39;, &#39;end_time&#39;, &#39;days_left&#39; and &#39;last_modified_time&#39;. The default ordering is &#39;-last_modified_time&#39;. (optional)
   * @param page request particular page in paginated results (optional)
   * @param pageSize request that server delivers page_size results in response (optional)
   */
  public ApiResponse<InlineResponse200> eventList(List<String> include, String text, String lastModifiedSince, @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor start, @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor end, List<String> bbox, String dataSource, List<Integer> location, String division, String keyword, String recurring, Integer minDuration, Integer maxDuration, String publisher, String sort, Integer page, Integer pageSize) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (include != null)
    queryParams.put("include", include);
if (text != null)
    queryParams.put("text", text);
if (lastModifiedSince != null)
    queryParams.put("last_modified_since", lastModifiedSince);
if (start != null)
    queryParams.put("start", start);
if (end != null)
    queryParams.put("end", end);
if (bbox != null)
    queryParams.put("bbox", bbox);
if (dataSource != null)
    queryParams.put("data_source", dataSource);
if (location != null)
    queryParams.put("location", location);
if (division != null)
    queryParams.put("division", division);
if (keyword != null)
    queryParams.put("keyword", keyword);
if (recurring != null)
    queryParams.put("recurring", recurring);
if (minDuration != null)
    queryParams.put("min_duration", minDuration);
if (maxDuration != null)
    queryParams.put("max_duration", maxDuration);
if (publisher != null)
    queryParams.put("publisher", publisher);
if (sort != null)
    queryParams.put("sort", sort);
if (page != null)
    queryParams.put("page", page);
if (pageSize != null)
    queryParams.put("page_size", pageSize);
    
        
    String requestPath = String.format("%s/event/", baseUrl);
      
    ResultType<InlineResponse200> resultType = new ResultType<InlineResponse200>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Retrieve single event by id
   * 
   * @param id Event identifier as defined in event schema (required)
   */
  public ApiResponse<Event> eventRetrieve(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/event/{id}/"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<Event> resultType = new ResultType<Event>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  /**
   * Update an event
   * Events can be updated if the user has appropriate access permissions. The original implementation behaves like PATCH, ie. if some field is left out from the PUT call, its value is retained in database. In order to ensure consistent behaviour, users should always supply every field in PUT call.
   * @param id Identifier for the event to be updated (required)
   * @param eventObject Event object that should replace the existing event, note that some implementations may retain unspecified fields at their original values. (optional)
   */
  public ApiResponse<Event> eventUpdate(String id, Event eventObject) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String requestPath = String.format("%s/event/{id}/"
      .replaceAll("\\{" + "id" + "\\}", id), baseUrl);
      
    ResultType<Event> resultType = new ResultType<Event>() {};
    return client.doPUTRequest(requestPath, resultType, queryParams, formParams);
  }
  
}
