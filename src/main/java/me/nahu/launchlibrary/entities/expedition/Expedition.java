package me.nahu.launchlibrary.entities.expedition;

import me.nahu.launchlibrary.entities.spacestation.BasicSpaceStation;

/**
 * API expedition entity.
 * @since 2.0.0
 */
public class Expedition extends ExpeditionBase {
    private BasicSpaceStation spacestation;

    /**
     * Get the space station this {@link ExpeditionBase} is launching to.
     * @return {@link BasicSpaceStation} space station.
     */
    public BasicSpaceStation getSpaceStation() {
        return spacestation;
    }
}
