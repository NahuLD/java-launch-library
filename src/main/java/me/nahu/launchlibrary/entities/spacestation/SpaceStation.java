package me.nahu.launchlibrary.entities.spacestation;

import org.jetbrains.annotations.Nullable;

import java.util.Date;

/**
 * API space station entity.
 * @since 2.0.0
 */
public class SpaceStation {
    private @Nullable Date deorbited;
    // TODO: Active expeditions list

    /**
     * Get the de-orbit date for this {@link SpaceStationBase}.
     * May be null if it's still on orbit.
     * @return {@link Date} date.
     */
    public @Nullable Date getDeOrbitedDate() {
        return deorbited;
    }
}
