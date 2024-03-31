package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import io.fly.sdk.client.models.fly.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StopRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The signal property
     */
    private String signal;
    /**
     * The timeout property
     */
    private Duration timeout;
    /**
     * Instantiates a new {@link StopRequest} and sets the default values.
     */
    public StopRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StopRequest}
     */
    @jakarta.annotation.Nonnull
    public static StopRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StopRequest();
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
        deserializerMap.put("signal", (n) -> { this.setSignal(n.getStringValue()); });
        deserializerMap.put("timeout", (n) -> { this.setTimeout(n.getObjectValue(Duration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the signal property value. The signal property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignal() {
        return this.signal;
    }
    /**
     * Gets the timeout property value. The timeout property
     * @return a {@link Duration}
     */
    @jakarta.annotation.Nullable
    public Duration getTimeout() {
        return this.timeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("signal", this.getSignal());
        writer.writeObjectValue("timeout", this.getTimeout());
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
     * Sets the signal property value. The signal property
     * @param value Value to set for the signal property.
     */
    public void setSignal(@jakarta.annotation.Nullable final String value) {
        this.signal = value;
    }
    /**
     * Sets the timeout property value. The timeout property
     * @param value Value to set for the timeout property.
     */
    public void setTimeout(@jakarta.annotation.Nullable final Duration value) {
        this.timeout = value;
    }
}
