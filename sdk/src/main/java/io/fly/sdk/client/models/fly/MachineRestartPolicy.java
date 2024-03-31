package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * * no - Never try to restart a Machine automatically when its main process exits, whether thats on purpose or on a crash.* always - Always restart a Machine automatically and never let it enter a stopped state, even when the main process exits cleanly.* on-failure - Try up to MaxRetries times to automatically restart the Machine if it exits with a non-zero exit code. Default when no explicit policy is set, and for Machines with schedules.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MachineRestartPolicy implements ValuedEnum {
    No("no"),
    Always("always"),
    OnFailure("on-failure");
    public final String value;
    MachineRestartPolicy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MachineRestartPolicy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "no": return No;
            case "always": return Always;
            case "on-failure": return OnFailure;
            default: return null;
        }
    }
}
