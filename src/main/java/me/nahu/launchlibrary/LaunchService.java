package me.nahu.launchlibrary;

public interface LaunchService {
//    /**
//     * Fetch an Agency.
//     * @param param ambiguous parameter, could be id, abbreviation or name.
//     * @return {@link Call} of type {@link Agency}
//     */
//    @GET("agency/{param}")
//    Call<AgencyQuery> getAgency(@Path("param") String param);
//
//    /**
//     * Function that returns a list of all agencies with that name.
//     * @param name {@link String} name.
//     * @return {@link Call} of type {@link Agency}.
//     */
//    @GET("agency")
//    Call<AgencyQuery> getAgenciesByName(@Query("name") String name);
//
//    /**
//     * Fetch an AgencyType.
//     * @param param ambiguous parameter, could be id, abbreviation or name.
//     * @return {@link Call} of type {@link AgencyType}.
//     */
//    @GET("agencytype/{param}")
//    Call<TypeQuery<AgencyType>> getAgencyType(@Path("param") String param);
//
//    /**
//     * Fetch an EventType
//     * @param param ambiguous parameter, could be id, abbreviation or name
//     * @return {@link Call} of type {@link EventType}
//     */
//    @GET("eventtype/{param}")
//    Call<TypeQuery<EventType>> getEventType(@Path("param") String param);
//
//    /**
//     * Fetch a Launch
//     * @param param ambiguous parameter, could be id, abbreviation or name
//     * @return {@link Call} of type {@link LaunchQuery.Launch}
//     */
//    @GET("launch/{param}")
//    Call<LaunchQuery> getLaunch(@Path("param") String param);
//
//    /**
//     * Get next amount of launches.
//     * @param amount {@link Integer} amount of wanted launches.
//     * @return {@link Call} of type {@link List} of {@link LaunchQuery.Launch}.
//     */
//    @GET("launch/next/{amount}")
//    Call<LaunchQuery> getNextLaunches(@Path("amount") int amount);
//
//    /**
//     * Fetch a Launch Status
//     * @param param ambiguous parameter, could be id, abbreviation or name
//     * @return {@link Call} of type {@link LaunchStatus}
//     */
//    @GET("launchstatus/{param}")
//    Call<TypeQuery<LaunchStatus>> getLaunchStatus(@Path("param") String param);
//
//    /**
//     * Fetch a Location
//     * @param param ambiguous parameter, could be id, abbreviation or name
//     * @return {@link Call} of type {@link LocationQuery.Location}
//     */
//    @GET("location/{param}")
//    Call<LocationQuery> getLocation(@Path("param") String param, @Query("countryCode") String countryCode);
//
//    /**
//     * Fetch a Mission
//     * @param param ambiguous parameter, could be id, abbreviation or name
//     * @return {@link Call} of type {@link MissionQuery.Mission}
//     */
//    @GET("mission/{param}")
//    Call<MissionQuery> getMission(@Path("param") String param);
//
//    /**
//     * Fetch a Mission Type
//     * @param param ambiguous parameter, could be id, abbreviation or name
//     * @return {@link Call} of type {@link MissionType}
//     */
//    @GET("missiontype/{param}")
//    Call<TypeQuery<MissionType>> getMissionType(@Path("param") String param);
//
//    /**
//     * Fetch a Pad
//     * @param param ambiguous parameter, could be id, abbreviation or name
//     * @return {@link Call} of type {@link PadQuery.Pad}
//     */
//    @GET("pad/{param}")
//    Call<PadQuery> getPad(@Path("param") String param);
//
//    /**
//     * Get pad by {@link LocationQuery.Location}'s id.
//     * @param locationId {@link Integer} id.
//     * @return {@link Call} of type {@link PadQuery.Pad}.
//     */
//    @GET("pad/")
//    Call<PadQuery> getPadsByLocationId(@Query("locationid") int locationId);
//
//    /**
//     * Fetch a Rocket
//     * @param param ambiguous parameter, could be id, abbreviation or name
//     * @return {@link Call} of type {@link RocketQuery.Rocket}
//     */
//    @GET("rocket/{param}")
//    Call<RocketQuery> getRocket(@Path("param") String param);
}
