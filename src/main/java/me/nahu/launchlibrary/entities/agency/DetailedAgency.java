package me.nahu.launchlibrary.entities.agency;

import me.nahu.launchlibrary.entities.label.Sourceable;
import org.jetbrains.annotations.Nullable;

import java.net.URL;

/**
 * Detailed Agency which may only be queries by calling up it's id.
 * @since 2.0.0
 */
public class DetailedAgency extends Agency implements Sourceable {
    private @Nullable URL wiki_url;
    private @Nullable URL info_url;

    private int total_launch_count;
    private int successful_launches;
    private int consecutive_successful_launches;
    private int failed_launches;
    private int pending_launches;
    private int successful_landings;
    private int failed_landings;
    private int attempted_landings;
    private int consecutive_successful_landings;

    private @Nullable URL logo_url;
    private @Nullable URL nation_url;

    // TODO: Launchers list
    // TODO: Spacecraft list

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
     * Get the total amount of launches made by this {@link DetailedAgency}.
     * @return {@link Integer} count.
     */
    public int getTotalLaunchCount() {
        return total_launch_count;
    }

    /**
     * Get the amount of successful launches made by this {@link DetailedAgency}.
     * @return {@link Integer} count.
     */
    public int getSuccessfulLaunches() {
        return successful_launches;
    }

    /**
     * Get the amount of consecutive successful launches by this {@link DetailedAgency}.
     * @return {@link Integer} count.
     */
    public int getConsecutiveSuccessfulLaunches() {
        return consecutive_successful_launches;
    }

    /**
     * Get the amount of failed launches by this {@link DetailedAgency}.
     * @return {@link Integer} count.
     */
    public int getFailedLaunches() {
        return failed_launches;
    }

    /**
     * Get the amount of pending launches by this {@link DetailedAgency}.
     * @return {@link Integer} count.
     */
    public int getPendingLaunches() {
        return pending_launches;
    }

    /**
     * Get the amount of successful landings by this {@link DetailedAgency}.
     * @return {@link Integer} count.
     */
    public int getSuccessfulLandings() {
        return successful_landings;
    }

    /**
     * Get the amount of failed landings by this {@link DetailedAgency}.
     * @return {@link Integer} count.
     */
    public int getFailedLandings() {
        return failed_landings;
    }

    /**
     * Get the amount of attempted landings by this {@link DetailedAgency}.
     * @return {@link Integer} count.
     */
    public int getAttemptedLandings() {
        return attempted_landings;
    }

    /**
     * Get the amount of consecutive successful landings by this {@link DetailedAgency}.
     * @return {@link Integer} count.
     */
    public int getConsecutiveSuccessfulLandings() {
        return consecutive_successful_landings;
    }

    /**
     * Get the logo of this {@link DetailedAgency}.
     * Beware that not all agencies have one assigned to them.
     * @return {@link URL} logo.
     */
    public @Nullable URL getLogoUrl() {
        return logo_url;
    }

    /**
     * Get the "nation" logo of this {@link DetailedAgency}.
     * Beware that not all agencies have one assigned to them.
     * @return {@link URL} logo.
     */
    public @Nullable URL getNationUrl() {
        return nation_url;
    }
}
