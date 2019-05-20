package me.nahu.launchlibrary.entities.mission;

import me.nahu.launchlibrary.entities.Entity;

/**
 * Mission Type entity class.
 * {@see https://launchlibrary.net/docs/1.4/api.html#missiontype} for more information.
 */
public class MissionType extends Entity {
    private String description;

    /**
     * Description of the {@link MissionType}.
     * @return {@link String} description.
     */
    public String getDescription() {
        return description;
    }
}
