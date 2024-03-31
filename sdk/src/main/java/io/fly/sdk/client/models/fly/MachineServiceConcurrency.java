package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachineServiceConcurrency implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The hard_limit property
     */
    private Integer hardLimit;
    /**
     * The soft_limit property
     */
    private Integer softLimit;
    /**
     * The type property
     */
    private String type;
    /**
     * Instantiates a new {@link MachineServiceConcurrency} and sets the default values.
     */
    public MachineServiceConcurrency() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachineServiceConcurrency}
     */
    @jakarta.annotation.Nonnull
    public static MachineServiceConcurrency createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineServiceConcurrency();
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
        deserializerMap.put("hard_limit", (n) -> { this.setHardLimit(n.getIntegerValue()); });
        deserializerMap.put("soft_limit", (n) -> { this.setSoftLimit(n.getIntegerValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hard_limit property value. The hard_limit property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHardLimit() {
        return this.hardLimit;
    }
    /**
     * Gets the soft_limit property value. The soft_limit property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSoftLimit() {
        return this.softLimit;
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("hard_limit", this.getHardLimit());
        writer.writeIntegerValue("soft_limit", this.getSoftLimit());
        writer.writeStringValue("type", this.getType());
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
     * Sets the hard_limit property value. The hard_limit property
     * @param value Value to set for the hard_limit property.
     */
    public void setHardLimit(@jakarta.annotation.Nullable final Integer value) {
        this.hardLimit = value;
    }
    /**
     * Sets the soft_limit property value. The soft_limit property
     * @param value Value to set for the soft_limit property.
     */
    public void setSoftLimit(@jakarta.annotation.Nullable final Integer value) {
        this.softLimit = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
