

# ApiMachineRestart

The Machine restart policy defines whether and how flyd restarts a Machine after its main process exits. See https://fly.io/docs/machines/guides-examples/machine-restart-policy/.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxRetries** | **Integer** | When policy is on-failure, the maximum number of times to attempt to restart the Machine before letting it stop. |  [optional] |
|**policy** | [**PolicyEnum**](#PolicyEnum) | * no - Never try to restart a Machine automatically when its main process exits, whether that’s on purpose or on a crash. * always - Always restart a Machine automatically and never let it enter a stopped state, even when the main process exits cleanly. * on-failure - Try up to MaxRetries times to automatically restart the Machine if it exits with a non-zero exit code. Default when no explicit policy is set, and for Machines with schedules. |  [optional] |



## Enum: PolicyEnum

| Name | Value |
|---- | -----|
| NO | &quot;no&quot; |
| ALWAYS | &quot;always&quot; |
| ON_FAILURE | &quot;on-failure&quot; |



