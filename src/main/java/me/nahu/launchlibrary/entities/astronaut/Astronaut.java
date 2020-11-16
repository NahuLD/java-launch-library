package me.nahu.launchlibrary.entities.astronaut;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.agency.Agency;
import me.nahu.launchlibrary.entities.label.Status;
import me.nahu.launchlibrary.entities.label.Type;
import me.nahu.launchlibrary.util.Utilities;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

/**
 * API entity that allows Astronauts to be viewed.
 * @since 2.0.0
 */
public class Astronaut extends Entity {
    private Status status;
    private Type type;

    private Agency agency;

    private Date date_of_birth;
    private @Nullable Date date_of_death;

    private String nationality;

    private @Nullable String twitter;
    private @Nullable String instagram;

    private String bio;

    private @Nullable String profile_image;
    private @Nullable String profile_image_thumbnail;

    private @Nullable String wiki;

    private Date last_flight;
    private Date first_flight;

    /**
     * Get the status of this {@link Astronaut}.
     * @return {@link AstronautStatus} status.
     */
    public @NotNull AstronautStatus getStatus() {
        return AstronautStatus.getById(status.getId());
    }

    /**
     * Get the type of this {@link Astronaut}.
     * @return {@link AstronautType} type.
     */
    public @NotNull AstronautType getType() {
        return AstronautType.getById(type.getId());
    }

    /**
     * Get the agency this {@link Astronaut} works under.
     * @return {@link Agency} agency.
     */
    public @NotNull Agency getAgency() {
        return agency;
    }

    /**
     * Get the date of birth of this {@link Astronaut}.
     * @return {@link Date} birthdate.
     */
    public @NotNull Date getDateOfBirth() {
        return (date_of_birth == null) ? Utilities.FALLBACK_DATE : date_of_birth;
    }

    /**
     * Get the date of death of this {@link Astronaut}.
     * Beware this will be null if the astronaut is still alive.
     * @return {@link Date} death date.
     */
    public @Nullable Date getDateOfDeath() {
        return date_of_death;
    }

    /**
     * Get the nationality of this {@link Astronaut}.
     * This does not conform to any ISO standard and is a decorated label.
     * @return {@link String} nationality.
     */
    public @NotNull String getNationality() {
        return nationality;
    }

    /**
     * Get a short biography for this {@link Astronaut}.
     * @return {@link String} biography.
     */
    public @NotNull String getBio() {
        return bio;
    }

    /**
     * Get the Twitter handle of this {@link Astronaut}.
     * Beware not all astronauts have this social media account.
     * @return {@link String} twitter handle.
     */
    public @Nullable String getTwitter() {
        return twitter;
    }

    /**
     * Get the Instagram handle of this {@link Astronaut}.
     * Beware not all astronauts have this social media account.
     * @return {@link String} instagram handle.
     */
    public @Nullable String getInstagram() {
        return instagram;
    }

    /**
     * Get a Wikipedia article for this {@link Astronaut}.
     * Not all astronauts have one!
     * @return {@link URL} wiki article.
     * @throws MalformedURLException Thrown if the URL passed is not valid.
     */
    public @Nullable URL getWikiUrl() throws MalformedURLException {
        if (wiki == null) {
            return null;
        }
        return new URL(wiki);
    }

    /**
     * Get an image URL for this {@link Astronaut}. It's full resolution, unlike its counterpart {@link #getProfileImageThumbnail()}.
     * Not all astronauts have one!
     * @return {@link URL} wiki article.
     * @throws MalformedURLException Thrown if the URL passed is not valid.
     */
    public @Nullable URL getProfileImage() throws MalformedURLException {
        if (profile_image == null) {
            return null;
        }
        return new URL(profile_image);
    }

    /**
     * Get an image URL for this {@link Astronaut}. This image is thumb sized, unlike its counterpart {@link #getProfileImage()}.
     * Not all astronauts have one!
     * @return {@link URL} wiki article.
     * @throws MalformedURLException Thrown if the URL passed is not valid.
     */
    public @Nullable URL getProfileImageThumbnail() throws MalformedURLException {
        if (profile_image_thumbnail == null) {
            return null;
        }
        return new URL(profile_image_thumbnail);
    }

    /**
     * Get the date of the last flight from this {@link Astronaut}.
     * @return {@link Date} last flight.
     */
    public @NotNull Date getLastFlight() {
        return last_flight;
    }

    /**
     * Get the date of the first flight from this {@link Astronaut}.
     * @return {@link Date} last flight.
     */
    public @NotNull Date getFirstFlight() {
        return first_flight;
    }
}
