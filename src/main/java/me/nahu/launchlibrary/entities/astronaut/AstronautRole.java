package me.nahu.launchlibrary.entities.astronaut;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public enum AstronautRole {
    COMMANDER(1, "Commander"),
    PILOT(2, "Pilot"),
    FLIGHT_ENGINEER(3, "Flight Engineer"),
    COMMAND_PILOT(4, "Command Pilot"),
    COMMAND_MODULE_PILOT(5, "Command Module Pilot"),
    LUNAR_MODULE_PILOT(6, "Lunar Module Pilot"), // ?
    MISSION_SPECIALIST(7, "Mission Specialist"),
    PAYLOAD_SPECIALIST(8, "Payload Specialist"),
    SCIENCE_PILOT(9, "Science Pilot"),
    SPACEFLIGHT_PARTICIPANT(10, "Spaceflight Participant"),
    UNKNOWN(-1, "Unknown"),
    ;

    private final int id;
    private final String role;

    AstronautRole(int id, @NotNull String role) {
        this.id = id;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String asString() {
        return role;
    }

    public static AstronautRole matchRole(@Nullable String role) {
        return Arrays.stream(values())
                .filter(agencyType -> agencyType.role.equals(role))
                .findFirst()
                .orElse(UNKNOWN);
    }
}
