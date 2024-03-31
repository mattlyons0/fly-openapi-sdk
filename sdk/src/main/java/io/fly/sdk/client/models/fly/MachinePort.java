package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachinePort implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The end_port property
     */
    private Integer endPort;
    /**
     * The force_https property
     */
    private Boolean forceHttps;
    /**
     * The handlers property
     */
    private java.util.List<String> handlers;
    /**
     * The http_options property
     */
    private HTTPOptions httpOptions;
    /**
     * The port property
     */
    private Integer port;
    /**
     * The proxy_proto_options property
     */
    private ProxyProtoOptions proxyProtoOptions;
    /**
     * The start_port property
     */
    private Integer startPort;
    /**
     * The tls_options property
     */
    private TLSOptions tlsOptions;
    /**
     * Instantiates a new {@link MachinePort} and sets the default values.
     */
    public MachinePort() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachinePort}
     */
    @jakarta.annotation.Nonnull
    public static MachinePort createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachinePort();
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
     * Gets the end_port property value. The end_port property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEndPort() {
        return this.endPort;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("end_port", (n) -> { this.setEndPort(n.getIntegerValue()); });
        deserializerMap.put("force_https", (n) -> { this.setForceHttps(n.getBooleanValue()); });
        deserializerMap.put("handlers", (n) -> { this.setHandlers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("http_options", (n) -> { this.setHttpOptions(n.getObjectValue(HTTPOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("proxy_proto_options", (n) -> { this.setProxyProtoOptions(n.getObjectValue(ProxyProtoOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("start_port", (n) -> { this.setStartPort(n.getIntegerValue()); });
        deserializerMap.put("tls_options", (n) -> { this.setTlsOptions(n.getObjectValue(TLSOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the force_https property value. The force_https property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getForceHttps() {
        return this.forceHttps;
    }
    /**
     * Gets the handlers property value. The handlers property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getHandlers() {
        return this.handlers;
    }
    /**
     * Gets the http_options property value. The http_options property
     * @return a {@link HTTPOptions}
     */
    @jakarta.annotation.Nullable
    public HTTPOptions getHttpOptions() {
        return this.httpOptions;
    }
    /**
     * Gets the port property value. The port property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the proxy_proto_options property value. The proxy_proto_options property
     * @return a {@link ProxyProtoOptions}
     */
    @jakarta.annotation.Nullable
    public ProxyProtoOptions getProxyProtoOptions() {
        return this.proxyProtoOptions;
    }
    /**
     * Gets the start_port property value. The start_port property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStartPort() {
        return this.startPort;
    }
    /**
     * Gets the tls_options property value. The tls_options property
     * @return a {@link TLSOptions}
     */
    @jakarta.annotation.Nullable
    public TLSOptions getTlsOptions() {
        return this.tlsOptions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("end_port", this.getEndPort());
        writer.writeBooleanValue("force_https", this.getForceHttps());
        writer.writeCollectionOfPrimitiveValues("handlers", this.getHandlers());
        writer.writeObjectValue("http_options", this.getHttpOptions());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeObjectValue("proxy_proto_options", this.getProxyProtoOptions());
        writer.writeIntegerValue("start_port", this.getStartPort());
        writer.writeObjectValue("tls_options", this.getTlsOptions());
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
     * Sets the end_port property value. The end_port property
     * @param value Value to set for the end_port property.
     */
    public void setEndPort(@jakarta.annotation.Nullable final Integer value) {
        this.endPort = value;
    }
    /**
     * Sets the force_https property value. The force_https property
     * @param value Value to set for the force_https property.
     */
    public void setForceHttps(@jakarta.annotation.Nullable final Boolean value) {
        this.forceHttps = value;
    }
    /**
     * Sets the handlers property value. The handlers property
     * @param value Value to set for the handlers property.
     */
    public void setHandlers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.handlers = value;
    }
    /**
     * Sets the http_options property value. The http_options property
     * @param value Value to set for the http_options property.
     */
    public void setHttpOptions(@jakarta.annotation.Nullable final HTTPOptions value) {
        this.httpOptions = value;
    }
    /**
     * Sets the port property value. The port property
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the proxy_proto_options property value. The proxy_proto_options property
     * @param value Value to set for the proxy_proto_options property.
     */
    public void setProxyProtoOptions(@jakarta.annotation.Nullable final ProxyProtoOptions value) {
        this.proxyProtoOptions = value;
    }
    /**
     * Sets the start_port property value. The start_port property
     * @param value Value to set for the start_port property.
     */
    public void setStartPort(@jakarta.annotation.Nullable final Integer value) {
        this.startPort = value;
    }
    /**
     * Sets the tls_options property value. The tls_options property
     * @param value Value to set for the tls_options property.
     */
    public void setTlsOptions(@jakarta.annotation.Nullable final TLSOptions value) {
        this.tlsOptions = value;
    }
}
