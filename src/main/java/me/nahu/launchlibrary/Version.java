package me.nahu.launchlibrary;

/*
 * I am not supporting older versions, but going ahead I will keep backwards compatibility.
 */
public enum Version {
    VERSION_1_4("1.4"),
    VERSION_1_4_1("1.4.1");

    private final String version;

    Version(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
