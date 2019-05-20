package me.nahu.launchlibrary.entities.launch;

import me.nahu.launchlibrary.entities.Entity;

/**
 * Launch Status entity class.
 * {@see https://launchlibrary.net/docs/1.4/api.html#launchstatus} for more information.
 */
public class LaunchStatus extends Entity {
    private String description;

    /**
     * Get the description for this {@link LaunchStatus}.
     * @return {@link String} describing the {@link LaunchStatus}.
     */
    public String getDescription() {
        return description;
    }
}
