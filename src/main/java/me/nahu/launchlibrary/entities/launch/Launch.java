package me.nahu.launchlibrary.entities.launch;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.agency.MinimalAgency;
import me.nahu.launchlibrary.entities.config.Program;
import me.nahu.launchlibrary.entities.label.ImageMedia;
import me.nahu.launchlibrary.entities.label.Status;
import me.nahu.launchlibrary.entities.mission.Mission;
import me.nahu.launchlibrary.entities.pad.Pad;
import me.nahu.launchlibrary.entities.rocket.Rocket;
import me.nahu.launchlibrary.entities.spacecraft.Spacecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URL;
import java.util.Date;
import java.util.List;


/**
 * API common launch entity.
 * @since 2.0.0
 */
public class Launch extends Entity implements ImageMedia {
    private String slug;

    private Status status;

    private Date net;
    private Date window_end;
    private Date window_start;

    private boolean inhold;
    private boolean tbdtime;
    private boolean tbddate;

    private int probability;

    private @Nullable String holdreason;
    private @Nullable String failreason;
    private @Nullable String hashtag;

    private MinimalAgency launch_service_provider;
    private Rocket rocket;
    private @Nullable Mission mission;
    private Pad pad;

    private boolean webcast_live;

    private @Nullable URL image;
    private @Nullable String infographic;

    private List<Program> program;

    /**
     * Get the slug for this {@link Launch}.
     * It is basically {@link #getName()} but formatted to fit the regular expression {@code "^[-a-zA-Z0-9_]+$"}.
     * @return {@link String} slug.
     */
    public @NotNull String getSlug() {
        return slug;
    }

    /**
     * Get the status of this {@link Launch}.
     * @return {@link LaunchStatus} status.
     */
    public @NotNull LaunchStatus getStatus() {
        return LaunchStatus.getById(status.getId());
    }

    /**
     * Get scheduled date for this {@link Launch}.
     * @return {@link Date} date.
     */
    public @NotNull Date getNetDate() {
        return net;
    }

    /**
     * Get the window end for this {@link Launch}.
     * @return {@link Date} date.
     */
    public @NotNull Date getWindowEndDate() {
        return window_end;
    }

    /**
     * Get the window start for this {@link Launch}.
     * @return {@link Date} date.
     */
    public @NotNull Date getWindowStartDate() {
        return window_start;
    }

    /**
     * Check if this {@link Launch} is in hold.
     * @return {@link Boolean} hold.
     */
    public boolean isInHold() {
        return inhold;
    }

    /**
     * Check if the date is to be determined for this {@link Launch}.
     * @return {@link Boolean} determined.
     */
    public boolean isDateToBeDetermined() {
        return tbddate;
    }

    /**
     * Check if the time is to be determined for this {@link Launch}.
     * @return {@link Boolean} determined.
     */
    public boolean isTimeToBeDetermined() {
        return tbdtime;
    }

    /**
     * Get the probability of this {@link Launch} happening.
     * @return {@link Integer} probability.
     */
    public int getProbability() {
        return probability;
    }

    /**
     * Get the reason for this {@link Launch} being in hold.
     * May be null if the launch is not in hold.
     * @return {@link String} reason.
     */
    public @Nullable String getHoldReason() {
        return holdreason;
    }

    /**
     * Get the reason this {@link Launch} failed.
     * May be null if the launch did not fail.
     * @return {@link String} reason.
     */
    public @Nullable String getFailReason() {
        return failreason;
    }

    /**
     * Get the hashtag assigned to this {@link Launch}.
     * @return {@link String} hashtag.
     */
    public @Nullable String getHashtag() {
        return hashtag;
    }

    /**
     * Get the launch service provider for this {@link Launch}.
     * @return {@link MinimalAgency} agency.
     */
    public @NotNull MinimalAgency getLaunchServiceProvider() {
        return launch_service_provider;
    }

    /**
     * Get the rocket that is used by this {@link Launch}.
     * Not to be confused by its other API counterpart {@link Spacecraft}.
     * @return {@link Rocket} rocket.
     */
    public @NotNull Rocket getRocket() {
        return rocket;
    }

    /**
     * Get the mission assigned to this {@link Launch}.
     * May be null if there's not a specific mission.
     * @return {@link Mission} mission.
     */
    public @Nullable Mission getMission() {
        return mission;
    }

    /**
     * Get the pad assigned to this {@link Launch}.
     * @return {@link Pad} pad.
     */
    public @NotNull Pad getPad() {
        return pad;
    }

    /**
     * Check if this {@link Launch} is webcasted live for a wide audience.
     * @return {@link Boolean} live.
     */
    public boolean isWebcastLive() {
        return webcast_live;
    }

    /**
     * Get the inforgraphic for this {@link Launch}.
     * @return {@link String} infographic.
     */
    public @Nullable String getInfographic() {
        return infographic;
    }

    /**
     * Get the programs assigned to this {@link Launch}.
     * @return {@link List<Program>} programs.
     */
    public @NotNull List<Program> getPrograms() {
        return program;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getImageUrl() {
        return image;
    }
}
