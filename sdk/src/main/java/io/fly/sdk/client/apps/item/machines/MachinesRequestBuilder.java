package io.fly.sdk.client.apps.item.machines;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.fly.sdk.client.apps.item.machines.item.WithMachineItemRequestBuilder;
import io.fly.sdk.client.models.CreateMachineRequest;
import io.fly.sdk.client.models.Machine;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /apps/{app_name}/machines
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachinesRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.fly.sdk.client.apps.item.machines.item collection
     * @param machine_id Machine ID
     * @return a {@link WithMachineItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithMachineItemRequestBuilder byMachine_id(@jakarta.annotation.Nonnull final String machine_id) {
        Objects.requireNonNull(machine_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("machine_id", machine_id);
        return new WithMachineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MachinesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MachinesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/machines{?include_deleted*,region*}", pathParameters);
    }
    /**
     * Instantiates a new {@link MachinesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MachinesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/machines{?include_deleted*,region*}", rawUrl);
    }
    /**
     * List all Machines associated with a specific app, with optional filters for including deleted Machines and filtering by region.
     * @return a {@link java.util.List<Machine>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Machine> get() {
        return get(null);
    }
    /**
     * List all Machines associated with a specific app, with optional filters for including deleted Machines and filtering by region.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<Machine>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Machine> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendCollection(requestInfo, null, Machine::createFromDiscriminatorValue);
    }
    /**
     * Create a Machine within a specific app using the details provided in the request body.**Important**: This request can fail, and youre responsible for handling that failure. If you ask for a large Machine, or a Machine in a region we happen to be at capacity for, you might need to retry the request, or to fall back to another region. If youre working directly with the Machines API, youre taking some responsibility for your own orchestration!
     * @param body The request body
     * @return a {@link Machine}
     */
    @jakarta.annotation.Nullable
    public Machine post(@jakarta.annotation.Nonnull final CreateMachineRequest body) {
        return post(body, null);
    }
    /**
     * Create a Machine within a specific app using the details provided in the request body.**Important**: This request can fail, and youre responsible for handling that failure. If you ask for a large Machine, or a Machine in a region we happen to be at capacity for, you might need to retry the request, or to fall back to another region. If youre working directly with the Machines API, youre taking some responsibility for your own orchestration!
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Machine}
     */
    @jakarta.annotation.Nullable
    public Machine post(@jakarta.annotation.Nonnull final CreateMachineRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Machine::createFromDiscriminatorValue);
    }
    /**
     * List all Machines associated with a specific app, with optional filters for including deleted Machines and filtering by region.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List all Machines associated with a specific app, with optional filters for including deleted Machines and filtering by region.
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
     * Create a Machine within a specific app using the details provided in the request body.**Important**: This request can fail, and youre responsible for handling that failure. If you ask for a large Machine, or a Machine in a region we happen to be at capacity for, you might need to retry the request, or to fall back to another region. If youre working directly with the Machines API, youre taking some responsibility for your own orchestration!
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateMachineRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a Machine within a specific app using the details provided in the request body.**Important**: This request can fail, and youre responsible for handling that failure. If you ask for a large Machine, or a Machine in a region we happen to be at capacity for, you might need to retry the request, or to fall back to another region. If youre working directly with the Machines API, youre taking some responsibility for your own orchestration!
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateMachineRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MachinesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MachinesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MachinesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List all Machines associated with a specific app, with optional filters for including deleted Machines and filtering by region.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include deleted machines
         */
        @jakarta.annotation.Nullable
        public Boolean includeDeleted;
        /**
         * Region filter
         */
        @jakarta.annotation.Nullable
        public String region;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("include_deleted", includeDeleted);
            allQueryParams.put("region", region);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
