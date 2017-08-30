# LinkedeventsClient.Keyword

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Consists of source prefix and source specific identifier. These should be URIs uniquely identifying the keyword, and preferably also well formed http-URLs pointing to more information about the keyword. | 
**name** | [**KeywordName**](KeywordName.md) |  | [optional] 
**images** | [**[Image]**](Image.md) |  | [optional] 
**originId** | **String** | Identifier for the keyword in the organization using this keyword. For standardized namespaces this will be a shared identifier. | [optional] 
**createdTime** | **Date** | Creation time for the keyword entry. | [optional] 
**lastModifiedTime** | **Date** | Time this place was modified in the datastore behind the API (not necessarily in the originating system) | [optional] 
**aggregate** | **Boolean** | FIXME(verify) This keyword is an combination of several keywords at source | [optional] 
**dataSource** | **String** | Source of the keyword, typically API provider specific identifier. Will also be used to specify standardized namespaces as they are brought into use. | 
**createdBy** | **String** | FIXME(verify) URL reference to the user that created this record (user endpoint) | [optional] 
**lastModifiedBy** | **String** | FIXME(verify) URL reference to the user that last modfied this record (user endpoint) | [optional] 
**altLabels** | **[String]** | FIXME(verify) alternative labels for this keyword, no language specified. Use case? | [optional] 


