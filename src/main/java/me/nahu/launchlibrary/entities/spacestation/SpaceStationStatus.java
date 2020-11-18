package me.nahu.launchlibrary.entities.spacestation;

import org.jetbrains.annotations.NotNull;

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
        var type = values()[id];
        return (type == null) ? UNKNOWN : type;
    }
}
