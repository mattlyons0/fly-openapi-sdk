package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachineGuest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cpu_kind property
     */
    private String cpuKind;
    /**
     * The cpus property
     */
    private Integer cpus;
    /**
     * The gpu_kind property
     */
    private String gpuKind;
    /**
     * The gpus property
     */
    private Integer gpus;
    /**
     * The host_dedication_id property
     */
    private String hostDedicationId;
    /**
     * The kernel_args property
     */
    private java.util.List<String> kernelArgs;
    /**
     * The memory_mb property
     */
    private Integer memoryMb;
    /**
     * Instantiates a new {@link MachineGuest} and sets the default values.
     */
    public MachineGuest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachineGuest}
     */
    @jakarta.annotation.Nonnull
    public static MachineGuest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineGuest();
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
     * Gets the cpu_kind property value. The cpu_kind property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCpuKind() {
        return this.cpuKind;
    }
    /**
     * Gets the cpus property value. The cpus property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCpus() {
        return this.cpus;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("cpu_kind", (n) -> { this.setCpuKind(n.getStringValue()); });
        deserializerMap.put("cpus", (n) -> { this.setCpus(n.getIntegerValue()); });
        deserializerMap.put("gpu_kind", (n) -> { this.setGpuKind(n.getStringValue()); });
        deserializerMap.put("gpus", (n) -> { this.setGpus(n.getIntegerValue()); });
        deserializerMap.put("host_dedication_id", (n) -> { this.setHostDedicationId(n.getStringValue()); });
        deserializerMap.put("kernel_args", (n) -> { this.setKernelArgs(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("memory_mb", (n) -> { this.setMemoryMb(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gpu_kind property value. The gpu_kind property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGpuKind() {
        return this.gpuKind;
    }
    /**
     * Gets the gpus property value. The gpus property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getGpus() {
        return this.gpus;
    }
    /**
     * Gets the host_dedication_id property value. The host_dedication_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHostDedicationId() {
        return this.hostDedicationId;
    }
    /**
     * Gets the kernel_args property value. The kernel_args property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getKernelArgs() {
        return this.kernelArgs;
    }
    /**
     * Gets the memory_mb property value. The memory_mb property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMemoryMb() {
        return this.memoryMb;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cpu_kind", this.getCpuKind());
        writer.writeIntegerValue("cpus", this.getCpus());
        writer.writeStringValue("gpu_kind", this.getGpuKind());
        writer.writeIntegerValue("gpus", this.getGpus());
        writer.writeStringValue("host_dedication_id", this.getHostDedicationId());
        writer.writeCollectionOfPrimitiveValues("kernel_args", this.getKernelArgs());
        writer.writeIntegerValue("memory_mb", this.getMemoryMb());
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
     * Sets the cpu_kind property value. The cpu_kind property
     * @param value Value to set for the cpu_kind property.
     */
    public void setCpuKind(@jakarta.annotation.Nullable final String value) {
        this.cpuKind = value;
    }
    /**
     * Sets the cpus property value. The cpus property
     * @param value Value to set for the cpus property.
     */
    public void setCpus(@jakarta.annotation.Nullable final Integer value) {
        this.cpus = value;
    }
    /**
     * Sets the gpu_kind property value. The gpu_kind property
     * @param value Value to set for the gpu_kind property.
     */
    public void setGpuKind(@jakarta.annotation.Nullable final String value) {
        this.gpuKind = value;
    }
    /**
     * Sets the gpus property value. The gpus property
     * @param value Value to set for the gpus property.
     */
    public void setGpus(@jakarta.annotation.Nullable final Integer value) {
        this.gpus = value;
    }
    /**
     * Sets the host_dedication_id property value. The host_dedication_id property
     * @param value Value to set for the host_dedication_id property.
     */
    public void setHostDedicationId(@jakarta.annotation.Nullable final String value) {
        this.hostDedicationId = value;
    }
    /**
     * Sets the kernel_args property value. The kernel_args property
     * @param value Value to set for the kernel_args property.
     */
    public void setKernelArgs(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.kernelArgs = value;
    }
    /**
     * Sets the memory_mb property value. The memory_mb property
     * @param value Value to set for the memory_mb property.
     */
    public void setMemoryMb(@jakarta.annotation.Nullable final Integer value) {
        this.memoryMb = value;
    }
}
