# FlySDK::ApiDNSConfig

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **nameservers** | **Array&lt;String&gt;** |  | [optional] |
| **options** | [**Array&lt;ApiDnsOption&gt;**](ApiDnsOption.md) |  | [optional] |
| **searches** | **Array&lt;String&gt;** |  | [optional] |
| **skip_registration** | **Boolean** |  | [optional] |

## Example

```ruby
require 'fly-sdk-ruby'

instance = FlySDK::ApiDNSConfig.new(
  nameservers: null,
  options: null,
  searches: null,
  skip_registration: null
)
```

