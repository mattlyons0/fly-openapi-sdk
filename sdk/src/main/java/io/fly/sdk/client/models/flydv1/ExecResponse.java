package io.fly.sdk.client.models.flydv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExecResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The exit_code property
     */
    private Integer exitCode;
    /**
     * The exit_signal property
     */
    private Integer exitSignal;
    /**
     * The stderr property
     */
    private String stderr;
    /**
     * The stdout property
     */
    private String stdout;
    /**
     * Instantiates a new {@link ExecResponse} and sets the default values.
     */
    public ExecResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExecResponse}
     */
    @jakarta.annotation.Nonnull
    public static ExecResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExecResponse();
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
     * Gets the exit_code property value. The exit_code property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExitCode() {
        return this.exitCode;
    }
    /**
     * Gets the exit_signal property value. The exit_signal property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExitSignal() {
        return this.exitSignal;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("exit_code", (n) -> { this.setExitCode(n.getIntegerValue()); });
        deserializerMap.put("exit_signal", (n) -> { this.setExitSignal(n.getIntegerValue()); });
        deserializerMap.put("stderr", (n) -> { this.setStderr(n.getStringValue()); });
        deserializerMap.put("stdout", (n) -> { this.setStdout(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the stderr property value. The stderr property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStderr() {
        return this.stderr;
    }
    /**
     * Gets the stdout property value. The stdout property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStdout() {
        return this.stdout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("exit_code", this.getExitCode());
        writer.writeIntegerValue("exit_signal", this.getExitSignal());
        writer.writeStringValue("stderr", this.getStderr());
        writer.writeStringValue("stdout", this.getStdout());
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
     * Sets the exit_code property value. The exit_code property
     * @param value Value to set for the exit_code property.
     */
    public void setExitCode(@jakarta.annotation.Nullable final Integer value) {
        this.exitCode = value;
    }
    /**
     * Sets the exit_signal property value. The exit_signal property
     * @param value Value to set for the exit_signal property.
     */
    public void setExitSignal(@jakarta.annotation.Nullable final Integer value) {
        this.exitSignal = value;
    }
    /**
     * Sets the stderr property value. The stderr property
     * @param value Value to set for the stderr property.
     */
    public void setStderr(@jakarta.annotation.Nullable final String value) {
        this.stderr = value;
    }
    /**
     * Sets the stdout property value. The stdout property
     * @param value Value to set for the stdout property.
     */
    public void setStdout(@jakarta.annotation.Nullable final String value) {
        this.stdout = value;
    }
}
