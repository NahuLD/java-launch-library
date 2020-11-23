package me.nahu.launchlibrary.entities.config.launcher;

import me.nahu.launchlibrary.entities.agency.Agency;
import me.nahu.launchlibrary.entities.config.Program;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * API launcher configuration entity.
 * @since 2.0.0
 */
public class LauncherConfig extends BasicLauncherConfig {
    private Agency manufacturer;
    private List<Program> program;

    /**
     * Get the manufacturer for this {@link LauncherConfig}.
     * @return {@link Agency} manufacturer.
     */
    public @NotNull Agency getManufacturer() {
        return manufacturer;
    }

    /**
     * Get the list of programs this {@link LauncherConfig} was used on.
     * This list may be empty if there are none.
     * @return {@link List<Program>} programs.
     */
    public @NotNull List<Program> getPrograms() {
        return program;
    }
}
