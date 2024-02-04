# FlySDK::VolumesApi

All URIs are relative to *https://api.machines.dev/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_volume_snapshot**](VolumesApi.md#create_volume_snapshot) | **POST** /apps/{app_name}/volumes/{volume_id}/snapshots | Create Snapshot |
| [**volume_delete**](VolumesApi.md#volume_delete) | **DELETE** /apps/{app_name}/volumes/{volume_id} | Destroy Volume |
| [**volumes_create**](VolumesApi.md#volumes_create) | **POST** /apps/{app_name}/volumes | Create Volume |
| [**volumes_extend**](VolumesApi.md#volumes_extend) | **PUT** /apps/{app_name}/volumes/{volume_id}/extend | Extend Volume |
| [**volumes_get_by_id**](VolumesApi.md#volumes_get_by_id) | **GET** /apps/{app_name}/volumes/{volume_id} | Get Volume |
| [**volumes_list**](VolumesApi.md#volumes_list) | **GET** /apps/{app_name}/volumes | List Volumes |
| [**volumes_list_snapshots**](VolumesApi.md#volumes_list_snapshots) | **GET** /apps/{app_name}/volumes/{volume_id}/snapshots | List Snapshots |
| [**volumes_update**](VolumesApi.md#volumes_update) | **POST** /apps/{app_name}/volumes/{volume_id} | Update Volume |


## create_volume_snapshot

> create_volume_snapshot(app_name, volume_id)

Create Snapshot

Create a snapshot for a specific volume within an app. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::VolumesApi.new
app_name = 'app_name_example' # String | Fly App Name
volume_id = 'volume_id_example' # String | Volume ID

begin
  # Create Snapshot
  api_instance.create_volume_snapshot(app_name, volume_id)
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->create_volume_snapshot: #{e}"
end
```

#### Using the create_volume_snapshot_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> create_volume_snapshot_with_http_info(app_name, volume_id)

```ruby
begin
  # Create Snapshot
  data, status_code, headers = api_instance.create_volume_snapshot_with_http_info(app_name, volume_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->create_volume_snapshot_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **volume_id** | **String** | Volume ID |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## volume_delete

> <Volume> volume_delete(app_name, volume_id)

Destroy Volume

Delete a specific volume within an app by volume ID. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::VolumesApi.new
app_name = 'app_name_example' # String | Fly App Name
volume_id = 'volume_id_example' # String | Volume ID

begin
  # Destroy Volume
  result = api_instance.volume_delete(app_name, volume_id)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volume_delete: #{e}"
end
```

#### Using the volume_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Volume>, Integer, Hash)> volume_delete_with_http_info(app_name, volume_id)

```ruby
begin
  # Destroy Volume
  data, status_code, headers = api_instance.volume_delete_with_http_info(app_name, volume_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Volume>
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volume_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **volume_id** | **String** | Volume ID |  |

### Return type

[**Volume**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## volumes_create

> <Volume> volumes_create(app_name, request)

Create Volume

Create a volume for a specific app using the details provided in the request body. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::VolumesApi.new
app_name = 'app_name_example' # String | Fly App Name
request = FlySDK::CreateVolumeRequest.new # CreateVolumeRequest | Request body

begin
  # Create Volume
  result = api_instance.volumes_create(app_name, request)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volumes_create: #{e}"
end
```

#### Using the volumes_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Volume>, Integer, Hash)> volumes_create_with_http_info(app_name, request)

```ruby
begin
  # Create Volume
  data, status_code, headers = api_instance.volumes_create_with_http_info(app_name, request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Volume>
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volumes_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **request** | [**CreateVolumeRequest**](CreateVolumeRequest.md) | Request body |  |

### Return type

[**Volume**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## volumes_extend

> <ExtendVolumeResponse> volumes_extend(app_name, volume_id, request)

Extend Volume

Extend a volume's size within an app using the details provided in the request body. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::VolumesApi.new
app_name = 'app_name_example' # String | Fly App Name
volume_id = 'volume_id_example' # String | Volume ID
request = FlySDK::ExtendVolumeRequest.new # ExtendVolumeRequest | Request body

begin
  # Extend Volume
  result = api_instance.volumes_extend(app_name, volume_id, request)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volumes_extend: #{e}"
end
```

#### Using the volumes_extend_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ExtendVolumeResponse>, Integer, Hash)> volumes_extend_with_http_info(app_name, volume_id, request)

```ruby
begin
  # Extend Volume
  data, status_code, headers = api_instance.volumes_extend_with_http_info(app_name, volume_id, request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ExtendVolumeResponse>
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volumes_extend_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **volume_id** | **String** | Volume ID |  |
| **request** | [**ExtendVolumeRequest**](ExtendVolumeRequest.md) | Request body |  |

### Return type

[**ExtendVolumeResponse**](ExtendVolumeResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## volumes_get_by_id

> <Volume> volumes_get_by_id(app_name, volume_id)

Get Volume

Retrieve details about a specific volume by its ID within an app. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::VolumesApi.new
app_name = 'app_name_example' # String | Fly App Name
volume_id = 'volume_id_example' # String | Volume ID

begin
  # Get Volume
  result = api_instance.volumes_get_by_id(app_name, volume_id)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volumes_get_by_id: #{e}"
end
```

#### Using the volumes_get_by_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Volume>, Integer, Hash)> volumes_get_by_id_with_http_info(app_name, volume_id)

```ruby
begin
  # Get Volume
  data, status_code, headers = api_instance.volumes_get_by_id_with_http_info(app_name, volume_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Volume>
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volumes_get_by_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **volume_id** | **String** | Volume ID |  |

### Return type

[**Volume**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## volumes_list

> <Array<Volume>> volumes_list(app_name)

List Volumes

List all volumes associated with a specific app. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::VolumesApi.new
app_name = 'app_name_example' # String | Fly App Name

begin
  # List Volumes
  result = api_instance.volumes_list(app_name)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volumes_list: #{e}"
end
```

#### Using the volumes_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<Volume>>, Integer, Hash)> volumes_list_with_http_info(app_name)

```ruby
begin
  # List Volumes
  data, status_code, headers = api_instance.volumes_list_with_http_info(app_name)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<Volume>>
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volumes_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |

### Return type

[**Array&lt;Volume&gt;**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## volumes_list_snapshots

> <Array<VolumeSnapshot>> volumes_list_snapshots(app_name, volume_id)

List Snapshots

List all snapshots for a specific volume within an app. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::VolumesApi.new
app_name = 'app_name_example' # String | Fly App Name
volume_id = 'volume_id_example' # String | Volume ID

begin
  # List Snapshots
  result = api_instance.volumes_list_snapshots(app_name, volume_id)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volumes_list_snapshots: #{e}"
end
```

#### Using the volumes_list_snapshots_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<VolumeSnapshot>>, Integer, Hash)> volumes_list_snapshots_with_http_info(app_name, volume_id)

```ruby
begin
  # List Snapshots
  data, status_code, headers = api_instance.volumes_list_snapshots_with_http_info(app_name, volume_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<VolumeSnapshot>>
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volumes_list_snapshots_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **volume_id** | **String** | Volume ID |  |

### Return type

[**Array&lt;VolumeSnapshot&gt;**](VolumeSnapshot.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## volumes_update

> <Volume> volumes_update(app_name, volume_id, request)

Update Volume

Update a volume's configuration using the details provided in the request body. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::VolumesApi.new
app_name = 'app_name_example' # String | Fly App Name
volume_id = 'volume_id_example' # String | Volume ID
request = FlySDK::UpdateVolumeRequest.new # UpdateVolumeRequest | Request body

begin
  # Update Volume
  result = api_instance.volumes_update(app_name, volume_id, request)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volumes_update: #{e}"
end
```

#### Using the volumes_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Volume>, Integer, Hash)> volumes_update_with_http_info(app_name, volume_id, request)

```ruby
begin
  # Update Volume
  data, status_code, headers = api_instance.volumes_update_with_http_info(app_name, volume_id, request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Volume>
rescue FlySDK::ApiError => e
  puts "Error when calling VolumesApi->volumes_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **volume_id** | **String** | Volume ID |  |
| **request** | [**UpdateVolumeRequest**](UpdateVolumeRequest.md) | Request body |  |

### Return type

[**Volume**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

