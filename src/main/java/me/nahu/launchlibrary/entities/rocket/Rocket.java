package me.nahu.launchlibrary.entities.rocket;

import me.nahu.launchlibrary.entities.SourceableEntity;

import java.util.Arrays;

/**
 * Rocket Event entity class.
 * {@see https://launchlibrary.net/docs/1.4/api.html#rocket} for more information.
 */
public class Rocket extends SourceableEntity {
    private String defaultPads;

    private RocketFamily family;

    private String imageURL;
    private int[] imageSizes;

    /**
     * Get the default array of {@link me.nahu.launchlibrary.entities.location.Pad} ids for this {@link Rocket}.
     * @return {@link Integer[]} of ids.
     */
    public int[] getDefaultPads() {
        return Arrays.stream(defaultPads.split(",")).mapToInt(Integer::parseInt).toArray();
    }

    /**
     * Get the {@link RocketFamily} or model for this {@link Rocket}.
     * @return {@link RocketFamily} family.
     */
    public RocketFamily getFamily() {
        return family;
    }

    /**
     * Get the URL sampling this {@link Rocket}.
     * All images are either public domain, or permission has been obtained for use by those using the Launch Library.
     * Please set these images to cache, and do not pull them every time.
     * They are saved with different widths, maintaining the aspect ratio of the original image.
     * The url returned is the largest image available for that rocket.
     * @return {@link String} url for the image.
     */
    public String getImageUrl() {
        return imageURL;
    }

    /**
     * Get array of image sizes for this {@link Rocket}.
     * If you wish to pull a smaller image, select one of the widths, and replace it with the width in {@link this.getImageUrl()}.
     * @return {@link Integer[]} sizes.
     */
    public int[] getImageSizes() {
        return imageSizes;
    }
}
