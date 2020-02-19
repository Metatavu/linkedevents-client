# LinkedeventsClient.Event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | consists of source prefix and source specific identifier. These should be URIs uniquely identifying the event, and preferably also well formed http-URLs pointing to more information about the event. | [optional] 
**location** | [**Place**](Place.md) |  | 
**keywords** | [**[IdRef]**](IdRef.md) | array of keyword uri references | 
**inLanguage** | [**[Language]**](Language.md) | the languages spoken or supported at the event | [optional] 
**superEvent** | [**IdRef**](IdRef.md) | references the aggregate event containing this event | [optional] 
**superEventType** | **String** | If the event has sub_events, describes the type of the event. Current options are &#39;null&#39; and &#39;recurring&#39;, which means a repeating event. | [optional] 
**eventStatus** | **String** | As defined in schema.org/Event. Postponed events do not have a date set, rescheduled events have been moved to different date. | [optional] 
**publicationStatus** | **String** | Only available in POST/PUT. Specifies whether the event should be published in the API (&#39;public&#39;) or not (&#39;draft&#39;). | 
**externalLinks** | [**[Eventlink]**](Eventlink.md) | See external link definition | [optional] 
**offers** | [**[Offer]**](Offer.md) | See offer definition | [optional] 
**subEvents** | [**[IdRef]**](IdRef.md) | for aggregate events this contains references to all sub events. Usually this means that the sub events are part of series. The field &#39;super_event_type&#39; tells the type of the aggregate event. | [optional] 
**customData** | **Object** | Key value field for custom data. FIXME: is there 6Aika-wide use case for this? | [optional] 
**name** | [**EventName**](EventName.md) |  | [optional] 
**images** | [**[Image]**](Image.md) |  | [optional] 
**createdTime** | **Date** | Creation time for the event entry. | [optional] 
**lastModifiedTime** | **Date** | Time this event was modified in the datastore behind the API (not necessarily in the originating system) | [optional] 
**infoUrl** | [**EventInfoUrl**](EventInfoUrl.md) |  | [optional] 
**description** | **Object** | Description for the event, several chapters(FIXME, verify) | [optional] 
**shortDescription** | **Object** | Short description for the event, recommended limit 140 characters | [optional] 
**context** | **String** |  | [optional] 
**type** | **String** |  | [optional] 
**datePublished** | **Date** | Date this event is free to be published | [optional] 
**provider** | **Object** | organization responsible for the practical implementation of the event | [optional] 
**locationExtraInfo** | **Object** | Unstructured extra info about location (like \&quot;eastern door of railway station\&quot;) | [optional] 
**startTime** | **Date** | Time the event will start | 
**endTime** | **Date** | Time the event will end | [optional] 
**hasStartTime** | **Boolean** |  | [optional] 
**hasEndTime** | **Boolean** |  | [optional] 
**audience** | [**[Keyword]**](Keyword.md) |  | [optional] 
**dataSource** | **String** | Unique identifier (URI)for the system from which this event came from, preferably URL with more information about the system and its policies | [optional] 
**createdBy** | **String** | FIXME(verify) Which API user created this keyword | [optional] 
**lastModifiedBy** | **String** | FIXME(verify) Which API user most recently edited this keyword | [optional] 
**publisher** | **String** | Organization responsible for this event record. | [optional] 


