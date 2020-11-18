package me.nahu.launchlibrary.entities.spacestation;

import me.nahu.launchlibrary.entities.Entity;
import me.nahu.launchlibrary.entities.agency.ListAgency;
import me.nahu.launchlibrary.entities.label.Describable;
import me.nahu.launchlibrary.entities.label.ImageMedia;
import me.nahu.launchlibrary.entities.label.Status;
import me.nahu.launchlibrary.entities.label.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URL;
import java.util.Date;
import java.util.List;

public class SpaceStation extends Entity implements Describable, ImageMedia {
    private Status status;
    private Type type;

    private String description;
    private String orbit;

    private Date founded;
    private @Nullable Date deorbited;

    private List<ListAgency> owners;

    private @Nullable URL image_url;

    /**
     * Get the list of agencies that run and operate this {@link SpaceStation}.
     * @return {@link List<ListAgency>} agencies.
     */
    public List<ListAgency> getOwners() {
        return owners;
    }

    /**
     * Get the status for this {@link SpaceStation}.
     * @return {@link SpaceStationStatus} status.
     */
    public @NotNull SpaceStationStatus getStatus() {
        return SpaceStationStatus.getById(status.getId());
    }

    /**
     * TODO: use custom type.
     * @return {@link Type} type.
     */
    public Type getType() {
        return type;
    }

    /**
     * Get the orbit this {@link SpaceStation} is at.
     * @return {@link String} orbit.
     */
    public @NotNull String getOrbit() {
        return orbit;
    }

    /**
     * Get the foundation date for this {@link SpaceStation}.
     * @return {@link Date} date.
     */
    public Date getFoundationDate() {
        return founded;
    }

    /**
     * Get the de-orbit date for this {@link SpaceStation}.
     * May be null if it's still on orbit.
     * @return {@link Date} date.
     */
    public @Nullable Date getDeOrbitedDate() {
        return deorbited;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable String getDescription() {
        return description;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable URL getImageUrl() {
        return image_url;
    }
}
