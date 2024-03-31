package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An optional object that defines one or more named checks. The key for each check is the check name.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachineCheck implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The time to wait after a VM starts before checking its health
     */
    private Duration gracePeriod;
    /**
     * The headers property
     */
    private java.util.List<MachineHTTPHeader> headers;
    /**
     * The time between connectivity checks
     */
    private Duration interval;
    /**
     * For http checks, the HTTP method to use to when making the request
     */
    private String method;
    /**
     * For http checks, the path to send the request to
     */
    private String path;
    /**
     * The port to connect to, often the same as internal_port
     */
    private Integer port;
    /**
     * For http checks, whether to use http or https
     */
    private String protocol;
    /**
     * The maximum time a connection can take before being reported as failing its health check
     */
    private Duration timeout;
    /**
     * If the protocol is https, the hostname to use for TLS certificate validation
     */
    private String tlsServerName;
    /**
     * For http checks with https protocol, whether or not to verify the TLS certificate
     */
    private Boolean tlsSkipVerify;
    /**
     * tcp or http
     */
    private String type;
    /**
     * Instantiates a new {@link MachineCheck} and sets the default values.
     */
    public MachineCheck() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachineCheck}
     */
    @jakarta.annotation.Nonnull
    public static MachineCheck createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineCheck();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("grace_period", (n) -> { this.setGracePeriod(n.getObjectValue(Duration::createFromDiscriminatorValue)); });
        deserializerMap.put("headers", (n) -> { this.setHeaders(n.getCollectionOfObjectValues(MachineHTTPHeader::createFromDiscriminatorValue)); });
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getObjectValue(Duration::createFromDiscriminatorValue)); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getStringValue()); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getStringValue()); });
        deserializerMap.put("timeout", (n) -> { this.setTimeout(n.getObjectValue(Duration::createFromDiscriminatorValue)); });
        deserializerMap.put("tls_server_name", (n) -> { this.setTlsServerName(n.getStringValue()); });
        deserializerMap.put("tls_skip_verify", (n) -> { this.setTlsSkipVerify(n.getBooleanValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the grace_period property value. The time to wait after a VM starts before checking its health
     * @return a {@link Duration}
     */
    @jakarta.annotation.Nullable
    public Duration getGracePeriod() {
        return this.gracePeriod;
    }
    /**
     * Gets the headers property value. The headers property
     * @return a {@link java.util.List<MachineHTTPHeader>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MachineHTTPHeader> getHeaders() {
        return this.headers;
    }
    /**
     * Gets the interval property value. The time between connectivity checks
     * @return a {@link Duration}
     */
    @jakarta.annotation.Nullable
    public Duration getInterval() {
        return this.interval;
    }
    /**
     * Gets the method property value. For http checks, the HTTP method to use to when making the request
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMethod() {
        return this.method;
    }
    /**
     * Gets the path property value. For http checks, the path to send the request to
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Gets the port property value. The port to connect to, often the same as internal_port
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the protocol property value. For http checks, whether to use http or https
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * Gets the timeout property value. The maximum time a connection can take before being reported as failing its health check
     * @return a {@link Duration}
     */
    @jakarta.annotation.Nullable
    public Duration getTimeout() {
        return this.timeout;
    }
    /**
     * Gets the tls_server_name property value. If the protocol is https, the hostname to use for TLS certificate validation
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTlsServerName() {
        return this.tlsServerName;
    }
    /**
     * Gets the tls_skip_verify property value. For http checks with https protocol, whether or not to verify the TLS certificate
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTlsSkipVerify() {
        return this.tlsSkipVerify;
    }
    /**
     * Gets the type property value. tcp or http
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("grace_period", this.getGracePeriod());
        writer.writeCollectionOfObjectValues("headers", this.getHeaders());
        writer.writeObjectValue("interval", this.getInterval());
        writer.writeStringValue("method", this.getMethod());
        writer.writeStringValue("path", this.getPath());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeStringValue("protocol", this.getProtocol());
        writer.writeObjectValue("timeout", this.getTimeout());
        writer.writeStringValue("tls_server_name", this.getTlsServerName());
        writer.writeBooleanValue("tls_skip_verify", this.getTlsSkipVerify());
        writer.writeStringValue("type", this.getType());
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
     * Sets the grace_period property value. The time to wait after a VM starts before checking its health
     * @param value Value to set for the grace_period property.
     */
    public void setGracePeriod(@jakarta.annotation.Nullable final Duration value) {
        this.gracePeriod = value;
    }
    /**
     * Sets the headers property value. The headers property
     * @param value Value to set for the headers property.
     */
    public void setHeaders(@jakarta.annotation.Nullable final java.util.List<MachineHTTPHeader> value) {
        this.headers = value;
    }
    /**
     * Sets the interval property value. The time between connectivity checks
     * @param value Value to set for the interval property.
     */
    public void setInterval(@jakarta.annotation.Nullable final Duration value) {
        this.interval = value;
    }
    /**
     * Sets the method property value. For http checks, the HTTP method to use to when making the request
     * @param value Value to set for the method property.
     */
    public void setMethod(@jakarta.annotation.Nullable final String value) {
        this.method = value;
    }
    /**
     * Sets the path property value. For http checks, the path to send the request to
     * @param value Value to set for the path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.path = value;
    }
    /**
     * Sets the port property value. The port to connect to, often the same as internal_port
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the protocol property value. For http checks, whether to use http or https
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final String value) {
        this.protocol = value;
    }
    /**
     * Sets the timeout property value. The maximum time a connection can take before being reported as failing its health check
     * @param value Value to set for the timeout property.
     */
    public void setTimeout(@jakarta.annotation.Nullable final Duration value) {
        this.timeout = value;
    }
    /**
     * Sets the tls_server_name property value. If the protocol is https, the hostname to use for TLS certificate validation
     * @param value Value to set for the tls_server_name property.
     */
    public void setTlsServerName(@jakarta.annotation.Nullable final String value) {
        this.tlsServerName = value;
    }
    /**
     * Sets the tls_skip_verify property value. For http checks with https protocol, whether or not to verify the TLS certificate
     * @param value Value to set for the tls_skip_verify property.
     */
    public void setTlsSkipVerify(@jakarta.annotation.Nullable final Boolean value) {
        this.tlsSkipVerify = value;
    }
    /**
     * Sets the type property value. tcp or http
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
