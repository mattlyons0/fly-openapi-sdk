package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExtendVolumeResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The needs_restart property
     */
    private Boolean needsRestart;
    /**
     * The volume property
     */
    private Volume volume;
    /**
     * Instantiates a new {@link ExtendVolumeResponse} and sets the default values.
     */
    public ExtendVolumeResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExtendVolumeResponse}
     */
    @jakarta.annotation.Nonnull
    public static ExtendVolumeResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtendVolumeResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("needs_restart", (n) -> { this.setNeedsRestart(n.getBooleanValue()); });
        deserializerMap.put("volume", (n) -> { this.setVolume(n.getObjectValue(Volume::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the needs_restart property value. The needs_restart property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNeedsRestart() {
        return this.needsRestart;
    }
    /**
     * Gets the volume property value. The volume property
     * @return a {@link Volume}
     */
    @jakarta.annotation.Nullable
    public Volume getVolume() {
        return this.volume;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("needs_restart", this.getNeedsRestart());
        writer.writeObjectValue("volume", this.getVolume());
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
     * Sets the needs_restart property value. The needs_restart property
     * @param value Value to set for the needs_restart property.
     */
    public void setNeedsRestart(@jakarta.annotation.Nullable final Boolean value) {
        this.needsRestart = value;
    }
    /**
     * Sets the volume property value. The volume property
     * @param value Value to set for the volume property.
     */
    public void setVolume(@jakarta.annotation.Nullable final Volume value) {
        this.volume = value;
    }
}
