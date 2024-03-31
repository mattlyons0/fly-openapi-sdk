package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DNSConfig implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The dns_forward_rules property
     */
    private java.util.List<DnsForwardRule> dnsForwardRules;
    /**
     * The nameservers property
     */
    private java.util.List<String> nameservers;
    /**
     * The options property
     */
    private java.util.List<DnsOption> options;
    /**
     * The searches property
     */
    private java.util.List<String> searches;
    /**
     * The skip_registration property
     */
    private Boolean skipRegistration;
    /**
     * Instantiates a new {@link DNSConfig} and sets the default values.
     */
    public DNSConfig() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DNSConfig}
     */
    @jakarta.annotation.Nonnull
    public static DNSConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DNSConfig();
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
     * Gets the dns_forward_rules property value. The dns_forward_rules property
     * @return a {@link java.util.List<DnsForwardRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DnsForwardRule> getDnsForwardRules() {
        return this.dnsForwardRules;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("dns_forward_rules", (n) -> { this.setDnsForwardRules(n.getCollectionOfObjectValues(DnsForwardRule::createFromDiscriminatorValue)); });
        deserializerMap.put("nameservers", (n) -> { this.setNameservers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("options", (n) -> { this.setOptions(n.getCollectionOfObjectValues(DnsOption::createFromDiscriminatorValue)); });
        deserializerMap.put("searches", (n) -> { this.setSearches(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("skip_registration", (n) -> { this.setSkipRegistration(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nameservers property value. The nameservers property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNameservers() {
        return this.nameservers;
    }
    /**
     * Gets the options property value. The options property
     * @return a {@link java.util.List<DnsOption>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DnsOption> getOptions() {
        return this.options;
    }
    /**
     * Gets the searches property value. The searches property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSearches() {
        return this.searches;
    }
    /**
     * Gets the skip_registration property value. The skip_registration property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipRegistration() {
        return this.skipRegistration;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("dns_forward_rules", this.getDnsForwardRules());
        writer.writeCollectionOfPrimitiveValues("nameservers", this.getNameservers());
        writer.writeCollectionOfObjectValues("options", this.getOptions());
        writer.writeCollectionOfPrimitiveValues("searches", this.getSearches());
        writer.writeBooleanValue("skip_registration", this.getSkipRegistration());
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
     * Sets the dns_forward_rules property value. The dns_forward_rules property
     * @param value Value to set for the dns_forward_rules property.
     */
    public void setDnsForwardRules(@jakarta.annotation.Nullable final java.util.List<DnsForwardRule> value) {
        this.dnsForwardRules = value;
    }
    /**
     * Sets the nameservers property value. The nameservers property
     * @param value Value to set for the nameservers property.
     */
    public void setNameservers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.nameservers = value;
    }
    /**
     * Sets the options property value. The options property
     * @param value Value to set for the options property.
     */
    public void setOptions(@jakarta.annotation.Nullable final java.util.List<DnsOption> value) {
        this.options = value;
    }
    /**
     * Sets the searches property value. The searches property
     * @param value Value to set for the searches property.
     */
    public void setSearches(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.searches = value;
    }
    /**
     * Sets the skip_registration property value. The skip_registration property
     * @param value Value to set for the skip_registration property.
     */
    public void setSkipRegistration(@jakarta.annotation.Nullable final Boolean value) {
        this.skipRegistration = value;
    }
}
