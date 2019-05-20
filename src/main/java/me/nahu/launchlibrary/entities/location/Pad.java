package me.nahu.launchlibrary.entities.location;

import me.nahu.launchlibrary.entities.SourceableEntity;
import me.nahu.launchlibrary.entities.agency.Agency;
import me.nahu.launchlibrary.util.Utils;

/**
 * Pad entity class.
 * {@see https://launchlibrary.net/docs/1.4/api.html#pad} for more information.
 */
public class Pad extends SourceableEntity {
    private int padType;

    private String latitude;
    private String longitude;

    private String mapURL;

    private int retired;

    private int locationid;

    private Agency[] agencies;

    /**
     * Get the {@link Pad} type.
     * @return {@link Type} of the {@link Pad}.
     */
    public Type getPadType() {
        return padType == 0 ? Type.LAUNCH : Type.LANDING;
    }

    /**
     * Get the {@link Pad} longitude.
     * @return {@link String} {@link Pad}'s longitude coordinates.
     */
    public String getLongitude() {
        return longitude;
    }
    
    /**
     * Get the {@link Pad} latitude.
     * @return {@link String} {@link Pad}'s latitude coordinates.
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Check if the pad is retired, and is no longer fit for use.
     * @return {@link Boolean} is the {@link Pad} retired.
     */
    public boolean isRetired() {
        return Utils.getBoolean(retired);
    }

    /**
     * Get the {@link Pad} locations id to query the {@link Location} object.
     * @return {@link Integer} location id.
     */
    public int getLocationId() {
        return locationid;
    }

    /**
     * Array of agencies collaborating on the {@link Pad}.
     * @return {@link Agency[]} collaborating agencies.
     */
    public Agency[] getAgencies() {
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
