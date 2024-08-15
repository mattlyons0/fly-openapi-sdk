package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MachineHostStatus implements ValuedEnum {
    Ok("ok"),
    Unknown("unknown"),
    Unreachable("unreachable");
    public final String value;
    MachineHostStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MachineHostStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ok": return Ok;
            case "unknown": return Unknown;
            case "unreachable": return Unreachable;
            default: return null;
        }
    }
}
