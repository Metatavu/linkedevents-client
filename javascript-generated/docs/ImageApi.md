# LinkedeventsClient.ImageApi

All URIs are relative to *https://api.hel.fi/linkedevents/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**imageCreate**](ImageApi.md#imageCreate) | **POST** /image/ | Create a new image
[**imageList**](ImageApi.md#imageList) | **GET** /image/ | Returns a list of images
[**imageRetrieve**](ImageApi.md#imageRetrieve) | **GET** /image/{id}/ | Return information for single image
[**imageUpdate**](ImageApi.md#imageUpdate) | **PUT** /image/{id}/ | Update an image


<a name="imageCreate"></a>
# **imageCreate**
> Image imageCreate(opts)

Create a new image

There are two ways to create an image object. The image file can be posted as a multipart request, but the endpoint also accepts a simple JSON object with an external url in the url field. This allows using external images for events without saving them on the API server.

### Example
```javascript
var LinkedeventsClient = require('linkedevents-client');

var apiInstance = new LinkedeventsClient.ImageApi();

var opts = { 
  'imageFile': "/path/to/file.txt", // File | 
  'imageObject': new LinkedeventsClient.ImageUrl() // ImageUrl | 
};
apiInstance.imageCreate(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**|  | [optional] 
 **imageObject** | [**ImageUrl**](ImageUrl.md)|  | [optional] 

### Return type

[**Image**](Image.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="imageList"></a>
# **imageList**
> InlineResponse2001 imageList(opts)

Returns a list of images

Image endpoint returns images that are used for events, places or organizers. 

### Example
```javascript
var LinkedeventsClient = require('linkedevents-client');

var apiInstance = new LinkedeventsClient.ImageApi();

var opts = { 
  'page': 56, // Number | request particular page in paginated results
  'pageSize': 56 // Number | request that server delivers page_size results in response
  'include': ["include_example"], // [String] | Embed given reference-type fields directly into the response, otherwise they are returned as URI references.
  'sort': "sort_example" // String | return the results in ascending or descending order by the named field. sorting is only supported for some string, integer and datetime fields.
};
apiInstance.imageList(opts).then(function(data) {
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
 **include** | [**[String]**](String.md)| Embed given reference-type fields directly into the response, otherwise they are returned as URI references. | [optional] 
 **sort** | **String**| return the results in ascending or descending order by the named field. sorting is only supported for some string, integer and datetime fields. | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="imageRetrieve"></a>
# **imageRetrieve**
> Image imageRetrieve(id)

Return information for single image

### Example
```javascript
var LinkedeventsClient = require('linkedevents-client');

var apiInstance = new LinkedeventsClient.ImageApi();

var id = "id_example"; // String | The id for the image

apiInstance.imageRetrieve(id).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id for the image | 

### Return type

[**Image**](Image.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="imageUpdate"></a>
# **imageUpdate**
> Image imageUpdate(id, opts)

Update an image

Images can be updated if the user has appropriate access permissions. The original implementation behaves like PATCH, ie. if some field is left out from the PUT call, its value is retained in database. In order to ensure consistent behaviour, users should always supply every field in PUT call.

### Example
```javascript
var LinkedeventsClient = require('linkedevents-client');

var apiInstance = new LinkedeventsClient.ImageApi();

var id = "id_example"; // String | Identifier for the image to be updated

var opts = { 
  'imageObject': new LinkedeventsClient.Image() // Image | Image object that should replace the existing image, note that some implementations may retain unspecified fields at their original values.
};
apiInstance.imageUpdate(id, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier for the image to be updated | 
 **imageObject** | [**Image**](Image.md)| Image object that should replace the existing image, note that some implementations may retain unspecified fields at their original values. | [optional] 

### Return type

[**Image**](Image.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

