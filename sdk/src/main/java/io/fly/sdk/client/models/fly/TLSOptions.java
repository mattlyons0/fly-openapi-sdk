package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TLSOptions implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The alpn property
     */
    private java.util.List<String> alpn;
    /**
     * The default_self_signed property
     */
    private Boolean defaultSelfSigned;
    /**
     * The versions property
     */
    private java.util.List<String> versions;
    /**
     * Instantiates a new {@link TLSOptions} and sets the default values.
     */
    public TLSOptions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TLSOptions}
     */
    @jakarta.annotation.Nonnull
    public static TLSOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TLSOptions();
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
     * Gets the alpn property value. The alpn property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAlpn() {
        return this.alpn;
    }
    /**
     * Gets the default_self_signed property value. The default_self_signed property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDefaultSelfSigned() {
        return this.defaultSelfSigned;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("alpn", (n) -> { this.setAlpn(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("default_self_signed", (n) -> { this.setDefaultSelfSigned(n.getBooleanValue()); });
        deserializerMap.put("versions", (n) -> { this.setVersions(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the versions property value. The versions property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getVersions() {
        return this.versions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("alpn", this.getAlpn());
        writer.writeBooleanValue("default_self_signed", this.getDefaultSelfSigned());
        writer.writeCollectionOfPrimitiveValues("versions", this.getVersions());
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
     * Sets the alpn property value. The alpn property
     * @param value Value to set for the alpn property.
     */
    public void setAlpn(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.alpn = value;
    }
    /**
     * Sets the default_self_signed property value. The default_self_signed property
     * @param value Value to set for the default_self_signed property.
     */
    public void setDefaultSelfSigned(@jakarta.annotation.Nullable final Boolean value) {
        this.defaultSelfSigned = value;
    }
    /**
     * Sets the versions property value. The versions property
     * @param value Value to set for the versions property.
     */
    public void setVersions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.versions = value;
    }
}
