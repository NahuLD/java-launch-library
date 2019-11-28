package me.nahu.launchlibrary.entities;

import java.util.List;

public abstract class SourceableEntity extends Entity {
    private String wikiURL;
    private String infoURL;
    private List<String> infoURLs;

    /**
     * Convenient Wikipedia's page with information of the {@link SourceableEntity}.
     * @return {@link String} with more information.
     */
    public String getWikiUrl() {
        return wikiURL;
    }

    /**
     * Alternate source of information about the {@link SourceableEntity}. Can be used instead of {@link this.getWikiUrl()}.
     * Please consider this method is being discontinued in future released and it should be avoided.
     * @return {@link String} source of information.
     */
    @Deprecated
    public String getInfoUrl() {
        return infoURL;
    }

    /**
     * Array of informational sources about the {@link SourceableEntity}. Can be iterated and used instead of {@link this.getInfoUrl()}
     * @return {@link String[]} array with multiple sources.
     */
    public List<String> getInfoUrls() {
        return infoURLs;
    }

}
