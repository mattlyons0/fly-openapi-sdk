package io.fly.sdk;

import io.fly.client.ApiClient;

import io.fly.client.model.App;
import io.fly.client.model.CreateAppRequest;
import io.fly.client.model.ErrorResponse;
import io.fly.client.model.ListAppsResponse;

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
@Component("io.fly.sdk.AppsApi")
public class AppsApi {
    private ApiClient apiClient;

    public AppsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AppsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create App
     * Create an app with the specified details in the request body. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param request App body (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void appsCreate(CreateAppRequest request) throws RestClientException {
        appsCreateWithHttpInfo(request);
    }

    /**
     * Create App
     * Create an app with the specified details in the request body. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param request App body (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> appsCreateWithHttpInfo(CreateAppRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling appsCreate");
        }
        

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
        return apiClient.invokeAPI("/apps", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Destroy App
     * Delete an app by its name. 
     * <p><b>202</b> - Accepted
     * @param appName Fly App Name (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void appsDelete(String appName) throws RestClientException {
        appsDeleteWithHttpInfo(appName);
    }

    /**
     * Destroy App
     * Delete an app by its name. 
     * <p><b>202</b> - Accepted
     * @param appName Fly App Name (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> appsDeleteWithHttpInfo(String appName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling appsDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app_name", appName);

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
        return apiClient.invokeAPI("/apps/{app_name}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Apps
     * List all apps with the ability to filter by organization slug. 
     * <p><b>200</b> - OK
     * @param orgSlug The org slug, or &#39;personal&#39;, to filter apps (required)
     * @return ListAppsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListAppsResponse appsList(String orgSlug) throws RestClientException {
        return appsListWithHttpInfo(orgSlug).getBody();
    }

    /**
     * List Apps
     * List all apps with the ability to filter by organization slug. 
     * <p><b>200</b> - OK
     * @param orgSlug The org slug, or &#39;personal&#39;, to filter apps (required)
     * @return ResponseEntity&lt;ListAppsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListAppsResponse> appsListWithHttpInfo(String orgSlug) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'orgSlug' is set
        if (orgSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orgSlug' when calling appsList");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "org_slug", orgSlug));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ListAppsResponse> localReturnType = new ParameterizedTypeReference<ListAppsResponse>() {};
        return apiClient.invokeAPI("/apps", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get App
     * Retrieve details about a specific app by its name. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @return App
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public App appsShow(String appName) throws RestClientException {
        return appsShowWithHttpInfo(appName).getBody();
    }

    /**
     * Get App
     * Retrieve details about a specific app by its name. 
     * <p><b>200</b> - OK
     * @param appName Fly App Name (required)
     * @return ResponseEntity&lt;App&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<App> appsShowWithHttpInfo(String appName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling appsShow");
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

        ParameterizedTypeReference<App> localReturnType = new ParameterizedTypeReference<App>() {};
        return apiClient.invokeAPI("/apps/{app_name}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
