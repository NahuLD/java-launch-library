package me.nahu.launchlibrary.entities.spacecraft;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.config.spacecraft.SpacecraftConfig;
import me.nahu.launchlibrary.entities.label.Describable;
import me.nahu.launchlibrary.entities.label.Status;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Spacecraft extends Entity implements Describable {
    private Status status;

    private @Nullable String serial_number;
    private String description;

    private SpacecraftConfig spacecraft_config;

    /**
     * Get the status of this {@link Spacecraft}.
     * @return {@link SpacecraftStatus} status.
     */
    public @NotNull SpacecraftStatus getStatus() {
        return SpacecraftStatus.getById(status.getId());
    }

    /**
     * Get the configuration of this {@link Spacecraft}.
     * @return {@link SpacecraftConfig} configuration.
     */
    public @NotNull SpacecraftConfig getSpacecraftConfiguration() {
        return spacecraft_config;
    }

    /**
     * Get the serial number of this {@link Spacecraft}.
     * @return {@link String} serial number.
     */
    public @Nullable String getSerialNumber() {
        return serial_number;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable String getDescription() {
        return description;
    }
}
