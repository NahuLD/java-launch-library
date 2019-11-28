package me.nahu.launchlibrary;

public class LaunchLibrary {

    private static final Version DEFAULT_API_VERSION = Version.VERSION_1_4;
    private static final Mode DEFAULT_MODE = Mode.VERBOSE;
    private static final String DEFAULT_API_URL = "https://launchlibrary.net/%s/";

    private final Mode mode;
    private final String apiEndpoint;

    private LaunchLibrary(String apiUrl, Version version, Mode mode) {
        apiEndpoint = String.format(apiUrl, version.getVersion());
        this.mode = mode;
    }



    public class Builder {
        private Mode mode = DEFAULT_MODE;
        private Version version = DEFAULT_API_VERSION;
        private String apiUrl = DEFAULT_API_URL;

        /**
         * Set the {@link String} API url for the instance of {@link LaunchLibrary}.
         * @param apiUrl {@link} api url.
         * @return this instance.
         */
        public Builder setUrl(String apiUrl){
            this.apiUrl = apiUrl;
            return this;
        }

        /**
         * Set the {@link Mode} for the instance of {@link LaunchLibrary}.
         * @param mode {@link Mode} enum.
         * @return this instance.
         */
        public Builder setMode(Mode mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Set the {@link Version} for the instance of {@link LaunchLibrary}.
         * @param version {@link Version} enum.
         * @return this instance.
         */
        public Builder setVersion(Version version) {
            this.version = version;
            return this;
        }

        /**
         * Build an instance of {@link LaunchLibrary} with the properties set to this builder.
         * @return {@link LaunchLibrary} instance.
         */
        public LaunchLibrary build() {
            return new LaunchLibrary(apiUrl, version, mode);
        }
    }
}
