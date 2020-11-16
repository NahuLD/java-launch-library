package me.nahu.launchlibrary.entities.label;

import org.jetbrains.annotations.NotNull;

/**
 * Labels for the API entities. This class may be extended by {@link Status} and {@link Type}.
 * @since 2.0.0
 */
public abstract class Label {
    private int id;
    private String name;

    /**
     * Get the id for this {@link Label}.
     * @return {@link Integer} id.
     */
    public int getId() {
        return id;
    }

    /**
     * Get the name of this {@link Label}.
     * @return {@link String} name.
     */
    public @NotNull String getName() {
        return name;
    }
}
