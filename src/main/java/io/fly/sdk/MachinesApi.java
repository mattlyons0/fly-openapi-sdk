package io.fly.sdk;

import io.fly.client.ApiClient;

import io.fly.client.model.CreateLeaseRequest;
import io.fly.client.model.CreateMachineRequest;
import io.fly.client.model.ErrorResponse;
import io.fly.client.model.Lease;
import io.fly.client.model.Machine;
import io.fly.client.model.MachineEvent;
import io.fly.client.model.MachineExecRequest;
import io.fly.client.model.MachineVersion;
import io.fly.client.model.ProcessStat;
import io.fly.client.model.SignalRequest;
import io.fly.client.model.StopRequest;
import io.fly.client.model.UpdateMachineRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-04T04:08:18.495225938Z[Etc/UTC]")
@Component("io.fly.sdk.MachinesApi")
public class MachinesApi {
    private ApiClient apiClient;

    public MachinesApi() {
        this(new ApiClient());
    }

    @Autowired
    public MachinesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cordon Machine
     * “Cordoning” a Machine refers to disabling its services, so the Fly Proxy won’t route requests to it. In flyctl this is used by blue/green deployments; one set of Machines is started up with services disabled, and when they are all healthy, the services are enabled on the new Machines and disabled on the old ones. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void machinesCordon(String appName, String machineId) throws RestClientException {
        machinesCordonWithHttpInfo(appName, machineId);
    }

    /**
     * Cordon Machine
     * “Cordoning” a Machine refers to disabling its services, so the Fly Proxy won’t route requests to it. In flyctl this is used by blue/green deployments; one set of Machines is started up with services disabled, and when they are all healthy, the services are enabled on the new Machines and disabled on the old ones. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> machinesCordonWithHttpInfo(String appName, String machineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesCordon");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesCordon");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/cordon", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Machine
     * Create a Machine within a specific app using the details provided in the request body.  **Important**: This request can fail, and you’re responsible for handling that failure. If you ask for a large Machine, or a Machine in a region we happen to be at capacity for, you might need to retry the request, or to fall back to another region. If you’re working directly with the Machines API, you’re taking some responsibility for your own orchestration! 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param request Create machine request (required)
     * @return Machine
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Machine machinesCreate(String appName, CreateMachineRequest request) throws RestClientException {
        return machinesCreateWithHttpInfo(appName, request).getBody();
    }

    /**
     * Create Machine
     * Create a Machine within a specific app using the details provided in the request body.  **Important**: This request can fail, and you’re responsible for handling that failure. If you ask for a large Machine, or a Machine in a region we happen to be at capacity for, you might need to retry the request, or to fall back to another region. If you’re working directly with the Machines API, you’re taking some responsibility for your own orchestration! 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param request Create machine request (required)
     * @return ResponseEntity&lt;Machine&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Machine> machinesCreateWithHttpInfo(String appName, CreateMachineRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesCreate");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling machinesCreate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Machine> localReturnType = new ParameterizedTypeReference<Machine>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Lease
     * Create a lease for a specific Machine within an app using the details provided in the request body. Machine leases can be used to obtain an exclusive lock on modifying a Machine. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param request Request body (required)
     * @return Lease
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Lease machinesCreateLease(String appName, String machineId, CreateLeaseRequest request) throws RestClientException {
        return machinesCreateLeaseWithHttpInfo(appName, machineId, request).getBody();
    }

    /**
     * Create Lease
     * Create a lease for a specific Machine within an app using the details provided in the request body. Machine leases can be used to obtain an exclusive lock on modifying a Machine. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param request Request body (required)
     * @return ResponseEntity&lt;Lease&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Lease> machinesCreateLeaseWithHttpInfo(String appName, String machineId, CreateLeaseRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesCreateLease");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesCreateLease");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling machinesCreateLease");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Lease> localReturnType = new ParameterizedTypeReference<Lease>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/lease", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Destroy Machine
     * Delete a specific Machine within an app by Machine ID, with an optional force parameter to force kill the Machine if it&#39;s running. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param force Force kill the machine if it&#39;s running (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void machinesDelete(String appName, String machineId, Boolean force) throws RestClientException {
        machinesDeleteWithHttpInfo(appName, machineId, force);
    }

    /**
     * Destroy Machine
     * Delete a specific Machine within an app by Machine ID, with an optional force parameter to force kill the Machine if it&#39;s running. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param force Force kill the machine if it&#39;s running (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> machinesDeleteWithHttpInfo(String appName, String machineId, Boolean force) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesDelete");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "force", force));
        

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Metadata
     * Delete metadata for a specific Machine within an app by providing a metadata key. 
     * <p><b>204</b> - No Content
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param key Metadata Key (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void machinesDeleteMetadata(String appName, String machineId, String key) throws RestClientException {
        machinesDeleteMetadataWithHttpInfo(appName, machineId, key);
    }

    /**
     * Delete Metadata
     * Delete metadata for a specific Machine within an app by providing a metadata key. 
     * <p><b>204</b> - No Content
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param key Metadata Key (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> machinesDeleteMetadataWithHttpInfo(String appName, String machineId, String key) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesDeleteMetadata");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesDeleteMetadata");
        }
        
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'key' when calling machinesDeleteMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);
        uriVariables.put("key", key);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/metadata/{key}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Execute Command
     * Execute a command on a specific Machine and return the raw command output bytes. 
     * <p><b>200</b> - Raw command output bytes are written back
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param request Request body (required)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String machinesExec(String appName, String machineId, MachineExecRequest request) throws RestClientException {
        return machinesExecWithHttpInfo(appName, machineId, request).getBody();
    }

    /**
     * Execute Command
     * Execute a command on a specific Machine and return the raw command output bytes. 
     * <p><b>200</b> - Raw command output bytes are written back
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param request Request body (required)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> machinesExecWithHttpInfo(String appName, String machineId, MachineExecRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesExec");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesExec");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling machinesExec");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/exec", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Machines
     * List all Machines associated with a specific app, with optional filters for including deleted Machines and filtering by region. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param includeDeleted Include deleted machines (optional)
     * @param region Region filter (optional)
     * @return List&lt;Machine&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Machine> machinesList(String appName, Boolean includeDeleted, String region) throws RestClientException {
        return machinesListWithHttpInfo(appName, includeDeleted, region).getBody();
    }

    /**
     * List Machines
     * List all Machines associated with a specific app, with optional filters for including deleted Machines and filtering by region. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param includeDeleted Include deleted machines (optional)
     * @param region Region filter (optional)
     * @return ResponseEntity&lt;List&lt;Machine&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Machine>> machinesListWithHttpInfo(String appName, Boolean includeDeleted, String region) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesList");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_deleted", includeDeleted));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Machine>> localReturnType = new ParameterizedTypeReference<List<Machine>>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Events
     * List all events associated with a specific Machine within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return List&lt;MachineEvent&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MachineEvent> machinesListEvents(String appName, String machineId) throws RestClientException {
        return machinesListEventsWithHttpInfo(appName, machineId).getBody();
    }

    /**
     * List Events
     * List all events associated with a specific Machine within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return ResponseEntity&lt;List&lt;MachineEvent&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MachineEvent>> machinesListEventsWithHttpInfo(String appName, String machineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesListEvents");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesListEvents");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<MachineEvent>> localReturnType = new ParameterizedTypeReference<List<MachineEvent>>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/events", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Processes
     * List all processes running on a specific Machine within an app, with optional sorting parameters. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param sortBy Sort by (optional)
     * @param order Order (optional)
     * @return List&lt;ProcessStat&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ProcessStat> machinesListProcesses(String appName, String machineId, String sortBy, String order) throws RestClientException {
        return machinesListProcessesWithHttpInfo(appName, machineId, sortBy, order).getBody();
    }

    /**
     * List Processes
     * List all processes running on a specific Machine within an app, with optional sorting parameters. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param sortBy Sort by (optional)
     * @param order Order (optional)
     * @return ResponseEntity&lt;List&lt;ProcessStat&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ProcessStat>> machinesListProcessesWithHttpInfo(String appName, String machineId, String sortBy, String order) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesListProcesses");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesListProcesses");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort_by", sortBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ProcessStat>> localReturnType = new ParameterizedTypeReference<List<ProcessStat>>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/ps", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Versions
     * List all versions of the configuration for a specific Machine within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return List&lt;MachineVersion&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MachineVersion> machinesListVersions(String appName, String machineId) throws RestClientException {
        return machinesListVersionsWithHttpInfo(appName, machineId).getBody();
    }

    /**
     * List Versions
     * List all versions of the configuration for a specific Machine within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return ResponseEntity&lt;List&lt;MachineVersion&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MachineVersion>> machinesListVersionsWithHttpInfo(String appName, String machineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesListVersions");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesListVersions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<MachineVersion>> localReturnType = new ParameterizedTypeReference<List<MachineVersion>>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/versions", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Release Lease
     * Release the lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void machinesReleaseLease(String appName, String machineId) throws RestClientException {
        machinesReleaseLeaseWithHttpInfo(appName, machineId);
    }

    /**
     * Release Lease
     * Release the lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> machinesReleaseLeaseWithHttpInfo(String appName, String machineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesReleaseLease");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesReleaseLease");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/lease", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Restart Machine
     * Restart a specific Machine within an app, with an optional timeout parameter. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param timeout Restart timeout as a Go duration string or number of seconds (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void machinesRestart(String appName, String machineId, String timeout) throws RestClientException {
        machinesRestartWithHttpInfo(appName, machineId, timeout);
    }

    /**
     * Restart Machine
     * Restart a specific Machine within an app, with an optional timeout parameter. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param timeout Restart timeout as a Go duration string or number of seconds (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> machinesRestartWithHttpInfo(String appName, String machineId, String timeout) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesRestart");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesRestart");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeout", timeout));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/restart", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Machine
     * Get details of a specific Machine within an app by the Machine ID. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return Machine
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Machine machinesShow(String appName, String machineId) throws RestClientException {
        return machinesShowWithHttpInfo(appName, machineId).getBody();
    }

    /**
     * Get Machine
     * Get details of a specific Machine within an app by the Machine ID. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return ResponseEntity&lt;Machine&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Machine> machinesShowWithHttpInfo(String appName, String machineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesShow");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesShow");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Machine> localReturnType = new ParameterizedTypeReference<Machine>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Lease
     * Retrieve the current lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return Lease
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Lease machinesShowLease(String appName, String machineId) throws RestClientException {
        return machinesShowLeaseWithHttpInfo(appName, machineId).getBody();
    }

    /**
     * Get Lease
     * Retrieve the current lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return ResponseEntity&lt;Lease&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Lease> machinesShowLeaseWithHttpInfo(String appName, String machineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesShowLease");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesShowLease");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Lease> localReturnType = new ParameterizedTypeReference<Lease>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/lease", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Metadata
     * Retrieve metadata for a specific Machine within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return Map&lt;String, String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Map<String, String> machinesShowMetadata(String appName, String machineId) throws RestClientException {
        return machinesShowMetadataWithHttpInfo(appName, machineId).getBody();
    }

    /**
     * Get Metadata
     * Retrieve metadata for a specific Machine within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return ResponseEntity&lt;Map&lt;String, String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Map<String, String>> machinesShowMetadataWithHttpInfo(String appName, String machineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesShowMetadata");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesShowMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Map<String, String>> localReturnType = new ParameterizedTypeReference<Map<String, String>>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/metadata", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Signal Machine
     * Send a signal to a specific Machine within an app using the details provided in the request body. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param request Request body (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void machinesSignal(String appName, String machineId, SignalRequest request) throws RestClientException {
        machinesSignalWithHttpInfo(appName, machineId, request);
    }

    /**
     * Signal Machine
     * Send a signal to a specific Machine within an app using the details provided in the request body. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param request Request body (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> machinesSignalWithHttpInfo(String appName, String machineId, SignalRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesSignal");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesSignal");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling machinesSignal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/signal", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Start Machine
     * Start a specific Machine within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void machinesStart(String appName, String machineId) throws RestClientException {
        machinesStartWithHttpInfo(appName, machineId);
    }

    /**
     * Start Machine
     * Start a specific Machine within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> machinesStartWithHttpInfo(String appName, String machineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesStart");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesStart");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/start", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Stop Machine
     * Stop a specific Machine within an app, with an optional request body to specify signal and timeout. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param request Optional request body (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void machinesStop(String appName, String machineId, StopRequest request) throws RestClientException {
        machinesStopWithHttpInfo(appName, machineId, request);
    }

    /**
     * Stop Machine
     * Stop a specific Machine within an app, with an optional request body to specify signal and timeout. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param request Optional request body (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> machinesStopWithHttpInfo(String appName, String machineId, StopRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesStop");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesStop");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/stop", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Uncordon Machine
     * “Cordoning” a Machine refers to disabling its services, so the Fly Proxy won’t route requests to it. In flyctl this is used by blue/green deployments; one set of Machines is started up with services disabled, and when they are all healthy, the services are enabled on the new Machines and disabled on the old ones. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void machinesUncordon(String appName, String machineId) throws RestClientException {
        machinesUncordonWithHttpInfo(appName, machineId);
    }

    /**
     * Uncordon Machine
     * “Cordoning” a Machine refers to disabling its services, so the Fly Proxy won’t route requests to it. In flyctl this is used by blue/green deployments; one set of Machines is started up with services disabled, and when they are all healthy, the services are enabled on the new Machines and disabled on the old ones. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> machinesUncordonWithHttpInfo(String appName, String machineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesUncordon");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesUncordon");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/uncordon", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Machine
     * Update a Machine&#39;s configuration using the details provided in the request body. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param request Request body (required)
     * @return Machine
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Machine machinesUpdate(String appName, String machineId, UpdateMachineRequest request) throws RestClientException {
        return machinesUpdateWithHttpInfo(appName, machineId, request).getBody();
    }

    /**
     * Update Machine
     * Update a Machine&#39;s configuration using the details provided in the request body. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param request Request body (required)
     * @return ResponseEntity&lt;Machine&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Machine> machinesUpdateWithHttpInfo(String appName, String machineId, UpdateMachineRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesUpdate");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesUpdate");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling machinesUpdate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Machine> localReturnType = new ParameterizedTypeReference<Machine>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Metadata
     * Update metadata for a specific machine within an app by providing a metadata key. 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param key Metadata Key (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void machinesUpdateMetadata(String appName, String machineId, String key) throws RestClientException {
        machinesUpdateMetadataWithHttpInfo(appName, machineId, key);
    }

    /**
     * Update Metadata
     * Update metadata for a specific machine within an app by providing a metadata key. 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param key Metadata Key (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> machinesUpdateMetadataWithHttpInfo(String appName, String machineId, String key) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesUpdateMetadata");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesUpdateMetadata");
        }
        
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'key' when calling machinesUpdateMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);
        uriVariables.put("key", key);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/metadata/{key}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Wait for State
     * Wait for a Machine to reach a specific state. Specify the desired state with the state parameter. See the [Machine states table](https://fly.io/docs/machines/working-with-machines/#machine-states) for a list of possible states. The default for this parameter is &#x60;started&#x60;.  This request will block for up to 60 seconds. Set a shorter timeout with the timeout parameter. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param instanceId instance? version? TODO (optional)
     * @param timeout wait timeout. default 60s (optional)
     * @param state desired state (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void machinesWait(String appName, String machineId, String instanceId, Integer timeout, String state) throws RestClientException {
        machinesWaitWithHttpInfo(appName, machineId, instanceId, timeout, state);
    }

    /**
     * Wait for State
     * Wait for a Machine to reach a specific state. Specify the desired state with the state parameter. See the [Machine states table](https://fly.io/docs/machines/working-with-machines/#machine-states) for a list of possible states. The default for this parameter is &#x60;started&#x60;.  This request will block for up to 60 seconds. Set a shorter timeout with the timeout parameter. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param machineId Machine ID (required)
     * @param instanceId instance? version? TODO (optional)
     * @param timeout wait timeout. default 60s (optional)
     * @param state desired state (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> machinesWaitWithHttpInfo(String appName, String machineId, String instanceId, Integer timeout, String state) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling machinesWait");
        }
        
        // verify the required parameter 'machineId' is set
        if (machineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'machineId' when calling machinesWait");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("machine_id", machineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "instance_id", instanceId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeout", timeout));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "state", state));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/apps/{app_name}/machines/{machine_id}/wait", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
