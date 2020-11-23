package me.nahu.launchlibrary.entities.launcher;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.config.launcher.LauncherConfigBase;
import me.nahu.launchlibrary.entities.label.ImageMedia;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URL;
import java.util.Date;

public class Launcher extends Entity implements ImageMedia {
    private boolean flight_proven;

    private @Nullable String serial_number;
    private String status;
    private String details;

    private LauncherConfigBase launcher_config;

    private @Nullable URL image_url;

    private int flights;

    private Date last_launch_date;
    private Date first_launch_date;

    /**
     * Check if the {@link Launcher} is flight proven.
     * @return {@link Boolean} proven.
     */
    public boolean isFlightProven() {
        return flight_proven;
    }

    /**
     * Get the serial number of this {@link Launcher}.
     * @return {@link String} serial number.
     */
    public @Nullable String getSerialNumber() {
        return serial_number;
    }

    /**
     * Get the status of this {@link Launcher}.
     * This does not follow any format so we will only provide a string.
     * @return {@link String} status.
     */
    public @NotNull String getStatus() {
        return status;
    }

    /**
     * Get the details of this {@link Launcher}.
     * @return {@link String} details.
     */
    public @NotNull String getDetails() {
        return details;
    }

    /**
     * Get the configurations of this {@link Launcher}.
     * @return {@link LauncherConfigBase} configuration.
     */
    public @NotNull LauncherConfigBase getLauncherConfiguration() {
        return launcher_config;
    }

    /**
     * Get the amount of flights done by this {@link Launcher}.
     * @return {@link Integer} amount.
     */
    public int getAmountOfFlights() {
        return flights;
    }

    /**
     * Get the date for the last launch by this {@link Launcher}.
     * @return {@link Date} date.
     */
    public @NotNull Date getLastLaunchDate() {
        return last_launch_date;
    }

    /**
     * Get the date for the first launch by this {@link Launcher}.
     * @return {@link Date} date.
     */
    public @NotNull Date getFirstLaunchDate() {
        return first_launch_date;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getImageUrl() {
        return null;
    }
}
