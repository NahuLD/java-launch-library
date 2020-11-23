package me.nahu.launchlibrary.entities.spacestation;

import me.nahu.launchlibrary.entities.expedition.ExpeditionBase;
import org.jetbrains.annotations.Nullable;

import java.util.Date;
import java.util.List;

/**
 * API space station entity.
 * @since 2.0.0
 */
public class SpaceStation {
    private @Nullable Date deorbited;
    private List<ExpeditionBase> active_expeditions;

    /**
     * Get a list of the active expeditions that are currently ongoing for this {@link SpaceStation}.
     * May be empty if there are none.
     * @return {@link List<ExpeditionBase>} expeditions.
     */
    public List<ExpeditionBase> getActiveExpeditions() {
        return active_expeditions;
    }

    /**
     * Get the de-orbit date for this {@link SpaceStationBase}.
     * May be null if it's still on orbit.
     * @return {@link Date} date.
     */
    public @Nullable Date getDeOrbitedDate() {
        return deorbited;
    }
}
