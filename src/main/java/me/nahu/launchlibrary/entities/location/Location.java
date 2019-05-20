package me.nahu.launchlibrary.entities.location;

import me.nahu.launchlibrary.entities.SourceableEntity;

/**
 * Location entity class.
 * {@see https://launchlibrary.net/docs/1.4/api.html#location} for more information.
 */
public class Location extends SourceableEntity {
    private String countrycode;

    private Pad[] pads;

    /**
     * Abbreviation of the {@link Location}'s country.
     * @return {@link String} abbreviation.
     */
    public String getCountryCode() {
        return countrycode;
    }

    /**
     * Get the array of {@link Pad} for this {@link Location}.
     * @return {@link Pad} pads.
     */
    public Pad[] getPads() {
        return pads;
    }
}
