package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StaticEscaped implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The guest_path property
     */
    private String guestPath;
    /**
     * The tigris_bucket property
     */
    private String tigrisBucket;
    /**
     * The url_prefix property
     */
    private String urlPrefix;
    /**
     * Instantiates a new {@link StaticEscaped} and sets the default values.
     */
    public StaticEscaped() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StaticEscaped}
     */
    @jakarta.annotation.Nonnull
    public static StaticEscaped createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StaticEscaped();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("guest_path", (n) -> { this.setGuestPath(n.getStringValue()); });
        deserializerMap.put("tigris_bucket", (n) -> { this.setTigrisBucket(n.getStringValue()); });
        deserializerMap.put("url_prefix", (n) -> { this.setUrlPrefix(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the guest_path property value. The guest_path property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGuestPath() {
        return this.guestPath;
    }
    /**
     * Gets the tigris_bucket property value. The tigris_bucket property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTigrisBucket() {
        return this.tigrisBucket;
    }
    /**
     * Gets the url_prefix property value. The url_prefix property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrlPrefix() {
        return this.urlPrefix;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("guest_path", this.getGuestPath());
        writer.writeStringValue("tigris_bucket", this.getTigrisBucket());
        writer.writeStringValue("url_prefix", this.getUrlPrefix());
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
     * Sets the guest_path property value. The guest_path property
     * @param value Value to set for the guest_path property.
     */
    public void setGuestPath(@jakarta.annotation.Nullable final String value) {
        this.guestPath = value;
    }
    /**
     * Sets the tigris_bucket property value. The tigris_bucket property
     * @param value Value to set for the tigris_bucket property.
     */
    public void setTigrisBucket(@jakarta.annotation.Nullable final String value) {
        this.tigrisBucket = value;
    }
    /**
     * Sets the url_prefix property value. The url_prefix property
     * @param value Value to set for the url_prefix property.
     */
    public void setUrlPrefix(@jakarta.annotation.Nullable final String value) {
        this.urlPrefix = value;
    }
}
