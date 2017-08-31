# LinkedeventsClient.LanguageApi

All URIs are relative to *https://api.hel.fi/linkedevents/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageList**](LanguageApi.md#languageList) | **GET** /language/ | Return a list of languages used for describing events
[**languageRetrieve**](LanguageApi.md#languageRetrieve) | **GET** /language/{id}/ | Return information for single language


<a name="languageList"></a>
# **languageList**
> InlineResponse2005 languageList()

Return a list of languages used for describing events

The returned list describes languages used for describing events in this Linked events instance

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.LanguageApi();
apiInstance.languageList().then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="languageRetrieve"></a>
# **languageRetrieve**
> Language languageRetrieve(id)

Return information for single language

Can be used to retrieve translations for a single language

### Example
```javascript
import LinkedeventsClient from 'linkedevents-client';

let apiInstance = new LinkedeventsClient.LanguageApi();

let id = "id_example"; // String | 

apiInstance.languageRetrieve(id).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  | 

### Return type

[**Language**](Language.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

