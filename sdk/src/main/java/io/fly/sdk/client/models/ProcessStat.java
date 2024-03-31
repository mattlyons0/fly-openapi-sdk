package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProcessStat implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The command property
     */
    private String command;
    /**
     * The cpu property
     */
    private Integer cpu;
    /**
     * The directory property
     */
    private String directory;
    /**
     * The listen_sockets property
     */
    private java.util.List<ListenSocket> listenSockets;
    /**
     * The pid property
     */
    private Integer pid;
    /**
     * The rss property
     */
    private Integer rss;
    /**
     * The rtime property
     */
    private Integer rtime;
    /**
     * The stime property
     */
    private Integer stime;
    /**
     * Instantiates a new {@link ProcessStat} and sets the default values.
     */
    public ProcessStat() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProcessStat}
     */
    @jakarta.annotation.Nonnull
    public static ProcessStat createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProcessStat();
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
     * Gets the command property value. The command property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommand() {
        return this.command;
    }
    /**
     * Gets the cpu property value. The cpu property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCpu() {
        return this.cpu;
    }
    /**
     * Gets the directory property value. The directory property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirectory() {
        return this.directory;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("command", (n) -> { this.setCommand(n.getStringValue()); });
        deserializerMap.put("cpu", (n) -> { this.setCpu(n.getIntegerValue()); });
        deserializerMap.put("directory", (n) -> { this.setDirectory(n.getStringValue()); });
        deserializerMap.put("listen_sockets", (n) -> { this.setListenSockets(n.getCollectionOfObjectValues(ListenSocket::createFromDiscriminatorValue)); });
        deserializerMap.put("pid", (n) -> { this.setPid(n.getIntegerValue()); });
        deserializerMap.put("rss", (n) -> { this.setRss(n.getIntegerValue()); });
        deserializerMap.put("rtime", (n) -> { this.setRtime(n.getIntegerValue()); });
        deserializerMap.put("stime", (n) -> { this.setStime(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listen_sockets property value. The listen_sockets property
     * @return a {@link java.util.List<ListenSocket>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ListenSocket> getListenSockets() {
        return this.listenSockets;
    }
    /**
     * Gets the pid property value. The pid property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPid() {
        return this.pid;
    }
    /**
     * Gets the rss property value. The rss property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRss() {
        return this.rss;
    }
    /**
     * Gets the rtime property value. The rtime property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRtime() {
        return this.rtime;
    }
    /**
     * Gets the stime property value. The stime property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStime() {
        return this.stime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("command", this.getCommand());
        writer.writeIntegerValue("cpu", this.getCpu());
        writer.writeStringValue("directory", this.getDirectory());
        writer.writeCollectionOfObjectValues("listen_sockets", this.getListenSockets());
        writer.writeIntegerValue("pid", this.getPid());
        writer.writeIntegerValue("rss", this.getRss());
        writer.writeIntegerValue("rtime", this.getRtime());
        writer.writeIntegerValue("stime", this.getStime());
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
     * Sets the command property value. The command property
     * @param value Value to set for the command property.
     */
    public void setCommand(@jakarta.annotation.Nullable final String value) {
        this.command = value;
    }
    /**
     * Sets the cpu property value. The cpu property
     * @param value Value to set for the cpu property.
     */
    public void setCpu(@jakarta.annotation.Nullable final Integer value) {
        this.cpu = value;
    }
    /**
     * Sets the directory property value. The directory property
     * @param value Value to set for the directory property.
     */
    public void setDirectory(@jakarta.annotation.Nullable final String value) {
        this.directory = value;
    }
    /**
     * Sets the listen_sockets property value. The listen_sockets property
     * @param value Value to set for the listen_sockets property.
     */
    public void setListenSockets(@jakarta.annotation.Nullable final java.util.List<ListenSocket> value) {
        this.listenSockets = value;
    }
    /**
     * Sets the pid property value. The pid property
     * @param value Value to set for the pid property.
     */
    public void setPid(@jakarta.annotation.Nullable final Integer value) {
        this.pid = value;
    }
    /**
     * Sets the rss property value. The rss property
     * @param value Value to set for the rss property.
     */
    public void setRss(@jakarta.annotation.Nullable final Integer value) {
        this.rss = value;
    }
    /**
     * Sets the rtime property value. The rtime property
     * @param value Value to set for the rtime property.
     */
    public void setRtime(@jakarta.annotation.Nullable final Integer value) {
        this.rtime = value;
    }
    /**
     * Sets the stime property value. The stime property
     * @param value Value to set for the stime property.
     */
    public void setStime(@jakarta.annotation.Nullable final Integer value) {
        this.stime = value;
    }
}
