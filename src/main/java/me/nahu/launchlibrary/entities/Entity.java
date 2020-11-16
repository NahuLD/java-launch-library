package me.nahu.launchlibrary.entities;

import org.jetbrains.annotations.NotNull;

/**
 * Extendable abstract class for every entity.
 */
public abstract class Entity {
    private int id;
    private String name;

    private String changed;
    private String url;

    /**
     * Return the id of the entity as stored in the database.
     * @return id of the {@link Entity} object.
     */
    public int getId() {
        return id;
    }

    /**
     * Human readable text describing the entity.
     * @return {@link String} as the entity.
     */
    @NotNull
    public String getName() {
        return name;
    }

    /**
     * Get the API url. Might be useful for something.
     * @return LaunchLibrary URL for this entity.
     */
    @NotNull
    public String getUrl() {
        return url;
    }
}
