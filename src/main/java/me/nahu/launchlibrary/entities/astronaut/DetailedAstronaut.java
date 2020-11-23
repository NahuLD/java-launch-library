package me.nahu.launchlibrary.entities.astronaut;

import me.nahu.launchlibrary.entities.agency.Agency;
import me.nahu.launchlibrary.entities.agency.ListAgency;
import org.jetbrains.annotations.NotNull;

/**
 * Detailed Astronaut which may only be queries by calling up it's id.
 * @since 2.0.0
 */
public class DetailedAstronaut extends BasicAstronaut {
    private ListAgency agency;

    // TODO: Flights (launches) and landings

    /**
     * Get the agency this {@link Astronaut} works under.
     * @return {@link Agency} agency.
     */
    public @NotNull ListAgency getAgency() {
        return agency;
    }
}
