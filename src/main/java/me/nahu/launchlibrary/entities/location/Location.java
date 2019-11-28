package me.nahu.launchlibrary.entities.location;

import me.nahu.launchlibrary.entities.SourceableEntity;

import java.util.List;

/**
 * Location entity class.
 * {@code https://launchlibrary.net/docs/1.4/api.html#location} for more information.
 */
public class Location extends SourceableEntity {
    private String countrycode;

    private List<Pad> pads;

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
    public List<Pad> getPads() {
        return pads;
    }
}
