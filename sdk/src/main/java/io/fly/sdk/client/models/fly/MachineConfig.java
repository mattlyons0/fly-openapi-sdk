package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachineConfig implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Optional boolean telling the Machine to destroy itself once its complete (default false)
     */
    private Boolean autoDestroy;
    /**
     * The checks property
     */
    private MachineConfigChecks checks;
    /**
     * Deprecated: use Service.Autostart instead
     */
    private Boolean disableMachineAutostart;
    /**
     * The dns property
     */
    private DNSConfig dns;
    /**
     * An object filled with key/value pairs to be set as environment variables
     */
    private MachineConfigEnv env;
    /**
     * The files property
     */
    private java.util.List<File> files;
    /**
     * The guest property
     */
    private MachineGuest guest;
    /**
     * The docker image to run
     */
    private String image;
    /**
     * The init property
     */
    private MachineInit init;
    /**
     * The metadata property
     */
    private MachineConfigMetadata metadata;
    /**
     * The metrics property
     */
    private MachineMetrics metrics;
    /**
     * The mounts property
     */
    private java.util.List<MachineMount> mounts;
    /**
     * The processes property
     */
    private java.util.List<MachineProcess> processes;
    /**
     * The Machine restart policy defines whether and how flyd restarts a Machine after its main process exits. See https://fly.io/docs/machines/guides-examples/machine-restart-policy/.
     */
    private MachineRestart restart;
    /**
     * The schedule property
     */
    private String schedule;
    /**
     * The services property
     */
    private java.util.List<MachineService> services;
    /**
     * Deprecated: use Guest instead
     */
    private String size;
    /**
     * Standbys enable a machine to be a standby for another. In the event of a hardware failure,the standby machine will be started.
     */
    private java.util.List<String> standbys;
    /**
     * The statics property
     */
    private java.util.List<StaticEscaped> statics;
    /**
     * The stop_config property
     */
    private StopConfig stopConfig;
    /**
     * Instantiates a new {@link MachineConfig} and sets the default values.
     */
    public MachineConfig() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachineConfig}
     */
    @jakarta.annotation.Nonnull
    public static MachineConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineConfig();
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
     * Gets the auto_destroy property value. Optional boolean telling the Machine to destroy itself once its complete (default false)
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoDestroy() {
        return this.autoDestroy;
    }
    /**
     * Gets the checks property value. The checks property
     * @return a {@link MachineConfigChecks}
     */
    @jakarta.annotation.Nullable
    public MachineConfigChecks getChecks() {
        return this.checks;
    }
    /**
     * Gets the disable_machine_autostart property value. Deprecated: use Service.Autostart instead
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableMachineAutostart() {
        return this.disableMachineAutostart;
    }
    /**
     * Gets the dns property value. The dns property
     * @return a {@link DNSConfig}
     */
    @jakarta.annotation.Nullable
    public DNSConfig getDns() {
        return this.dns;
    }
    /**
     * Gets the env property value. An object filled with key/value pairs to be set as environment variables
     * @return a {@link MachineConfigEnv}
     */
    @jakarta.annotation.Nullable
    public MachineConfigEnv getEnv() {
        return this.env;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("auto_destroy", (n) -> { this.setAutoDestroy(n.getBooleanValue()); });
        deserializerMap.put("checks", (n) -> { this.setChecks(n.getObjectValue(MachineConfigChecks::createFromDiscriminatorValue)); });
        deserializerMap.put("disable_machine_autostart", (n) -> { this.setDisableMachineAutostart(n.getBooleanValue()); });
        deserializerMap.put("dns", (n) -> { this.setDns(n.getObjectValue(DNSConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("env", (n) -> { this.setEnv(n.getObjectValue(MachineConfigEnv::createFromDiscriminatorValue)); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(File::createFromDiscriminatorValue)); });
        deserializerMap.put("guest", (n) -> { this.setGuest(n.getObjectValue(MachineGuest::createFromDiscriminatorValue)); });
        deserializerMap.put("image", (n) -> { this.setImage(n.getStringValue()); });
        deserializerMap.put("init", (n) -> { this.setInit(n.getObjectValue(MachineInit::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(MachineConfigMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("metrics", (n) -> { this.setMetrics(n.getObjectValue(MachineMetrics::createFromDiscriminatorValue)); });
        deserializerMap.put("mounts", (n) -> { this.setMounts(n.getCollectionOfObjectValues(MachineMount::createFromDiscriminatorValue)); });
        deserializerMap.put("processes", (n) -> { this.setProcesses(n.getCollectionOfObjectValues(MachineProcess::createFromDiscriminatorValue)); });
        deserializerMap.put("restart", (n) -> { this.setRestart(n.getObjectValue(MachineRestart::createFromDiscriminatorValue)); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getStringValue()); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(MachineService::createFromDiscriminatorValue)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getStringValue()); });
        deserializerMap.put("standbys", (n) -> { this.setStandbys(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("statics", (n) -> { this.setStatics(n.getCollectionOfObjectValues(StaticEscaped::createFromDiscriminatorValue)); });
        deserializerMap.put("stop_config", (n) -> { this.setStopConfig(n.getObjectValue(StopConfig::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the files property value. The files property
     * @return a {@link java.util.List<File>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<File> getFiles() {
        return this.files;
    }
    /**
     * Gets the guest property value. The guest property
     * @return a {@link MachineGuest}
     */
    @jakarta.annotation.Nullable
    public MachineGuest getGuest() {
        return this.guest;
    }
    /**
     * Gets the image property value. The docker image to run
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImage() {
        return this.image;
    }
    /**
     * Gets the init property value. The init property
     * @return a {@link MachineInit}
     */
    @jakarta.annotation.Nullable
    public MachineInit getInit() {
        return this.init;
    }
    /**
     * Gets the metadata property value. The metadata property
     * @return a {@link MachineConfigMetadata}
     */
    @jakarta.annotation.Nullable
    public MachineConfigMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the metrics property value. The metrics property
     * @return a {@link MachineMetrics}
     */
    @jakarta.annotation.Nullable
    public MachineMetrics getMetrics() {
        return this.metrics;
    }
    /**
     * Gets the mounts property value. The mounts property
     * @return a {@link java.util.List<MachineMount>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MachineMount> getMounts() {
        return this.mounts;
    }
    /**
     * Gets the processes property value. The processes property
     * @return a {@link java.util.List<MachineProcess>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MachineProcess> getProcesses() {
        return this.processes;
    }
    /**
     * Gets the restart property value. The Machine restart policy defines whether and how flyd restarts a Machine after its main process exits. See https://fly.io/docs/machines/guides-examples/machine-restart-policy/.
     * @return a {@link MachineRestart}
     */
    @jakarta.annotation.Nullable
    public MachineRestart getRestart() {
        return this.restart;
    }
    /**
     * Gets the schedule property value. The schedule property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchedule() {
        return this.schedule;
    }
    /**
     * Gets the services property value. The services property
     * @return a {@link java.util.List<MachineService>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MachineService> getServices() {
        return this.services;
    }
    /**
     * Gets the size property value. Deprecated: use Guest instead
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSize() {
        return this.size;
    }
    /**
     * Gets the standbys property value. Standbys enable a machine to be a standby for another. In the event of a hardware failure,the standby machine will be started.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStandbys() {
        return this.standbys;
    }
    /**
     * Gets the statics property value. The statics property
     * @return a {@link java.util.List<StaticEscaped>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StaticEscaped> getStatics() {
        return this.statics;
    }
    /**
     * Gets the stop_config property value. The stop_config property
     * @return a {@link StopConfig}
     */
    @jakarta.annotation.Nullable
    public StopConfig getStopConfig() {
        return this.stopConfig;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("auto_destroy", this.getAutoDestroy());
        writer.writeObjectValue("checks", this.getChecks());
        writer.writeBooleanValue("disable_machine_autostart", this.getDisableMachineAutostart());
        writer.writeObjectValue("dns", this.getDns());
        writer.writeObjectValue("env", this.getEnv());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeObjectValue("guest", this.getGuest());
        writer.writeStringValue("image", this.getImage());
        writer.writeObjectValue("init", this.getInit());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeObjectValue("metrics", this.getMetrics());
        writer.writeCollectionOfObjectValues("mounts", this.getMounts());
        writer.writeCollectionOfObjectValues("processes", this.getProcesses());
        writer.writeObjectValue("restart", this.getRestart());
        writer.writeStringValue("schedule", this.getSchedule());
        writer.writeCollectionOfObjectValues("services", this.getServices());
        writer.writeStringValue("size", this.getSize());
        writer.writeCollectionOfPrimitiveValues("standbys", this.getStandbys());
        writer.writeCollectionOfObjectValues("statics", this.getStatics());
        writer.writeObjectValue("stop_config", this.getStopConfig());
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
     * Sets the auto_destroy property value. Optional boolean telling the Machine to destroy itself once its complete (default false)
     * @param value Value to set for the auto_destroy property.
     */
    public void setAutoDestroy(@jakarta.annotation.Nullable final Boolean value) {
        this.autoDestroy = value;
    }
    /**
     * Sets the checks property value. The checks property
     * @param value Value to set for the checks property.
     */
    public void setChecks(@jakarta.annotation.Nullable final MachineConfigChecks value) {
        this.checks = value;
    }
    /**
     * Sets the disable_machine_autostart property value. Deprecated: use Service.Autostart instead
     * @param value Value to set for the disable_machine_autostart property.
     */
    public void setDisableMachineAutostart(@jakarta.annotation.Nullable final Boolean value) {
        this.disableMachineAutostart = value;
    }
    /**
     * Sets the dns property value. The dns property
     * @param value Value to set for the dns property.
     */
    public void setDns(@jakarta.annotation.Nullable final DNSConfig value) {
        this.dns = value;
    }
    /**
     * Sets the env property value. An object filled with key/value pairs to be set as environment variables
     * @param value Value to set for the env property.
     */
    public void setEnv(@jakarta.annotation.Nullable final MachineConfigEnv value) {
        this.env = value;
    }
    /**
     * Sets the files property value. The files property
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<File> value) {
        this.files = value;
    }
    /**
     * Sets the guest property value. The guest property
     * @param value Value to set for the guest property.
     */
    public void setGuest(@jakarta.annotation.Nullable final MachineGuest value) {
        this.guest = value;
    }
    /**
     * Sets the image property value. The docker image to run
     * @param value Value to set for the image property.
     */
    public void setImage(@jakarta.annotation.Nullable final String value) {
        this.image = value;
    }
    /**
     * Sets the init property value. The init property
     * @param value Value to set for the init property.
     */
    public void setInit(@jakarta.annotation.Nullable final MachineInit value) {
        this.init = value;
    }
    /**
     * Sets the metadata property value. The metadata property
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final MachineConfigMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the metrics property value. The metrics property
     * @param value Value to set for the metrics property.
     */
    public void setMetrics(@jakarta.annotation.Nullable final MachineMetrics value) {
        this.metrics = value;
    }
    /**
     * Sets the mounts property value. The mounts property
     * @param value Value to set for the mounts property.
     */
    public void setMounts(@jakarta.annotation.Nullable final java.util.List<MachineMount> value) {
        this.mounts = value;
    }
    /**
     * Sets the processes property value. The processes property
     * @param value Value to set for the processes property.
     */
    public void setProcesses(@jakarta.annotation.Nullable final java.util.List<MachineProcess> value) {
        this.processes = value;
    }
    /**
     * Sets the restart property value. The Machine restart policy defines whether and how flyd restarts a Machine after its main process exits. See https://fly.io/docs/machines/guides-examples/machine-restart-policy/.
     * @param value Value to set for the restart property.
     */
    public void setRestart(@jakarta.annotation.Nullable final MachineRestart value) {
        this.restart = value;
    }
    /**
     * Sets the schedule property value. The schedule property
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final String value) {
        this.schedule = value;
    }
    /**
     * Sets the services property value. The services property
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<MachineService> value) {
        this.services = value;
    }
    /**
     * Sets the size property value. Deprecated: use Guest instead
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final String value) {
        this.size = value;
    }
    /**
     * Sets the standbys property value. Standbys enable a machine to be a standby for another. In the event of a hardware failure,the standby machine will be started.
     * @param value Value to set for the standbys property.
     */
    public void setStandbys(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.standbys = value;
    }
    /**
     * Sets the statics property value. The statics property
     * @param value Value to set for the statics property.
     */
    public void setStatics(@jakarta.annotation.Nullable final java.util.List<StaticEscaped> value) {
        this.statics = value;
    }
    /**
     * Sets the stop_config property value. The stop_config property
     * @param value Value to set for the stop_config property.
     */
    public void setStopConfig(@jakarta.annotation.Nullable final StopConfig value) {
        this.stopConfig = value;
    }
}
