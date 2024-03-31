package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import io.fly.sdk.client.models.fly.MachineGuest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateVolumeRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The compute property
     */
    private MachineGuest compute;
    /**
     * The compute_image property
     */
    private String computeImage;
    /**
     * The encrypted property
     */
    private Boolean encrypted;
    /**
     * The fstype property
     */
    private String fstype;
    /**
     * The machines_only property
     */
    private Boolean machinesOnly;
    /**
     * The name property
     */
    private String name;
    /**
     * The region property
     */
    private String region;
    /**
     * The require_unique_zone property
     */
    private Boolean requireUniqueZone;
    /**
     * The size_gb property
     */
    private Integer sizeGb;
    /**
     * restore from snapshot
     */
    private String snapshotId;
    /**
     * The snapshot_retention property
     */
    private Integer snapshotRetention;
    /**
     * fork from remote volume
     */
    private String sourceVolumeId;
    /**
     * Instantiates a new {@link CreateVolumeRequest} and sets the default values.
     */
    public CreateVolumeRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateVolumeRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateVolumeRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateVolumeRequest();
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
     * Gets the compute property value. The compute property
     * @return a {@link MachineGuest}
     */
    @jakarta.annotation.Nullable
    public MachineGuest getCompute() {
        return this.compute;
    }
    /**
     * Gets the compute_image property value. The compute_image property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComputeImage() {
        return this.computeImage;
    }
    /**
     * Gets the encrypted property value. The encrypted property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEncrypted() {
        return this.encrypted;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("compute", (n) -> { this.setCompute(n.getObjectValue(MachineGuest::createFromDiscriminatorValue)); });
        deserializerMap.put("compute_image", (n) -> { this.setComputeImage(n.getStringValue()); });
        deserializerMap.put("encrypted", (n) -> { this.setEncrypted(n.getBooleanValue()); });
        deserializerMap.put("fstype", (n) -> { this.setFstype(n.getStringValue()); });
        deserializerMap.put("machines_only", (n) -> { this.setMachinesOnly(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("require_unique_zone", (n) -> { this.setRequireUniqueZone(n.getBooleanValue()); });
        deserializerMap.put("size_gb", (n) -> { this.setSizeGb(n.getIntegerValue()); });
        deserializerMap.put("snapshot_id", (n) -> { this.setSnapshotId(n.getStringValue()); });
        deserializerMap.put("snapshot_retention", (n) -> { this.setSnapshotRetention(n.getIntegerValue()); });
        deserializerMap.put("source_volume_id", (n) -> { this.setSourceVolumeId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fstype property value. The fstype property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFstype() {
        return this.fstype;
    }
    /**
     * Gets the machines_only property value. The machines_only property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMachinesOnly() {
        return this.machinesOnly;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the region property value. The region property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Gets the require_unique_zone property value. The require_unique_zone property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireUniqueZone() {
        return this.requireUniqueZone;
    }
    /**
     * Gets the size_gb property value. The size_gb property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSizeGb() {
        return this.sizeGb;
    }
    /**
     * Gets the snapshot_id property value. restore from snapshot
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSnapshotId() {
        return this.snapshotId;
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
     * Gets the source_volume_id property value. fork from remote volume
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceVolumeId() {
        return this.sourceVolumeId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("compute", this.getCompute());
        writer.writeStringValue("compute_image", this.getComputeImage());
        writer.writeBooleanValue("encrypted", this.getEncrypted());
        writer.writeStringValue("fstype", this.getFstype());
        writer.writeBooleanValue("machines_only", this.getMachinesOnly());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("region", this.getRegion());
        writer.writeBooleanValue("require_unique_zone", this.getRequireUniqueZone());
        writer.writeIntegerValue("size_gb", this.getSizeGb());
        writer.writeStringValue("snapshot_id", this.getSnapshotId());
        writer.writeIntegerValue("snapshot_retention", this.getSnapshotRetention());
        writer.writeStringValue("source_volume_id", this.getSourceVolumeId());
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
     * Sets the compute property value. The compute property
     * @param value Value to set for the compute property.
     */
    public void setCompute(@jakarta.annotation.Nullable final MachineGuest value) {
        this.compute = value;
    }
    /**
     * Sets the compute_image property value. The compute_image property
     * @param value Value to set for the compute_image property.
     */
    public void setComputeImage(@jakarta.annotation.Nullable final String value) {
        this.computeImage = value;
    }
    /**
     * Sets the encrypted property value. The encrypted property
     * @param value Value to set for the encrypted property.
     */
    public void setEncrypted(@jakarta.annotation.Nullable final Boolean value) {
        this.encrypted = value;
    }
    /**
     * Sets the fstype property value. The fstype property
     * @param value Value to set for the fstype property.
     */
    public void setFstype(@jakarta.annotation.Nullable final String value) {
        this.fstype = value;
    }
    /**
     * Sets the machines_only property value. The machines_only property
     * @param value Value to set for the machines_only property.
     */
    public void setMachinesOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.machinesOnly = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the region property value. The region property
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.region = value;
    }
    /**
     * Sets the require_unique_zone property value. The require_unique_zone property
     * @param value Value to set for the require_unique_zone property.
     */
    public void setRequireUniqueZone(@jakarta.annotation.Nullable final Boolean value) {
        this.requireUniqueZone = value;
    }
    /**
     * Sets the size_gb property value. The size_gb property
     * @param value Value to set for the size_gb property.
     */
    public void setSizeGb(@jakarta.annotation.Nullable final Integer value) {
        this.sizeGb = value;
    }
    /**
     * Sets the snapshot_id property value. restore from snapshot
     * @param value Value to set for the snapshot_id property.
     */
    public void setSnapshotId(@jakarta.annotation.Nullable final String value) {
        this.snapshotId = value;
    }
    /**
     * Sets the snapshot_retention property value. The snapshot_retention property
     * @param value Value to set for the snapshot_retention property.
     */
    public void setSnapshotRetention(@jakarta.annotation.Nullable final Integer value) {
        this.snapshotRetention = value;
    }
    /**
     * Sets the source_volume_id property value. fork from remote volume
     * @param value Value to set for the source_volume_id property.
     */
    public void setSourceVolumeId(@jakarta.annotation.Nullable final String value) {
        this.sourceVolumeId = value;
    }
}
