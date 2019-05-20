package me.nahu.launchlibrary.entities;

import java.time.Instant;
import java.util.Date;

/**
 * Extendable abstract class for almost every entity.
 */
public abstract class Entity {
    private int id;
    private String name;

    private String changed;

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
    public String getName() {
        return name;
    }

    /**
     * Utility date containing last revision/changes made for this entity.
     * @return {@link Date} as last revision.
     */
    public Date getChanged() {
        return Date.from(Instant.parse(changed));
    }
}
