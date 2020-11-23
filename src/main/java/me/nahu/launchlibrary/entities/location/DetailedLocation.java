package me.nahu.launchlibrary.entities.location;

import me.nahu.launchlibrary.entities.pad.BasicPad;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DetailedLocation extends Location {
    private List<BasicPad> pads;

    /**
     * Get a list of pads in this {@link DetailedLocation}.
     * May be empty if none are located there.
     * @return {@link List< BasicPad >} pads.
     */
    public @NotNull List<BasicPad> getPads() {
        return pads;
    }
}
