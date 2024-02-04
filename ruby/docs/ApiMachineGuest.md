# FlySDK::ApiMachineGuest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cpu_kind** | **String** |  | [optional] |
| **cpus** | **Integer** |  | [optional] |
| **gpu_kind** | **String** |  | [optional] |
| **gpus** | **Integer** |  | [optional] |
| **host_dedication_id** | **String** |  | [optional] |
| **kernel_args** | **Array&lt;String&gt;** |  | [optional] |
| **memory_mb** | **Integer** |  | [optional] |

## Example

```ruby
require 'fly-sdk-ruby'

instance = FlySDK::ApiMachineGuest.new(
  cpu_kind: null,
  cpus: null,
  gpu_kind: null,
  gpus: null,
  host_dedication_id: null,
  kernel_args: null,
  memory_mb: null
)
```

