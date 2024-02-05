# MachinesApi

All URIs are relative to *https://api.machines.dev/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**machinesCordon**](MachinesApi.md#machinesCordon) | **POST** /apps/{app_name}/machines/{machine_id}/cordon | Cordon Machine |
| [**machinesCreate**](MachinesApi.md#machinesCreate) | **POST** /apps/{app_name}/machines | Create Machine |
| [**machinesCreateLease**](MachinesApi.md#machinesCreateLease) | **POST** /apps/{app_name}/machines/{machine_id}/lease | Create Lease |
| [**machinesDelete**](MachinesApi.md#machinesDelete) | **DELETE** /apps/{app_name}/machines/{machine_id} | Destroy Machine |
| [**machinesDeleteMetadata**](MachinesApi.md#machinesDeleteMetadata) | **DELETE** /apps/{app_name}/machines/{machine_id}/metadata/{key} | Delete Metadata |
| [**machinesExec**](MachinesApi.md#machinesExec) | **POST** /apps/{app_name}/machines/{machine_id}/exec | Execute Command |
| [**machinesList**](MachinesApi.md#machinesList) | **GET** /apps/{app_name}/machines | List Machines |
| [**machinesListEvents**](MachinesApi.md#machinesListEvents) | **GET** /apps/{app_name}/machines/{machine_id}/events | List Events |
| [**machinesListProcesses**](MachinesApi.md#machinesListProcesses) | **GET** /apps/{app_name}/machines/{machine_id}/ps | List Processes |
| [**machinesListVersions**](MachinesApi.md#machinesListVersions) | **GET** /apps/{app_name}/machines/{machine_id}/versions | List Versions |
| [**machinesReleaseLease**](MachinesApi.md#machinesReleaseLease) | **DELETE** /apps/{app_name}/machines/{machine_id}/lease | Release Lease |
| [**machinesRestart**](MachinesApi.md#machinesRestart) | **POST** /apps/{app_name}/machines/{machine_id}/restart | Restart Machine |
| [**machinesShow**](MachinesApi.md#machinesShow) | **GET** /apps/{app_name}/machines/{machine_id} | Get Machine |
| [**machinesShowLease**](MachinesApi.md#machinesShowLease) | **GET** /apps/{app_name}/machines/{machine_id}/lease | Get Lease |
| [**machinesShowMetadata**](MachinesApi.md#machinesShowMetadata) | **GET** /apps/{app_name}/machines/{machine_id}/metadata | Get Metadata |
| [**machinesSignal**](MachinesApi.md#machinesSignal) | **POST** /apps/{app_name}/machines/{machine_id}/signal | Signal Machine |
| [**machinesStart**](MachinesApi.md#machinesStart) | **POST** /apps/{app_name}/machines/{machine_id}/start | Start Machine |
| [**machinesStop**](MachinesApi.md#machinesStop) | **POST** /apps/{app_name}/machines/{machine_id}/stop | Stop Machine |
| [**machinesUncordon**](MachinesApi.md#machinesUncordon) | **POST** /apps/{app_name}/machines/{machine_id}/uncordon | Uncordon Machine |
| [**machinesUpdate**](MachinesApi.md#machinesUpdate) | **POST** /apps/{app_name}/machines/{machine_id} | Update Machine |
| [**machinesUpdateMetadata**](MachinesApi.md#machinesUpdateMetadata) | **POST** /apps/{app_name}/machines/{machine_id}/metadata/{key} | Update Metadata |
| [**machinesWait**](MachinesApi.md#machinesWait) | **GET** /apps/{app_name}/machines/{machine_id}/wait | Wait for State |



## machinesCordon

> machinesCordon(appName, machineId)

Cordon Machine

“Cordoning” a Machine refers to disabling its services, so the Fly Proxy won’t route requests to it. In flyctl this is used by blue/green deployments; one set of Machines is started up with services disabled, and when they are all healthy, the services are enabled on the new Machines and disabled on the old ones. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        try {
            apiInstance.machinesCordon(appName, machineId);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesCordon");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesCreate

> Machine machinesCreate(appName, request)

Create Machine

Create a Machine within a specific app using the details provided in the request body.  **Important**: This request can fail, and you’re responsible for handling that failure. If you ask for a large Machine, or a Machine in a region we happen to be at capacity for, you might need to retry the request, or to fall back to another region. If you’re working directly with the Machines API, you’re taking some responsibility for your own orchestration! 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        CreateMachineRequest request = new CreateMachineRequest(); // CreateMachineRequest | Create machine request
        try {
            Machine result = apiInstance.machinesCreate(appName, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **request** | [**CreateMachineRequest**](CreateMachineRequest.md)| Create machine request | |

### Return type

[**Machine**](Machine.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesCreateLease

> Lease machinesCreateLease(appName, machineId, request)

Create Lease

Create a lease for a specific Machine within an app using the details provided in the request body. Machine leases can be used to obtain an exclusive lock on modifying a Machine. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        CreateLeaseRequest request = new CreateLeaseRequest(); // CreateLeaseRequest | Request body
        try {
            Lease result = apiInstance.machinesCreateLease(appName, machineId, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesCreateLease");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |
| **request** | [**CreateLeaseRequest**](CreateLeaseRequest.md)| Request body | |

### Return type

[**Lease**](Lease.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesDelete

> machinesDelete(appName, machineId, force)

Destroy Machine

Delete a specific Machine within an app by Machine ID, with an optional force parameter to force kill the Machine if it&#39;s running. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        Boolean force = true; // Boolean | Force kill the machine if it's running
        try {
            apiInstance.machinesDelete(appName, machineId, force);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |
| **force** | **Boolean**| Force kill the machine if it&#39;s running | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesDeleteMetadata

> machinesDeleteMetadata(appName, machineId, key)

Delete Metadata

Delete metadata for a specific Machine within an app by providing a metadata key. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        String key = "key_example"; // String | Metadata Key
        try {
            apiInstance.machinesDeleteMetadata(appName, machineId, key);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesDeleteMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |
| **key** | **String**| Metadata Key | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |


## machinesExec

> String machinesExec(appName, machineId, request)

Execute Command

Execute a command on a specific Machine and return the raw command output bytes. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        MachineExecRequest request = new MachineExecRequest(); // MachineExecRequest | Request body
        try {
            String result = apiInstance.machinesExec(appName, machineId, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesExec");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |
| **request** | [**MachineExecRequest**](MachineExecRequest.md)| Request body | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Raw command output bytes are written back |  -  |
| **400** | Bad Request |  -  |


## machinesList

> List&lt;Machine&gt; machinesList(appName, includeDeleted, region)

List Machines

List all Machines associated with a specific app, with optional filters for including deleted Machines and filtering by region. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        Boolean includeDeleted = true; // Boolean | Include deleted machines
        String region = "region_example"; // String | Region filter
        try {
            List<Machine> result = apiInstance.machinesList(appName, includeDeleted, region);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **includeDeleted** | **Boolean**| Include deleted machines | [optional] |
| **region** | **String**| Region filter | [optional] |

### Return type

[**List&lt;Machine&gt;**](Machine.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesListEvents

> List&lt;MachineEvent&gt; machinesListEvents(appName, machineId)

List Events

List all events associated with a specific Machine within an app. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        try {
            List<MachineEvent> result = apiInstance.machinesListEvents(appName, machineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesListEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |

### Return type

[**List&lt;MachineEvent&gt;**](MachineEvent.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesListProcesses

> List&lt;ProcessStat&gt; machinesListProcesses(appName, machineId, sortBy, order)

List Processes

List all processes running on a specific Machine within an app, with optional sorting parameters. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        String sortBy = "sortBy_example"; // String | Sort by
        String order = "order_example"; // String | Order
        try {
            List<ProcessStat> result = apiInstance.machinesListProcesses(appName, machineId, sortBy, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesListProcesses");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |
| **sortBy** | **String**| Sort by | [optional] |
| **order** | **String**| Order | [optional] |

### Return type

[**List&lt;ProcessStat&gt;**](ProcessStat.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## machinesListVersions

> List&lt;MachineVersion&gt; machinesListVersions(appName, machineId)

List Versions

List all versions of the configuration for a specific Machine within an app. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        try {
            List<MachineVersion> result = apiInstance.machinesListVersions(appName, machineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesListVersions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |

### Return type

[**List&lt;MachineVersion&gt;**](MachineVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesReleaseLease

> machinesReleaseLease(appName, machineId)

Release Lease

Release the lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        try {
            apiInstance.machinesReleaseLease(appName, machineId);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesReleaseLease");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesRestart

> machinesRestart(appName, machineId, timeout)

Restart Machine

Restart a specific Machine within an app, with an optional timeout parameter. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        String timeout = "timeout_example"; // String | Restart timeout as a Go duration string or number of seconds
        try {
            apiInstance.machinesRestart(appName, machineId, timeout);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesRestart");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |
| **timeout** | **String**| Restart timeout as a Go duration string or number of seconds | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## machinesShow

> Machine machinesShow(appName, machineId)

Get Machine

Get details of a specific Machine within an app by the Machine ID. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        try {
            Machine result = apiInstance.machinesShow(appName, machineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesShow");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |

### Return type

[**Machine**](Machine.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesShowLease

> Lease machinesShowLease(appName, machineId)

Get Lease

Retrieve the current lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        try {
            Lease result = apiInstance.machinesShowLease(appName, machineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesShowLease");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |

### Return type

[**Lease**](Lease.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesShowMetadata

> Map&lt;String, String&gt; machinesShowMetadata(appName, machineId)

Get Metadata

Retrieve metadata for a specific Machine within an app. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        try {
            Map<String, String> result = apiInstance.machinesShowMetadata(appName, machineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesShowMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesSignal

> machinesSignal(appName, machineId, request)

Signal Machine

Send a signal to a specific Machine within an app using the details provided in the request body. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        SignalRequest request = new SignalRequest(); // SignalRequest | Request body
        try {
            apiInstance.machinesSignal(appName, machineId, request);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesSignal");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |
| **request** | [**SignalRequest**](SignalRequest.md)| Request body | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## machinesStart

> machinesStart(appName, machineId)

Start Machine

Start a specific Machine within an app. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        try {
            apiInstance.machinesStart(appName, machineId);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesStart");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesStop

> machinesStop(appName, machineId, request)

Stop Machine

Stop a specific Machine within an app, with an optional request body to specify signal and timeout. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        StopRequest request = new StopRequest(); // StopRequest | Optional request body
        try {
            apiInstance.machinesStop(appName, machineId, request);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesStop");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |
| **request** | [**StopRequest**](StopRequest.md)| Optional request body | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## machinesUncordon

> machinesUncordon(appName, machineId)

Uncordon Machine

“Cordoning” a Machine refers to disabling its services, so the Fly Proxy won’t route requests to it. In flyctl this is used by blue/green deployments; one set of Machines is started up with services disabled, and when they are all healthy, the services are enabled on the new Machines and disabled on the old ones. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        try {
            apiInstance.machinesUncordon(appName, machineId);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesUncordon");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## machinesUpdate

> Machine machinesUpdate(appName, machineId, request)

Update Machine

Update a Machine&#39;s configuration using the details provided in the request body. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        UpdateMachineRequest request = new UpdateMachineRequest(); // UpdateMachineRequest | Request body
        try {
            Machine result = apiInstance.machinesUpdate(appName, machineId, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |
| **request** | [**UpdateMachineRequest**](UpdateMachineRequest.md)| Request body | |

### Return type

[**Machine**](Machine.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## machinesUpdateMetadata

> machinesUpdateMetadata(appName, machineId, key)

Update Metadata

Update metadata for a specific machine within an app by providing a metadata key. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        String key = "key_example"; // String | Metadata Key
        try {
            apiInstance.machinesUpdateMetadata(appName, machineId, key);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesUpdateMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |
| **key** | **String**| Metadata Key | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |


## machinesWait

> machinesWait(appName, machineId, instanceId, timeout, state)

Wait for State

Wait for a Machine to reach a specific state. Specify the desired state with the state parameter. See the [Machine states table](https://fly.io/docs/machines/working-with-machines/#machine-states) for a list of possible states. The default for this parameter is &#x60;started&#x60;.  This request will block for up to 60 seconds. Set a shorter timeout with the timeout parameter. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.MachinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        MachinesApi apiInstance = new MachinesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String machineId = "machineId_example"; // String | Machine ID
        String instanceId = "instanceId_example"; // String | instance? version? TODO
        Long timeout = 56L; // Long | wait timeout. default 60s
        String state = "started"; // String | desired state
        try {
            apiInstance.machinesWait(appName, machineId, instanceId, timeout, state);
        } catch (ApiException e) {
            System.err.println("Exception when calling MachinesApi#machinesWait");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appName** | **String**| Fly App Name | |
| **machineId** | **String**| Machine ID | |
| **instanceId** | **String**| instance? version? TODO | [optional] |
| **timeout** | **Long**| wait timeout. default 60s | [optional] |
| **state** | **String**| desired state | [optional] [enum: started, stopped, destroyed] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

