package me.nahu.launchlibrary.entities.rocket;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.agency.Agency;

/**
 * Rocket Family entity class.
 * {@see https://launchlibrary.net/docs/1.4/api.html#rocketfamily} for more information.
 */
public class RocketFamily extends Entity {
    private Agency[] agencies;

    /**
     * Get array of {@link Agency} collaborating on the {@link RocketFamily}.
     * @return {@link Agency[]} agencies.
     */
    public Agency[] getAgencies() {
        return agencies;
    }
}
