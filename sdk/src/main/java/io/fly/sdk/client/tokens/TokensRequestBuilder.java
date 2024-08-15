package io.fly.sdk.client.tokens;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import io.fly.sdk.client.tokens.oidc.OidcRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /tokens
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TokensRequestBuilder extends BaseRequestBuilder {
    /**
     * The oidc property
     * @return a {@link OidcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OidcRequestBuilder oidc() {
        return new OidcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link TokensRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TokensRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tokens", pathParameters);
    }
    /**
     * Instantiates a new {@link TokensRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TokensRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tokens", rawUrl);
    }
}
