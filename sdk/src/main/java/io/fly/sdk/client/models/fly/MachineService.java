package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachineService implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The autostart property
     */
    private Boolean autostart;
    /**
     * The autostop property
     */
    private Boolean autostop;
    /**
     * The checks property
     */
    private java.util.List<MachineCheck> checks;
    /**
     * The concurrency property
     */
    private MachineServiceConcurrency concurrency;
    /**
     * The force_instance_description property
     */
    private String forceInstanceDescription;
    /**
     * The force_instance_key property
     */
    private String forceInstanceKey;
    /**
     * The internal_port property
     */
    private Integer internalPort;
    /**
     * The min_machines_running property
     */
    private Integer minMachinesRunning;
    /**
     * The ports property
     */
    private java.util.List<MachinePort> ports;
    /**
     * The protocol property
     */
    private String protocol;
    /**
     * Instantiates a new {@link MachineService} and sets the default values.
     */
    public MachineService() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachineService}
     */
    @jakarta.annotation.Nonnull
    public static MachineService createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineService();
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
     * Gets the autostart property value. The autostart property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutostart() {
        return this.autostart;
    }
    /**
     * Gets the autostop property value. The autostop property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutostop() {
        return this.autostop;
    }
    /**
     * Gets the checks property value. The checks property
     * @return a {@link java.util.List<MachineCheck>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MachineCheck> getChecks() {
        return this.checks;
    }
    /**
     * Gets the concurrency property value. The concurrency property
     * @return a {@link MachineServiceConcurrency}
     */
    @jakarta.annotation.Nullable
    public MachineServiceConcurrency getConcurrency() {
        return this.concurrency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("autostart", (n) -> { this.setAutostart(n.getBooleanValue()); });
        deserializerMap.put("autostop", (n) -> { this.setAutostop(n.getBooleanValue()); });
        deserializerMap.put("checks", (n) -> { this.setChecks(n.getCollectionOfObjectValues(MachineCheck::createFromDiscriminatorValue)); });
        deserializerMap.put("concurrency", (n) -> { this.setConcurrency(n.getObjectValue(MachineServiceConcurrency::createFromDiscriminatorValue)); });
        deserializerMap.put("force_instance_description", (n) -> { this.setForceInstanceDescription(n.getStringValue()); });
        deserializerMap.put("force_instance_key", (n) -> { this.setForceInstanceKey(n.getStringValue()); });
        deserializerMap.put("internal_port", (n) -> { this.setInternalPort(n.getIntegerValue()); });
        deserializerMap.put("min_machines_running", (n) -> { this.setMinMachinesRunning(n.getIntegerValue()); });
        deserializerMap.put("ports", (n) -> { this.setPorts(n.getCollectionOfObjectValues(MachinePort::createFromDiscriminatorValue)); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the force_instance_description property value. The force_instance_description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getForceInstanceDescription() {
        return this.forceInstanceDescription;
    }
    /**
     * Gets the force_instance_key property value. The force_instance_key property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getForceInstanceKey() {
        return this.forceInstanceKey;
    }
    /**
     * Gets the internal_port property value. The internal_port property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInternalPort() {
        return this.internalPort;
    }
    /**
     * Gets the min_machines_running property value. The min_machines_running property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinMachinesRunning() {
        return this.minMachinesRunning;
    }
    /**
     * Gets the ports property value. The ports property
     * @return a {@link java.util.List<MachinePort>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MachinePort> getPorts() {
        return this.ports;
    }
    /**
     * Gets the protocol property value. The protocol property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("autostart", this.getAutostart());
        writer.writeBooleanValue("autostop", this.getAutostop());
        writer.writeCollectionOfObjectValues("checks", this.getChecks());
        writer.writeObjectValue("concurrency", this.getConcurrency());
        writer.writeStringValue("force_instance_description", this.getForceInstanceDescription());
        writer.writeStringValue("force_instance_key", this.getForceInstanceKey());
        writer.writeIntegerValue("internal_port", this.getInternalPort());
        writer.writeIntegerValue("min_machines_running", this.getMinMachinesRunning());
        writer.writeCollectionOfObjectValues("ports", this.getPorts());
        writer.writeStringValue("protocol", this.getProtocol());
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
     * Sets the autostart property value. The autostart property
     * @param value Value to set for the autostart property.
     */
    public void setAutostart(@jakarta.annotation.Nullable final Boolean value) {
        this.autostart = value;
    }
    /**
     * Sets the autostop property value. The autostop property
     * @param value Value to set for the autostop property.
     */
    public void setAutostop(@jakarta.annotation.Nullable final Boolean value) {
        this.autostop = value;
    }
    /**
     * Sets the checks property value. The checks property
     * @param value Value to set for the checks property.
     */
    public void setChecks(@jakarta.annotation.Nullable final java.util.List<MachineCheck> value) {
        this.checks = value;
    }
    /**
     * Sets the concurrency property value. The concurrency property
     * @param value Value to set for the concurrency property.
     */
    public void setConcurrency(@jakarta.annotation.Nullable final MachineServiceConcurrency value) {
        this.concurrency = value;
    }
    /**
     * Sets the force_instance_description property value. The force_instance_description property
     * @param value Value to set for the force_instance_description property.
     */
    public void setForceInstanceDescription(@jakarta.annotation.Nullable final String value) {
        this.forceInstanceDescription = value;
    }
    /**
     * Sets the force_instance_key property value. The force_instance_key property
     * @param value Value to set for the force_instance_key property.
     */
    public void setForceInstanceKey(@jakarta.annotation.Nullable final String value) {
        this.forceInstanceKey = value;
    }
    /**
     * Sets the internal_port property value. The internal_port property
     * @param value Value to set for the internal_port property.
     */
    public void setInternalPort(@jakarta.annotation.Nullable final Integer value) {
        this.internalPort = value;
    }
    /**
     * Sets the min_machines_running property value. The min_machines_running property
     * @param value Value to set for the min_machines_running property.
     */
    public void setMinMachinesRunning(@jakarta.annotation.Nullable final Integer value) {
        this.minMachinesRunning = value;
    }
    /**
     * Sets the ports property value. The ports property
     * @param value Value to set for the ports property.
     */
    public void setPorts(@jakarta.annotation.Nullable final java.util.List<MachinePort> value) {
        this.ports = value;
    }
    /**
     * Sets the protocol property value. The protocol property
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final String value) {
        this.protocol = value;
    }
}
