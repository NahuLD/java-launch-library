package me.nahu.launchlibrary.entities.agency;

import me.nahu.launchlibrary.entities.Entity;

/**
 * Agency Type entity class.
 * {@see https://launchlibrary.net/docs/1.4/api.html#agencytype} for more information.
 */
public class AgencyType extends Entity {
    private String description;

    /**
     * Get the description for this {@link AgencyType}.
     * @return {@link String} describing the {@link AgencyType}.
     */
    public String getDescription() {
        return description;
    }
}
