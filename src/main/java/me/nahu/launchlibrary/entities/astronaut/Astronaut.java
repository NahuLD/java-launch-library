package me.nahu.launchlibrary.entities.astronaut;

import me.nahu.launchlibrary.entities.agency.Agency;
import org.jetbrains.annotations.NotNull;

/**
 * API entity that allows Astronauts to be viewed.
 * @since 2.0.0
 */
public class Astronaut extends AstronautBase {
    private Agency agency;

    /**
     * Get the agency this {@link Astronaut} works under.
     * @return {@link Agency} agency.
     */
    public @NotNull Agency getAgency() {
        return agency;
    }
}
