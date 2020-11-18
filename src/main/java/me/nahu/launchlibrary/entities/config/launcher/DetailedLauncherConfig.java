package me.nahu.launchlibrary.entities.config.launcher;

import me.nahu.launchlibrary.entities.agency.DetailedAgency;
import me.nahu.launchlibrary.entities.label.Describable;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class DetailedLauncherConfig extends LauncherConfig implements Describable {
    private DetailedAgency manufacturer;

    private String description;
    private String alias;

    private int min_stage;
    private int max_stage;

    private double length;
    private double diameter;

    private int launch_mass;

    private Date maiden_flight;

    private int leo_capacity;
    private int gto_capacity;
    private int to_thrust;
    private int apogee;
    private int vehicle_range;

    private int total_launch_count;
    private int consecutive_successful_launches;
    private int successful_launches;
    private int failed_launches;
    private int pending_launches;

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull DetailedAgency getManufacturer() {
        return manufacturer;
    }

    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    public @NotNull String getDescription() {
        return description;
    }

    /**
     * Get the alias for this {@link DetailedLauncherConfig}.
     * @return {@link String} alias.
     */
    public @NotNull String getAlias() {
        return alias;
    }

    /**
     * Get the minimum stage amount needed for this {@link DetailedLauncherConfig}.
     * @return {@link Integer} amount.
     */
    public int getMinStage() {
        return min_stage;
    }

    /**
     * Get the maximum stage amount needed for this {@link DetailedLauncherConfig}.
     * @return {@link Integer} amount.
     */
    public int getMaxStage() {
        return max_stage;
    }

    /**
     * Get the length in meters for this {@link DetailedLauncherConfig}.
     * @return {@link Double} length.
     */
    public double getLength() {
        return length;
    }

    /**
     * Get the maximum diameter in meters for this {@link DetailedLauncherConfig}.
     * @return {@link Double} diameter.
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Get the mass at launch in tonnes (metric) for this {@link DetailedLauncherConfig}.
     * @return {@link Integer} mass.
     */
    public int getLaunchMass() {
        return launch_mass;
    }

    /**
     * Get the Maiden flight date for this {@link DetailedLauncherConfig}.
     * @return {@link Date} date.
     */
    public Date getMaidenFlight() {
        return maiden_flight;
    }

    /**
     * Get the LEO capacity in kilograms for this {@link DetailedLauncherConfig}.
     * @return {@link Integer} capacity.
     */
    public int getLEOCapacity() {
        return leo_capacity;
    }

    /**
     * Get the GTO capacity in kilograms for this {@link DetailedLauncherConfig}.
     * @return {@link Integer} capacity.
     */
    public int getGTOCapacity() {
        return gto_capacity;
    }

    /**
     * Get the amount of thrust at liftoff in kiloNewtons for this {@link DetailedLauncherConfig}.
     * @return {@link Integer} thrust.
     */
    public int getThrustAtLiftoff() {
        return to_thrust;
    }

    /**
     * Get the apogee (sub-orbital only) in kilometers for this {@link DetailedLauncherConfig}.
     * @return {@link Integer} apogee.
     */
    public int getApogee() {
        return apogee;
    }

    /**
     * Get the vehicle range (legacy) for this {@link DetailedLauncherConfig}.
     * @return {@link Integer} range.
     */
    public int getVehicleRange() {
        return vehicle_range;
    }

    /**
     * Get the total amount of launches made by this {@link DetailedLauncherConfig}.
     * @return {@link Integer} count.
     */
    public int getTotalLaunchCount() {
        return total_launch_count;
    }

    /**
     * Get the amount of successful launches made by this {@link DetailedLauncherConfig}.
     * @return {@link Integer} count.
     */
    public int getSuccessfulLaunches() {
        return successful_launches;
    }

    /**
     * Get the amount of consecutive successful launches by this {@link DetailedLauncherConfig}.
     * @return {@link Integer} count.
     */
    public int getConsecutiveSuccessfulLaunches() {
        return consecutive_successful_launches;
    }

    /**
     * Get the amount of failed launches by this {@link DetailedLauncherConfig}.
     * @return {@link Integer} count.
     */
    public int getFailedLaunches() {
        return failed_launches;
    }

    /**
     * Get the amount of pending launches by this {@link DetailedLauncherConfig}.
     * @return {@link Integer} count.
     */
    public int getPendingLaunches() {
        return pending_launches;
    }
}
