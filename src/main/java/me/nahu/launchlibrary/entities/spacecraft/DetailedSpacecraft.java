package me.nahu.launchlibrary.entities.spacecraft;

import me.nahu.launchlibrary.entities.config.spacecraft.DetailedSpacecraftConfig;
import me.nahu.launchlibrary.entities.spacecraft.flight.SpacecraftFlight;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * API detailed spacecraft entity.
 * @since 2.0.0
 */
public class DetailedSpacecraft extends Spacecraft {
    private DetailedSpacecraftConfig spacecraft_config;
    private List<SpacecraftFlight> flights;

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull DetailedSpacecraftConfig getSpacecraftConfiguration() {
        return spacecraft_config;
    }

    /**
     * Get the flights this {@link DetailedSpacecraft} has.
     * @return {@link List<SpacecraftFlight>} flights;
     */
    public @NotNull List<SpacecraftFlight> getFlights() {
        return flights;
    }
}
