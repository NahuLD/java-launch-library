package me.nahu.launchlibrary.entities.astronaut;

import org.jetbrains.annotations.NotNull;

/**
 * Type of astronaut.
 * https://ll.thespacedevs.com/2.1.0/config/astronauttype/
 * @since 2.0.0
 */
public enum AstronautType {
    UNKNOWN(1, "Unknown"),
    GOVERNMENT(2, "Government"),
    PRIVATE(3, "Private"),
    NON_ASTRONAUT_PASSENGER(4, "Non-Astronaut Passenger"),
    PAYLOAD_SPECIALIST(5, "Payload Specialist"),
    NON_HUMAN(6, "Non-Human"), // ?
    COMMERCIAL(7, "Commercial")
    ;

    private final int id;
    private final @NotNull String name;

    AstronautType(int id, @NotNull String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public @NotNull String asString() {
        return name;
    }

    public static AstronautType getById(int id) {
        var type = values()[id];
        return (type == null) ? UNKNOWN : type;
    }
}
