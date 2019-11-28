package me.nahu.launchlibrary.entities.location;

import me.nahu.launchlibrary.entities.Query;
import me.nahu.launchlibrary.entities.SourceableEntity;

import java.util.List;

/**
 * Location entity class.
 * {@code https://launchlibrary.net/docs/1.4/api.html#location} for more information.
 */
public class LocationQuery extends Query {
    private List<Location> locations;

    public List<Location> getLocations() {
        return locations;
    }

    public static class Location extends SourceableEntity {
        private String countrycode;
        private List<PadQuery.Pad> pads;

        /**
         * Abbreviation of the {@link Location}'s country.
         * @return {@link String} abbreviation.
         */
        public String getCountryCode() {
            return countrycode;
        }

        /**
         * Get the array of {@link PadQuery.Pad} for this {@link Location}.
         * @return {@link PadQuery.Pad} pads.
         */
        public List<PadQuery.Pad> getPads() {
            return pads;
        }
    }
}
