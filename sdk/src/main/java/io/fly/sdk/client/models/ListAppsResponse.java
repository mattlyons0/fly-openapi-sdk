package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListAppsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The apps property
     */
    private java.util.List<ListApp> apps;
    /**
     * The total_apps property
     */
    private Integer totalApps;
    /**
     * Instantiates a new {@link ListAppsResponse} and sets the default values.
     */
    public ListAppsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListAppsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListAppsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListAppsResponse();
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
     * Gets the apps property value. The apps property
     * @return a {@link java.util.List<ListApp>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ListApp> getApps() {
        return this.apps;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("apps", (n) -> { this.setApps(n.getCollectionOfObjectValues(ListApp::createFromDiscriminatorValue)); });
        deserializerMap.put("total_apps", (n) -> { this.setTotalApps(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the total_apps property value. The total_apps property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalApps() {
        return this.totalApps;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("apps", this.getApps());
        writer.writeIntegerValue("total_apps", this.getTotalApps());
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
     * Sets the apps property value. The apps property
     * @param value Value to set for the apps property.
     */
    public void setApps(@jakarta.annotation.Nullable final java.util.List<ListApp> value) {
        this.apps = value;
    }
    /**
     * Sets the total_apps property value. The total_apps property
     * @param value Value to set for the total_apps property.
     */
    public void setTotalApps(@jakarta.annotation.Nullable final Integer value) {
        this.totalApps = value;
    }
}
