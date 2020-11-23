package me.nahu.launchlibrary.entities.expedition;

import me.nahu.launchlibrary.entities.astronaut.AstronautRole;
import me.nahu.launchlibrary.entities.astronaut.BasicAstronaut;
import org.jetbrains.annotations.NotNull;

/**
 * This is an embedded entity and thus does not follow proper format.
 * @since 2.0.0
 */
public class ExpeditionFlightMember {
    private int id;
    private String role;
    private BasicAstronaut astronaut;

    /**
     * Get the id for this {@link ExpeditionFlightMember}.
     * @return {@link Integer} id.
     */
    public int getId() {
        return id;
    }

    /**
     * Get the role of the astronaut that is taking part in this {@link ExpeditionFlightMember}.
     * @return {@link AstronautRole} role.
     */
    public @NotNull AstronautRole getRole() {
        return AstronautRole.matchRole(role);
    }

    /**
     * Get the astronaut that is flying in this {@link ExpeditionFlightMember}.
     * @return {@link BasicAstronaut} astronaut.
     */
    public BasicAstronaut getAstronaut() {
        return astronaut;
    }
}
