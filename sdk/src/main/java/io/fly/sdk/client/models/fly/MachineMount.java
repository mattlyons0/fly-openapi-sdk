package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachineMount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The add_size_gb property
     */
    private Integer addSizeGb;
    /**
     * The encrypted property
     */
    private Boolean encrypted;
    /**
     * The extend_threshold_percent property
     */
    private Integer extendThresholdPercent;
    /**
     * The name property
     */
    private String name;
    /**
     * The path property
     */
    private String path;
    /**
     * The size_gb property
     */
    private Integer sizeGb;
    /**
     * The size_gb_limit property
     */
    private Integer sizeGbLimit;
    /**
     * The volume property
     */
    private String volume;
    /**
     * Instantiates a new {@link MachineMount} and sets the default values.
     */
    public MachineMount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachineMount}
     */
    @jakarta.annotation.Nonnull
    public static MachineMount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineMount();
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
     * Gets the add_size_gb property value. The add_size_gb property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAddSizeGb() {
        return this.addSizeGb;
    }
    /**
     * Gets the encrypted property value. The encrypted property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEncrypted() {
        return this.encrypted;
    }
    /**
     * Gets the extend_threshold_percent property value. The extend_threshold_percent property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExtendThresholdPercent() {
        return this.extendThresholdPercent;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("add_size_gb", (n) -> { this.setAddSizeGb(n.getIntegerValue()); });
        deserializerMap.put("encrypted", (n) -> { this.setEncrypted(n.getBooleanValue()); });
        deserializerMap.put("extend_threshold_percent", (n) -> { this.setExtendThresholdPercent(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("size_gb", (n) -> { this.setSizeGb(n.getIntegerValue()); });
        deserializerMap.put("size_gb_limit", (n) -> { this.setSizeGbLimit(n.getIntegerValue()); });
        deserializerMap.put("volume", (n) -> { this.setVolume(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the path property value. The path property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Gets the size_gb property value. The size_gb property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSizeGb() {
        return this.sizeGb;
    }
    /**
     * Gets the size_gb_limit property value. The size_gb_limit property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSizeGbLimit() {
        return this.sizeGbLimit;
    }
    /**
     * Gets the volume property value. The volume property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVolume() {
        return this.volume;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("add_size_gb", this.getAddSizeGb());
        writer.writeBooleanValue("encrypted", this.getEncrypted());
        writer.writeIntegerValue("extend_threshold_percent", this.getExtendThresholdPercent());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("path", this.getPath());
        writer.writeIntegerValue("size_gb", this.getSizeGb());
        writer.writeIntegerValue("size_gb_limit", this.getSizeGbLimit());
        writer.writeStringValue("volume", this.getVolume());
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
     * Sets the add_size_gb property value. The add_size_gb property
     * @param value Value to set for the add_size_gb property.
     */
    public void setAddSizeGb(@jakarta.annotation.Nullable final Integer value) {
        this.addSizeGb = value;
    }
    /**
     * Sets the encrypted property value. The encrypted property
     * @param value Value to set for the encrypted property.
     */
    public void setEncrypted(@jakarta.annotation.Nullable final Boolean value) {
        this.encrypted = value;
    }
    /**
     * Sets the extend_threshold_percent property value. The extend_threshold_percent property
     * @param value Value to set for the extend_threshold_percent property.
     */
    public void setExtendThresholdPercent(@jakarta.annotation.Nullable final Integer value) {
        this.extendThresholdPercent = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the path property value. The path property
     * @param value Value to set for the path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.path = value;
    }
    /**
     * Sets the size_gb property value. The size_gb property
     * @param value Value to set for the size_gb property.
     */
    public void setSizeGb(@jakarta.annotation.Nullable final Integer value) {
        this.sizeGb = value;
    }
    /**
     * Sets the size_gb_limit property value. The size_gb_limit property
     * @param value Value to set for the size_gb_limit property.
     */
    public void setSizeGbLimit(@jakarta.annotation.Nullable final Integer value) {
        this.sizeGbLimit = value;
    }
    /**
     * Sets the volume property value. The volume property
     * @param value Value to set for the volume property.
     */
    public void setVolume(@jakarta.annotation.Nullable final String value) {
        this.volume = value;
    }
}
