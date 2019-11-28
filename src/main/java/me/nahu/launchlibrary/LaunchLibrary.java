package me.nahu.launchlibrary;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LaunchLibrary {
    private static final Version DEFAULT_API_VERSION = Version.VERSION_1_4_1;
    private static final String DEFAULT_API_URL = "https://launchlibrary.net/%s/";

    private LaunchService launchService;

    private LaunchLibrary(String apiUrl, Version version) {
        String apiEndpoint = String.format(apiUrl, version.getVersion());
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(apiEndpoint)
                .build();
        launchService = retrofit.create(LaunchService.class);
    }

    private LaunchService getLaunchService() {
        return launchService;
    }

    public class Builder {
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
        public LaunchService build() {
            return new LaunchLibrary(apiUrl, version).getLaunchService();
        }
    }
}
