package me.nahu.launchlibrary.entities.label;

import org.jetbrains.annotations.Nullable;

public interface Describable {
    /**
     * Get a good description of the {@link Describable} entity.
     * Beware that not all entities have one assigned to them.
     * @return {@link String} description.
     */
    @Nullable String getDescription();
}
