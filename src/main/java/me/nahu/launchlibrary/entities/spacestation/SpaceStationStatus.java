package me.nahu.launchlibrary.entities.spacestation;

import org.jetbrains.annotations.NotNull;

/**
 * Space station status enumeration.
 * https://ll.thespacedevs.com/2.1.0/config/spacestationstatus/
 * @since 2.0.0
 */
public enum SpaceStationStatus {
    ACTIVE(1, "Active"),
    DE_ORBITED(2, "De-Orbited"),
    ABANDONED(3, "Abandoned"),
    UNKNOWN(-1, "Uknown")
    ;

    private final int id;
    private final String status;

    SpaceStationStatus(int id, @NotNull String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public @NotNull String asString() {
        return status;
    }

    public static SpaceStationStatus getById(int id) {
        var type = values()[id - 1];
        return (type == null) ? UNKNOWN : type;
    }
}
