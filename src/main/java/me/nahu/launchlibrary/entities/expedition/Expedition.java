package me.nahu.launchlibrary.entities.expedition;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.spacestation.SpaceStationBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

/**
 * API expedition entity.
 * @since 2.0.0
 */
public class Expedition extends Entity {
    private Date start;
    private @Nullable Date end;

    private SpaceStationBase spacestation;

    /**
     * Get the space station this {@link Expedition} is launching to.
     * @return {@link SpaceStationBase} space station.
     */
    public SpaceStationBase getSpaceStation() {
        return spacestation;
    }

    /**
     * Get the start date for this {@link Expedition}.
     * @return {@link Date} date.
     */
    public @NotNull Date getStartDate() {
        return start;
    }

    /**
     * Get the end date for this {@link Expedition}.
     * May be null if the expedition is still ongoing.
     * @return {@link Date} date.
     */
    public @Nullable Date getEndDate() {
        return end;
    }
}
