package me.nahu.launchlibrary.entities.agency;

import me.nahu.launchlibrary.entities.Entity;
import org.jetbrains.annotations.NotNull;

/**
 * Smaller agency entity. It's used on other entities when listing multiple instances of agencies.
 * @since 2.0.0
 */
public class ListAgency extends Entity {
    private String abbrev;

    /**
     * Get the {@link Agency} abbreviation.
     * @return {@link String} short abbreviation.
     */
    public @NotNull String getAbbreviation() {
        return abbrev;
    }
}
