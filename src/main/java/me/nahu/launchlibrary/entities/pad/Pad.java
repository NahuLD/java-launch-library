package me.nahu.launchlibrary.entities.pad;

import me.nahu.launchlibrary.entities.location.Location;
import org.jetbrains.annotations.NotNull;

/**
 * API Pad entity.
 * @since 2.0.0
 */
public class Pad extends PadBase {
    private Location location;

    /**
     * Get the location for this {@link Pad}.
     * @return {@link Location} location.
     */
    public @NotNull Location getLocation() {
        return location;
    }
}
