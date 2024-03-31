package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImageRef implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The digest property
     */
    private String digest;
    /**
     * The labels property
     */
    private ImageRefLabels labels;
    /**
     * The registry property
     */
    private String registry;
    /**
     * The repository property
     */
    private String repository;
    /**
     * The tag property
     */
    private String tag;
    /**
     * Instantiates a new {@link ImageRef} and sets the default values.
     */
    public ImageRef() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImageRef}
     */
    @jakarta.annotation.Nonnull
    public static ImageRef createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImageRef();
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
     * Gets the digest property value. The digest property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDigest() {
        return this.digest;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("digest", (n) -> { this.setDigest(n.getStringValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(ImageRefLabels::createFromDiscriminatorValue)); });
        deserializerMap.put("registry", (n) -> { this.setRegistry(n.getStringValue()); });
        deserializerMap.put("repository", (n) -> { this.setRepository(n.getStringValue()); });
        deserializerMap.put("tag", (n) -> { this.setTag(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the labels property value. The labels property
     * @return a {@link ImageRefLabels}
     */
    @jakarta.annotation.Nullable
    public ImageRefLabels getLabels() {
        return this.labels;
    }
    /**
     * Gets the registry property value. The registry property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegistry() {
        return this.registry;
    }
    /**
     * Gets the repository property value. The repository property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRepository() {
        return this.repository;
    }
    /**
     * Gets the tag property value. The tag property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTag() {
        return this.tag;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("digest", this.getDigest());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("registry", this.getRegistry());
        writer.writeStringValue("repository", this.getRepository());
        writer.writeStringValue("tag", this.getTag());
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
     * Sets the digest property value. The digest property
     * @param value Value to set for the digest property.
     */
    public void setDigest(@jakarta.annotation.Nullable final String value) {
        this.digest = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final ImageRefLabels value) {
        this.labels = value;
    }
    /**
     * Sets the registry property value. The registry property
     * @param value Value to set for the registry property.
     */
    public void setRegistry(@jakarta.annotation.Nullable final String value) {
        this.registry = value;
    }
    /**
     * Sets the repository property value. The repository property
     * @param value Value to set for the repository property.
     */
    public void setRepository(@jakarta.annotation.Nullable final String value) {
        this.repository = value;
    }
    /**
     * Sets the tag property value. The tag property
     * @param value Value to set for the tag property.
     */
    public void setTag(@jakarta.annotation.Nullable final String value) {
        this.tag = value;
    }
}
