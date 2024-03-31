package io.fly.sdk.client.apps.item.machines.item.waitescaped;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.fly.sdk.client.models.ErrorResponse;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /apps/{app_name}/machines/{machine_id}/wait
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WaitRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WaitRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WaitRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/machines/{machine_id}/wait{?instance_id*,state*,timeout*}", pathParameters);
    }
    /**
     * Instantiates a new {@link WaitRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WaitRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/machines/{machine_id}/wait{?instance_id*,state*,timeout*}", rawUrl);
    }
    /**
     * Wait for a Machine to reach a specific state. Specify the desired state with the state parameter. See the [Machine states table](https://fly.io/docs/machines/working-with-machines/#machine-states) for a list of possible states. The default for this parameter is `started`.This request will block for up to 60 seconds. Set a shorter timeout with the timeout parameter.
     * @return a {@link InputStream}
     * @throws ErrorResponse When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * Wait for a Machine to reach a specific state. Specify the desired state with the state parameter. See the [Machine states table](https://fly.io/docs/machines/working-with-machines/#machine-states) for a list of possible states. The default for this parameter is `started`.This request will block for up to 60 seconds. Set a shorter timeout with the timeout parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws ErrorResponse When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * Wait for a Machine to reach a specific state. Specify the desired state with the state parameter. See the [Machine states table](https://fly.io/docs/machines/working-with-machines/#machine-states) for a list of possible states. The default for this parameter is `started`.This request will block for up to 60 seconds. Set a shorter timeout with the timeout parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Wait for a Machine to reach a specific state. Specify the desired state with the state parameter. See the [Machine states table](https://fly.io/docs/machines/working-with-machines/#machine-states) for a list of possible states. The default for this parameter is `started`.This request will block for up to 60 seconds. Set a shorter timeout with the timeout parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WaitRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WaitRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WaitRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Wait for a Machine to reach a specific state. Specify the desired state with the state parameter. See the [Machine states table](https://fly.io/docs/machines/working-with-machines/#machine-states) for a list of possible states. The default for this parameter is `started`.This request will block for up to 60 seconds. Set a shorter timeout with the timeout parameter.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * instance? version? TODO
         */
        @jakarta.annotation.Nullable
        public String instanceId;
        /**
         * desired state
         */
        @jakarta.annotation.Nullable
        public GetStateQueryParameterType state;
        /**
         * wait timeout. default 60s
         */
        @jakarta.annotation.Nullable
        public Integer timeout;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("state", state);
            allQueryParams.put("instance_id", instanceId);
            allQueryParams.put("timeout", timeout);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
