package io.fly.sdk.client.apps.item.machines.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.fly.sdk.client.apps.item.machines.item.cordon.CordonRequestBuilder;
import io.fly.sdk.client.apps.item.machines.item.events.EventsRequestBuilder;
import io.fly.sdk.client.apps.item.machines.item.exec.ExecRequestBuilder;
import io.fly.sdk.client.apps.item.machines.item.lease.LeaseRequestBuilder;
import io.fly.sdk.client.apps.item.machines.item.metadata.MetadataRequestBuilder;
import io.fly.sdk.client.apps.item.machines.item.ps.PsRequestBuilder;
import io.fly.sdk.client.apps.item.machines.item.restart.RestartRequestBuilder;
import io.fly.sdk.client.apps.item.machines.item.signal.SignalRequestBuilder;
import io.fly.sdk.client.apps.item.machines.item.start.StartRequestBuilder;
import io.fly.sdk.client.apps.item.machines.item.stop.StopRequestBuilder;
import io.fly.sdk.client.apps.item.machines.item.uncordon.UncordonRequestBuilder;
import io.fly.sdk.client.apps.item.machines.item.versions.VersionsRequestBuilder;
import io.fly.sdk.client.apps.item.machines.item.waitescaped.WaitRequestBuilder;
import io.fly.sdk.client.models.ErrorResponse;
import io.fly.sdk.client.models.Machine;
import io.fly.sdk.client.models.UpdateMachineRequest;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /apps/{app_name}/machines/{machine_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithMachineItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The cordon property
     * @return a {@link CordonRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CordonRequestBuilder cordon() {
        return new CordonRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The events property
     * @return a {@link EventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The exec property
     * @return a {@link ExecRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExecRequestBuilder exec() {
        return new ExecRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The lease property
     * @return a {@link LeaseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeaseRequestBuilder lease() {
        return new LeaseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The metadata property
     * @return a {@link MetadataRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MetadataRequestBuilder metadata() {
        return new MetadataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The ps property
     * @return a {@link PsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PsRequestBuilder ps() {
        return new PsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The restart property
     * @return a {@link RestartRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestartRequestBuilder restart() {
        return new RestartRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The signal property
     * @return a {@link SignalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SignalRequestBuilder signal() {
        return new SignalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The start property
     * @return a {@link StartRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StartRequestBuilder start() {
        return new StartRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The stop property
     * @return a {@link StopRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StopRequestBuilder stop() {
        return new StopRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The uncordon property
     * @return a {@link UncordonRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UncordonRequestBuilder uncordon() {
        return new UncordonRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The versions property
     * @return a {@link VersionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VersionsRequestBuilder versions() {
        return new VersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The wait property
     * @return a {@link WaitRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WaitRequestBuilder waitEscaped() {
        return new WaitRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithMachineItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMachineItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/machines/{machine_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithMachineItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMachineItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/machines/{machine_id}", rawUrl);
    }
    /**
     * Delete a specific Machine within an app by Machine ID, with an optional force parameter to force kill the Machine if it's running.
     * @return a {@link InputStream}
     */
    @jakarta.annotation.Nullable
    public InputStream delete() {
        return delete(null);
    }
    /**
     * Delete a specific Machine within an app by Machine ID, with an optional force parameter to force kill the Machine if it's running.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     */
    @jakarta.annotation.Nullable
    public InputStream delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.sendPrimitive(requestInfo, null, InputStream.class);
    }
    /**
     * Get details of a specific Machine within an app by the Machine ID.
     * @return a {@link Machine}
     */
    @jakarta.annotation.Nullable
    public Machine get() {
        return get(null);
    }
    /**
     * Get details of a specific Machine within an app by the Machine ID.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Machine}
     */
    @jakarta.annotation.Nullable
    public Machine get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Machine::createFromDiscriminatorValue);
    }
    /**
     * Update a Machine's configuration using the details provided in the request body.
     * @param body The request body
     * @return a {@link Machine}
     * @throws ErrorResponse When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public Machine post(@jakarta.annotation.Nonnull final UpdateMachineRequest body) {
        return post(body, null);
    }
    /**
     * Update a Machine's configuration using the details provided in the request body.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Machine}
     * @throws ErrorResponse When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public Machine post(@jakarta.annotation.Nonnull final UpdateMachineRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Machine::createFromDiscriminatorValue);
    }
    /**
     * Delete a specific Machine within an app by Machine ID, with an optional force parameter to force kill the Machine if it's running.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a specific Machine within an app by Machine ID, with an optional force parameter to force kill the Machine if it's running.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/apps/{app_name}/machines/{machine_id}{?force*}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get details of a specific Machine within an app by the Machine ID.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get details of a specific Machine within an app by the Machine ID.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update a Machine's configuration using the details provided in the request body.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateMachineRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Update a Machine's configuration using the details provided in the request body.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateMachineRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link WithMachineItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithMachineItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithMachineItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Delete a specific Machine within an app by Machine ID, with an optional force parameter to force kill the Machine if it's running.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteQueryParameters implements QueryParameters {
        /**
         * Force kill the machine if it's running
         */
        @jakarta.annotation.Nullable
        public Boolean force;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("force", force);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public DeleteQueryParameters queryParameters = new DeleteQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
