# FlySDK::CreateMachineRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **config** | [**ApiMachineConfig**](ApiMachineConfig.md) | An object defining the Machine configuration | [optional] |
| **lease_ttl** | **Integer** |  | [optional] |
| **lsvd** | **Boolean** |  | [optional] |
| **name** | **String** | Unique name for this Machine. If omitted, one is generated for you | [optional] |
| **region** | **String** | The target region. Omitting this param launches in the same region as your WireGuard peer connection (somewhere near you). | [optional] |
| **skip_launch** | **Boolean** |  | [optional] |
| **skip_service_registration** | **Boolean** |  | [optional] |

## Example

```ruby
require 'fly-sdk-ruby'

instance = FlySDK::CreateMachineRequest.new(
  config: null,
  lease_ttl: null,
  lsvd: null,
  name: null,
  region: null,
  skip_launch: null,
  skip_service_registration: null
)
```

