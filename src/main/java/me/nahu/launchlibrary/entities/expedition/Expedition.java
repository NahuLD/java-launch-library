package me.nahu.launchlibrary.entities.expedition;

import me.nahu.launchlibrary.entities.spacestation.SpaceStationBase;

/**
 * API expedition entity.
 * @since 2.0.0
 */
public class Expedition extends ExpeditionBase {
    private SpaceStationBase spacestation;

    /**
     * Get the space station this {@link ExpeditionBase} is launching to.
     * @return {@link SpaceStationBase} space station.
     */
    public SpaceStationBase getSpaceStation() {
        return spacestation;
    }
}
