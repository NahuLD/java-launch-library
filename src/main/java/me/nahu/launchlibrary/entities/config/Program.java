package me.nahu.launchlibrary.entities.config;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.label.Describable;
import me.nahu.launchlibrary.entities.label.ImageMedia;
import me.nahu.launchlibrary.entities.label.Sourceable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URL;
import java.util.Date;

public class Program extends Entity implements Sourceable, Describable, ImageMedia {
    private @Nullable String description;
    private URL image_url;

    private @Nullable Date start_date;
    private @Nullable Date end_date;

    private @Nullable URL info_url;
    private @Nullable URL wiki_url;

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable String getDescription() {
        return description;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull URL getImageUrl() {
        return image_url;
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

    /**
     * Get the start date of this {@link Program}.
     * @return {@link Date} start date.
     */
    public @Nullable Date getStartDate() {
        return start_date;
    }

    /**
     * Get the end date of this {@link Program}.
     * @return {@link Date} end date.
     */
    public @Nullable Date getEndDate() {
        return end_date;
    }
}
