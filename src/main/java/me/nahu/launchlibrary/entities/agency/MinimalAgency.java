package me.nahu.launchlibrary.entities.agency;

import me.nahu.launchlibrary.entities.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Minimal agency entity that is used for some entities.
 * @since 2.0.0
 */
public class MinimalAgency extends Entity {
    private @Nullable String type;
    private AgencyType agencyType;

    /**
     * Get the type of {@link MinimalAgency} this one is.
     * @return {@link AgencyType} enum.
     */
    public @NotNull AgencyType getType() {
        return (agencyType == null) ? agencyType = AgencyType.matchType(type) : agencyType;
    }
}
