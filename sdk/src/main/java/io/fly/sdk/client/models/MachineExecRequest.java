package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachineExecRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Deprecated: use Command instead
     */
    private String cmd;
    /**
     * The command property
     */
    private java.util.List<String> command;
    /**
     * The timeout property
     */
    private Integer timeout;
    /**
     * Instantiates a new {@link MachineExecRequest} and sets the default values.
     */
    public MachineExecRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachineExecRequest}
     */
    @jakarta.annotation.Nonnull
    public static MachineExecRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineExecRequest();
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
     * Gets the cmd property value. Deprecated: use Command instead
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCmd() {
        return this.cmd;
    }
    /**
     * Gets the command property value. The command property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCommand() {
        return this.command;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("cmd", (n) -> { this.setCmd(n.getStringValue()); });
        deserializerMap.put("command", (n) -> { this.setCommand(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("timeout", (n) -> { this.setTimeout(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the timeout property value. The timeout property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTimeout() {
        return this.timeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cmd", this.getCmd());
        writer.writeCollectionOfPrimitiveValues("command", this.getCommand());
        writer.writeIntegerValue("timeout", this.getTimeout());
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
     * Sets the cmd property value. Deprecated: use Command instead
     * @param value Value to set for the cmd property.
     */
    public void setCmd(@jakarta.annotation.Nullable final String value) {
        this.cmd = value;
    }
    /**
     * Sets the command property value. The command property
     * @param value Value to set for the command property.
     */
    public void setCommand(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.command = value;
    }
    /**
     * Sets the timeout property value. The timeout property
     * @param value Value to set for the timeout property.
     */
    public void setTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.timeout = value;
    }
}
