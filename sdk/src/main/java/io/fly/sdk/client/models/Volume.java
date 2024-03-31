package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Volume implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The attached_alloc_id property
     */
    private String attachedAllocId;
    /**
     * The attached_machine_id property
     */
    private String attachedMachineId;
    /**
     * The auto_backup_enabled property
     */
    private Boolean autoBackupEnabled;
    /**
     * The blocks property
     */
    private Integer blocks;
    /**
     * The blocks_avail property
     */
    private Integer blocksAvail;
    /**
     * The blocks_free property
     */
    private Integer blocksFree;
    /**
     * The block_size property
     */
    private Integer blockSize;
    /**
     * The created_at property
     */
    private String createdAt;
    /**
     * The encrypted property
     */
    private Boolean encrypted;
    /**
     * The fstype property
     */
    private String fstype;
    /**
     * The id property
     */
    private String id;
    /**
     * The name property
     */
    private String name;
    /**
     * The region property
     */
    private String region;
    /**
     * The size_gb property
     */
    private Integer sizeGb;
    /**
     * The snapshot_retention property
     */
    private Integer snapshotRetention;
    /**
     * The state property
     */
    private String state;
    /**
     * The zone property
     */
    private String zone;
    /**
     * Instantiates a new {@link Volume} and sets the default values.
     */
    public Volume() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Volume}
     */
    @jakarta.annotation.Nonnull
    public static Volume createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Volume();
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
     * Gets the attached_alloc_id property value. The attached_alloc_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAttachedAllocId() {
        return this.attachedAllocId;
    }
    /**
     * Gets the attached_machine_id property value. The attached_machine_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAttachedMachineId() {
        return this.attachedMachineId;
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
     * Gets the blocks property value. The blocks property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBlocks() {
        return this.blocks;
    }
    /**
     * Gets the blocks_avail property value. The blocks_avail property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBlocksAvail() {
        return this.blocksAvail;
    }
    /**
     * Gets the blocks_free property value. The blocks_free property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBlocksFree() {
        return this.blocksFree;
    }
    /**
     * Gets the block_size property value. The block_size property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBlockSize() {
        return this.blockSize;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("attached_alloc_id", (n) -> { this.setAttachedAllocId(n.getStringValue()); });
        deserializerMap.put("attached_machine_id", (n) -> { this.setAttachedMachineId(n.getStringValue()); });
        deserializerMap.put("auto_backup_enabled", (n) -> { this.setAutoBackupEnabled(n.getBooleanValue()); });
        deserializerMap.put("blocks", (n) -> { this.setBlocks(n.getIntegerValue()); });
        deserializerMap.put("blocks_avail", (n) -> { this.setBlocksAvail(n.getIntegerValue()); });
        deserializerMap.put("blocks_free", (n) -> { this.setBlocksFree(n.getIntegerValue()); });
        deserializerMap.put("block_size", (n) -> { this.setBlockSize(n.getIntegerValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("encrypted", (n) -> { this.setEncrypted(n.getBooleanValue()); });
        deserializerMap.put("fstype", (n) -> { this.setFstype(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("size_gb", (n) -> { this.setSizeGb(n.getIntegerValue()); });
        deserializerMap.put("snapshot_retention", (n) -> { this.setSnapshotRetention(n.getIntegerValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("zone", (n) -> { this.setZone(n.getStringValue()); });
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
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
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
     * Gets the size_gb property value. The size_gb property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSizeGb() {
        return this.sizeGb;
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
     * Gets the state property value. The state property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the zone property value. The zone property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getZone() {
        return this.zone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("attached_alloc_id", this.getAttachedAllocId());
        writer.writeStringValue("attached_machine_id", this.getAttachedMachineId());
        writer.writeBooleanValue("auto_backup_enabled", this.getAutoBackupEnabled());
        writer.writeIntegerValue("blocks", this.getBlocks());
        writer.writeIntegerValue("blocks_avail", this.getBlocksAvail());
        writer.writeIntegerValue("blocks_free", this.getBlocksFree());
        writer.writeIntegerValue("block_size", this.getBlockSize());
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeBooleanValue("encrypted", this.getEncrypted());
        writer.writeStringValue("fstype", this.getFstype());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("region", this.getRegion());
        writer.writeIntegerValue("size_gb", this.getSizeGb());
        writer.writeIntegerValue("snapshot_retention", this.getSnapshotRetention());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("zone", this.getZone());
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
     * Sets the attached_alloc_id property value. The attached_alloc_id property
     * @param value Value to set for the attached_alloc_id property.
     */
    public void setAttachedAllocId(@jakarta.annotation.Nullable final String value) {
        this.attachedAllocId = value;
    }
    /**
     * Sets the attached_machine_id property value. The attached_machine_id property
     * @param value Value to set for the attached_machine_id property.
     */
    public void setAttachedMachineId(@jakarta.annotation.Nullable final String value) {
        this.attachedMachineId = value;
    }
    /**
     * Sets the auto_backup_enabled property value. The auto_backup_enabled property
     * @param value Value to set for the auto_backup_enabled property.
     */
    public void setAutoBackupEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.autoBackupEnabled = value;
    }
    /**
     * Sets the blocks property value. The blocks property
     * @param value Value to set for the blocks property.
     */
    public void setBlocks(@jakarta.annotation.Nullable final Integer value) {
        this.blocks = value;
    }
    /**
     * Sets the blocks_avail property value. The blocks_avail property
     * @param value Value to set for the blocks_avail property.
     */
    public void setBlocksAvail(@jakarta.annotation.Nullable final Integer value) {
        this.blocksAvail = value;
    }
    /**
     * Sets the blocks_free property value. The blocks_free property
     * @param value Value to set for the blocks_free property.
     */
    public void setBlocksFree(@jakarta.annotation.Nullable final Integer value) {
        this.blocksFree = value;
    }
    /**
     * Sets the block_size property value. The block_size property
     * @param value Value to set for the block_size property.
     */
    public void setBlockSize(@jakarta.annotation.Nullable final Integer value) {
        this.blockSize = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
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
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
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
     * Sets the size_gb property value. The size_gb property
     * @param value Value to set for the size_gb property.
     */
    public void setSizeGb(@jakarta.annotation.Nullable final Integer value) {
        this.sizeGb = value;
    }
    /**
     * Sets the snapshot_retention property value. The snapshot_retention property
     * @param value Value to set for the snapshot_retention property.
     */
    public void setSnapshotRetention(@jakarta.annotation.Nullable final Integer value) {
        this.snapshotRetention = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the zone property value. The zone property
     * @param value Value to set for the zone property.
     */
    public void setZone(@jakarta.annotation.Nullable final String value) {
        this.zone = value;
    }
}
