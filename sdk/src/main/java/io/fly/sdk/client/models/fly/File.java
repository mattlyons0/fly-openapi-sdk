package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A file that will be written to the Machine. One of RawValue or SecretName must be set.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class File implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * GuestPath is the path on the machine where the file will be written and must be an absolute path.For example: /full/path/to/file.json
     */
    private String guestPath;
    /**
     * The base64 encoded string of the file contents.
     */
    private String rawValue;
    /**
     * The name of the secret that contains the base64 encoded file contents.
     */
    private String secretName;
    /**
     * Instantiates a new {@link File} and sets the default values.
     */
    public File() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link File}
     */
    @jakarta.annotation.Nonnull
    public static File createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new File();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("guest_path", (n) -> { this.setGuestPath(n.getStringValue()); });
        deserializerMap.put("raw_value", (n) -> { this.setRawValue(n.getStringValue()); });
        deserializerMap.put("secret_name", (n) -> { this.setSecretName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the guest_path property value. GuestPath is the path on the machine where the file will be written and must be an absolute path.For example: /full/path/to/file.json
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGuestPath() {
        return this.guestPath;
    }
    /**
     * Gets the raw_value property value. The base64 encoded string of the file contents.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRawValue() {
        return this.rawValue;
    }
    /**
     * Gets the secret_name property value. The name of the secret that contains the base64 encoded file contents.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecretName() {
        return this.secretName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("guest_path", this.getGuestPath());
        writer.writeStringValue("raw_value", this.getRawValue());
        writer.writeStringValue("secret_name", this.getSecretName());
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
     * Sets the guest_path property value. GuestPath is the path on the machine where the file will be written and must be an absolute path.For example: /full/path/to/file.json
     * @param value Value to set for the guest_path property.
     */
    public void setGuestPath(@jakarta.annotation.Nullable final String value) {
        this.guestPath = value;
    }
    /**
     * Sets the raw_value property value. The base64 encoded string of the file contents.
     * @param value Value to set for the raw_value property.
     */
    public void setRawValue(@jakarta.annotation.Nullable final String value) {
        this.rawValue = value;
    }
    /**
     * Sets the secret_name property value. The name of the secret that contains the base64 encoded file contents.
     * @param value Value to set for the secret_name property.
     */
    public void setSecretName(@jakarta.annotation.Nullable final String value) {
        this.secretName = value;
    }
}
