package me.nahu.launchlibrary.entities.config.spacecraft;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.agency.DetailedAgency;
import me.nahu.launchlibrary.entities.label.ImageMedia;
import me.nahu.launchlibrary.entities.label.Sourceable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URL;
import java.util.Date;

/**
 * API spacecraft configuration entity.
 * @since 2.0.0
 */
public class SpacecraftConfig extends Entity implements Sourceable, ImageMedia {
    private DetailedAgency agency;

    private boolean in_use;
    private String capability;

    private @Nullable Date maiden_flight;

    private boolean human_rated;
    private @Nullable Integer crew_capacity;

    private @Nullable URL image_url;
    private @Nullable URL nation_url;

    private URL wiki_link;
    private URL info_link;

    /**
     * Get the capacity of crew this {@link SpacecraftConfig} can handle.
     * May be zero if {@link #isHumanRated()} is false.
     * @return {@link Integer} capacity.
     */
    public int getCrewCapacity() {
        return (crew_capacity == null) ? 0 : crew_capacity;
    }

    /**
     * Check if this {@link SpacecraftConfig} is rated for human transportation.
     * @return {@link Boolean} rated.
     */
    public boolean isHumanRated() {
        return human_rated;
    }

    /**
     * Get the Maiden flight date for this {@link SpacecraftConfig}.
     * @return {@link Date} date.
     */
    public @Nullable Date getMaidenFlight() {
        return maiden_flight;
    }

    /**
     * Get the capabilities this {@link SpacecraftConfig} has.
     * Ex. Crew and/or cargo capabilities or more.
     * @return {@link String} capabilities.
     */
    public @NotNull String getCapability() {
        return capability;
    }

    /**
     * Check if this {@link SpacecraftConfig} is still in use.
     * @return {@link Boolean} in use.
     */
    public boolean isInUse() {
        return in_use;
    }

    /**
     * Get the {@link DetailedAgency} that manages this {@link SpacecraftConfig}.
     * @return {@link DetailedAgency} agency.
     */
    public @NotNull DetailedAgency getAgency() {
        return agency;
    }

    /**
     * Get an url for an image representing the nation of this {@link SpacecraftConfig}.
     * @return {@link URL} image.
     */
    public @Nullable URL getNationUrl() {
        return nation_url;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getImageUrl() {
        return image_url;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getWikiUrl() {
        return wiki_link;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getInfoUrl() {
        return info_link;
    }
}
