package me.nahu.launchlibrary.entities;

import org.jetbrains.annotations.Nullable;

/**
 * Entity that contains links and information to source it's content.
 */
public interface SourceableEntity {
    /**
     * Convenient Wikipedia's page with information of the {@link SourceableEntity}.
     * @return {@link String} with more information.
     */
    @Nullable String getWikiUrl();

    /**
     * Alternate source of information about the {@link SourceableEntity}.
     * Can be used instead of {@link #getWikiUrl()}.
     * @return {@link String} source of information.
     */
    @Nullable String getInfoUrl();
}
