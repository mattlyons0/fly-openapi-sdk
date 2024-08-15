package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import io.fly.sdk.client.models.fly.MachineConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Machine implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The checks property
     */
    private java.util.List<CheckStatus> checks;
    /**
     * The config property
     */
    private MachineConfig config;
    /**
     * The created_at property
     */
    private String createdAt;
    /**
     * The events property
     */
    private java.util.List<MachineEvent> events;
    /**
     * The host_status property
     */
    private MachineHostStatus hostStatus;
    /**
     * The id property
     */
    private String id;
    /**
     * The image_ref property
     */
    private ImageRef imageRef;
    /**
     * The incomplete_config property
     */
    private MachineConfig incompleteConfig;
    /**
     * InstanceID is unique for each version of the machine
     */
    private String instanceId;
    /**
     * The name property
     */
    private String name;
    /**
     * Nonce is only every returned on machine creation if a lease_duration was provided.
     */
    private String nonce;
    /**
     * PrivateIP is the internal 6PN address of the machine.
     */
    private String privateIp;
    /**
     * The region property
     */
    private String region;
    /**
     * The state property
     */
    private String state;
    /**
     * The updated_at property
     */
    private String updatedAt;
    /**
     * Instantiates a new {@link Machine} and sets the default values.
     */
    public Machine() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Machine}
     */
    @jakarta.annotation.Nonnull
    public static Machine createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Machine();
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
     * Gets the checks property value. The checks property
     * @return a {@link java.util.List<CheckStatus>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CheckStatus> getChecks() {
        return this.checks;
    }
    /**
     * Gets the config property value. The config property
     * @return a {@link MachineConfig}
     */
    @jakarta.annotation.Nullable
    public MachineConfig getConfig() {
        return this.config;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the events property value. The events property
     * @return a {@link java.util.List<MachineEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MachineEvent> getEvents() {
        return this.events;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("checks", (n) -> { this.setChecks(n.getCollectionOfObjectValues(CheckStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("config", (n) -> { this.setConfig(n.getObjectValue(MachineConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(MachineEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("host_status", (n) -> { this.setHostStatus(n.getEnumValue(MachineHostStatus::forValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("image_ref", (n) -> { this.setImageRef(n.getObjectValue(ImageRef::createFromDiscriminatorValue)); });
        deserializerMap.put("incomplete_config", (n) -> { this.setIncompleteConfig(n.getObjectValue(MachineConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("instance_id", (n) -> { this.setInstanceId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("nonce", (n) -> { this.setNonce(n.getStringValue()); });
        deserializerMap.put("private_ip", (n) -> { this.setPrivateIp(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the host_status property value. The host_status property
     * @return a {@link MachineHostStatus}
     */
    @jakarta.annotation.Nullable
    public MachineHostStatus getHostStatus() {
        return this.hostStatus;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the image_ref property value. The image_ref property
     * @return a {@link ImageRef}
     */
    @jakarta.annotation.Nullable
    public ImageRef getImageRef() {
        return this.imageRef;
    }
    /**
     * Gets the incomplete_config property value. The incomplete_config property
     * @return a {@link MachineConfig}
     */
    @jakarta.annotation.Nullable
    public MachineConfig getIncompleteConfig() {
        return this.incompleteConfig;
    }
    /**
     * Gets the instance_id property value. InstanceID is unique for each version of the machine
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInstanceId() {
        return this.instanceId;
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
     * Gets the nonce property value. Nonce is only every returned on machine creation if a lease_duration was provided.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNonce() {
        return this.nonce;
    }
    /**
     * Gets the private_ip property value. PrivateIP is the internal 6PN address of the machine.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrivateIp() {
        return this.privateIp;
    }
    /**
     * Gets the region property value. The region property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the updated_at property value. The updated_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("checks", this.getChecks());
        writer.writeObjectValue("config", this.getConfig());
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeEnumValue("host_status", this.getHostStatus());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("image_ref", this.getImageRef());
        writer.writeObjectValue("incomplete_config", this.getIncompleteConfig());
        writer.writeStringValue("instance_id", this.getInstanceId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("nonce", this.getNonce());
        writer.writeStringValue("private_ip", this.getPrivateIp());
        writer.writeStringValue("region", this.getRegion());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("updated_at", this.getUpdatedAt());
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
     * Sets the checks property value. The checks property
     * @param value Value to set for the checks property.
     */
    public void setChecks(@jakarta.annotation.Nullable final java.util.List<CheckStatus> value) {
        this.checks = value;
    }
    /**
     * Sets the config property value. The config property
     * @param value Value to set for the config property.
     */
    public void setConfig(@jakarta.annotation.Nullable final MachineConfig value) {
        this.config = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the events property value. The events property
     * @param value Value to set for the events property.
     */
    public void setEvents(@jakarta.annotation.Nullable final java.util.List<MachineEvent> value) {
        this.events = value;
    }
    /**
     * Sets the host_status property value. The host_status property
     * @param value Value to set for the host_status property.
     */
    public void setHostStatus(@jakarta.annotation.Nullable final MachineHostStatus value) {
        this.hostStatus = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the image_ref property value. The image_ref property
     * @param value Value to set for the image_ref property.
     */
    public void setImageRef(@jakarta.annotation.Nullable final ImageRef value) {
        this.imageRef = value;
    }
    /**
     * Sets the incomplete_config property value. The incomplete_config property
     * @param value Value to set for the incomplete_config property.
     */
    public void setIncompleteConfig(@jakarta.annotation.Nullable final MachineConfig value) {
        this.incompleteConfig = value;
    }
    /**
     * Sets the instance_id property value. InstanceID is unique for each version of the machine
     * @param value Value to set for the instance_id property.
     */
    public void setInstanceId(@jakarta.annotation.Nullable final String value) {
        this.instanceId = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the nonce property value. Nonce is only every returned on machine creation if a lease_duration was provided.
     * @param value Value to set for the nonce property.
     */
    public void setNonce(@jakarta.annotation.Nullable final String value) {
        this.nonce = value;
    }
    /**
     * Sets the private_ip property value. PrivateIP is the internal 6PN address of the machine.
     * @param value Value to set for the private_ip property.
     */
    public void setPrivateIp(@jakarta.annotation.Nullable final String value) {
        this.privateIp = value;
    }
    /**
     * Sets the region property value. The region property
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.region = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the updated_at property value. The updated_at property
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final String value) {
        this.updatedAt = value;
    }
}
