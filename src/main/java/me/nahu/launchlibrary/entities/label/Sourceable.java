package me.nahu.launchlibrary.entities.label;

import org.jetbrains.annotations.Nullable;

import java.net.URL;

/**
 * Entity that contains links and information to source it's content.
 */
public interface Sourceable {
    /**
     * Convenient Wikipedia's page with information of the {@link Sourceable}.
     * @return {@link String} with more information.
     */
    @Nullable URL getWikiUrl();

    /**
     * Alternate source of information about the {@link Sourceable}.
     * Can be used instead of {@link #getWikiUrl()}.
     * @return {@link String} source of information.
     */
    @Nullable URL getInfoUrl();
}
