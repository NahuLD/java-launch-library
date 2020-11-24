package me.nahu.launchlibrary.entities.mission;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.label.Describable;
import me.nahu.launchlibrary.entities.orbit.Orbit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API mission entity.
 * @since 2.0.0
 */
public class Mission extends Entity implements Describable {
    private String description;

    private @Nullable String launch_designator;
    private String type;

    private Orbit orbit;

    /**
     * Get the launch designator for this {@link Mission}.
     * @return {@link String} designator.
     */
    public @Nullable String getLaunchDesignator() {
        return launch_designator;
    }

    /**
     * Get the type of {@link Mission}.
     * @return {@link String} type.
     */
    public @NotNull String getType() {
        return type;
    }

    /**
     * Get the orbit of this {@link Mission}.
     * @return {@link Orbit} orbit.
     */
    public @NotNull Orbit getOrbit() {
        return orbit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable String getDescription() {
        return description;
    }
}
