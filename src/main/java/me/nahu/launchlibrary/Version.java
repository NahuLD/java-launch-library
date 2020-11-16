package me.nahu.launchlibrary;

/*
 * I am not supporting older versions, but going ahead I will keep backwards compatibility.
 *
 * Versions 1.4 and 1.4.1 have officially been discontinued as endpoints.
 * The format of the entities has changed in between versions (2.0.0) too, making them completely incompatible.
 */
public enum Version {
    @Deprecated
    VERSION_1_4("1.4"),
    @Deprecated
    VERSION_1_4_1("1.4.1"),
    VERSION_2("2.0.0");

    private final String version;

    Version(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
