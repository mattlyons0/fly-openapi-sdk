package io.fly.sdk.client.apps.item.machines.item.lease;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.fly.sdk.client.models.CreateLeaseRequest;
import io.fly.sdk.client.models.Lease;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /apps/{app_name}/machines/{machine_id}/lease
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeaseRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link LeaseRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LeaseRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/machines/{machine_id}/lease", pathParameters);
    }
    /**
     * Instantiates a new {@link LeaseRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LeaseRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/machines/{machine_id}/lease", rawUrl);
    }
    /**
     * Release the lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine.
     * @return a {@link InputStream}
     */
    @jakarta.annotation.Nullable
    public InputStream delete() {
        return delete(null);
    }
    /**
     * Release the lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     */
    @jakarta.annotation.Nullable
    public InputStream delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.sendPrimitive(requestInfo, null, InputStream.class);
    }
    /**
     * Retrieve the current lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine.
     * @return a {@link Lease}
     */
    @jakarta.annotation.Nullable
    public Lease get() {
        return get(null);
    }
    /**
     * Retrieve the current lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Lease}
     */
    @jakarta.annotation.Nullable
    public Lease get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Lease::createFromDiscriminatorValue);
    }
    /**
     * Create a lease for a specific Machine within an app using the details provided in the request body. Machine leases can be used to obtain an exclusive lock on modifying a Machine.
     * @param body The request body
     * @return a {@link Lease}
     */
    @jakarta.annotation.Nullable
    public Lease post(@jakarta.annotation.Nonnull final CreateLeaseRequest body) {
        return post(body, null);
    }
    /**
     * Create a lease for a specific Machine within an app using the details provided in the request body. Machine leases can be used to obtain an exclusive lock on modifying a Machine.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Lease}
     */
    @jakarta.annotation.Nullable
    public Lease post(@jakarta.annotation.Nonnull final CreateLeaseRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Lease::createFromDiscriminatorValue);
    }
    /**
     * Release the lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Release the lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the current lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the current lease of a specific Machine within an app. Machine leases can be used to obtain an exclusive lock on modifying a Machine.
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
     * Create a lease for a specific Machine within an app using the details provided in the request body. Machine leases can be used to obtain an exclusive lock on modifying a Machine.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateLeaseRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a lease for a specific Machine within an app using the details provided in the request body. Machine leases can be used to obtain an exclusive lock on modifying a Machine.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateLeaseRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link LeaseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeaseRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LeaseRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
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
