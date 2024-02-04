# VolumesApi

All URIs are relative to *https://api.machines.dev/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVolumeSnapshot**](VolumesApi.md#createVolumeSnapshot) | **POST** /apps/{app_name}/volumes/{volume_id}/snapshots | Create Snapshot |
| [**volumeDelete**](VolumesApi.md#volumeDelete) | **DELETE** /apps/{app_name}/volumes/{volume_id} | Destroy Volume |
| [**volumesCreate**](VolumesApi.md#volumesCreate) | **POST** /apps/{app_name}/volumes | Create Volume |
| [**volumesExtend**](VolumesApi.md#volumesExtend) | **PUT** /apps/{app_name}/volumes/{volume_id}/extend | Extend Volume |
| [**volumesGetById**](VolumesApi.md#volumesGetById) | **GET** /apps/{app_name}/volumes/{volume_id} | Get Volume |
| [**volumesList**](VolumesApi.md#volumesList) | **GET** /apps/{app_name}/volumes | List Volumes |
| [**volumesListSnapshots**](VolumesApi.md#volumesListSnapshots) | **GET** /apps/{app_name}/volumes/{volume_id}/snapshots | List Snapshots |
| [**volumesUpdate**](VolumesApi.md#volumesUpdate) | **POST** /apps/{app_name}/volumes/{volume_id} | Update Volume |



## createVolumeSnapshot

> createVolumeSnapshot(appName, volumeId)

Create Snapshot

Create a snapshot for a specific volume within an app. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String volumeId = "volumeId_example"; // String | Volume ID
        try {
            apiInstance.createVolumeSnapshot(appName, volumeId);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#createVolumeSnapshot");
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
| **volumeId** | **String**| Volume ID | |

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


## volumeDelete

> Volume volumeDelete(appName, volumeId)

Destroy Volume

Delete a specific volume within an app by volume ID. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String volumeId = "volumeId_example"; // String | Volume ID
        try {
            Volume result = apiInstance.volumeDelete(appName, volumeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumeDelete");
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
| **volumeId** | **String**| Volume ID | |

### Return type

[**Volume**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## volumesCreate

> Volume volumesCreate(appName, request)

Create Volume

Create a volume for a specific app using the details provided in the request body. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        CreateVolumeRequest request = new CreateVolumeRequest(); // CreateVolumeRequest | Request body
        try {
            Volume result = apiInstance.volumesCreate(appName, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumesCreate");
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
| **request** | [**CreateVolumeRequest**](CreateVolumeRequest.md)| Request body | |

### Return type

[**Volume**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## volumesExtend

> ExtendVolumeResponse volumesExtend(appName, volumeId, request)

Extend Volume

Extend a volume&#39;s size within an app using the details provided in the request body. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String volumeId = "volumeId_example"; // String | Volume ID
        ExtendVolumeRequest request = new ExtendVolumeRequest(); // ExtendVolumeRequest | Request body
        try {
            ExtendVolumeResponse result = apiInstance.volumesExtend(appName, volumeId, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumesExtend");
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
| **volumeId** | **String**| Volume ID | |
| **request** | [**ExtendVolumeRequest**](ExtendVolumeRequest.md)| Request body | |

### Return type

[**ExtendVolumeResponse**](ExtendVolumeResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## volumesGetById

> Volume volumesGetById(appName, volumeId)

Get Volume

Retrieve details about a specific volume by its ID within an app. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String volumeId = "volumeId_example"; // String | Volume ID
        try {
            Volume result = apiInstance.volumesGetById(appName, volumeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumesGetById");
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
| **volumeId** | **String**| Volume ID | |

### Return type

[**Volume**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## volumesList

> List&lt;Volume&gt; volumesList(appName)

List Volumes

List all volumes associated with a specific app. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        try {
            List<Volume> result = apiInstance.volumesList(appName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumesList");
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

### Return type

[**List&lt;Volume&gt;**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## volumesListSnapshots

> List&lt;VolumeSnapshot&gt; volumesListSnapshots(appName, volumeId)

List Snapshots

List all snapshots for a specific volume within an app. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String volumeId = "volumeId_example"; // String | Volume ID
        try {
            List<VolumeSnapshot> result = apiInstance.volumesListSnapshots(appName, volumeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumesListSnapshots");
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
| **volumeId** | **String**| Volume ID | |

### Return type

[**List&lt;VolumeSnapshot&gt;**](VolumeSnapshot.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## volumesUpdate

> Volume volumesUpdate(appName, volumeId, request)

Update Volume

Update a volume&#39;s configuration using the details provided in the request body. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.VolumesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        String volumeId = "volumeId_example"; // String | Volume ID
        UpdateVolumeRequest request = new UpdateVolumeRequest(); // UpdateVolumeRequest | Request body
        try {
            Volume result = apiInstance.volumesUpdate(appName, volumeId, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#volumesUpdate");
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
| **volumeId** | **String**| Volume ID | |
| **request** | [**UpdateVolumeRequest**](UpdateVolumeRequest.md)| Request body | |

### Return type

[**Volume**](Volume.md)

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

