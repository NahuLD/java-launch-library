package me.nahu.launchlibrary.entities.launch;

import org.jetbrains.annotations.NotNull;

public enum LaunchStatus {
    GO_FOR_LAUNCH(1, "Go for Launch", "Go"),
    TO_BE_DETERMINED(2, "To Be Determined", "TBD"),
    LAUNCH_SUCCESSFUL(3, "Launch Successful", "Success"),
    LAUNCH_FAILURE(4, "Launch Failure", "Failure"),
    ON_HOLD(5, "On Hold", "Hold"),
    LAUNCH_IN_FLIGHT(6, "Launch In Flight", "In Flight"),
    LAUNCH_WAS_PARTIAL_FAILURE(7, "Launch was a Partial Failure", "Partial Failure"),
    TO_BE_CONFIRMED(8, "To Be Confirmed", "TBC"),
    UNKNOWN(-1, "Unknown", "Unknown")
    ;

    private final int id;
    private final String name;
    private final String abbrev;

    LaunchStatus(int id, @NotNull String name, @NotNull String abbrev) {
        this.id = id;
        this.name = name;
        this.abbrev = abbrev;
    }

    public int getId() {
        return id;
    }

    public @NotNull String asString() {
        return name;
    }

    public @NotNull String getAbbreviation() {
        return abbrev;
    }

    public static @NotNull LaunchStatus getById(int id) {
        var type = values()[id - 1];
        return (type == null) ? UNKNOWN : type;
    }
}
