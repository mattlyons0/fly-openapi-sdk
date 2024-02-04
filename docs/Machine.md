

# Machine


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checks** | [**List&lt;CheckStatus&gt;**](CheckStatus.md) |  |  [optional] |
|**config** | [**ApiMachineConfig**](ApiMachineConfig.md) |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**events** | [**List&lt;MachineEvent&gt;**](MachineEvent.md) |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**imageRef** | [**ImageRef**](ImageRef.md) |  |  [optional] |
|**instanceId** | **String** | InstanceID is unique for each version of the machine |  [optional] |
|**name** | **String** |  |  [optional] |
|**nonce** | **String** | Nonce is only every returned on machine creation if a lease_duration was provided. |  [optional] |
|**privateIp** | **String** | PrivateIP is the internal 6PN address of the machine. |  [optional] |
|**region** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |



