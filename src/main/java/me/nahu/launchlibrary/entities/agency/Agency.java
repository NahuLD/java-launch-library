package me.nahu.launchlibrary.entities.agency;

import com.neovisionaries.i18n.CountryCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Year;

/**
 * API entity that allows Agencies to be viewed.
 * @since 1.0.0
 */
public class Agency extends ListAgency {
    private String type;
    private AgencyType agencyType;

    private boolean featured;

    private String country_code;
    private CountryCode countryCode;

    private @Nullable String description;
    private @Nullable String administrator;

    private @Nullable String founding_year;
    private @Nullable Year year;

    private String launchers; // Another entity????
    private String spacecraft; // Another entity???

    private @Nullable String parent; // Another Agency entity???
    private @Nullable String image_url;

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
        return (countryCode == null) ? countryCode = CountryCode.getByAlpha3Code(country_code) : countryCode;
    }

    /**
     * Get a good description of the {@link Agency}.
     * Beware that not all agencies have one assigned to them.
     * @return {@link String} description.
     */
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
     * Get an image representing this {@link Agency}.
     * Beware that not all agencies have one assigned to them.
     * @return {@link URL} image.
     * @throws MalformedURLException If the URL passed is invalid.
     */
    public @Nullable URL getImageUrl() throws MalformedURLException {
        if (image_url == null) {
            return null;
        }
        return new URL(image_url);
    }
}