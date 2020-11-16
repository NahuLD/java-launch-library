package me.nahu.launchlibrary.entities.agency;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

/**
 * Type of agency.
 * https://ll.thespacedevs.com/2.1.0/config/agencytype/
 */
public enum AgencyType {
    GOVERNMENT(1, "Government"),
    MULTINATIONAL(2, "Multinational"),
    COMMERCIAL(3, "Commercial"),
    EDUCATIONAL(4, "Educational"),
    PRIVATE(5, "Private"),
    UNKNOWN(6, "Unknown");

    private final int id;
    @NotNull
    private final String type;

    AgencyType(int id, @NotNull String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    @NotNull
    public String asString() {
        return type;
    }

    public static AgencyType matchType(@Nullable String type) {
        return Arrays.stream(values())
                .filter(agencyType -> agencyType.type.equals(type))
                .findFirst()
                .orElse(UNKNOWN);
    }
}
