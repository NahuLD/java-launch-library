package me.nahu.launchlibrary.entities.label;

import org.jetbrains.annotations.Nullable;

import java.net.URL;

public interface ImageMedia {
    /**
     * Get an url for an image representing this {@link ImageMedia} entity.
     * Beware that not all entities have one assigned to them.
     * @return {@link URL} image.
     */
    @Nullable URL getImageUrl();
}
