package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Accepts a string (new format) or a boolean (old format). For backward compatibility with older clients, the API continues to use booleans for "off" and "stop" in responses.* "off" or false - Do not autostop the Machine.* "stop" or true - Automatically stop the Machine.* "suspend" - Automatically suspend the Machine, falling back to a full stop if this is not possible.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MachineServiceAutostop implements ValuedEnum {
    Off("off"),
    Stop("stop"),
    Suspend("suspend");
    public final String value;
    MachineServiceAutostop(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MachineServiceAutostop forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "off": return Off;
            case "stop": return Stop;
            case "suspend": return Suspend;
            default: return null;
        }
    }
}
