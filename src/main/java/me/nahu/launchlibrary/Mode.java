package me.nahu.launchlibrary;

/**
 * Modes available for library requests.
 * Default will be set to verbose and it is not recommended to change it to keep all the functionalities.
 */
public enum Mode {
    LIST,
    SUMMARY,
    VERBOSE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
