package me.nahu.launchlibrary.entities;

import org.jetbrains.annotations.NotNull;

import java.net.URL;

/**
 * Extendable abstract class for every entity.
 * @since 1.0.0 - revamped for 2.0.0
 */
public abstract class Entity {
    private int id;
    private String name;

    private URL url;

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
    public @NotNull String getName() {
        return name;
    }

    /**
     * Get the API URL. Might be useful for something.
     * @return LaunchLibrary URL for this entity.
     */
    public @NotNull URL getUrl() {
        return url;
    }
}
