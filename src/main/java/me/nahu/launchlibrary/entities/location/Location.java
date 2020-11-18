package me.nahu.launchlibrary.entities.location;

import com.neovisionaries.i18n.CountryCode;
import me.nahu.launchlibrary.entities.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URL;

public class Location extends Entity {
    private CountryCode country_code;

    private @Nullable URL map_image;

    private int total_launch_count;
    private int total_landing_count;

    /**
     * Get the country code assigned for the location this {@link Location} is in.
     * @return {@link CountryCode} country.
     */
    public @NotNull CountryCode getCountryCode() {
        return country_code;
    }

    /**
     * Get an URL for a satellite image of this {@link Location}.
     * @return {@link URL} image.
     */
    public @Nullable URL getMapImage() {
        return map_image;
    }

    /**
     * Get the total amount of launches done in this {@link Location}.
     * @return {@link Integer} count.
     */
    public int getTotalLaunchCount() {
        return total_launch_count;
    }

    /**
     * Get the total amount of landings done in this {@link Location}.
     * @return {@link Integer} count.
     */
    public int getTotalLandingCount() {
        return total_landing_count;
    }
}
