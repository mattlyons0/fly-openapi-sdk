# ApiDNSConfig

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Nameservers** | Pointer to **[]string** |  | [optional] 
**Options** | Pointer to [**[]ApiDnsOption**](ApiDnsOption.md) |  | [optional] 
**Searches** | Pointer to **[]string** |  | [optional] 
**SkipRegistration** | Pointer to **bool** |  | [optional] 

## Methods

### NewApiDNSConfig

`func NewApiDNSConfig() *ApiDNSConfig`

NewApiDNSConfig instantiates a new ApiDNSConfig object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApiDNSConfigWithDefaults

`func NewApiDNSConfigWithDefaults() *ApiDNSConfig`

NewApiDNSConfigWithDefaults instantiates a new ApiDNSConfig object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNameservers

`func (o *ApiDNSConfig) GetNameservers() []string`

GetNameservers returns the Nameservers field if non-nil, zero value otherwise.

### GetNameserversOk

`func (o *ApiDNSConfig) GetNameserversOk() (*[]string, bool)`

GetNameserversOk returns a tuple with the Nameservers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNameservers

`func (o *ApiDNSConfig) SetNameservers(v []string)`

SetNameservers sets Nameservers field to given value.

### HasNameservers

`func (o *ApiDNSConfig) HasNameservers() bool`

HasNameservers returns a boolean if a field has been set.

### GetOptions

`func (o *ApiDNSConfig) GetOptions() []ApiDnsOption`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ApiDNSConfig) GetOptionsOk() (*[]ApiDnsOption, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ApiDNSConfig) SetOptions(v []ApiDnsOption)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ApiDNSConfig) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetSearches

`func (o *ApiDNSConfig) GetSearches() []string`

GetSearches returns the Searches field if non-nil, zero value otherwise.

### GetSearchesOk

`func (o *ApiDNSConfig) GetSearchesOk() (*[]string, bool)`

GetSearchesOk returns a tuple with the Searches field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearches

`func (o *ApiDNSConfig) SetSearches(v []string)`

SetSearches sets Searches field to given value.

### HasSearches

`func (o *ApiDNSConfig) HasSearches() bool`

HasSearches returns a boolean if a field has been set.

### GetSkipRegistration

`func (o *ApiDNSConfig) GetSkipRegistration() bool`

GetSkipRegistration returns the SkipRegistration field if non-nil, zero value otherwise.

### GetSkipRegistrationOk

`func (o *ApiDNSConfig) GetSkipRegistrationOk() (*bool, bool)`

GetSkipRegistrationOk returns a tuple with the SkipRegistration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSkipRegistration

`func (o *ApiDNSConfig) SetSkipRegistration(v bool)`

SetSkipRegistration sets SkipRegistration field to given value.

### HasSkipRegistration

`func (o *ApiDNSConfig) HasSkipRegistration() bool`

HasSkipRegistration returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


