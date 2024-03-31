package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * EnvVar defines an environment variable to be populated from a machine field, env_var
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnvFrom implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * EnvVar is required and is the name of the environment variable that will be set from thesecret. It must be a valid environment variable name.
     */
    private String envVar;
    /**
     * FieldRef selects a field of the Machine: supports id, version, app_name, private_ip, region, image.
     */
    private EnvFromFieldRef fieldRef;
    /**
     * Instantiates a new {@link EnvFrom} and sets the default values.
     */
    public EnvFrom() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EnvFrom}
     */
    @jakarta.annotation.Nonnull
    public static EnvFrom createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnvFrom();
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
        deserializerMap.put("field_ref", (n) -> { this.setFieldRef(n.getEnumValue(EnvFromFieldRef::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the field_ref property value. FieldRef selects a field of the Machine: supports id, version, app_name, private_ip, region, image.
     * @return a {@link EnvFromFieldRef}
     */
    @jakarta.annotation.Nullable
    public EnvFromFieldRef getFieldRef() {
        return this.fieldRef;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("env_var", this.getEnvVar());
        writer.writeEnumValue("field_ref", this.getFieldRef());
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
     * Sets the field_ref property value. FieldRef selects a field of the Machine: supports id, version, app_name, private_ip, region, image.
     * @param value Value to set for the field_ref property.
     */
    public void setFieldRef(@jakarta.annotation.Nullable final EnvFromFieldRef value) {
        this.fieldRef = value;
    }
}
