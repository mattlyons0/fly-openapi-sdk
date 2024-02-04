# FlySDK::MachinesApi

All URIs are relative to *https://api.machines.dev/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**machines_cordon**](MachinesApi.md#machines_cordon) | **POST** /apps/{app_name}/machines/{machine_id}/cordon | Cordon Machine |
| [**machines_create**](MachinesApi.md#machines_create) | **POST** /apps/{app_name}/machines | Create Machine |
| [**machines_create_lease**](MachinesApi.md#machines_create_lease) | **POST** /apps/{app_name}/machines/{machine_id}/lease | Create Lease |
| [**machines_delete**](MachinesApi.md#machines_delete) | **DELETE** /apps/{app_name}/machines/{machine_id} | Destroy Machine |
| [**machines_delete_metadata**](MachinesApi.md#machines_delete_metadata) | **DELETE** /apps/{app_name}/machines/{machine_id}/metadata/{key} | Delete Metadata |
| [**machines_exec**](MachinesApi.md#machines_exec) | **POST** /apps/{app_name}/machines/{machine_id}/exec | Execute Command |
| [**machines_list**](MachinesApi.md#machines_list) | **GET** /apps/{app_name}/machines | List Machines |
| [**machines_list_events**](MachinesApi.md#machines_list_events) | **GET** /apps/{app_name}/machines/{machine_id}/events | List Events |
| [**machines_list_processes**](MachinesApi.md#machines_list_processes) | **GET** /apps/{app_name}/machines/{machine_id}/ps | List Processes |
| [**machines_list_versions**](MachinesApi.md#machines_list_versions) | **GET** /apps/{app_name}/machines/{machine_id}/versions | List Versions |
| [**machines_release_lease**](MachinesApi.md#machines_release_lease) | **DELETE** /apps/{app_name}/machines/{machine_id}/lease | Release Lease |
| [**machines_restart**](MachinesApi.md#machines_restart) | **POST** /apps/{app_name}/machines/{machine_id}/restart | Restart Machine |
| [**machines_show**](MachinesApi.md#machines_show) | **GET** /apps/{app_name}/machines/{machine_id} | Get Machine |
| [**machines_show_lease**](MachinesApi.md#machines_show_lease) | **GET** /apps/{app_name}/machines/{machine_id}/lease | Get Lease |
| [**machines_show_metadata**](MachinesApi.md#machines_show_metadata) | **GET** /apps/{app_name}/machines/{machine_id}/metadata | Get Metadata |
| [**machines_signal**](MachinesApi.md#machines_signal) | **POST** /apps/{app_name}/machines/{machine_id}/signal | Signal Machine |
| [**machines_start**](MachinesApi.md#machines_start) | **POST** /apps/{app_name}/machines/{machine_id}/start | Start Machine |
| [**machines_stop**](MachinesApi.md#machines_stop) | **POST** /apps/{app_name}/machines/{machine_id}/stop | Stop Machine |
| [**machines_uncordon**](MachinesApi.md#machines_uncordon) | **POST** /apps/{app_name}/machines/{machine_id}/uncordon | Uncordon Machine |
| [**machines_update**](MachinesApi.md#machines_update) | **POST** /apps/{app_name}/machines/{machine_id} | Update Machine |
| [**machines_update_metadata**](MachinesApi.md#machines_update_metadata) | **POST** /apps/{app_name}/machines/{machine_id}/metadata/{key} | Update Metadata |
| [**machines_wait**](MachinesApi.md#machines_wait) | **GET** /apps/{app_name}/machines/{machine_id}/wait | Wait for State |


## machines_cordon

> machines_cordon(app_name, machine_id)

Cordon Machine

“Cordoning” a Machine refers to disabling its services, so the Fly Proxy won’t route requests to it. In flyctl this is used by blue/green deployments; one set of Machines is started up with services disabled, and when they are all healthy, the services are enabled on the new Machines and disabled on the old ones. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID

begin
  # Cordon Machine
  api_instance.machines_cordon(app_name, machine_id)
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_cordon: #{e}"
end
```

#### Using the machines_cordon_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> machines_cordon_with_http_info(app_name, machine_id)

```ruby
begin
  # Cordon Machine
  data, status_code, headers = api_instance.machines_cordon_with_http_info(app_name, machine_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_cordon_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## machines_create

> <Machine> machines_create(app_name, request)

Create Machine

Create a Machine within a specific app using the details provided in the request body.  **Important**: This request can fail, and you’re responsible for handling that failure. If you ask for a large Machine, or a Machine in a region we happen to be at capacity for, you might need to retry the request, or to fall back to another region. If you’re working directly with the Machines API, you’re taking some responsibility for your own orchestration! 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
request = FlySDK::CreateMachineRequest.new # CreateMachineRequest | Create machine request

begin
  # Create Machine
  result = api_instance.machines_create(app_name, request)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_create: #{e}"
end
```

#### Using the machines_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Machine>, Integer, Hash)> machines_create_with_http_info(app_name, request)

```ruby
begin
  # Create Machine
  data, status_code, headers = api_instance.machines_create_with_http_info(app_name, request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Machine>
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **request** | [**CreateMachineRequest**](CreateMachineRequest.md) | Create machine request |  |

### Return type

[**Machine**](Machine.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## machines_create_lease

> <Lease> machines_create_lease(app_name, machine_id, request)

Create Lease

Create a lease for a specific Machine within an app using the details provided in the request body. Machine leases can be used to obtain an exclusive lock on modifying a Machine. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID
request = FlySDK::CreateLeaseRequest.new # CreateLeaseRequest | Request body

begin
  # Create Lease
  result = api_instance.machines_create_lease(app_name, machine_id, request)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_create_lease: #{e}"
end
```

#### Using the machines_create_lease_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Lease>, Integer, Hash)> machines_create_lease_with_http_info(app_name, machine_id, request)

```ruby
begin
  # Create Lease
  data, status_code, headers = api_instance.machines_create_lease_with_http_info(app_name, machine_id, request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Lease>
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_create_lease_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |
| **request** | [**CreateLeaseRequest**](CreateLeaseRequest.md) | Request body |  |

### Return type

[**Lease**](Lease.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## machines_delete

> machines_delete(app_name, machine_id, opts)

Destroy Machine

Delete a specific Machine within an app by Machine ID, with an optional force parameter to force kill the Machine if it's running. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID
opts = {
  force: true # Boolean | Force kill the machine if it's running
}

begin
  # Destroy Machine
  api_instance.machines_delete(app_name, machine_id, opts)
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_delete: #{e}"
end
```

#### Using the machines_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> machines_delete_with_http_info(app_name, machine_id, opts)

```ruby
begin
  # Destroy Machine
  data, status_code, headers = api_instance.machines_delete_with_http_info(app_name, machine_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |
| **force** | **Boolean** | Force kill the machine if it&#39;s running | [optional] |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## machines_delete_metadata

> machines_delete_metadata(app_name, machine_id, key)

Delete Metadata

Delete metadata for a specific Machine within an app by providing a metadata key. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID
key = 'key_example' # String | Metadata Key

begin
  # Delete Metadata
  api_instance.machines_delete_metadata(app_name, machine_id, key)
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_delete_metadata: #{e}"
end
```

#### Using the machines_delete_metadata_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> machines_delete_metadata_with_http_info(app_name, machine_id, key)

```ruby
begin
  # Delete Metadata
  data, status_code, headers = api_instance.machines_delete_metadata_with_http_info(app_name, machine_id, key)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_delete_metadata_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |
| **key** | **String** | Metadata Key |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## machines_exec

> String machines_exec(app_name, machine_id, request)

Execute Command

Execute a command on a specific Machine and return the raw command output bytes. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID
request = FlySDK::MachineExecRequest.new # MachineExecRequest | Request body

begin
  # Execute Command
  result = api_instance.machines_exec(app_name, machine_id, request)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_exec: #{e}"
end
```

#### Using the machines_exec_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> machines_exec_with_http_info(app_name, machine_id, request)

```ruby
begin
  # Execute Command
  data, status_code, headers = api_instance.machines_exec_with_http_info(app_name, machine_id, request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_exec_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |
| **request** | [**MachineExecRequest**](MachineExecRequest.md) | Request body |  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/octet-stream, application/json


## machines_list

> <Array<Machine>> machines_list(app_name, opts)

List Machines

List all Machines associated with a specific app, with optional filters for including deleted Machines and filtering by region. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
opts = {
  include_deleted: true, # Boolean | Include deleted machines
  region: 'region_example' # String | Region filter
}

begin
  # List Machines
  result = api_instance.machines_list(app_name, opts)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_list: #{e}"
end
```

#### Using the machines_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<Machine>>, Integer, Hash)> machines_list_with_http_info(app_name, opts)

```ruby
begin
  # List Machines
  data, status_code, headers = api_instance.machines_list_with_http_info(app_name, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<Machine>>
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **include_deleted** | **Boolean** | Include deleted machines | [optional] |
| **region** | **String** | Region filter | [optional] |

### Return type

[**Array&lt;Machine&gt;**](Machine.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## machines_list_events

> <Array<MachineEvent>> machines_list_events(app_name, machine_id)

List Events

List all events associated with a specific Machine within an app. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID

begin
  # List Events
  result = api_instance.machines_list_events(app_name, machine_id)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_list_events: #{e}"
end
```

#### Using the machines_list_events_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<MachineEvent>>, Integer, Hash)> machines_list_events_with_http_info(app_name, machine_id)

```ruby
begin
  # List Events
  data, status_code, headers = api_instance.machines_list_events_with_http_info(app_name, machine_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<MachineEvent>>
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_list_events_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |

### Return type

[**Array&lt;MachineEvent&gt;**](MachineEvent.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## machines_list_processes

> <Array<ProcessStat>> machines_list_processes(app_name, machine_id, opts)

List Processes

List all processes running on a specific Machine within an app, with optional sorting parameters. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID
opts = {
  sort_by: 'sort_by_example', # String | Sort by
  order: 'order_example' # String | Order
}

begin
  # List Processes
  result = api_instance.machines_list_processes(app_name, machine_id, opts)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_list_processes: #{e}"
end
```

#### Using the machines_list_processes_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<ProcessStat>>, Integer, Hash)> machines_list_processes_with_http_info(app_name, machine_id, opts)

```ruby
begin
  # List Processes
  data, status_code, headers = api_instance.machines_list_processes_with_http_info(app_name, machine_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<ProcessStat>>
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_list_processes_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |
| **sort_by** | **String** | Sort by | [optional] |
| **order** | **String** | Order | [optional] |

### Return type

[**Array&lt;ProcessStat&gt;**](ProcessStat.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## machines_list_versions

> <Array<MachineVersion>> machines_list_versions(app_name, machine_id)

List Versions

List all versions of the configuration for a specific Machine within an app. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID

begin
  # List Versions
  result = api_instance.machines_list_versions(app_name, machine_id)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_list_versions: #{e}"
end
```

#### Using the machines_list_versions_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<MachineVersion>>, Integer, Hash)> machines_list_versions_with_http_info(app_name, machine_id)

```ruby
begin
  # List Versions
  data, status_code, headers = api_instance.machines_list_versions_with_http_info(app_name, machine_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<MachineVersion>>
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_list_versions_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |

### Return type

[**Array&lt;MachineVersion&gt;**](MachineVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## machines_release_lease

> machines_release_lease(app_name, machine_id)

Release Lease

Release the lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID

begin
  # Release Lease
  api_instance.machines_release_lease(app_name, machine_id)
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_release_lease: #{e}"
end
```

#### Using the machines_release_lease_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> machines_release_lease_with_http_info(app_name, machine_id)

```ruby
begin
  # Release Lease
  data, status_code, headers = api_instance.machines_release_lease_with_http_info(app_name, machine_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_release_lease_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## machines_restart

> machines_restart(app_name, machine_id, opts)

Restart Machine

Restart a specific Machine within an app, with an optional timeout parameter. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID
opts = {
  timeout: 'timeout_example' # String | Restart timeout as a Go duration string or number of seconds
}

begin
  # Restart Machine
  api_instance.machines_restart(app_name, machine_id, opts)
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_restart: #{e}"
end
```

#### Using the machines_restart_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> machines_restart_with_http_info(app_name, machine_id, opts)

```ruby
begin
  # Restart Machine
  data, status_code, headers = api_instance.machines_restart_with_http_info(app_name, machine_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_restart_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |
| **timeout** | **String** | Restart timeout as a Go duration string or number of seconds | [optional] |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## machines_show

> <Machine> machines_show(app_name, machine_id)

Get Machine

Get details of a specific Machine within an app by the Machine ID. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID

begin
  # Get Machine
  result = api_instance.machines_show(app_name, machine_id)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_show: #{e}"
end
```

#### Using the machines_show_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Machine>, Integer, Hash)> machines_show_with_http_info(app_name, machine_id)

```ruby
begin
  # Get Machine
  data, status_code, headers = api_instance.machines_show_with_http_info(app_name, machine_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Machine>
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_show_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |

### Return type

[**Machine**](Machine.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## machines_show_lease

> <Lease> machines_show_lease(app_name, machine_id)

Get Lease

Retrieve the current lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID

begin
  # Get Lease
  result = api_instance.machines_show_lease(app_name, machine_id)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_show_lease: #{e}"
end
```

#### Using the machines_show_lease_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Lease>, Integer, Hash)> machines_show_lease_with_http_info(app_name, machine_id)

```ruby
begin
  # Get Lease
  data, status_code, headers = api_instance.machines_show_lease_with_http_info(app_name, machine_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Lease>
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_show_lease_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |

### Return type

[**Lease**](Lease.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## machines_show_metadata

> Hash&lt;String, String&gt; machines_show_metadata(app_name, machine_id)

Get Metadata

Retrieve metadata for a specific Machine within an app. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID

begin
  # Get Metadata
  result = api_instance.machines_show_metadata(app_name, machine_id)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_show_metadata: #{e}"
end
```

#### Using the machines_show_metadata_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Hash&lt;String, String&gt;, Integer, Hash)> machines_show_metadata_with_http_info(app_name, machine_id)

```ruby
begin
  # Get Metadata
  data, status_code, headers = api_instance.machines_show_metadata_with_http_info(app_name, machine_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Hash&lt;String, String&gt;
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_show_metadata_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |

### Return type

**Hash&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## machines_signal

> machines_signal(app_name, machine_id, request)

Signal Machine

Send a signal to a specific Machine within an app using the details provided in the request body. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID
request = FlySDK::SignalRequest.new # SignalRequest | Request body

begin
  # Signal Machine
  api_instance.machines_signal(app_name, machine_id, request)
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_signal: #{e}"
end
```

#### Using the machines_signal_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> machines_signal_with_http_info(app_name, machine_id, request)

```ruby
begin
  # Signal Machine
  data, status_code, headers = api_instance.machines_signal_with_http_info(app_name, machine_id, request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_signal_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |
| **request** | [**SignalRequest**](SignalRequest.md) | Request body |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## machines_start

> machines_start(app_name, machine_id)

Start Machine

Start a specific Machine within an app. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID

begin
  # Start Machine
  api_instance.machines_start(app_name, machine_id)
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_start: #{e}"
end
```

#### Using the machines_start_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> machines_start_with_http_info(app_name, machine_id)

```ruby
begin
  # Start Machine
  data, status_code, headers = api_instance.machines_start_with_http_info(app_name, machine_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_start_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## machines_stop

> machines_stop(app_name, machine_id, opts)

Stop Machine

Stop a specific Machine within an app, with an optional request body to specify signal and timeout. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID
opts = {
  request: FlySDK::StopRequest.new # StopRequest | Optional request body
}

begin
  # Stop Machine
  api_instance.machines_stop(app_name, machine_id, opts)
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_stop: #{e}"
end
```

#### Using the machines_stop_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> machines_stop_with_http_info(app_name, machine_id, opts)

```ruby
begin
  # Stop Machine
  data, status_code, headers = api_instance.machines_stop_with_http_info(app_name, machine_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_stop_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |
| **request** | [**StopRequest**](StopRequest.md) | Optional request body | [optional] |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## machines_uncordon

> machines_uncordon(app_name, machine_id)

Uncordon Machine

“Cordoning” a Machine refers to disabling its services, so the Fly Proxy won’t route requests to it. In flyctl this is used by blue/green deployments; one set of Machines is started up with services disabled, and when they are all healthy, the services are enabled on the new Machines and disabled on the old ones. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID

begin
  # Uncordon Machine
  api_instance.machines_uncordon(app_name, machine_id)
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_uncordon: #{e}"
end
```

#### Using the machines_uncordon_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> machines_uncordon_with_http_info(app_name, machine_id)

```ruby
begin
  # Uncordon Machine
  data, status_code, headers = api_instance.machines_uncordon_with_http_info(app_name, machine_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_uncordon_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## machines_update

> <Machine> machines_update(app_name, machine_id, request)

Update Machine

Update a Machine's configuration using the details provided in the request body. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID
request = FlySDK::UpdateMachineRequest.new # UpdateMachineRequest | Request body

begin
  # Update Machine
  result = api_instance.machines_update(app_name, machine_id, request)
  p result
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_update: #{e}"
end
```

#### Using the machines_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Machine>, Integer, Hash)> machines_update_with_http_info(app_name, machine_id, request)

```ruby
begin
  # Update Machine
  data, status_code, headers = api_instance.machines_update_with_http_info(app_name, machine_id, request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Machine>
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |
| **request** | [**UpdateMachineRequest**](UpdateMachineRequest.md) | Request body |  |

### Return type

[**Machine**](Machine.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## machines_update_metadata

> machines_update_metadata(app_name, machine_id, key)

Update Metadata

Update metadata for a specific machine within an app by providing a metadata key. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID
key = 'key_example' # String | Metadata Key

begin
  # Update Metadata
  api_instance.machines_update_metadata(app_name, machine_id, key)
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_update_metadata: #{e}"
end
```

#### Using the machines_update_metadata_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> machines_update_metadata_with_http_info(app_name, machine_id, key)

```ruby
begin
  # Update Metadata
  data, status_code, headers = api_instance.machines_update_metadata_with_http_info(app_name, machine_id, key)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_update_metadata_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |
| **key** | **String** | Metadata Key |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## machines_wait

> machines_wait(app_name, machine_id, opts)

Wait for State

Wait for a Machine to reach a specific state. Specify the desired state with the state parameter. See the [Machine states table](https://fly.io/docs/machines/working-with-machines/#machine-states) for a list of possible states. The default for this parameter is `started`.  This request will block for up to 60 seconds. Set a shorter timeout with the timeout parameter. 

### Examples

```ruby
require 'time'
require 'fly-sdk-ruby'

api_instance = FlySDK::MachinesApi.new
app_name = 'app_name_example' # String | Fly App Name
machine_id = 'machine_id_example' # String | Machine ID
opts = {
  instance_id: 'instance_id_example', # String | instance? version? TODO
  timeout: 56, # Integer | wait timeout. default 60s
  state: 'started' # String | desired state
}

begin
  # Wait for State
  api_instance.machines_wait(app_name, machine_id, opts)
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_wait: #{e}"
end
```

#### Using the machines_wait_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> machines_wait_with_http_info(app_name, machine_id, opts)

```ruby
begin
  # Wait for State
  data, status_code, headers = api_instance.machines_wait_with_http_info(app_name, machine_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue FlySDK::ApiError => e
  puts "Error when calling MachinesApi->machines_wait_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_name** | **String** | Fly App Name |  |
| **machine_id** | **String** | Machine ID |  |
| **instance_id** | **String** | instance? version? TODO | [optional] |
| **timeout** | **Integer** | wait timeout. default 60s | [optional] |
| **state** | **String** | desired state | [optional] |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

