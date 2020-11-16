package me.nahu.launchlibrary.entities.rocket;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.agency.Agency;

import java.util.List;

/**
 * Rocket Family entity class.
 * {@code https://launchlibrary.net/docs/1.4/api.html#rocketfamily} for more information.
 */
public class RocketFamily extends Entity {
    private List<Agency> agencies;

    /**
     * Get array of {@link Agency} collaborating on the {@link RocketFamily}.
     * @return {@link List< Agency >} agencies.
     */
    public List<Agency> getAgencies() {
        return agencies;
    }
}
