package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A Secret needing to be set in the environment of the Machine. env_var is required
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachineSecret implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * EnvVar is required and is the name of the environment variable that will be set from thesecret. It must be a valid environment variable name.
     */
    private String envVar;
    /**
     * Name is optional and when provided is used to reference a secret name where the EnvVar isdifferent from what was set as the secret name.
     */
    private String name;
    /**
     * Instantiates a new {@link MachineSecret} and sets the default values.
     */
    public MachineSecret() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachineSecret}
     */
    @jakarta.annotation.Nonnull
    public static MachineSecret createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineSecret();
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
     * Gets the env_var property value. EnvVar is required and is the name of the environment variable that will be set from thesecret. It must be a valid environment variable name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEnvVar() {
        return this.envVar;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("env_var", (n) -> { this.setEnvVar(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name is optional and when provided is used to reference a secret name where the EnvVar isdifferent from what was set as the secret name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("env_var", this.getEnvVar());
        writer.writeStringValue("name", this.getName());
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
     * Sets the env_var property value. EnvVar is required and is the name of the environment variable that will be set from thesecret. It must be a valid environment variable name.
     * @param value Value to set for the env_var property.
     */
    public void setEnvVar(@jakarta.annotation.Nullable final String value) {
        this.envVar = value;
    }
    /**
     * Sets the name property value. Name is optional and when provided is used to reference a secret name where the EnvVar isdifferent from what was set as the secret name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
}
