# LinkedeventsClient.Place

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Consists of source prefix and source specific identifier. These should be URIs uniquely identifying the place, and preferably also well formed http-URLs pointing to more information about the place. | [optional] 
**customData** | [**[PlaceCustomData]**](PlaceCustomData.md) | Key value field for custom data. FIXME: is there 6Aika-wide use case for this? | [optional] 
**name** | [**PlaceName**](PlaceName.md) |  | [optional] 
**images** | [**[Image]**](Image.md) |  | [optional] 
**originId** | **String** | Place identifier in the originating system, these should be in same format as id but variations are more likely than with id. | [optional] 
**createdTime** | **Date** | Creation time for the place entry. | [optional] 
**lastModifiedTime** | **Date** | Time this place was modified in the datastore behind the API (not necessarily in the originating system) | [optional] 
**infoUrl** | [**PlaceInfoUrl**](PlaceInfoUrl.md) |  | [optional] 
**description** | [**PlaceDescription**](PlaceDescription.md) |  | [optional] 
**position** | [**PlacePosition**](PlacePosition.md) |  | [optional] 
**email** | **String** | Contact email for the place, note that this is NOT multilingual | [optional] 
**telephone** | [**PlaceTelephone**](PlaceTelephone.md) |  | [optional] 
**contactType** | **String** | FIXME: this seems unused in Helsinki data. Does any 6Aika city have use for describing contact type? | [optional] 
**streetAddress** | [**PlaceStreetAddress**](PlaceStreetAddress.md) |  | [optional] 
**addressLocality** | [**PlaceAddressLocality**](PlaceAddressLocality.md) |  | [optional] 
**addressRegion** | **String** | Larger region for address (like states), not typically used in Finland | [optional] 
**postalCode** | **String** | Postal code of the location (as used by traditional mail) | [optional] 
**postOfficeBoxNum** | **String** | PO box for traditional mail, in case mail is not delivered to the building | [optional] 
**addressCountry** | **String** | Country for the place, NOT multilingual | [optional] 
**deleted** | **Boolean** | This place entry is not used anymore, but old events still reference it. This might be because of duplicate removal. | [optional] 
**dataSource** | **String** | Identifies the source for data, this is specific to API provider. This is useful for API users, as any data quality issues are likely to be specific to data source and workarounds can be applied as such. | [optional] 
**publisher** | **String** | Organization that provided the event that this place is associated with | [optional] 
**id** | **String** |  | [optional] 


