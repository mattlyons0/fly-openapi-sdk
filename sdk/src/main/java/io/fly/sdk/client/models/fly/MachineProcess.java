package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachineProcess implements AdditionalDataHolder, Parsable {
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
     * The env property
     */
    private MachineProcessEnv env;
    /**
     * EnvFrom can be provided to set environment variables from machine fields.
     */
    private java.util.List<EnvFrom> envFrom;
    /**
     * The exec property
     */
    private java.util.List<String> exec;
    /**
     * IgnoreAppSecrets can be set to true to ignore the secrets for the App the Machine belongs toand only use the secrets provided at the process level. The default/legacy behavior is to usethe secrets provided at the App level.
     */
    private Boolean ignoreAppSecrets;
    /**
     * Secrets can be provided at the process level to explicitly indicate which secrets should beused for the process. If not provided, the secrets provided at the machine level will be used.
     */
    private java.util.List<MachineSecret> secrets;
    /**
     * The user property
     */
    private String user;
    /**
     * Instantiates a new {@link MachineProcess} and sets the default values.
     */
    public MachineProcess() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachineProcess}
     */
    @jakarta.annotation.Nonnull
    public static MachineProcess createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineProcess();
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
     * Gets the env property value. The env property
     * @return a {@link MachineProcessEnv}
     */
    @jakarta.annotation.Nullable
    public MachineProcessEnv getEnv() {
        return this.env;
    }
    /**
     * Gets the env_from property value. EnvFrom can be provided to set environment variables from machine fields.
     * @return a {@link java.util.List<EnvFrom>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EnvFrom> getEnvFrom() {
        return this.envFrom;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("cmd", (n) -> { this.setCmd(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("entrypoint", (n) -> { this.setEntrypoint(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("env", (n) -> { this.setEnv(n.getObjectValue(MachineProcessEnv::createFromDiscriminatorValue)); });
        deserializerMap.put("env_from", (n) -> { this.setEnvFrom(n.getCollectionOfObjectValues(EnvFrom::createFromDiscriminatorValue)); });
        deserializerMap.put("exec", (n) -> { this.setExec(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("ignore_app_secrets", (n) -> { this.setIgnoreAppSecrets(n.getBooleanValue()); });
        deserializerMap.put("secrets", (n) -> { this.setSecrets(n.getCollectionOfObjectValues(MachineSecret::createFromDiscriminatorValue)); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignore_app_secrets property value. IgnoreAppSecrets can be set to true to ignore the secrets for the App the Machine belongs toand only use the secrets provided at the process level. The default/legacy behavior is to usethe secrets provided at the App level.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreAppSecrets() {
        return this.ignoreAppSecrets;
    }
    /**
     * Gets the secrets property value. Secrets can be provided at the process level to explicitly indicate which secrets should beused for the process. If not provided, the secrets provided at the machine level will be used.
     * @return a {@link java.util.List<MachineSecret>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MachineSecret> getSecrets() {
        return this.secrets;
    }
    /**
     * Gets the user property value. The user property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("cmd", this.getCmd());
        writer.writeCollectionOfPrimitiveValues("entrypoint", this.getEntrypoint());
        writer.writeObjectValue("env", this.getEnv());
        writer.writeCollectionOfObjectValues("env_from", this.getEnvFrom());
        writer.writeCollectionOfPrimitiveValues("exec", this.getExec());
        writer.writeBooleanValue("ignore_app_secrets", this.getIgnoreAppSecrets());
        writer.writeCollectionOfObjectValues("secrets", this.getSecrets());
        writer.writeStringValue("user", this.getUser());
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
     * Sets the env property value. The env property
     * @param value Value to set for the env property.
     */
    public void setEnv(@jakarta.annotation.Nullable final MachineProcessEnv value) {
        this.env = value;
    }
    /**
     * Sets the env_from property value. EnvFrom can be provided to set environment variables from machine fields.
     * @param value Value to set for the env_from property.
     */
    public void setEnvFrom(@jakarta.annotation.Nullable final java.util.List<EnvFrom> value) {
        this.envFrom = value;
    }
    /**
     * Sets the exec property value. The exec property
     * @param value Value to set for the exec property.
     */
    public void setExec(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.exec = value;
    }
    /**
     * Sets the ignore_app_secrets property value. IgnoreAppSecrets can be set to true to ignore the secrets for the App the Machine belongs toand only use the secrets provided at the process level. The default/legacy behavior is to usethe secrets provided at the App level.
     * @param value Value to set for the ignore_app_secrets property.
     */
    public void setIgnoreAppSecrets(@jakarta.annotation.Nullable final Boolean value) {
        this.ignoreAppSecrets = value;
    }
    /**
     * Sets the secrets property value. Secrets can be provided at the process level to explicitly indicate which secrets should beused for the process. If not provided, the secrets provided at the machine level will be used.
     * @param value Value to set for the secrets property.
     */
    public void setSecrets(@jakarta.annotation.Nullable final java.util.List<MachineSecret> value) {
        this.secrets = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final String value) {
        this.user = value;
    }
}
