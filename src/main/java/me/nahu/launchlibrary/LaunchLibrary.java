package me.nahu.launchlibrary;

import com.google.common.base.Preconditions;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.nahu.launchlibrary.util.deserializer.DateDeserializer;
import me.nahu.launchlibrary.util.deserializer.UrlDeserializer;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.net.URL;
import java.util.Date;

public class LaunchLibrary {
    private static final Version DEFAULT_API_VERSION = Version.VERSION_2;
    private static final String DEFAULT_API_URL = "https://ll.thespacedevs.com/%s/";

    private static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(Date.class, new DateDeserializer())
            .registerTypeAdapter(URL.class, new UrlDeserializer())
            .create();

    private final @NotNull LaunchService launchService;

    private LaunchLibrary(@NotNull String apiUrl, @NotNull Version version) {
        Preconditions.checkNotNull(apiUrl, "api url cannot be null");
        Preconditions.checkNotNull(version, "version cannot be null");
        Preconditions.checkArgument(version == Version.VERSION_1_4 || version == Version.VERSION_1_4_1,
                "these are outdated versions, please use versions >= 2.0.0");

        String apiEndpoint = String.format(apiUrl, version.getVersion());
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(GSON))
                .baseUrl(apiEndpoint)
                .build();
        launchService = retrofit.create(LaunchService.class);
    }

//    /**
//     * Get the agency by the unique id assigned by the API.
//     * @param id {@link Integer} id.
//     * @return {@link Request} of type {@link Agency}.
//     */
//    public Request<AgencyQuery> getAgencyById(int id) {
//        return new Request<>(launchService.getAgency(String.valueOf(id)));
//    }
//
//    /**
//     * Get the agency by its abbreviation, like NASA.
//     * @param abbr {@link String} abbreviation.
//     * @return {@link Request} of type {@link Agency}.
//     */
//    public Request<AgencyQuery> getAgencyByAbbreviation(String abbr) {
//        return new Request<>(launchService.getAgency(abbr));
//    }
//
//    /**
//     * Get the agency by its name, like Belarus Space Agency.
//     * @param name {@link String} name.
//     * @return {@link Request} of type {@link Agency}.
//     */
//    public Request<AgencyQuery> getAgenciesByName(String name) {
//        return new Request<>(launchService.getAgenciesByName(name));
//    }
//
//    /**
//     * Get the agency type by the unique id assigned by the API.
//     * @param id {@link Integer} id.
//     * @return {@link Request} of type {@link AgencyType}.
//     */
//    public Request<TypeQuery<AgencyType>> getAgencyTypeById(int id) {
//        return new Request<>(launchService.getAgencyType(String.valueOf(id)));
//    }
//
//    /**
//     * Get the agency types by their name, like Government.
//     * @param name {@link String} name.
//     * @return {@link Request} of type {@link AgencyType}.
//     */
//    public Request<TypeQuery<AgencyType>> getAgencyTypesByName(String name) {
//        return new Request<>(launchService.getAgencyType(name));
//    }
//
//    /**
//     * Get the event type by the unique id assigned by the API.
//     * @param id {@link Integer} id.
//     * @return {@link Request} of type {@link EventType}
//     */
//    public Request<TypeQuery<EventType>> getEventTypeById(int id) {
//        return new Request<>(launchService.getEventType(String.valueOf(id)));
//    }
//
//    /**
//     * Get the event types by their name, like Info.
//     * @param name {@link String} name.
//     * @return {@link Request} of type {@link EventType}.
//     */
//    public Request<TypeQuery<EventType>> getEventTypesByName(String name) {
//        return new Request<>(launchService.getEventType(name));
//    }
//
//    /**
//     * Get the launch by the unique id assigned by the API.
//     * @param id {@link Integer} id
//     * @return {@link Request} of type {@link LaunchQuery.Launch}
//     */
//    public Request<LaunchQuery> getLaunchById(int id) {
//        return new Request<>(launchService.getLaunch(String.valueOf(id)));
//    }
//
//    /**
//     * Get launches according by their name, like querying Falcon.
//     * @param name {@link String} name.
//     * @return {@link Request} of type {@link LaunchQuery.Launch}.
//     */
//    public Request<LaunchQuery> getLaunchesByName(String name) {
//        return new Request<>(launchService.getLaunch(name));
//    }
//
//    /**
//     * Get next amount of launches.
//     * @param amount {@link Integer} amount of wanted launches.
//     * @return {@link Request} of type {@link List} of {@link LaunchQuery.Launch}.
//     */
//    public Request<LaunchQuery> getNextLaunches(int amount) {
//        return new Request<>(launchService.getNextLaunches(amount));
//    }
//
//    /**
//     * Get launches after a provided convenient {@link Date} class.
//     * @param moment {@link Date} date.
//     * @return {@link Request} of type {@link List} of {@link LaunchQuery.Launch}.
//     */
//    public Request<LaunchQuery> getLaunchesAfter(Date moment) {
//        return new Request<>(launchService.getLaunch(DATE_FORMAT.format(moment)));
//    }
//
//    /**
//     * Get launches between two ISO dates.
//     * @param from {@link String} formatted YYYY-MM-DD.
//     * @param to {@link String} formatted YYYY-MM-DD.
//     * @return {@link Request} of type {@link List} of {@link LaunchQuery.Launch}.
//     */
//    public Request<LaunchQuery> getLaunchesBetween(Date from, Date to) {
//        return new Request<>(launchService.getLaunch(DATE_FORMAT.format(from) + "/" + DATE_FORMAT.format(to)));
//    }
//
//    /**
//     * Get launch status by the unique id assigned by the API.
//     * @param id {@link Integer} id
//     * @return {@link Request} of type {@link LaunchStatus}
//     */
//    public Request<TypeQuery<LaunchStatus>> getLaunchStatusById(int id) {
//        return new Request<>(launchService.getLaunchStatus(String.valueOf(id)));
//    }
//
//    /**
//     * Get launch statuses matching a name, like On Hold.
//     * @param name {@link String} name.
//     * @return {@link Request} of type {@link LaunchStatus}.
//     */
//    public Request<TypeQuery<LaunchStatus>> getLaunchStatusesByName(String name) {
//        return new Request<>(launchService.getLaunchStatus(name));
//    }
//
//    /**
//     * Get location by the unique id assigned by the API.
//     * @param id {@link Integer} id
//     * @return {@link Request} of type {@link LocationQuery.Location}
//     */
//    public Request<LocationQuery> getLocationFromId(int id) {
//        return new Request<>(launchService.getLocation(String.valueOf(id), null));
//    }
//
//    /**
//     * Get locations from their name, like Cape Canaveral, Florida
//     * @param name {@link String} name.
//     * @return {@link Request} of type {@link LocationQuery.Location}.
//     */
//    public Request<LocationQuery> getLocationsFromName(String name) {
//        return new Request<>(launchService.getLocation(name, null));
//    }
//
//
//    /**
//     * Get locations from their 3-letter country code, like USA or CHN.
//     * @param countryCode {@link String} name.
//     * @return {@link Request} of type {@link LocationQuery.Location}.
//     */
//    public Request<LocationQuery> getLocationsFromCountryCode(String countryCode) {
//        return new Request<>(launchService.getLocation(null, countryCode));
//    }
//
//    /**
//     * Get a mission by its unique id assigned by the API.
//     * @param id {@link Integer} id
//     * @return {@link Request} of type {@link MissionQuery.Mission}
//     */
//    public Request<MissionQuery> getMissionById(int id) {
//        return new Request<>(launchService.getMission(String.valueOf(id)));
//    }
//
//    /**
//     * Get missions from their name, like "Falcon" will return all Falcon missions.
//     * @param name {@link String} name.
//     * @return {@link Request} of type {@link MissionQuery.Mission}.
//     */
//    public Request<MissionQuery> getMissionsByName(String name) {
//        return new Request<>(launchService.getMission(name));
//    }
//
//    /**
//     * Get a mission type by its unique id assigned by the API.
//     * @param id {@link Integer} id
//     * @return {@link Request} of type {@link MissionType}
//     */
//    public Request<TypeQuery<MissionType>> getMissionFromId(int id) {
//        return new Request<>(launchService.getMissionType(String.valueOf(id)));
//    }
//
//    /**
//     * Get mission types from their name, like Earth Science.
//     * @param name {@link String} name.
//     * @return {@link Request} of type {@link MissionType}.
//     */
//    public Request<TypeQuery<MissionType>> getMissionTypesFromName(String name) {
//        return new Request<>(launchService.getMissionType(name));
//    }
//
//    /**
//     * Get a pad by its unique id assigned by the API.
//     * @param id {@link Integer} id
//     * @return {@link Request} of type {@link PadQuery.Pad}
//     */
//    public Request<PadQuery> getPadFromId(int id) {
//        return new Request<>(launchService.getPad(String.valueOf(id)));
//    }
//
//    /**
//     * Get pads from their name, like Cape Canaveral will return all pads in there.
//     * @param name {@link String} name.
//     * @return {@link Request} of type {@link PadQuery.Pad}.
//     */
//    public Request<PadQuery> getPadsFromName(String name) {
//        return new Request<>(launchService.getPad(name));
//    }
//
//    /**
//     * Get pad located in a certain place.
//     * @param location {@link LocationQuery.Location} location.
//     * @return {@link Request} of type {@link PadQuery.Pad}.
//     */
//    public Request<PadQuery> getPadsByLocation(LocationQuery.Location location) {
//        return new Request<>(launchService.getPadsByLocationId(location.getId()));
//    }
//
//    /**
//     * Get a rocket by its unique id assigned by the API.
//     * @param id {@link Integer} id
//     * @return {@link Request} of type {@link RocketQuery.Rocket}
//     */
//    public Request<RocketQuery> getRocketById(int id) {
//        return new Request<>(launchService.getRocket(String.valueOf(id)));
//    }
//
//    /**
//     * Get rockets by their name, Falcon will return all the series of Falcon rockets.
//     * @param name {@link String} name
//     * @return {@link Request} of type {@link RocketQuery.Rocket}
//     */
//    public Request<RocketQuery> getRocketsFromName(String name) {
//        return new Request<>(launchService.getRocket(name));
//    }

    public static class Builder {
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
        public LaunchLibrary build() {
            return new LaunchLibrary(apiUrl, version);
        }
    }
}
