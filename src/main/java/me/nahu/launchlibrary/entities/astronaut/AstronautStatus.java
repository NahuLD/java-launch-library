package me.nahu.launchlibrary.entities.astronaut;

import org.jetbrains.annotations.NotNull;

/**
 * Astronaut status.
 * https://lldev.thespacedevs.com/2.1.0/config/astronautstatus/
 * @since 2.0.0
 */
public enum AstronautStatus {
    ACTIVE(1, "Active"),
    RETIRED(2, "Retired"),
    IN_TRAINING(3, "In-Training"),
    LOST_IN_FLIGHT(4, "Lost In Flight"),
    LOST_IN_TRAINING(5, "Lost In Training"),
    DIED_WHILE_IN_ACTIVE_SERVICE(6, "Died While In Active Service"),
    DISMISSED(7, "Dismissed"),
    RESIGNED_DURING_TRAINING(8, "Resigned during Training"),
    DECEASED(11, "Deceased"),
    UNKNOWN(-1, "Unknown")
    ;

    private final int id;
    private final @NotNull String name;

    AstronautStatus(int id, @NotNull String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public @NotNull String asString() {
        return name;
    }

    public static AstronautStatus getById(int id) {
        var type = values()[id - 1];
        return (type == null) ? UNKNOWN : type;
    }
}
