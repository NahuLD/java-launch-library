package me.nahu.launchlibrary.entities.agency;

import me.nahu.launchlibrary.entities.SourceableEntity;
import org.jetbrains.annotations.Nullable;

import java.net.MalformedURLException;
import java.net.URL;

public class DetailedAgency extends Agency implements SourceableEntity {
    private @Nullable String wiki_url;
    private @Nullable String info_url;

    private int total_launch_count;
    private int successful_launches;
    private int consecutive_successful_launches;
    private int failed_launches;
    private int pending_launches;
    private int successful_landings;
    private int failed_landings;
    private int attempted_landings;
    private int consecutive_successful_landings;

    private @Nullable String logo_url;
    private @Nullable String nation_url;

    // TODO: Launchers list
    // TODO: Spacecraft list

    /**
     * @inheritDoc
     */
    @Override
    public @Nullable String getWikiUrl() {
        return wiki_url;
    }

    /**
     * @inheritDoc
     */
    @Override
    public @Nullable String getInfoUrl() {
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
     * @throws MalformedURLException If the URL passed is invalid.
     */
    public @Nullable URL getLogoUrl() throws MalformedURLException {
        if (logo_url == null) {
            return null;
        }
        return new URL(logo_url);
    }

    /**
     * Get the "nation" logo of this {@link DetailedAgency}.
     * Beware that not all agencies have one assigned to them.
     * @return {@link URL} logo.
     * @throws MalformedURLException If the URL passed is invalid.
     */
    public @Nullable URL getNationUrl() throws MalformedURLException {
        if (nation_url == null) {
            return null;
        }
        return new URL(nation_url);
    }
}
