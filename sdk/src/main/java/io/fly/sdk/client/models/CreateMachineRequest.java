package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import io.fly.sdk.client.models.fly.MachineConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateMachineRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An object defining the Machine configuration
     */
    private MachineConfig config;
    /**
     * The lease_ttl property
     */
    private Integer leaseTtl;
    /**
     * The lsvd property
     */
    private Boolean lsvd;
    /**
     * Unique name for this Machine. If omitted, one is generated for you
     */
    private String name;
    /**
     * The target region. Omitting this param launches in the same region as your WireGuard peer connection (somewhere near you).
     */
    private String region;
    /**
     * The skip_launch property
     */
    private Boolean skipLaunch;
    /**
     * The skip_service_registration property
     */
    private Boolean skipServiceRegistration;
    /**
     * Instantiates a new {@link CreateMachineRequest} and sets the default values.
     */
    public CreateMachineRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateMachineRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateMachineRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateMachineRequest();
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
     * Gets the config property value. An object defining the Machine configuration
     * @return a {@link MachineConfig}
     */
    @jakarta.annotation.Nullable
    public MachineConfig getConfig() {
        return this.config;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("config", (n) -> { this.setConfig(n.getObjectValue(MachineConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("lease_ttl", (n) -> { this.setLeaseTtl(n.getIntegerValue()); });
        deserializerMap.put("lsvd", (n) -> { this.setLsvd(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("skip_launch", (n) -> { this.setSkipLaunch(n.getBooleanValue()); });
        deserializerMap.put("skip_service_registration", (n) -> { this.setSkipServiceRegistration(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lease_ttl property value. The lease_ttl property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLeaseTtl() {
        return this.leaseTtl;
    }
    /**
     * Gets the lsvd property value. The lsvd property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLsvd() {
        return this.lsvd;
    }
    /**
     * Gets the name property value. Unique name for this Machine. If omitted, one is generated for you
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the region property value. The target region. Omitting this param launches in the same region as your WireGuard peer connection (somewhere near you).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Gets the skip_launch property value. The skip_launch property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipLaunch() {
        return this.skipLaunch;
    }
    /**
     * Gets the skip_service_registration property value. The skip_service_registration property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipServiceRegistration() {
        return this.skipServiceRegistration;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("config", this.getConfig());
        writer.writeIntegerValue("lease_ttl", this.getLeaseTtl());
        writer.writeBooleanValue("lsvd", this.getLsvd());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("region", this.getRegion());
        writer.writeBooleanValue("skip_launch", this.getSkipLaunch());
        writer.writeBooleanValue("skip_service_registration", this.getSkipServiceRegistration());
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
     * Sets the config property value. An object defining the Machine configuration
     * @param value Value to set for the config property.
     */
    public void setConfig(@jakarta.annotation.Nullable final MachineConfig value) {
        this.config = value;
    }
    /**
     * Sets the lease_ttl property value. The lease_ttl property
     * @param value Value to set for the lease_ttl property.
     */
    public void setLeaseTtl(@jakarta.annotation.Nullable final Integer value) {
        this.leaseTtl = value;
    }
    /**
     * Sets the lsvd property value. The lsvd property
     * @param value Value to set for the lsvd property.
     */
    public void setLsvd(@jakarta.annotation.Nullable final Boolean value) {
        this.lsvd = value;
    }
    /**
     * Sets the name property value. Unique name for this Machine. If omitted, one is generated for you
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the region property value. The target region. Omitting this param launches in the same region as your WireGuard peer connection (somewhere near you).
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.region = value;
    }
    /**
     * Sets the skip_launch property value. The skip_launch property
     * @param value Value to set for the skip_launch property.
     */
    public void setSkipLaunch(@jakarta.annotation.Nullable final Boolean value) {
        this.skipLaunch = value;
    }
    /**
     * Sets the skip_service_registration property value. The skip_service_registration property
     * @param value Value to set for the skip_service_registration property.
     */
    public void setSkipServiceRegistration(@jakarta.annotation.Nullable final Boolean value) {
        this.skipServiceRegistration = value;
    }
}
