# LinkedeventsClient.EventApi

All URIs are relative to *https://api.hel.fi/linkedevents/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventCreate**](EventApi.md#eventCreate) | **POST** /event/ | Create a new event
[**eventDelete**](EventApi.md#eventDelete) | **DELETE** /event/{id}/ | Delete an event
[**eventList**](EventApi.md#eventList) | **GET** /event/ | Return a list of events
[**eventRetrieve**](EventApi.md#eventRetrieve) | **GET** /event/{id}/ | Retrieve single event by id
[**eventUpdate**](EventApi.md#eventUpdate) | **PUT** /event/{id}/ | Update an event


<a name="eventCreate"></a>
# **eventCreate**
> Event eventCreate(opts)

Create a new event

### Example
```javascript
var LinkedeventsClient = require('linkedevents-client');

var apiInstance = new LinkedeventsClient.EventApi();

var opts = { 
  'eventObject': new LinkedeventsClient.Event() // Event | 
};
apiInstance.eventCreate(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventObject** | [**Event**](Event.md)|  | [optional] 

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventDelete"></a>
# **eventDelete**
> eventDelete(id)

Delete an event

Deletes an event

### Example
```javascript
var LinkedeventsClient = require('linkedevents-client');

var apiInstance = new LinkedeventsClient.EventApi();

var id = "id_example"; // String | Identifier for the event to be deleted

apiInstance.eventDelete(id).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier for the event to be deleted | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventList"></a>
# **eventList**
> InlineResponse200 eventList(opts)

Return a list of events

&lt;h2 id&#x3D;\&quot;filtering-retrieved-events\&quot;&gt;Filtering retrieved events&lt;/h2&gt; &lt;p&gt;Query parameters can be used to filter the retrieved events by the following criteria.&lt;/p&gt; &lt;h3 id&#x3D;\&quot;event-time\&quot;&gt;Event time&lt;/h3&gt; &lt;p&gt;Use &lt;code&gt;start&lt;/code&gt; and &lt;code&gt;end&lt;/code&gt; to restrict the date range of returned events. Any events that intersect with the given date range will be returned.&lt;/p&gt; &lt;p&gt;The parameters &lt;code&gt;start&lt;/code&gt; and &lt;code&gt;end&lt;/code&gt; can be given in the following formats:&lt;/p&gt; &lt;ul&gt; &lt;li&gt;ISO 8601 (including the time of day)&lt;/li&gt; &lt;li&gt;yyyy-mm-dd&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;In addition, &lt;code&gt;today&lt;/code&gt; can be used as the value.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?start&#x3D;2014-01-15&amp;amp;end&#x3D;2014-01-20 &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?start&#x3D;2014-01-15&amp;amp;end&#x3D;2014-01-20\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h3 id&#x3D;\&quot;event-location\&quot;&gt;Event location&lt;/h3&gt; &lt;h4 id&#x3D;\&quot;bounding-box\&quot;&gt;Bounding box&lt;/h4&gt; &lt;p&gt;To restrict the retrieved events to a geographical region, use the query parameter &lt;code&gt;bbox&lt;/code&gt; in the format&lt;/p&gt; &lt;pre&gt;&lt;code&gt;bbox&#x3D;west,south,east,north &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;Where &lt;code&gt;west&lt;/code&gt; is the longitude of the rectangle&#39;s western boundary, &lt;code&gt;south&lt;/code&gt; is the latitude of the rectangle&#39;s southern boundary, and so on.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?bbox&#x3D;24.9348,60.1762,24.9681,60.1889 &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?bbox&#x3D;24.9348,60.1762,24.9681,60.1889\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;specific-location\&quot;&gt;Specific location&lt;/h4&gt; &lt;p&gt;To restrict the retrieved events to a known location(s), use the query parameter &lt;code&gt;location&lt;/code&gt;, separating values by commas if you wish to query for several locations.&lt;/p&gt; &lt;p&gt;Location ids are found at the &lt;code&gt;place&lt;/code&gt; endpoint, which lists the locations in decreasing number of events found. Most locations originate from the Helsinki service point registry (tprek), hence the format &lt;code&gt;tprek:28473&lt;/code&gt;. An easy way to locate service points is to browse &lt;code&gt;servicemap.hel.fi&lt;/code&gt;, which uses the same location ids, e.g. &lt;code&gt;servicemap.hel.fi/unit/28473&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?location&#x3D;tprek:28473 &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?location&#x3D;tprek:28473\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;district\&quot;&gt;District&lt;/h4&gt; &lt;p&gt;To restrict the retrieved events to city district(s), use the query parameter &lt;code&gt;division&lt;/code&gt;, separating values by commas if you wish to query for several divisions.&lt;/p&gt; &lt;p&gt;City of Helsinki neighborhoods (kaupunginosa), districts (peruspiiri) and subdistricts (osa-alue) are supported.     &lt;a href&#x3D;\&quot;http://kartta.hel.fi/?setlanguage&#x3D;en&amp;e&#x3D;25498873&amp;n&#x3D;6674660&amp;r&#x3D;16&amp;w&#x3D;***&amp;l&#x3D;Karttasarja%2Ckaupunginosat%2Cosaalueet_WFS%2Cperuspiiri_WFS&amp;o&#x3D;100%2C100%2C100%2C100&amp;swtab&#x3D;kaikki\&quot;&gt;         Check the divisions on the Helsinki map service.&lt;/a&gt; &lt;/p&gt; &lt;p&gt; You may query either by specific OCD division type &lt;code&gt;peruspiiri:malmi&lt;/code&gt;, or by division name &lt;code&gt;malmi&lt;/code&gt;. The latter query checks all divisions with the name, regardless of division type.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?division&#x3D;malmi &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?division&#x3D;malmi\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h3 id&#x3D;\&quot;event-category\&quot;&gt;Event category&lt;/h3&gt; &lt;p&gt;To restrict the retrieved events by category, use the query parameter &lt;code&gt;keyword&lt;/code&gt;, separating values by commas if you wish to query for several locations.&lt;/p&gt; &lt;p&gt;Keyword ids are found at the &lt;code&gt;keyword&lt;/code&gt; endpoint, which lists the keywords in decreasing number of events found. The common keywords used in all events originate from the general Finnish ontology (yso), hence the format &lt;code&gt;yso:p4354&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?keyword&#x3D;yso:p4354 &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?keyword&#x3D;yso:p4354\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h3 id&#x3D;\&quot;event-text\&quot;&gt;Event text&lt;/h3&gt; &lt;p&gt;To find out events that contain a specific string in any of the text fields, use the query parameter &lt;code&gt;text&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?text&#x3D;shostakovich &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?text&#x3D;shostakovich\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h2 id&#x3D;\&quot;getting-detailed-data\&quot;&gt;Getting detailed data&lt;/h2&gt; &lt;p&gt;In the default case, keywords, locations, and other fields that refer to separate resources are only displayed as simple references.&lt;/p&gt; &lt;p&gt;If you want to include the complete data from related resources in the current response, use the keyword &lt;code&gt;include&lt;/code&gt;. For example:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;event/?include&#x3D;location,keywords &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?include&#x3D;location,keywords\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt;

### Example
```javascript
var LinkedeventsClient = require('linkedevents-client');

var apiInstance = new LinkedeventsClient.EventApi();

var opts = { 
  'include': ["include_example"], // [String] | Embed given reference-type fields directly into the response, otherwise they are returned as URI references.
  'text': "text_example", // String | Search (case insensitive) through all multilingual text fields (name, description, short_description, info_url) of an event (every language). Multilingual fields contain the text that users are expected to care about, thus multilinguality is useful discriminator.
  'lastModifiedSince': "lastModifiedSince_example", // String | Search for events that have been modified since or at this time.
  'start': new Date("2013-10-20T19:20:30+01:00"), // Date | Search for events beginning or ending after this time. Dates can be specified using ISO 8601 (\"2016-01-12\") and additionally \"today\".
  'end': new Date("2013-10-20T19:20:30+01:00"), // Date | Search for events beginning or ending before this time. Dates can be specified using ISO 8601 (\"2016-01-12\") and additionally \"today\".
  'bbox': ["bbox_example"], // [String] | Search for events that are within this bounding box. Decimal coordinates are given in order west, south, east, north. Period is used as decimal separator.
  'dataSource': "dataSource_example", // String | Search for events that come from the specified source system
  'location': [3.4], // [Number] | Search for events in given locations as specified by id. Multiple ids are separated by comma
  'showAll': true, // Boolean | Show all events (optional)
  'division': "division_example", // String | You may filter places by specific OCD division id, or by division name. The latter query checks all divisions with the name, regardless of division type.
  'keyword': "keyword_example", // String | Search for events with given keywords as specified by id. Multiple ids are separated by comma
  'recurring': "recurring_example", // String | Search for events based on whether they are part of recurring event set. 'super' specifies recurring, while 'sub' is non-recurring.
  'minDuration': 56, // Number | Search for events that are longer than given time in seconds
  'maxDuration': 56, // Number | Search for events that are shorter than given time in seconds
  'publisher': "publisher_example", // String | Search for events published by the given organization
  'sort': "sort_example", // String | Sort the returned events in the given order. Possible sorting criteria are 'start_time', 'end_time', 'days_left' and 'last_modified_time'. The default ordering is '-last_modified_time'.
  'page': 56, // Number | request particular page in paginated results
  'pageSize': 56, // Number | request that server delivers page_size results in response
  'addressLocalityFi': "addressLocalityFi_example", // String | Search for events in given address localities (fi). Multiple localities can be entered by separating them by a comma
  'addressLocalitySv': "addressLocalitySv_example", // String | Search for events in given address localities (sv). Multiple localities can be entered by separating them by a comma
  'addressLocalityEn': "addressLocalityEn_example", // String | Search for events in given address localities (en). Multiple localities can be entered by separating them by a comma
  'language': "language_example", // String | Search for events in given language
  'publicationStatus': "publicationStatus_example" // String | Filter events by publication status (either draft or public)
};
apiInstance.eventList(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | [**[String]**](String.md)| Embed given reference-type fields directly into the response, otherwise they are returned as URI references. | [optional] 
 **text** | **String**| Search (case insensitive) through all multilingual text fields (name, description, short_description, info_url) of an event (every language). Multilingual fields contain the text that users are expected to care about, thus multilinguality is useful discriminator. | [optional] 
 **lastModifiedSince** | **String**| Search for events that have been modified since or at this time. | [optional] 
 **start** | **Date**| Search for events beginning or ending after this time. Dates can be specified using ISO 8601 (\&quot;2016-01-12\&quot;) and additionally \&quot;today\&quot;. | [optional] 
 **end** | **Date**| Search for events beginning or ending before this time. Dates can be specified using ISO 8601 (\&quot;2016-01-12\&quot;) and additionally \&quot;today\&quot;. | [optional] 
 **bbox** | [**[String]**](String.md)| Search for events that are within this bounding box. Decimal coordinates are given in order west, south, east, north. Period is used as decimal separator. | [optional] 
 **dataSource** | **String**| Search for events that come from the specified source system | [optional] 
 **location** | [**[Number]**](Number.md)| Search for events in given locations as specified by id. Multiple ids are separated by comma | [optional] 
 **showAll** | **Boolean**| Show all events (optional) | [optional] 
 **division** | **String**| You may filter places by specific OCD division id, or by division name. The latter query checks all divisions with the name, regardless of division type. | [optional] 
 **keyword** | **String**| Search for events with given keywords as specified by id. Multiple ids are separated by comma | [optional] 
 **recurring** | **String**| Search for events based on whether they are part of recurring event set. &#39;super&#39; specifies recurring, while &#39;sub&#39; is non-recurring. | [optional] 
 **minDuration** | **Number**| Search for events that are longer than given time in seconds | [optional] 
 **maxDuration** | **Number**| Search for events that are shorter than given time in seconds | [optional] 
 **publisher** | **String**| Search for events published by the given organization | [optional] 
 **sort** | **String**| Sort the returned events in the given order. Possible sorting criteria are &#39;start_time&#39;, &#39;end_time&#39;, &#39;days_left&#39; and &#39;last_modified_time&#39;. The default ordering is &#39;-last_modified_time&#39;. | [optional] 
 **page** | **Number**| request particular page in paginated results | [optional] 
 **pageSize** | **Number**| request that server delivers page_size results in response | [optional] 
 **addressLocalityFi** | **String**| Search for events in given address localities (fi). Multiple localities can be entered by separating them by a comma | [optional] 
 **addressLocalitySv** | **String**| Search for events in given address localities (sv). Multiple localities can be entered by separating them by a comma | [optional] 
 **addressLocalityEn** | **String**| Search for events in given address localities (en). Multiple localities can be entered by separating them by a comma | [optional] 
 **language** | **String**| Search for events in given language | [optional] 
 **publicationStatus** | **String**| Filter events by publication status (either draft or public) | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventRetrieve"></a>
# **eventRetrieve**
> Event eventRetrieve(id, opts)

Retrieve single event by id

### Example
```javascript
var LinkedeventsClient = require('linkedevents-client');

var apiInstance = new LinkedeventsClient.EventApi();

var id = "id_example"; // String | Event identifier as defined in event schema

var opts = { 
  'include': ["include_example"] // [String] | Embed given reference-type fields directly into the response, otherwise they are returned as URI references.
};
apiInstance.eventRetrieve(id, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Event identifier as defined in event schema | 
 **include** | [**[String]**](String.md)| Embed given reference-type fields directly into the response, otherwise they are returned as URI references. | [optional] 

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventUpdate"></a>
# **eventUpdate**
> Event eventUpdate(id, opts)

Update an event

Events can be updated if the user has appropriate access permissions. The original implementation behaves like PATCH, ie. if some field is left out from the PUT call, its value is retained in database. In order to ensure consistent behaviour, users should always supply every field in PUT call.

### Example
```javascript
var LinkedeventsClient = require('linkedevents-client');

var apiInstance = new LinkedeventsClient.EventApi();

var id = "id_example"; // String | Identifier for the event to be updated

var opts = { 
  'eventObject': new LinkedeventsClient.Event() // Event | Event object that should replace the existing event, note that some implementations may retain unspecified fields at their original values.
};
apiInstance.eventUpdate(id, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier for the event to be updated | 
 **eventObject** | [**Event**](Event.md)| Event object that should replace the existing event, note that some implementations may retain unspecified fields at their original values. | [optional] 

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

