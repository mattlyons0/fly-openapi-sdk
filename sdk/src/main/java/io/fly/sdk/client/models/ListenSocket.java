package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListenSocket implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The address property
     */
    private String address;
    /**
     * The proto property
     */
    private String proto;
    /**
     * Instantiates a new {@link ListenSocket} and sets the default values.
     */
    public ListenSocket() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListenSocket}
     */
    @jakarta.annotation.Nonnull
    public static ListenSocket createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListenSocket();
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
     * Gets the address property value. The address property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddress() {
        return this.address;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getStringValue()); });
        deserializerMap.put("proto", (n) -> { this.setProto(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the proto property value. The proto property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProto() {
        return this.proto;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("address", this.getAddress());
        writer.writeStringValue("proto", this.getProto());
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
     * Sets the address property value. The address property
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final String value) {
        this.address = value;
    }
    /**
     * Sets the proto property value. The proto property
     * @param value Value to set for the proto property.
     */
    public void setProto(@jakarta.annotation.Nullable final String value) {
        this.proto = value;
    }
}
