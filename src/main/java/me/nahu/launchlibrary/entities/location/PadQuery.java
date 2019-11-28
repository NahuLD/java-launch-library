package me.nahu.launchlibrary.entities.location;

import me.nahu.launchlibrary.entities.Query;
import me.nahu.launchlibrary.entities.SourceableEntity;
import me.nahu.launchlibrary.entities.agency.AgencyQuery;
import me.nahu.launchlibrary.util.Utils;

import java.util.List;

/**
 * Pad entity class.
 * {@code https://launchlibrary.net/docs/1.4/api.html#pad} for more information.
 */
public class PadQuery extends Query {
    private List<Pad> pads;
    
    /**
     * API forces us to list all queries.
     * @return {@link List} of type {@link PadQuery.Pad}
     */
    public List<Pad> getPads() {
        return pads;
    }

    public static class Pad extends SourceableEntity {
        private int padType;

        private String latitude;
        private String longitude;

        private String mapURL;

        private int retired;

        private int locationid;

        private List<AgencyQuery.Agency> agencies;

        /**
         * Get the {@link PadQuery.Pad} type.
         * @return {@link Type} of the {@link PadQuery.Pad}.
         */
        public Type getPadType() {
            return padType == 0 ? Type.LAUNCH : Type.LANDING;
        }

        /**
         * Get the {@link PadQuery.Pad} longitude.
         * @return {@link String} {@link PadQuery.Pad}'s longitude coordinates.
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Get the {@link PadQuery.Pad} latitude.
         * @return {@link String} {@link PadQuery.Pad}'s latitude coordinates.
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Check if the pad is retired, and is no longer fit for use.
         * @return {@link Boolean} is the {@link PadQuery.Pad} retired.
         */
        public boolean isRetired() {
            return Utils.getBoolean(retired);
        }

        /**
         * Get the {@link PadQuery.Pad} locations id to query the {@link LocationQuery.Location} object.
         * @return {@link Integer} location id.
         */
        public int getLocationId() {
            return locationid;
        }

        /**
         * Array of agencies collaborating on the {@link PadQuery.Pad}.
         * @return {@link List<AgencyQuery.Agency>} collaborating agencies.
         */
        public List<AgencyQuery.Agency> getAgencies() {
            return agencies;
        }

        /**
         * Pad type.
         */
        enum Type {
            LAUNCH,
            LANDING
        }
    }
}
