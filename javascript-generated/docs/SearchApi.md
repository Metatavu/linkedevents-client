# LinkedeventsClient.SearchApi

All URIs are relative to *https://api.hel.fi/linkedevents/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventSearch**](SearchApi.md#eventSearch) | **GET** /search/ | Search through events and places


<a name="eventSearch"></a>
# **eventSearch**
> InlineResponse200 eventSearch(opts)

Search through events and places

&lt;h2 id&#x3D;\&quot;using-search-endpoint\&quot;&gt;Using the search endpoint&lt;/h2&gt; &lt;p&gt;This is the supposedly intelligent Elasticsearch Finnish full-text search for both events and places.     The results are sorted by relevance score shown in the &lt;code&gt;score&lt;/code&gt; field. The search parameter is &lt;code&gt;?q&#x3D;&lt;/code&gt;. &lt;h4 id&#x3D;\&quot;specifying-resource-type\&quot;&gt;Specifying resource type&lt;/h4&gt; &lt;p&gt;In the default case, both events and places are returned. The type of each resource is returned in the     &lt;code&gt;resource_type&lt;/code&gt; field. You may use the parameter &lt;code&gt;type&lt;/code&gt; to ask for only &lt;code&gt;event&lt;/code&gt; or &lt;code&gt;place&lt;/code&gt;. &lt;h4 id&#x3D;\&quot;events-with-decay-score\&quot;&gt;Future events with time decay&lt;/h4&gt; &lt;p&gt;When searching for events only (&lt;code&gt;?type&#x3D;event&lt;/code&gt;), by default only future events are returned, with a decay function applied so that next     events get a higher relevance score. This means that     events in the near future are returned first:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;search/?type&#x3D;event&amp;q&#x3D;sibelius &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?type&#x3D;event&amp;q&#x3D;sibelius\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;events-with-time-filtering\&quot;&gt;Events with time filtering&lt;/h4&gt; &lt;p&gt;When searching for events only (&lt;code&gt;?type&#x3D;event&lt;/code&gt;), you may also search for events in the specified time range using     &lt;code&gt;start&lt;/code&gt; or &lt;code&gt;end&lt;/code&gt; or both. In this case, relevance score is calculated only based on Finnish tokenization of the search string, with no time preference:&lt;/p&gt; &lt;pre&gt;&lt;code&gt;search/?type&#x3D;event&amp;q&#x3D;sibelius&amp;start&#x3D;2017-01-01 &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?type&#x3D;event&amp;q&#x3D;sibelius&amp;start&#x3D;2017-01-01\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; &lt;h4 id&#x3D;\&quot;autocomplete\&quot;&gt;Autocomplete&lt;/h4&gt;         &lt;p&gt;For fast autocomplete substring match in the resource name, use the &lt;code&gt;?input&#x3D;&lt;/code&gt; parameter instead.             When searching for events only (&lt;code&gt;?type&#x3D;event&lt;/code&gt;), by default only future events are returned, with a decay function applied so that next     events get a higher relevance score. May be combined with &lt;code&gt;start&lt;/code&gt; and &lt;code&gt;end&lt;/code&gt;. &lt;pre&gt;&lt;code&gt;search/?type&#x3D;place&amp;input&#x3D;sibe &lt;/code&gt;&lt;/pre&gt; &lt;p&gt;&lt;a href&#x3D;\&quot;?type&#x3D;event&amp;input&#x3D;sibe\&quot; title&#x3D;\&quot;json\&quot;&gt;See the result&lt;/a&gt;&lt;/p&gt; 

### Example
```javascript
var LinkedeventsClient = require('linkedevents-client');

var apiInstance = new LinkedeventsClient.SearchApi();

var opts = { 
  'page': 56, // Number | request particular page in paginated results
  'pageSize': 56 // Number | request that server delivers page_size results in response
  'type': "type_example", // String | Comma-delimited list of resource types to search for. Currently allowed values are `event` and `place`. `type=event` must be specified for event date filtering and relevancy sorting.
  'q': "q_example", // String | Search for events and places matching this string. Mutually exclusive with `input` typeahead search.
  'input': "input_example", // String | Return autocompletition suggestions for this string. Mutually exclusive with `q` full-text search.
  'start': new Date("2013-10-20T19:20:30+01:00"), // Date | Search for events beginning or ending after this time. Dates can be specified using ISO 8601 (\"2016-01-12\") and additionally \"today\".
  'end': new Date("2013-10-20T19:20:30+01:00"), // Date | Search for events beginning or ending before this time. Dates can be specified using ISO 8601 (\"2016-01-12\") and additionally \"today\".
};
apiInstance.eventSearch(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| request particular page in paginated results | [optional] 
 **pageSize** | **Number**| request that server delivers page_size results in response | [optional] 
 **type** | **String**| Comma-delimited list of resource types to search for. Currently allowed values are &#x60;event&#x60; and &#x60;place&#x60;. &#x60;type&#x3D;event&#x60; must be specified for event date filtering and relevancy sorting. | [optional] 
 **q** | **String**| Search for events and places matching this string. Mutually exclusive with &#x60;input&#x60; typeahead search. | [optional] 
 **input** | **String**| Return autocompletition suggestions for this string. Mutually exclusive with &#x60;q&#x60; full-text search. | [optional] 
 **start** | **Date**| Search for events beginning or ending after this time. Dates can be specified using ISO 8601 (\&quot;2016-01-12\&quot;) and additionally \&quot;today\&quot;. | [optional] 
 **end** | **Date**| Search for events beginning or ending before this time. Dates can be specified using ISO 8601 (\&quot;2016-01-12\&quot;) and additionally \&quot;today\&quot;. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

