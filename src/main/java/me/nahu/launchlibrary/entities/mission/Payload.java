package me.nahu.launchlibrary.entities.mission;

import me.nahu.launchlibrary.entities.Entity;

/**
 * Payloads are special objects only returned in missions as an array of objects.
 * There is no endpoint currently.
 */
public class Payload extends Entity {
    private String description;

    private String countryCodes;

    private int type;
    private String dimensions;
    private String weight;
    private int total;

    private String missionId;

    /**
     * Description of the {@link Payload}.
     * @return {@link String} description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get country codes collaborating on the {@link Payload}.
     * @return {@link String} country codes delimited with commas.
     */
    private String getCountryCodes() {
        return countryCodes;
    }

    /**
     * {@link Payload} type.
     * @return {@link Payload} type.
     */
    public int getType() {
        return type;
    }

    /**
     * Get dimensions of the {@link Payload}.
     * @return {@link String} dimensions.
     */
    public String getDimensions() {
        return dimensions;
    }

    /**
     * Get weight of the {@link Payload}.
     * @return {@link String} weight.
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Unknown or undocumented type.
     * @return {@link} total.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Get parent {@link Mission} id.
     * @return {@link String} mission id.
     */
    public String getMissionId() {
        return missionId;
    }
}
