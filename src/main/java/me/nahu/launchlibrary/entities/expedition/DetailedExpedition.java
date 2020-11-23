package me.nahu.launchlibrary.entities.expedition;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * API detailed expedition entity.
 * @since 2.0.0
 */
public class DetailedExpedition extends Expedition {
    private List<ExpeditionFlightMember> crew;

    /**
     * Get the crew that is set up for this {@link DetailedExpedition}.
     * @return {@link List<ExpeditionFlightMember>} crew.
     */
    public @NotNull List<ExpeditionFlightMember> getCrew() {
        return crew;
    }
}
