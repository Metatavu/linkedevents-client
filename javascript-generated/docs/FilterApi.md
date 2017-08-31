# LinkedeventsClient.FilterApi

All URIs are relative to *https://api.hel.fi/linkedevents/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keywordCreate**](FilterApi.md#keywordCreate) | **POST** /keyword/ | Creates new keyword
[**keywordDelete**](FilterApi.md#keywordDelete) | **DELETE** /keyword/{id}/ | Delete a keyword
[**keywordList**](FilterApi.md#keywordList) | **GET** /keyword/ | Returns a list of keywords used for describing events
[**keywordRetrieve**](FilterApi.md#keywordRetrieve) | **GET** /keyword/{id}/ | Return information for single keyword
[**keywordSetList**](FilterApi.md#keywordSetList) | **GET** /keyword_set/ | Return as list of keyword_sets for grouping keywords
[**keywordSetRetrieve**](FilterApi.md#keywordSetRetrieve) | **GET** /keyword_set/{id} | Return information about single keyword_set
[**keywordUpdate**](FilterApi.md#keywordUpdate) | **PUT** /keyword/{id}/ | Update a keyword
[**placeCreate**](FilterApi.md#placeCreate) | **POST** /place/ | Creates new place
[**placeDelete**](FilterApi.md#placeDelete) | **DELETE** /place/{id}/ | Delete a place
[**placeList**](FilterApi.md#placeList) | **GET** /place/ | Returns list of places used for describing events
[**placeRetrieve**](FilterApi.md#placeRetrieve) | **GET** /place/{id}/ | Return information for single place
[**placeUpdate**](FilterApi.md#placeUpdate) | **PUT** /place/{id}/ | Update a place


<a name="keywordCreate"></a>
# **keywordCreate**
> Place keywordCreate(opts)

Creates new keyword

Endpoint for creating new keywords

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.FilterApi();

let opts = { 
  'keywordObject': new LinkedeventsClient.Keyword() // Keyword | 
};
apiInstance.keywordCreate(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordObject** | [**Keyword**](Keyword.md)|  | [optional] 

### Return type

[**Place**](Place.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keywordDelete"></a>
# **keywordDelete**
> keywordDelete(id)

Delete a keyword

Deletes a keyword

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.FilterApi();

let id = "id_example"; // String | Identifier for the keyword to be deleted

apiInstance.keywordDelete(id).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier for the keyword to be deleted | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keywordList"></a>
# **keywordList**
> InlineResponse2002 keywordList(opts)

Returns a list of keywords used for describing events

&lt;h2 id&#x3D;\&quot;using-keyword-endpoint\&quot;&gt;Using the keyword endpoint&lt;/h2&gt; &lt;p&gt;Here, categories for events are listed. Events in each category can be found at the &lt;code&gt;event&lt;/code&gt; endpoint using the query parameter &lt;code&gt;keyword&lt;/code&gt;. The common keywords used in all events originate from the &lt;a href&#x3D;\&quot;https://finto.fi/yso/en/\&quot;&gt;general Finnish ontology (yso)&lt;/a&gt;, hence the format &lt;code&gt;yso:p4354&lt;/code&gt;. Default ordering is decreasing order by the number of events found.&lt;/p&gt; &lt;h4 id&#x3D;\&quot;keyword-text\&quot;&gt;Keyword text&lt;/h4&gt; &lt;p&gt;To find keywords that contain a specific string, use the query parameter &lt;code&gt;text&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;keyword/?text&#x3D;lapset &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?text&#x3D;lapset\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;keyword-source\&quot;&gt;Keyword source&lt;/h4&gt; &lt;p&gt;Will restrict keywords to a specific data source.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;keyword/?data_source&#x3D;yso &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?data_source&#x3D;yso\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;showing-all-keyword\&quot;&gt;Showing all keywords&lt;/h4&gt; &lt;p&gt;By default, only those keywords which have listed events are displayed. You may display keywords with zero &lt;code&gt;n_events&lt;/code&gt; with the     query parameter &lt;code&gt;show_all_keywords&lt;/code&gt;.&lt;/p&gt; 

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.FilterApi();

let opts = { 
  'page': 56, // Number | request particular page in paginated results
  'pageSize': 56 // Number | request that server delivers page_size results in response
  'include': ["include_example"], // [String] | Embed given reference-type fields directly into the response, otherwise they are returned as URI references.
  'showAllKeywords': true, // Boolean | Show all keywords, including those that are not associated with any events. Otherwise such keywords are hidden. When show_all_keywords is specified, no other filter is applied, **except** \"filter\" (match for keywords beginning with string)
  'dataSource': "dataSource_example", // String | Search for keywords (**note**: NOT events) that come from the specified data source (see data source in keyword definition).
  'text': "text_example", // String | Search for keywords (**note**: NOT events) that contain the given string. This applies even when show_all_keywords is specified.
  'sort': "sort_example" // String | Sort the returned keywords in the given order. Possible sorting criteria are 'n_events', 'id', 'name', 'data_source'. The default ordering is '-data_source', '-n_events'.
};
apiInstance.keywordList(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| request particular page in paginated results | [optional] 
 **pageSize** | **Number**| request that server delivers page_size results in response | [optional] 
 **include** | [**[String]**](String.md)| Embed given reference-type fields directly into the response, otherwise they are returned as URI references. | [optional] 
 **showAllKeywords** | **Boolean**| Show all keywords, including those that are not associated with any events. Otherwise such keywords are hidden. When show_all_keywords is specified, no other filter is applied, **except** \&quot;filter\&quot; (match for keywords beginning with string) | [optional] 
 **dataSource** | **String**| Search for keywords (**note**: NOT events) that come from the specified data source (see data source in keyword definition). | [optional] 
 **text** | **String**| Search for keywords (**note**: NOT events) that contain the given string. This applies even when show_all_keywords is specified. | [optional] 
 **sort** | **String**| Sort the returned keywords in the given order. Possible sorting criteria are &#39;n_events&#39;, &#39;id&#39;, &#39;name&#39;, &#39;data_source&#39;. The default ordering is &#39;-data_source&#39;, &#39;-n_events&#39;. | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keywordRetrieve"></a>
# **keywordRetrieve**
> Keyword keywordRetrieve(id)

Return information for single keyword

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.FilterApi();

let id = "id_example"; // String | Same as id in keyword schema

apiInstance.keywordRetrieve(id).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Same as id in keyword schema | 

### Return type

[**Keyword**](Keyword.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keywordSetList"></a>
# **keywordSetList**
> InlineResponse2003 keywordSetList(opts)

Return as list of keyword_sets for grouping keywords

Unlike other endpoints, keyword_sets do not support filtering. It is expected that the full result set will remain small enough.

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.FilterApi();

let opts = { 
  'page': 56, // Number | request particular page in paginated results
  'pageSize': 56 // Number | request that server delivers page_size results in response
  'include': ["include_example"], // [String] | Embed given reference-type fields directly into the response, otherwise they are returned as URI references.
};
apiInstance.keywordSetList(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| request particular page in paginated results | [optional] 
 **pageSize** | **Number**| request that server delivers page_size results in response | [optional] 
 **include** | [**[String]**](String.md)| Embed given reference-type fields directly into the response, otherwise they are returned as URI references. | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keywordSetRetrieve"></a>
# **keywordSetRetrieve**
> KeywordSet keywordSetRetrieve(id)

Return information about single keyword_set

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.FilterApi();

let id = "id_example"; // String | Same as id in keyword_set schema

apiInstance.keywordSetRetrieve(id).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Same as id in keyword_set schema | 

### Return type

[**KeywordSet**](KeywordSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keywordUpdate"></a>
# **keywordUpdate**
> Keyword keywordUpdate(id, opts)

Update a keyword

Keywords can be updated if the user has appropriate access permissions.

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.FilterApi();

let id = "id_example"; // String | Identifier for the keyword to be updated

let opts = { 
  'keywordObject': new LinkedeventsClient.Keyword() // Keyword | Keyword object that should replace the existing keyword
};
apiInstance.keywordUpdate(id, opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier for the keyword to be updated | 
 **keywordObject** | [**Keyword**](Keyword.md)| Keyword object that should replace the existing keyword | [optional] 

### Return type

[**Keyword**](Keyword.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="placeCreate"></a>
# **placeCreate**
> Place placeCreate(opts)

Creates new place

Endpoint for creating new places

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.FilterApi();

let opts = { 
  'placeObject': new LinkedeventsClient.Place() // Place | 
};
apiInstance.placeCreate(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **placeObject** | [**Place**](Place.md)|  | [optional] 

### Return type

[**Place**](Place.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="placeDelete"></a>
# **placeDelete**
> placeDelete(id)

Delete a place

Deletes a place

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.FilterApi();

let id = "id_example"; // String | Identifier for the place to be deleted

apiInstance.placeDelete(id).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier for the place to be deleted | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="placeList"></a>
# **placeList**
> InlineResponse2004 placeList(opts)

Returns list of places used for describing events

&lt;h2 id&#x3D;\&quot;using-place-endpoint\&quot;&gt;Using the place endpoint&lt;/h2&gt; &lt;p&gt;Here, locations for events are listed. Events in each location can be found at the &lt;code&gt;event&lt;/code&gt; endpoint using the query parameter &lt;code&gt;location&lt;/code&gt;. Most locations     originate from the &lt;a href&#x3D;\&quot;https://servicemap.hel.fi\&quot;&gt;Helsinki service point registry (tprek)&lt;/a&gt;, hence the id format &lt;code&gt;tprek:28473&lt;/code&gt;. An easy way to locate service points is         to browse our &lt;a href&#x3D;\&quot;https://servicemap.hel.fi\&quot;&gt;Service Map&lt;/a&gt;, which uses the same location ids, e.g. &lt;code&gt;servicemap.hel.fi/unit/28473&lt;/code&gt;.&lt;/p&gt; &lt;h4 id&#x3D;\&quot;district\&quot;&gt;District&lt;/h4&gt; &lt;p&gt;To restrict the retrieved places to city district(s), use the query parameter &lt;code&gt;division&lt;/code&gt;, separating values by commas if you wish to query for several divisions.&lt;/p&gt; &lt;p&gt;City of Helsinki neighborhoods (kaupunginosa), districts (peruspiiri) and subdistricts (osa-alue) are supported.     &lt;a href&#x3D;\&quot;http://kartta.hel.fi/?setlanguage&#x3D;en&amp;e&#x3D;25498873&amp;n&#x3D;6674660&amp;r&#x3D;16&amp;w&#x3D;***&amp;l&#x3D;Karttasarja%2Ckaupunginosat%2Cosaalueet_WFS%2Cperuspiiri_WFS&amp;o&#x3D;100%2C100%2C100%2C100&amp;swtab&#x3D;kaikki\&quot;&gt;         Check the divisions on the Helsinki map service.&lt;/a&gt; &lt;/p&gt; &lt;p&gt;You may query either by specific OCD division type &lt;code&gt;peruspiiri:malmi&lt;/code&gt;, or by division name &lt;code&gt;malmi&lt;/code&gt;. The latter query checks all divisions with the name, regardless of division type.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;place/?division&#x3D;malmi &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?division&#x3D;malmi\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;ordering\&quot;&gt;Ordering&lt;/h4&gt; &lt;p&gt;Default ordering is decreasing order by the number of events found.     You may also order results by &lt;code&gt;name&lt;/code&gt;, &lt;code&gt;street_address&lt;/code&gt; or &lt;code&gt;postal_code&lt;/code&gt;.     For example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;place/?sort&#x3D;name &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?sort&#x3D;name\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;showing-all-places\&quot;&gt;Showing all places&lt;/h4&gt; &lt;p&gt;By default, only those locations which have listed events are displayed. You may display locations with zero &lt;code&gt;n_events&lt;/code&gt; with the     query parameter &lt;code&gt;show_all_places&lt;/code&gt;.&lt;/p&gt; 

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.FilterApi();

let opts = { 
  'page': 56, // Number | request particular page in paginated results
  'pageSize': 56 // Number | request that server delivers page_size results in response
  'showAllPlaces': true, // Boolean | Show all places, including those that are not hosting any events. Otherwise such places are hidden. When show_all_places is specified, no other filter is applied.
  'division': "division_example", // String | You may filter places by specific OCD division id, or by division name. The latter query checks all divisions with the name, regardless of division type.
  'dataSource': "dataSource_example", // String | Search for places that come from specified data source
  'text': "text_example", // String | 
  'sort': "sort_example" // String | Sort the returned places in the given order. Possible sorting criteria are 'n_events', 'id', 'name', 'street_address' and 'postal_code'. The default ordering is '-n_events'.
};
apiInstance.placeList(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| request particular page in paginated results | [optional] 
 **pageSize** | **Number**| request that server delivers page_size results in response | [optional] 
 **showAllPlaces** | **Boolean**| Show all places, including those that are not hosting any events. Otherwise such places are hidden. When show_all_places is specified, no other filter is applied. | [optional] 
 **division** | **String**| You may filter places by specific OCD division id, or by division name. The latter query checks all divisions with the name, regardless of division type. | [optional] 
 **dataSource** | **String**| Search for places that come from specified data source | [optional] 
 **text** | **String**|  | [optional] 
 **sort** | **String**| Sort the returned places in the given order. Possible sorting criteria are &#39;n_events&#39;, &#39;id&#39;, &#39;name&#39;, &#39;street_address&#39; and &#39;postal_code&#39;. The default ordering is &#39;-n_events&#39;. | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="placeRetrieve"></a>
# **placeRetrieve**
> Place placeRetrieve(id)

Return information for single place

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.FilterApi();

let id = "id_example"; // String | Id as defined in place model

apiInstance.placeRetrieve(id).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id as defined in place model | 

### Return type

[**Place**](Place.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="placeUpdate"></a>
# **placeUpdate**
> Place placeUpdate(id, opts)

Update a place

Place can be updated if the user has appropriate access permissions.

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.FilterApi();

let id = "id_example"; // String | Identifier for the place to be updated

let opts = { 
  'placeObject': new LinkedeventsClient.Place() // Place | Place object that should replace the existing place.
};
apiInstance.placeUpdate(id, opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier for the place to be updated | 
 **placeObject** | [**Place**](Place.md)| Place object that should replace the existing place. | [optional] 

### Return type

[**Place**](Place.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

