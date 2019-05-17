package me.nahu.launchlibrary;

public class LaunchLibrary {

    public static final String DEFAULT_API_VERSION = "1.4";
    public static final String DEFAULT_API_URL = "https://launchlibrary.net/";

    private String apiEndpoint;

    public LaunchLibrary() {
        this(DEFAULT_API_URL, DEFAULT_API_VERSION);
    }

    public LaunchLibrary(String apiUrl, String apiVersion) {
        apiEndpoint = apiUrl.concat(String.format("/%s/", apiVersion));
    }
}
