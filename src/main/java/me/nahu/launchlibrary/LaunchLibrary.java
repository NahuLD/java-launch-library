package me.nahu.launchlibrary;

public class LaunchLibrary {

    private static final String DEFAULT_API_VERSION = "1.4";
    private static final String DEFAULT_API_URL = "https://launchlibrary.net/%s/";

    private String apiEndpoint;

    public LaunchLibrary() {
        this(DEFAULT_API_VERSION);
    }

    public LaunchLibrary(String apiVersion) {
        apiEndpoint = String.format(DEFAULT_API_URL, apiVersion);
    }

}
