package me.nahu.launchlibrary.entities.pad;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.label.Sourceable;
import org.jetbrains.annotations.Nullable;

import java.net.URL;

/**
 * Pad base which may be extended or used standalone.
 * @since 2.0.0
 */
public class BasicPad extends Entity implements Sourceable {
    private @Nullable Integer agency_id;

    private @Nullable URL info_url;
    private @Nullable URL wiki_url;

    private @Nullable URL map_url;

    private @Nullable String latitude;
    private @Nullable String longitude;

    private @Nullable URL map_image;

    private int total_launch_count;

    /**
     * Get the ID for the agency that manages this {@link BasicPad}.
     * Beware this may be null if it's not managed by any specific agency.
     * @return {@link Integer} id.
     */
    public @Nullable Integer getAgencyId() {
        return agency_id;
    }

    /**
     * Get the latitude for this {@link BasicPad}.
     * @return {@link String} latitude.
     */
    public @Nullable String getLatitude() {
        return latitude;
    }

    /**
     * Get the longitude for this {@link BasicPad}.
     * @return {@link String} longitude.
     */
    public @Nullable String getLongitude() {
        return longitude;
    }

    /**
     * Get the total amount of launches done in this {@link BasicPad}.
     * @return {@link Integer} amount.
     */
    public int getTotalLaunchCount() {
        return total_launch_count;
    }

    /**
     * Get an URL for a map for this {@link BasicPad}.
     * @return {@link URL} map.
     */
    public @Nullable URL getMapUrl() {
        return map_url;
    }

    /**
     * Get an URL for a satellite image of this {@link BasicPad}.
     * @return {@link URL} image.
     */
    public @Nullable URL getMapImage() {
        return map_image;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getWikiUrl() {
        return wiki_url;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getInfoUrl() {
        return info_url;
    }
}
