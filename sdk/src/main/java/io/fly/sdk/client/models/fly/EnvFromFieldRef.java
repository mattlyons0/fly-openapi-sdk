package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * FieldRef selects a field of the Machine: supports id, version, app_name, private_ip, region, image.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnvFromFieldRef implements ValuedEnum {
    Id("id"),
    Version("version"),
    App_name("app_name"),
    Private_ip("private_ip"),
    Region("region"),
    Image("image");
    public final String value;
    EnvFromFieldRef(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnvFromFieldRef forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "id": return Id;
            case "version": return Version;
            case "app_name": return App_name;
            case "private_ip": return Private_ip;
            case "region": return Region;
            case "image": return Image;
            default: return null;
        }
    }
}
