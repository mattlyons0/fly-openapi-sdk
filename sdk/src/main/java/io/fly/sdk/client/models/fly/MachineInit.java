package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachineInit implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cmd property
     */
    private java.util.List<String> cmd;
    /**
     * The entrypoint property
     */
    private java.util.List<String> entrypoint;
    /**
     * The exec property
     */
    private java.util.List<String> exec;
    /**
     * The kernel_args property
     */
    private java.util.List<String> kernelArgs;
    /**
     * The swap_size_mb property
     */
    private Integer swapSizeMb;
    /**
     * The tty property
     */
    private Boolean tty;
    /**
     * Instantiates a new {@link MachineInit} and sets the default values.
     */
    public MachineInit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachineInit}
     */
    @jakarta.annotation.Nonnull
    public static MachineInit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineInit();
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
     * Gets the cmd property value. The cmd property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCmd() {
        return this.cmd;
    }
    /**
     * Gets the entrypoint property value. The entrypoint property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEntrypoint() {
        return this.entrypoint;
    }
    /**
     * Gets the exec property value. The exec property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExec() {
        return this.exec;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("cmd", (n) -> { this.setCmd(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("entrypoint", (n) -> { this.setEntrypoint(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("exec", (n) -> { this.setExec(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("kernel_args", (n) -> { this.setKernelArgs(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("swap_size_mb", (n) -> { this.setSwapSizeMb(n.getIntegerValue()); });
        deserializerMap.put("tty", (n) -> { this.setTty(n.getBooleanValue()); });
        return deserializerMap;
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
     * Gets the swap_size_mb property value. The swap_size_mb property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSwapSizeMb() {
        return this.swapSizeMb;
    }
    /**
     * Gets the tty property value. The tty property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTty() {
        return this.tty;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("cmd", this.getCmd());
        writer.writeCollectionOfPrimitiveValues("entrypoint", this.getEntrypoint());
        writer.writeCollectionOfPrimitiveValues("exec", this.getExec());
        writer.writeCollectionOfPrimitiveValues("kernel_args", this.getKernelArgs());
        writer.writeIntegerValue("swap_size_mb", this.getSwapSizeMb());
        writer.writeBooleanValue("tty", this.getTty());
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
     * Sets the cmd property value. The cmd property
     * @param value Value to set for the cmd property.
     */
    public void setCmd(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.cmd = value;
    }
    /**
     * Sets the entrypoint property value. The entrypoint property
     * @param value Value to set for the entrypoint property.
     */
    public void setEntrypoint(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.entrypoint = value;
    }
    /**
     * Sets the exec property value. The exec property
     * @param value Value to set for the exec property.
     */
    public void setExec(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.exec = value;
    }
    /**
     * Sets the kernel_args property value. The kernel_args property
     * @param value Value to set for the kernel_args property.
     */
    public void setKernelArgs(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.kernelArgs = value;
    }
    /**
     * Sets the swap_size_mb property value. The swap_size_mb property
     * @param value Value to set for the swap_size_mb property.
     */
    public void setSwapSizeMb(@jakarta.annotation.Nullable final Integer value) {
        this.swapSizeMb = value;
    }
    /**
     * Sets the tty property value. The tty property
     * @param value Value to set for the tty property.
     */
    public void setTty(@jakarta.annotation.Nullable final Boolean value) {
        this.tty = value;
    }
}
