package me.nahu.launchlibrary.entities.agency;

import me.nahu.launchlibrary.entities.Query;

import java.util.List;

/**
 * Agency entity class.
 * {@code https://launchlibrary.net/docs/1.4/api.html#agency} for more information.
 */
public class AgencyQuery extends Query {
    private List<Agency> agencies;

    /**
     * API forces us to list all queries.
     * @return {@link List} of type {@link Agency}
     */
    public List<Agency> getAgencies() {
        return agencies;
    }
}
