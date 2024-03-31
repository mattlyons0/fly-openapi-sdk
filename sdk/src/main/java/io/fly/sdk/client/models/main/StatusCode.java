package io.fly.sdk.client.models.main;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StatusCode implements ValuedEnum {
    Unknown("unknown"),
    Insufficient_capacity("insufficient_capacity");
    public final String value;
    StatusCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StatusCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "insufficient_capacity": return Insufficient_capacity;
            default: return null;
        }
    }
}
