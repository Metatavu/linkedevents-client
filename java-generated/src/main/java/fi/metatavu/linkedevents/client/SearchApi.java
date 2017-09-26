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

import fi.metatavu.linkedevents.client.model.InlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-26T16:31:14.818+03:00")
public class SearchApi {

  private ApiClient client;
  private String baseUrl;

  public SearchApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Search through events and places
   * &lt;h2 id&#x3D;\&quot;using-search-endpoint\&quot;&gt;Using the search endpoint&lt;/h2&gt; &lt;p&gt;This is the supposedly intelligent Elasticsearch Finnish full-text search for both events and places.     The results are sorted by relevance score shown in the &lt;code&gt;score&lt;/code&gt; field. The search parameter is &lt;code&gt;?q&#x3D;&lt;/code&gt;. &lt;h4 id&#x3D;\&quot;specifying-resource-type\&quot;&gt;Specifying resource type&lt;/h4&gt; &lt;p&gt;In the default case, both events and places are returned. The type of each resource is returned in the     &lt;code&gt;resource_type&lt;/code&gt; field. You may use the parameter &lt;code&gt;type&lt;/code&gt; to ask for only &lt;code&gt;event&lt;/code&gt; or &lt;code&gt;place&lt;/code&gt;. &lt;h4 id&#x3D;\&quot;events-with-decay-score\&quot;&gt;Future events with time decay&lt;/h4&gt; &lt;p&gt;When searching for events only (&lt;code&gt;?type&#x3D;event&lt;/code&gt;), by default only future events are returned, with a decay function applied so that next     events get a higher relevance score. This means that     events in the near future are returned first:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;search/?type&#x3D;event&amp;q&#x3D;sibelius &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?type&#x3D;event&amp;q&#x3D;sibelius\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;events-with-time-filtering\&quot;&gt;Events with time filtering&lt;/h4&gt; &lt;p&gt;When searching for events only (&lt;code&gt;?type&#x3D;event&lt;/code&gt;), you may also search for events in the specified time range using     &lt;code&gt;start&lt;/code&gt; or &lt;code&gt;end&lt;/code&gt; or both. In this case, relevance score is calculated only based on Finnish tokenization of the search string, with no time preference:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;search/?type&#x3D;event&amp;q&#x3D;sibelius&amp;start&#x3D;2017-01-01 &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?type&#x3D;event&amp;q&#x3D;sibelius&amp;start&#x3D;2017-01-01\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;autocomplete\&quot;&gt;Autocomplete&lt;/h4&gt;         &lt;p&gt;For fast autocomplete substring match in the resource name, use the &lt;code&gt;?input&#x3D;&lt;/code&gt; parameter instead.             When searching for events only (&lt;code&gt;?type&#x3D;event&lt;/code&gt;), by default only future events are returned, with a decay function applied so that next     events get a higher relevance score. May be combined with &lt;code&gt;start&lt;/code&gt; and &lt;code&gt;end&lt;/code&gt;. &lt;pre&gt;&lt;code&gt;search/?type&#x3D;place&amp;input&#x3D;sibe &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?type&#x3D;event&amp;input&#x3D;sibe\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; 
   * @param page request particular page in paginated results (optional)
   * @param pageSize request that server delivers page_size results in response (optional)
   * @param type Comma-delimited list of resource types to search for. Currently allowed values are &#x60;event&#x60; and &#x60;place&#x60;. &#x60;type&#x3D;event&#x60; must be specified for event date filtering and relevancy sorting. (optional)
   * @param q Search for events and places matching this string. Mutually exclusive with &#x60;input&#x60; typeahead search. (optional)
   * @param input Return autocompletition suggestions for this string. Mutually exclusive with &#x60;q&#x60; full-text search. (optional)
   * @param start Search for events beginning or ending after this time. Dates can be specified using ISO 8601 (\&quot;2016-01-12\&quot;) and additionally \&quot;today\&quot;. (optional)
   * @param end Search for events beginning or ending before this time. Dates can be specified using ISO 8601 (\&quot;2016-01-12\&quot;) and additionally \&quot;today\&quot;. (optional)
   */
  public ApiResponse<InlineResponse200> eventSearch(Integer page, Integer pageSize, String type, String q, String input, @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor start, @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = fi.metatavu.linkedevents.client.TemporalAccessorSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.linkedevents.client.TemporalAccessorDeserializer.class) java.time.temporal.TemporalAccessor end) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (page != null)
    queryParams.put("page", page);
if (pageSize != null)
    queryParams.put("page_size", pageSize);
if (type != null)
    queryParams.put("type", type);
if (q != null)
    queryParams.put("q", q);
if (input != null)
    queryParams.put("input", input);
if (start != null)
    queryParams.put("start", start);
if (end != null)
    queryParams.put("end", end);
    
        
    String requestPath = String.format("%s/search/", baseUrl);
      
    ResultType<InlineResponse200> resultType = new ResultType<InlineResponse200>() {};
    return client.doGETRequest(requestPath, resultType, queryParams, formParams);
  }
  
}
