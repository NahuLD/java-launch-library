package me.nahu.launchlibrary.entities.launcher;

import me.nahu.launchlibrary.entities.config.launcher.DetailedLauncherConfig;
import org.jetbrains.annotations.NotNull;

public class DetailedLauncher extends Launcher {
    private DetailedLauncherConfig launcher_config;

    private int successful_landings;
    private int attempted_landings;

    /**
     * Get the amount of successful landings by this {@link Launcher}.
     * @return {@link Integer} amount.
     */
    public int getSuccessfulLandings() {
        return successful_landings;
    }

    /**
     * Get the amount of attempted landings by this {@link Launcher}.
     * @return {@link Integer} amount.
     */
    public int getAttemptedLandings() {
        return attempted_landings;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull DetailedLauncherConfig getLauncherConfiguration() {
        return launcher_config;
    }
}
