package me.nahu.launchlibrary.entities.expedition;

import me.nahu.launchlibrary.entities.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

/**
 * Expeditions base for entities to extend and or utilize.
 * @since 2.0.0
 */
public class ExpeditionBase extends Entity {
    private Date start;
    private @Nullable Date end;

    /**
     * Get the start date for this {@link ExpeditionBase}.
     * @return {@link Date} date.
     */
    public @NotNull Date getStartDate() {
        return start;
    }

    /**
     * Get the end date for this {@link ExpeditionBase}.
     * May be null if the expedition is still ongoing.
     * @return {@link Date} date.
     */
    public @Nullable Date getEndDate() {
        return end;
    }
}
