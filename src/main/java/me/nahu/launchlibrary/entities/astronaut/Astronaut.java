package me.nahu.launchlibrary.entities.astronaut;

import me.nahu.launchlibrary.entities.agency.Agency;
import org.jetbrains.annotations.NotNull;

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
