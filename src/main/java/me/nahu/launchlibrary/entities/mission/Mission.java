package me.nahu.launchlibrary.entities.mission;

import me.nahu.launchlibrary.entities.SourceableEntity;
import me.nahu.launchlibrary.entities.agency.Agency;

/**
 * Mission entity class.
 * {@see https://launchlibrary.net/docs/1.4/api.html#mission} for more information.
 */
public class Mission extends SourceableEntity {
    private String description;

    private int type;

    private Agency[] agencies;
    private MissionEvent[] events;
    private Payload[] payloads;

    /**
     * Description of the {@link Mission}.
     * @return {@link String} description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get {@link Mission} type.
     * @return {@link Integer} type.
     */
    public int getType() {
        return type;
    }

    /**
     * Get array of {@link Agency} collaborating on the {@link Mission}.
     * @return {@link Agency[]} agencies.
     */
    public Agency[] getAgencies() {
        return agencies;
    }

    /**
     * Get array of {@link MissionEvent} for this {@link Mission}.
     * @return {@link MissionEvent} events.
     */
    public MissionEvent[] getEvents() {
        return events;
    }

    /**
     * Get array of {@link Payload} for this {@link Mission}.
     * @return {@link Payload[]} payloads.
     */
    public Payload[] getPayloads() {
        return payloads;
    }
}
