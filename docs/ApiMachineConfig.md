

# ApiMachineConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoDestroy** | **Boolean** | Optional boolean telling the Machine to destroy itself once it’s complete (default false) |  [optional] |
|**checks** | [**Map&lt;String, ApiMachineCheck&gt;**](ApiMachineCheck.md) |  |  [optional] |
|**disableMachineAutostart** | **Boolean** | Deprecated: use Service.Autostart instead |  [optional] |
|**dns** | [**ApiDNSConfig**](ApiDNSConfig.md) |  |  [optional] |
|**env** | **Map&lt;String, String&gt;** | An object filled with key/value pairs to be set as environment variables |  [optional] |
|**files** | [**List&lt;ApiFile&gt;**](ApiFile.md) |  |  [optional] |
|**guest** | [**ApiMachineGuest**](ApiMachineGuest.md) |  |  [optional] |
|**image** | **String** | The docker image to run |  [optional] |
|**init** | [**ApiMachineInit**](ApiMachineInit.md) |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** |  |  [optional] |
|**metrics** | [**ApiMachineMetrics**](ApiMachineMetrics.md) |  |  [optional] |
|**mounts** | [**List&lt;ApiMachineMount&gt;**](ApiMachineMount.md) |  |  [optional] |
|**processes** | [**List&lt;ApiMachineProcess&gt;**](ApiMachineProcess.md) |  |  [optional] |
|**restart** | [**ApiMachineRestart**](ApiMachineRestart.md) |  |  [optional] |
|**schedule** | **String** |  |  [optional] |
|**services** | [**List&lt;ApiMachineService&gt;**](ApiMachineService.md) |  |  [optional] |
|**size** | **String** | Deprecated: use Guest instead |  [optional] |
|**standbys** | **List&lt;String&gt;** | Standbys enable a machine to be a standby for another. In the event of a hardware failure, the standby machine will be started. |  [optional] |
|**statics** | [**List&lt;ApiStatic&gt;**](ApiStatic.md) |  |  [optional] |
|**stopConfig** | [**ApiStopConfig**](ApiStopConfig.md) |  |  [optional] |



