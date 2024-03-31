package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Machine restart policy defines whether and how flyd restarts a Machine after its main process exits. See https://fly.io/docs/machines/guides-examples/machine-restart-policy/.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachineRestart implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * When policy is on-failure, the maximum number of times to attempt to restart the Machine before letting it stop.
     */
    private Integer maxRetries;
    /**
     * * no - Never try to restart a Machine automatically when its main process exits, whether thats on purpose or on a crash.* always - Always restart a Machine automatically and never let it enter a stopped state, even when the main process exits cleanly.* on-failure - Try up to MaxRetries times to automatically restart the Machine if it exits with a non-zero exit code. Default when no explicit policy is set, and for Machines with schedules.
     */
    private MachineRestartPolicy policy;
    /**
     * Instantiates a new {@link MachineRestart} and sets the default values.
     */
    public MachineRestart() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachineRestart}
     */
    @jakarta.annotation.Nonnull
    public static MachineRestart createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineRestart();
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
        deserializerMap.put("max_retries", (n) -> { this.setMaxRetries(n.getIntegerValue()); });
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getEnumValue(MachineRestartPolicy::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the max_retries property value. When policy is on-failure, the maximum number of times to attempt to restart the Machine before letting it stop.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxRetries() {
        return this.maxRetries;
    }
    /**
     * Gets the policy property value. * no - Never try to restart a Machine automatically when its main process exits, whether thats on purpose or on a crash.* always - Always restart a Machine automatically and never let it enter a stopped state, even when the main process exits cleanly.* on-failure - Try up to MaxRetries times to automatically restart the Machine if it exits with a non-zero exit code. Default when no explicit policy is set, and for Machines with schedules.
     * @return a {@link MachineRestartPolicy}
     */
    @jakarta.annotation.Nullable
    public MachineRestartPolicy getPolicy() {
        return this.policy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("max_retries", this.getMaxRetries());
        writer.writeEnumValue("policy", this.getPolicy());
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
     * Sets the max_retries property value. When policy is on-failure, the maximum number of times to attempt to restart the Machine before letting it stop.
     * @param value Value to set for the max_retries property.
     */
    public void setMaxRetries(@jakarta.annotation.Nullable final Integer value) {
        this.maxRetries = value;
    }
    /**
     * Sets the policy property value. * no - Never try to restart a Machine automatically when its main process exits, whether thats on purpose or on a crash.* always - Always restart a Machine automatically and never let it enter a stopped state, even when the main process exits cleanly.* on-failure - Try up to MaxRetries times to automatically restart the Machine if it exits with a non-zero exit code. Default when no explicit policy is set, and for Machines with schedules.
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final MachineRestartPolicy value) {
        this.policy = value;
    }
}
