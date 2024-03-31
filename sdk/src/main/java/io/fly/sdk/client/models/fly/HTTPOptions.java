package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HTTPOptions implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The compress property
     */
    private Boolean compress;
    /**
     * The h2_backend property
     */
    private Boolean h2Backend;
    /**
     * The response property
     */
    private HTTPResponseOptions response;
    /**
     * Instantiates a new {@link HTTPOptions} and sets the default values.
     */
    public HTTPOptions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HTTPOptions}
     */
    @jakarta.annotation.Nonnull
    public static HTTPOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HTTPOptions();
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
     * Gets the compress property value. The compress property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCompress() {
        return this.compress;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("compress", (n) -> { this.setCompress(n.getBooleanValue()); });
        deserializerMap.put("h2_backend", (n) -> { this.setH2Backend(n.getBooleanValue()); });
        deserializerMap.put("response", (n) -> { this.setResponse(n.getObjectValue(HTTPResponseOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the h2_backend property value. The h2_backend property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getH2Backend() {
        return this.h2Backend;
    }
    /**
     * Gets the response property value. The response property
     * @return a {@link HTTPResponseOptions}
     */
    @jakarta.annotation.Nullable
    public HTTPResponseOptions getResponse() {
        return this.response;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("compress", this.getCompress());
        writer.writeBooleanValue("h2_backend", this.getH2Backend());
        writer.writeObjectValue("response", this.getResponse());
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
     * Sets the compress property value. The compress property
     * @param value Value to set for the compress property.
     */
    public void setCompress(@jakarta.annotation.Nullable final Boolean value) {
        this.compress = value;
    }
    /**
     * Sets the h2_backend property value. The h2_backend property
     * @param value Value to set for the h2_backend property.
     */
    public void setH2Backend(@jakarta.annotation.Nullable final Boolean value) {
        this.h2Backend = value;
    }
    /**
     * Sets the response property value. The response property
     * @param value Value to set for the response property.
     */
    public void setResponse(@jakarta.annotation.Nullable final HTTPResponseOptions value) {
        this.response = value;
    }
}
