package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Lease implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Description or reason for the Lease.
     */
    private String description;
    /**
     * ExpiresAt is the unix timestamp in UTC to denote when the Lease will no longer be valid.
     */
    private Integer expiresAt;
    /**
     * Nonce is the unique ID autogenerated and associated with the Lease.
     */
    private String nonce;
    /**
     * Owner is the user identifier which acquired the Lease.
     */
    private String owner;
    /**
     * Machine version
     */
    private String version;
    /**
     * Instantiates a new {@link Lease} and sets the default values.
     */
    public Lease() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Lease}
     */
    @jakarta.annotation.Nonnull
    public static Lease createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Lease();
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
     * Gets the description property value. Description or reason for the Lease.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the expires_at property value. ExpiresAt is the unix timestamp in UTC to denote when the Lease will no longer be valid.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getIntegerValue()); });
        deserializerMap.put("nonce", (n) -> { this.setNonce(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nonce property value. Nonce is the unique ID autogenerated and associated with the Lease.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNonce() {
        return this.nonce;
    }
    /**
     * Gets the owner property value. Owner is the user identifier which acquired the Lease.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwner() {
        return this.owner;
    }
    /**
     * Gets the version property value. Machine version
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeIntegerValue("expires_at", this.getExpiresAt());
        writer.writeStringValue("nonce", this.getNonce());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeStringValue("version", this.getVersion());
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
     * Sets the description property value. Description or reason for the Lease.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the expires_at property value. ExpiresAt is the unix timestamp in UTC to denote when the Lease will no longer be valid.
     * @param value Value to set for the expires_at property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final Integer value) {
        this.expiresAt = value;
    }
    /**
     * Sets the nonce property value. Nonce is the unique ID autogenerated and associated with the Lease.
     * @param value Value to set for the nonce property.
     */
    public void setNonce(@jakarta.annotation.Nullable final String value) {
        this.nonce = value;
    }
    /**
     * Sets the owner property value. Owner is the user identifier which acquired the Lease.
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final String value) {
        this.owner = value;
    }
    /**
     * Sets the version property value. Machine version
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
