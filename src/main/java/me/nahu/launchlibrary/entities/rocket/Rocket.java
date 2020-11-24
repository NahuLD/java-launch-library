package me.nahu.launchlibrary.entities.rocket;

import me.nahu.launchlibrary.entities.config.launcher.BasicLauncherConfig;
import org.jetbrains.annotations.NotNull;

/**
 * Pet entity for launcher entities.
 * @since 2.0.0
 */
public class Rocket {
    private int id;
    private BasicLauncherConfig configuration;

    /**
     * Get the id for this {@link Rocket}.
     * @return {@link Integer} id.
     */
    public int getId() {
        return id;
    }

    /**
     * Get the configuration for this {@link Rocket}.
     * @return {@link BasicLauncherConfig} configuration.
     */
    public @NotNull BasicLauncherConfig getConfiguration() {
        return configuration;
    }
}
