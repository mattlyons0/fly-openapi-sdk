package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SignalRequestSignal implements ValuedEnum {
    SIGABRT("SIGABRT"),
    SIGALRM("SIGALRM"),
    SIGFPE("SIGFPE"),
    SIGHUP("SIGHUP"),
    SIGILL("SIGILL"),
    SIGINT("SIGINT"),
    SIGKILL("SIGKILL"),
    SIGPIPE("SIGPIPE"),
    SIGQUIT("SIGQUIT"),
    SIGSEGV("SIGSEGV"),
    SIGTERM("SIGTERM"),
    SIGTRAP("SIGTRAP"),
    SIGUSR1("SIGUSR1");
    public final String value;
    SignalRequestSignal(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SignalRequestSignal forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SIGABRT": return SIGABRT;
            case "SIGALRM": return SIGALRM;
            case "SIGFPE": return SIGFPE;
            case "SIGHUP": return SIGHUP;
            case "SIGILL": return SIGILL;
            case "SIGINT": return SIGINT;
            case "SIGKILL": return SIGKILL;
            case "SIGPIPE": return SIGPIPE;
            case "SIGQUIT": return SIGQUIT;
            case "SIGSEGV": return SIGSEGV;
            case "SIGTERM": return SIGTERM;
            case "SIGTRAP": return SIGTRAP;
            case "SIGUSR1": return SIGUSR1;
            default: return null;
        }
    }
}
