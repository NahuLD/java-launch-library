package me.nahu.launchlibrary.entities.config.launcher;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.agency.Agency;
import me.nahu.launchlibrary.entities.config.Program;
import me.nahu.launchlibrary.entities.label.ImageMedia;
import me.nahu.launchlibrary.entities.label.Sourceable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URL;
import java.util.List;

public class LauncherConfig extends Entity implements Sourceable, ImageMedia {
    private Agency manufacturer;

    private String family;
    private String full_name;
    private String variant;

    private boolean reusable;

    private @Nullable URL wiki_url;
    private @Nullable URL info_url;

    private @Nullable URL image_url;

    private List<Program> program;

    /**
     * Get the manufacturer for this {@link LauncherConfig}.
     * @return {@link Agency} manufacturer.
     */
    public @NotNull Agency getManufacturer() {
        return manufacturer;
    }

    /**
     * Get the family for this {@link LauncherConfig}.
     * @return {@link String} family.
     */
    public @NotNull String getFamily() {
        return family;
    }

    /**
     * Get the full name of this {@link LauncherConfig}.
     * @return {@link String} full name.
     */
    public @NotNull String getFullName() {
        return full_name;
    }

    /**
     * Get the variant (version) for this {@link LauncherConfig}.
     * @return {@link String} variant.
     */
    public @NotNull String getVariant() {
        return variant;
    }

    /**
     * Check whether this {@link LauncherConfig} is reusable.
     * @return {@link Boolean} reusable.
     */
    public boolean isReusable() {
        return reusable;
    }

    /**
     * Get the list of programs this {@link LauncherConfig} was used on.
     * This list may be empty if there are none.
     * @return {@link List<Program>} programs.
     */
    public @NotNull List<Program> getPrograms() {
        return program;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getImageUrl() {
        return info_url;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getWikiUrl() {
        return wiki_url;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getInfoUrl() {
        return wiki_url;
    }
}
