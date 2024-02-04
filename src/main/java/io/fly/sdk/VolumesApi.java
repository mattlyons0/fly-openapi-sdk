package io.fly.sdk;

import io.fly.client.ApiClient;

import io.fly.client.model.CreateVolumeRequest;
import io.fly.client.model.ErrorResponse;
import io.fly.client.model.ExtendVolumeRequest;
import io.fly.client.model.ExtendVolumeResponse;
import io.fly.client.model.UpdateVolumeRequest;
import io.fly.client.model.Volume;
import io.fly.client.model.VolumeSnapshot;

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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@Component("io.fly.sdk.VolumesApi")
public class VolumesApi {
    private ApiClient apiClient;

    public VolumesApi() {
        this(new ApiClient());
    }

    @Autowired
    public VolumesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Snapshot
     * Create a snapshot for a specific volume within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param volumeId Volume ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void createVolumeSnapshot(String appName, String volumeId) throws RestClientException {
        createVolumeSnapshotWithHttpInfo(appName, volumeId);
    }

    /**
     * Create Snapshot
     * Create a snapshot for a specific volume within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param volumeId Volume ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createVolumeSnapshotWithHttpInfo(String appName, String volumeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling createVolumeSnapshot");
        }
        
        // verify the required parameter 'volumeId' is set
        if (volumeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'volumeId' when calling createVolumeSnapshot");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("volume_id", volumeId);

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
        return apiClient.invokeAPI("/apps/{app_name}/volumes/{volume_id}/snapshots", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Destroy Volume
     * Delete a specific volume within an app by volume ID. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param volumeId Volume ID (required)
     * @return Volume
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Volume volumeDelete(String appName, String volumeId) throws RestClientException {
        return volumeDeleteWithHttpInfo(appName, volumeId).getBody();
    }

    /**
     * Destroy Volume
     * Delete a specific volume within an app by volume ID. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param volumeId Volume ID (required)
     * @return ResponseEntity&lt;Volume&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Volume> volumeDeleteWithHttpInfo(String appName, String volumeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling volumeDelete");
        }
        
        // verify the required parameter 'volumeId' is set
        if (volumeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'volumeId' when calling volumeDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("volume_id", volumeId);

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

        ParameterizedTypeReference<Volume> localReturnType = new ParameterizedTypeReference<Volume>() {};
        return apiClient.invokeAPI("/apps/{app_name}/volumes/{volume_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Volume
     * Create a volume for a specific app using the details provided in the request body. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param request Request body (required)
     * @return Volume
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Volume volumesCreate(String appName, CreateVolumeRequest request) throws RestClientException {
        return volumesCreateWithHttpInfo(appName, request).getBody();
    }

    /**
     * Create Volume
     * Create a volume for a specific app using the details provided in the request body. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param request Request body (required)
     * @return ResponseEntity&lt;Volume&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Volume> volumesCreateWithHttpInfo(String appName, CreateVolumeRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling volumesCreate");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling volumesCreate");
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

        ParameterizedTypeReference<Volume> localReturnType = new ParameterizedTypeReference<Volume>() {};
        return apiClient.invokeAPI("/apps/{app_name}/volumes", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Extend Volume
     * Extend a volume&#39;s size within an app using the details provided in the request body. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param volumeId Volume ID (required)
     * @param request Request body (required)
     * @return ExtendVolumeResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExtendVolumeResponse volumesExtend(String appName, String volumeId, ExtendVolumeRequest request) throws RestClientException {
        return volumesExtendWithHttpInfo(appName, volumeId, request).getBody();
    }

    /**
     * Extend Volume
     * Extend a volume&#39;s size within an app using the details provided in the request body. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param volumeId Volume ID (required)
     * @param request Request body (required)
     * @return ResponseEntity&lt;ExtendVolumeResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExtendVolumeResponse> volumesExtendWithHttpInfo(String appName, String volumeId, ExtendVolumeRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling volumesExtend");
        }
        
        // verify the required parameter 'volumeId' is set
        if (volumeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'volumeId' when calling volumesExtend");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling volumesExtend");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("volume_id", volumeId);

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

        ParameterizedTypeReference<ExtendVolumeResponse> localReturnType = new ParameterizedTypeReference<ExtendVolumeResponse>() {};
        return apiClient.invokeAPI("/apps/{app_name}/volumes/{volume_id}/extend", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Volume
     * Retrieve details about a specific volume by its ID within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param volumeId Volume ID (required)
     * @return Volume
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Volume volumesGetById(String appName, String volumeId) throws RestClientException {
        return volumesGetByIdWithHttpInfo(appName, volumeId).getBody();
    }

    /**
     * Get Volume
     * Retrieve details about a specific volume by its ID within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param volumeId Volume ID (required)
     * @return ResponseEntity&lt;Volume&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Volume> volumesGetByIdWithHttpInfo(String appName, String volumeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling volumesGetById");
        }
        
        // verify the required parameter 'volumeId' is set
        if (volumeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'volumeId' when calling volumesGetById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("volume_id", volumeId);

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

        ParameterizedTypeReference<Volume> localReturnType = new ParameterizedTypeReference<Volume>() {};
        return apiClient.invokeAPI("/apps/{app_name}/volumes/{volume_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Volumes
     * List all volumes associated with a specific app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @return List&lt;Volume&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Volume> volumesList(String appName) throws RestClientException {
        return volumesListWithHttpInfo(appName).getBody();
    }

    /**
     * List Volumes
     * List all volumes associated with a specific app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @return ResponseEntity&lt;List&lt;Volume&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Volume>> volumesListWithHttpInfo(String appName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling volumesList");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Volume>> localReturnType = new ParameterizedTypeReference<List<Volume>>() {};
        return apiClient.invokeAPI("/apps/{app_name}/volumes", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Snapshots
     * List all snapshots for a specific volume within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param volumeId Volume ID (required)
     * @return List&lt;VolumeSnapshot&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<VolumeSnapshot> volumesListSnapshots(String appName, String volumeId) throws RestClientException {
        return volumesListSnapshotsWithHttpInfo(appName, volumeId).getBody();
    }

    /**
     * List Snapshots
     * List all snapshots for a specific volume within an app. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @param volumeId Volume ID (required)
     * @return ResponseEntity&lt;List&lt;VolumeSnapshot&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<VolumeSnapshot>> volumesListSnapshotsWithHttpInfo(String appName, String volumeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling volumesListSnapshots");
        }
        
        // verify the required parameter 'volumeId' is set
        if (volumeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'volumeId' when calling volumesListSnapshots");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("volume_id", volumeId);

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

        ParameterizedTypeReference<List<VolumeSnapshot>> localReturnType = new ParameterizedTypeReference<List<VolumeSnapshot>>() {};
        return apiClient.invokeAPI("/apps/{app_name}/volumes/{volume_id}/snapshots", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Volume
     * Update a volume&#39;s configuration using the details provided in the request body. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param volumeId Volume ID (required)
     * @param request Request body (required)
     * @return Volume
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Volume volumesUpdate(String appName, String volumeId, UpdateVolumeRequest request) throws RestClientException {
        return volumesUpdateWithHttpInfo(appName, volumeId, request).getBody();
    }

    /**
     * Update Volume
     * Update a volume&#39;s configuration using the details provided in the request body. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param appName Fly App Name (required)
     * @param volumeId Volume ID (required)
     * @param request Request body (required)
     * @return ResponseEntity&lt;Volume&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Volume> volumesUpdateWithHttpInfo(String appName, String volumeId, UpdateVolumeRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling volumesUpdate");
        }
        
        // verify the required parameter 'volumeId' is set
        if (volumeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'volumeId' when calling volumesUpdate");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling volumesUpdate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);
        uriVariables.put("volume_id", volumeId);

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

        ParameterizedTypeReference<Volume> localReturnType = new ParameterizedTypeReference<Volume>() {};
        return apiClient.invokeAPI("/apps/{app_name}/volumes/{volume_id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
