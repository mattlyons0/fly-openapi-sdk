

# CreateMachineRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**config** | [**ApiMachineConfig**](ApiMachineConfig.md) | An object defining the Machine configuration |  [optional] |
|**leaseTtl** | **Integer** |  |  [optional] |
|**lsvd** | **Boolean** |  |  [optional] |
|**name** | **String** | Unique name for this Machine. If omitted, one is generated for you |  [optional] |
|**region** | **String** | The target region. Omitting this param launches in the same region as your WireGuard peer connection (somewhere near you). |  [optional] |
|**skipLaunch** | **Boolean** |  |  [optional] |
|**skipServiceRegistration** | **Boolean** |  |  [optional] |



