package me.nahu.launchlibrary.entities.pad;

import me.nahu.launchlibrary.entities.location.Location;
import org.jetbrains.annotations.NotNull;

public class Pad extends me.nahu.launchlibrary.entities.pad.PadBase {
    private Location location;

    /**
     * Get the location for this {@link Pad}.
     * @return {@link Location} location.
     */
    public @NotNull Location getLocation() {
        return location;
    }
}
