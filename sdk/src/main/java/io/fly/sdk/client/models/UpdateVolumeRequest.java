package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateVolumeRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The auto_backup_enabled property
     */
    private Boolean autoBackupEnabled;
    /**
     * The snapshot_retention property
     */
    private Integer snapshotRetention;
    /**
     * Instantiates a new {@link UpdateVolumeRequest} and sets the default values.
     */
    public UpdateVolumeRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateVolumeRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateVolumeRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateVolumeRequest();
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
     * Gets the auto_backup_enabled property value. The auto_backup_enabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoBackupEnabled() {
        return this.autoBackupEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("auto_backup_enabled", (n) -> { this.setAutoBackupEnabled(n.getBooleanValue()); });
        deserializerMap.put("snapshot_retention", (n) -> { this.setSnapshotRetention(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the snapshot_retention property value. The snapshot_retention property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSnapshotRetention() {
        return this.snapshotRetention;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("auto_backup_enabled", this.getAutoBackupEnabled());
        writer.writeIntegerValue("snapshot_retention", this.getSnapshotRetention());
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
     * Sets the auto_backup_enabled property value. The auto_backup_enabled property
     * @param value Value to set for the auto_backup_enabled property.
     */
    public void setAutoBackupEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.autoBackupEnabled = value;
    }
    /**
     * Sets the snapshot_retention property value. The snapshot_retention property
     * @param value Value to set for the snapshot_retention property.
     */
    public void setSnapshotRetention(@jakarta.annotation.Nullable final Integer value) {
        this.snapshotRetention = value;
    }
}
