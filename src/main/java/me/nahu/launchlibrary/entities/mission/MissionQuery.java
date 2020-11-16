package me.nahu.launchlibrary.entities.mission;

import me.nahu.launchlibrary.entities.Query;
import me.nahu.launchlibrary.entities.SourceableEntity;
import me.nahu.launchlibrary.entities.agency.Agency;
import me.nahu.launchlibrary.entities.event.Event;

import java.util.List;

/**
 * Mission entity class.
 * {@code https://launchlibrary.net/docs/1.4/api.html#mission} for more information.
 */
public class MissionQuery extends Query {
    private List<Mission> missions;

    /**
     * API forces us to list all queries.
     * @return {@link List} of type {@link Mission}
     */
    public List<Mission> getMissions() {
        return missions;
    }

    public static class Mission extends SourceableEntity {
        private String description;

        private int type;

        private List<Agency> agencies;
        private List<Event> events;
        private List<Payload> payloads;

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
         * @return {@link List<Agency>} agencies.
         */
        public List<Agency> getAgencies() {
            return agencies;
        }

        /**
         * Get array of {@link Event} for this {@link Mission}.
         * @return {@link Event} events.
         */
        public List<Event> getEvents() {
            return events;
        }

        /**
         * Get array of {@link Payload} for this {@link Mission}.
         * @return {@link Payload[]} payloads.
         */
        public List<Payload> getPayloads() {
            return payloads;
        }
    }
}
