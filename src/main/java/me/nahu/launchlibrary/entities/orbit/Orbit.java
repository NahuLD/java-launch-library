package me.nahu.launchlibrary.entities.orbit;

import me.nahu.launchlibrary.entities.Entity;
import org.jetbrains.annotations.NotNull;

/**
 * API orbit entity.
 * @since 2.0.0
 */
public class Orbit extends Entity {
    private String abbrev;

    /**
     * Get the abbreviation for this {@link Orbit}.
     * @return {@link String} abbreviation.
     */
    public @NotNull String getAbbreviation() {
        return abbrev;
    }
}
