package me.nahu.launchlibrary.entities.spacecraft;

import org.jetbrains.annotations.NotNull;

public enum SpacecraftStatus {
    ACTIVE(1, "Active"),
    RETIRED(2, "Retired"),
    DESTROYED(3, "Destroyed"),
    SINGLE_USE(4, "Single Use"),
    UNKNOWN(-1, "Unknown")
    ;

    private final int id;
    private final String status;

    SpacecraftStatus(int id, @NotNull String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public @NotNull String asString() {
        return status;
    }

    public static SpacecraftStatus getById(int id) {
        var type = values()[id];
        return (type == null) ? UNKNOWN : type;
    }
}
