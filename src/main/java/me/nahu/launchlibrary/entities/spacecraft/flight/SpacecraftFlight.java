package me.nahu.launchlibrary.entities.spacecraft.flight;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.spacecraft.Spacecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

public class SpacecraftFlight extends Entity {
    private @Nullable String destination;
    private @Nullable Date mission_end;

    private Spacecraft spacecraft;

    // TODO: add launch

    /**
     * Get the destination this {@link SpacecraftFlight} is assigned to.
     * @return {@link String} destination.
     */
    public @Nullable String getDestination() {
        return destination;
    }

    /**
     * Get the date for the mission end.
     * @return {@link Date} date.
     */
    public @Nullable Date getMissionEndDate() {
        return mission_end;
    }

    /**
     * Get the spacecraft assigned to this {@link SpacecraftFlight}.
     * @return {@link Spacecraft} spacecraft.
     */
    public @NotNull Spacecraft getSpacecraft() {
        return spacecraft;
    }
}
