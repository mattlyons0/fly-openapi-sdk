# ApiDnsOption


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from fly_sdk.models.api_dns_option import ApiDnsOption

# TODO update the JSON string below
json = "{}"
# create an instance of ApiDnsOption from a JSON string
api_dns_option_instance = ApiDnsOption.from_json(json)
# print the JSON string representation of the object
print ApiDnsOption.to_json()

# convert the object into a dict
api_dns_option_dict = api_dns_option_instance.to_dict()
# create an instance of ApiDnsOption from a dict
api_dns_option_form_dict = api_dns_option.from_dict(api_dns_option_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


