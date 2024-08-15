package io.fly.sdk.client.apps.item.machines.item.waitescaped;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GetStateQueryParameterType implements ValuedEnum {
    Started("started"),
    Stopped("stopped"),
    Suspended("suspended"),
    Destroyed("destroyed");
    public final String value;
    GetStateQueryParameterType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GetStateQueryParameterType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "started": return Started;
            case "stopped": return Stopped;
            case "suspended": return Suspended;
            case "destroyed": return Destroyed;
            default: return null;
        }
    }
}
