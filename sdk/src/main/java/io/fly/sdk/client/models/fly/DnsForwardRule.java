package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DnsForwardRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The addr property
     */
    private String addr;
    /**
     * The basename property
     */
    private String basename;
    /**
     * Instantiates a new {@link DnsForwardRule} and sets the default values.
     */
    public DnsForwardRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DnsForwardRule}
     */
    @jakarta.annotation.Nonnull
    public static DnsForwardRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DnsForwardRule();
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
     * Gets the addr property value. The addr property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddr() {
        return this.addr;
    }
    /**
     * Gets the basename property value. The basename property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBasename() {
        return this.basename;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("addr", (n) -> { this.setAddr(n.getStringValue()); });
        deserializerMap.put("basename", (n) -> { this.setBasename(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("addr", this.getAddr());
        writer.writeStringValue("basename", this.getBasename());
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
     * Sets the addr property value. The addr property
     * @param value Value to set for the addr property.
     */
    public void setAddr(@jakarta.annotation.Nullable final String value) {
        this.addr = value;
    }
    /**
     * Sets the basename property value. The basename property
     * @param value Value to set for the basename property.
     */
    public void setBasename(@jakarta.annotation.Nullable final String value) {
        this.basename = value;
    }
}
