package me.nahu.launchlibrary.entities.location;

import me.nahu.launchlibrary.entities.pad.PadBase;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DetailedLocation extends Location {
    private List<PadBase> pads;

    /**
     * Get a list of pads in this {@link DetailedLocation}.
     * May be empty if none are located there.
     * @return {@link List<PadBase>} pads.
     */
    public @NotNull List<PadBase> getPads() {
        return pads;
    }
}
