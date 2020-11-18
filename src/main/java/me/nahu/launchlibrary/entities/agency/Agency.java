package me.nahu.launchlibrary.entities.agency;

import com.neovisionaries.i18n.CountryCode;
import me.nahu.launchlibrary.entities.label.Describable;
import me.nahu.launchlibrary.entities.label.ImageMedia;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URL;
import java.time.Year;

/**
 * API entity that allows Agencies to be viewed.
 * @since 1.0.0
 */
public class Agency extends ListAgency implements Describable, ImageMedia {
    private String type;
    private AgencyType agencyType;

    private boolean featured;

    private CountryCode country_code;

    private @Nullable String description;
    private @Nullable String administrator;

    private @Nullable String founding_year;
    private @Nullable Year year;

    private String launchers; // Another entity????
    private String spacecraft; // Another entity???

    private @Nullable String parent; // Another Agency entity???
    private @Nullable URL image_url;

    /**
     * Check whether the {@link Agency} is featured by the library.
     * @return Boolean value.
     */
    public boolean isFeatured() {
        return featured;
    }

    /**
     * Get the type of {@link Agency} this one is.
     * @return {@link AgencyType} enum.
     */
    public @NotNull AgencyType getType() {
        return (agencyType == null) ? agencyType = AgencyType.matchType(type) : agencyType;
    }

    /**
     * Get the country code for this {@link Agency}.
     * The library spits out an alpha-3 (meaning 3 letter) ISO 3166-1 code.
     * @return {@link CountryCode} enum.
     */
    public @NotNull CountryCode getCountryCode() {
        return country_code;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable String getDescription() {
        return description;
    }

    /**
     * Get the administrator for this {@link Agency}.
     * Might be a CEO, COO, or any other person at the helm.
     * Beware that not all agencies have one assigned to them.
     * @return {@link String} administrator.
     */
    public @Nullable String getAdministrator() {
        return administrator;
    }

    /**
     * Get the founding year for the {@link Agency}.
     * Beware that not all agencies have one assigned to them.
     * @return {@link Year} founded.
     */
    public @Nullable Year getFoundingYear() {
        if (founding_year == null) {
            return null;
        }
        return (year == null) ? year = Year.parse(founding_year) : year;
    }

    /**
     * Get the launchers for this {@link Agency}.
     * These are NOT API entities and instead a concatenated string separated by a pipe {@code '|'}.
     * Beware that not all agencies have one assigned to them.
     * @return {@link String} launchers.
     */
    public @NotNull String getLaunchers() {
        return launchers;
    }

    /**
     * Get the spacecraft associated to this {@link Agency}.
     * These are NOT API entities and instead a string.
     * Beware that not all agencies have one assigned to them, instead this may be an empty string or {@code "None"}.
     * @return {@link String} spacecraft.
     */
    public @NotNull String getSpacecraft() {
        return spacecraft;
    }

    /**
     * Get the parent {@link Agency} for this {@link Agency}.
     * These are NOT API entities and instead a string.
     * Beware that not all agencies have one assigned to them.
     * @return {@link String} parent agency.
     */
    public @Nullable String getParent() {
        return parent;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getImageUrl() {
        return image_url;
    }
}