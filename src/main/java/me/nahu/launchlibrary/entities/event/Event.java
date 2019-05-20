package me.nahu.launchlibrary.entities.event;

import me.nahu.launchlibrary.entities.Entity;

/**
 * Common low denominator class recurring in almost all entities.
 */
public class Event<T> extends Entity {
    private String description;

    private int relativeTime;
    private int type;
    private int duration;

    private int parentid;

    /**
     * Description of the {@link Event}.
     * @return {@link String} description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Relative time in seconds to/from T-0.
     * @return {@link Integer} relative time from activation.
     */
    public int getRelativeTime() {
        return relativeTime;
    }

    /**
     * Get {@link Event} type.
     * @return {@link Integer} event type.
     */
    public int getType() {
        return type;
    }

    /**
     * Get the duration of the {@link Event} if specified.
     * @return {@link Integer} duration in time.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Get the parent if of the {@link Event}.
     * @return {@link Integer} id.
     */
    public int getParentId() {
        return parentid;
    }
}
