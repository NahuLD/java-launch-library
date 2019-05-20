package me.nahu.launchlibrary.entities.location;

import me.nahu.launchlibrary.entities.SourceableEntity;

/**
 * Location entity class.
 * {@see https://launchlibrary.net/docs/1.4/api.html#location} for more information.
 */
public class Location extends SourceableEntity {
    private String countrycode;

    /**
     * Abbreviation of the {@link Location}'s country.
     * @return {@link String} abbreviation.
     */
    public String getCountryCode() {
        return countrycode;
    }
}
