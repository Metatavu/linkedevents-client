# LinkedeventsClient.KeywordSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this keyword_set. These should be URIs identifying the source and the keyword_set itself, and preferably also well formed http-URLs pointing to more information about the keyword. | 
**name** | [**KeywordSetName**](KeywordSetName.md) |  | [optional] 
**originId** | **String** | Set identifier in the originating system, if any | [optional] 
**createdTime** | **Date** | Time when this keyword_set was created (ISO 8601) | [optional] 
**lastModifiedTime** | **Date** | Time when this keyword_set was last modified (ISO 8601) | [optional] 
**dataSource** | **String** | Unique identifier (URI)for the system where this keyword_set originated, if any | [optional] 
**lastModifiedBy** | **String** | FIXME(verify) Which API user most recently edited this keyword | [optional] 
**usage** | **String** | Usage type for this keyword_set. These are allow UIs to show the set in appropriate place. FIXME: set of types is not finalized by any stretch | [optional] 
**organization** | **String** | Organization that has defined this keyword_set | [optional] 
**keywords** | [**[Keyword]**](Keyword.md) | Keywords that belong to this keyword_set | 


<a name="UsageEnum"></a>
## Enum: UsageEnum


* `any` (value: `"any"`)

* `keyword` (value: `"keyword"`)

* `audience` (value: `"audience"`)




