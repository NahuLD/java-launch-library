package me.nahu.launchlibrary.entities.config.spacecraft;

import me.nahu.launchlibrary.entities.label.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Detailed spacecraft configuration entity that may only be returned by querying it's id.
 * @since 2.0.0
 */
public class DetailedSpacecraftConfig extends SpacecraftConfig {
    private Type type;

    private String history;
    private String details;

    private @Nullable Double height; // fucking hell
    private @Nullable Double diameter;

    private @Nullable Integer payload_capacity;
    private @Nullable String flight_life;

    /**
     * Fetch the type of this {@link DetailedSpacecraftConfig}.
     * Since there's no enumeration for this type, the generic class will have to do.
     * @return {@link Type} type.
     */
    public @NotNull Type getType() {
        return type;
    }

    /**
     * Get the history for this {@link DetailedSpacecraftConfig}.
     * @return {@link String} history.
     */
    public @NotNull String getHistory() {
        return history;
    }

    /**
     * Get the details for this {@link DetailedSpacecraftConfig}.
     * @return {@link String} details.
     */
    public @NotNull String getDetails() {
        return details;
    }

    /**
     * Get the height for this {@link DetailedSpacecraftConfig}.
     * @return {@link Double} height.
     */
    public @Nullable Double getHeight() {
        return height;
    }

    /**
     * Get the diameter for this {@link DetailedSpacecraftConfig}.
     * @return {@link Double} diameter.
     */
    public @Nullable Double getDiameter() {
        return diameter;
    }

    /**
     * Get the payload capacity for this {@link DetailedSpacecraftConfig}.
     * @return {@link Integer} capacity.
     */
    public int getPayloadCapacity() {
        return (payload_capacity == null) ? 0 : payload_capacity;
    }

    /**
     * Get the flight life for this {@link DetailedSpacecraftConfig}.
     * This does not follow any ISO format, but it does provide a nicely formatted string.
     * @return {@link String} flight life.
     */
    public @Nullable String getFlightLife() {
        return flight_life;
    }
}
