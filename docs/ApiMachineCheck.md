

# ApiMachineCheck

An optional object that defines one or more named checks. The key for each check is the check name.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gracePeriod** | **String** | The time to wait after a VM starts before checking its health |  [optional] |
|**headers** | [**List&lt;ApiMachineHTTPHeader&gt;**](ApiMachineHTTPHeader.md) |  |  [optional] |
|**interval** | **String** | The time between connectivity checks |  [optional] |
|**method** | **String** | For http checks, the HTTP method to use to when making the request |  [optional] |
|**path** | **String** | For http checks, the path to send the request to |  [optional] |
|**port** | **Long** | The port to connect to, often the same as internal_port |  [optional] |
|**protocol** | **String** | For http checks, whether to use http or https |  [optional] |
|**timeout** | **String** | The maximum time a connection can take before being reported as failing its health check |  [optional] |
|**tlsServerName** | **String** | If the protocol is https, the hostname to use for TLS certificate validation |  [optional] |
|**tlsSkipVerify** | **Boolean** | For http checks with https protocol, whether or not to verify the TLS certificate |  [optional] |
|**type** | **String** | tcp or http |  [optional] |



