# AppsApi

All URIs are relative to *https://api.machines.dev/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appsCreate**](AppsApi.md#appsCreate) | **POST** /apps | Create App |
| [**appsDelete**](AppsApi.md#appsDelete) | **DELETE** /apps/{app_name} | Destroy App |
| [**appsList**](AppsApi.md#appsList) | **GET** /apps | List Apps |
| [**appsShow**](AppsApi.md#appsShow) | **GET** /apps/{app_name} | Get App |



## appsCreate

> appsCreate(request)

Create App

Create an app with the specified details in the request body. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.AppsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        AppsApi apiInstance = new AppsApi(defaultClient);
        CreateAppRequest request = new CreateAppRequest(); // CreateAppRequest | App body
        try {
            apiInstance.appsCreate(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppsApi#appsCreate");
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
| **request** | [**CreateAppRequest**](CreateAppRequest.md)| App body | |

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
| **201** | Created |  -  |
| **400** | Bad Request |  -  |


## appsDelete

> appsDelete(appName)

Destroy App

Delete an app by its name. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.AppsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        AppsApi apiInstance = new AppsApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        try {
            apiInstance.appsDelete(appName);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppsApi#appsDelete");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |


## appsList

> ListAppsResponse appsList(orgSlug)

List Apps

List all apps with the ability to filter by organization slug. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.AppsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        AppsApi apiInstance = new AppsApi(defaultClient);
        String orgSlug = "orgSlug_example"; // String | The org slug, or 'personal', to filter apps
        try {
            ListAppsResponse result = apiInstance.appsList(orgSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppsApi#appsList");
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
| **orgSlug** | **String**| The org slug, or &#39;personal&#39;, to filter apps | |

### Return type

[**ListAppsResponse**](ListAppsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## appsShow

> App appsShow(appName)

Get App

Retrieve details about a specific app by its name. 

### Example

```java
// Import classes:
import io.fly.client.ApiClient;
import io.fly.client.ApiException;
import io.fly.client.Configuration;
import io.fly.client.models.*;
import io.fly.sdk.AppsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");

        AppsApi apiInstance = new AppsApi(defaultClient);
        String appName = "appName_example"; // String | Fly App Name
        try {
            App result = apiInstance.appsShow(appName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppsApi#appsShow");
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

[**App**](App.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

