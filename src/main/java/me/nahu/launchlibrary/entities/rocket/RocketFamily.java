package me.nahu.launchlibrary.entities.rocket;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.agency.AgencyQuery;

import java.util.List;

/**
 * Rocket Family entity class.
 * {@code https://launchlibrary.net/docs/1.4/api.html#rocketfamily} for more information.
 */
public class RocketFamily extends Entity {
    private List<AgencyQuery.Agency> agencies;

    /**
     * Get array of {@link AgencyQuery.Agency} collaborating on the {@link RocketFamily}.
     * @return {@link List<AgencyQuery.Agency>} agencies.
     */
    public List<AgencyQuery.Agency> getAgencies() {
        return agencies;
    }
}
