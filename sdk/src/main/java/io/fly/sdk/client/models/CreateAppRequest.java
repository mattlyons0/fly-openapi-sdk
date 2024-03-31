package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateAppRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The app_name property
     */
    private String appName;
    /**
     * The enable_subdomains property
     */
    private Boolean enableSubdomains;
    /**
     * The network property
     */
    private String network;
    /**
     * The org_slug property
     */
    private String orgSlug;
    /**
     * Instantiates a new {@link CreateAppRequest} and sets the default values.
     */
    public CreateAppRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateAppRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateAppRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateAppRequest();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the app_name property value. The app_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppName() {
        return this.appName;
    }
    /**
     * Gets the enable_subdomains property value. The enable_subdomains property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSubdomains() {
        return this.enableSubdomains;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("app_name", (n) -> { this.setAppName(n.getStringValue()); });
        deserializerMap.put("enable_subdomains", (n) -> { this.setEnableSubdomains(n.getBooleanValue()); });
        deserializerMap.put("network", (n) -> { this.setNetwork(n.getStringValue()); });
        deserializerMap.put("org_slug", (n) -> { this.setOrgSlug(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the network property value. The network property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetwork() {
        return this.network;
    }
    /**
     * Gets the org_slug property value. The org_slug property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgSlug() {
        return this.orgSlug;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("app_name", this.getAppName());
        writer.writeBooleanValue("enable_subdomains", this.getEnableSubdomains());
        writer.writeStringValue("network", this.getNetwork());
        writer.writeStringValue("org_slug", this.getOrgSlug());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the app_name property value. The app_name property
     * @param value Value to set for the app_name property.
     */
    public void setAppName(@jakarta.annotation.Nullable final String value) {
        this.appName = value;
    }
    /**
     * Sets the enable_subdomains property value. The enable_subdomains property
     * @param value Value to set for the enable_subdomains property.
     */
    public void setEnableSubdomains(@jakarta.annotation.Nullable final Boolean value) {
        this.enableSubdomains = value;
    }
    /**
     * Sets the network property value. The network property
     * @param value Value to set for the network property.
     */
    public void setNetwork(@jakarta.annotation.Nullable final String value) {
        this.network = value;
    }
    /**
     * Sets the org_slug property value. The org_slug property
     * @param value Value to set for the org_slug property.
     */
    public void setOrgSlug(@jakarta.annotation.Nullable final String value) {
        this.orgSlug = value;
    }
}
