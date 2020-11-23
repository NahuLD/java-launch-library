package me.nahu.launchlibrary.entities.astronaut;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.label.Sourceable;
import me.nahu.launchlibrary.entities.label.Status;
import me.nahu.launchlibrary.entities.label.Type;
import me.nahu.launchlibrary.util.Utilities;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URL;
import java.util.Date;

/**
 * Astronaut base that is to be extended.
 * @since 2.0.0
 */
public abstract class BasicAstronaut extends Entity implements Sourceable {
    private Status status;
    private Type type;

    private Date date_of_birth;
    private @Nullable Date date_of_death;

    private String nationality;

    private @Nullable String twitter;
    private @Nullable String instagram;

    private String bio;

    private @Nullable URL profile_image;
    private @Nullable URL profile_image_thumbnail;

    private @Nullable URL wiki;

    private Date last_flight;
    private Date first_flight;

    /**
     * Get the status of this {@link BasicAstronaut}.
     * @return {@link AstronautStatus} status.
     */
    public @NotNull AstronautStatus getStatus() {
        return AstronautStatus.getById(status.getId());
    }

    /**
     * Get the type of this {@link BasicAstronaut}.
     * @return {@link AstronautType} type.
     */
    public @NotNull AstronautType getType() {
        return AstronautType.getById(type.getId());
    }

    /**
     * Get the date of birth of this {@link BasicAstronaut}.
     * @return {@link Date} birthdate.
     */
    public @NotNull Date getDateOfBirth() {
        return (date_of_birth == null) ? Utilities.FALLBACK_DATE : date_of_birth;
    }

    /**
     * Get the date of death of this {@link BasicAstronaut}.
     * Beware this will be null if the astronaut is still alive.
     * @return {@link Date} death date.
     */
    public @Nullable Date getDateOfDeath() {
        return date_of_death;
    }

    /**
     * Get the nationality of this {@link BasicAstronaut}.
     * This does not conform to any ISO standard and is a decorated label.
     * @return {@link String} nationality.
     */
    public @NotNull String getNationality() {
        return nationality;
    }

    /**
     * Get a short biography for this {@link BasicAstronaut}.
     * @return {@link String} biography.
     */
    public @NotNull String getBio() {
        return bio;
    }

    /**
     * Get the Twitter handle of this {@link BasicAstronaut}.
     * Beware not all astronauts have this social media account.
     * @return {@link String} twitter handle.
     */
    public @Nullable String getTwitter() {
        return twitter;
    }

    /**
     * Get the Instagram handle of this {@link BasicAstronaut}.
     * Beware not all astronauts have this social media account.
     * @return {@link String} instagram handle.
     */
    public @Nullable String getInstagram() {
        return instagram;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getWikiUrl() {
        return wiki;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getInfoUrl() {
        return null;
    }

    /**
     * Get an image URL for this {@link BasicAstronaut}. It's full resolution, unlike its counterpart {@link #getProfileImageThumbnail()}.
     * Not all astronauts have one!
     * @return {@link URL} wiki article.
     */
    public @Nullable URL getProfileImage() {
        return profile_image;
    }

    /**
     * Get an image URL for this {@link BasicAstronaut}. This image is thumb sized, unlike its counterpart {@link #getProfileImage()}.
     * Not all astronauts have one!
     * @return {@link URL} wiki article.
     */
    public @Nullable URL getProfileImageThumbnail() {
        return profile_image_thumbnail;
    }

    /**
     * Get the date of the last flight from this {@link BasicAstronaut}.
     * @return {@link Date} last flight.
     */
    public @NotNull Date getLastFlight() {
        return last_flight;
    }

    /**
     * Get the date of the first flight from this {@link BasicAstronaut}.
     * @return {@link Date} last flight.
     */
    public @NotNull Date getFirstFlight() {
        return first_flight;
    }
}
