package me.nahu.launchlibrary.entities.spacecraft.flight;

import me.nahu.launchlibrary.entities.expedition.ExpeditionFlightMember;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * API detailed spacecraft flight.
 * @since 2.0.0
 */
public class DetailedSpacecraftFlight extends SpacecraftFlight {
    private List<ExpeditionFlightMember> launch_crew;
    private List<ExpeditionFlightMember> onboard_crew;
    private List<ExpeditionFlightMember> landing_crew;

    // TODO: add launching and docking events

    /**
     * Get the crew that launched for this {@link DetailedSpacecraftFlight}.
     * @return {@link List<ExpeditionFlightMember>} crew.
     */
    public @NotNull List<ExpeditionFlightMember> getLaunchCrew() {
        return launch_crew;
    }

    /**
     * Get the crew that is onboard for this {@link DetailedSpacecraftFlight}.
     * @return {@link List<ExpeditionFlightMember>} crew.
     */
    public @NotNull List<ExpeditionFlightMember> getOnboardCrew() {
        return onboard_crew;
    }

    /**
     * Get the crew that performed the landing for this {@link DetailedSpacecraftFlight}.
     * @return {@link List<ExpeditionFlightMember>} crew.
     */
    public @NotNull List<ExpeditionFlightMember> getLandingCrew() {
        return landing_crew;
    }
}
