package me.nahu.launchlibrary;

import me.nahu.launchlibrary.entities.TypeQuery;
import me.nahu.launchlibrary.entities.agency.AgencyQuery;
import me.nahu.launchlibrary.entities.agency.AgencyType;
import me.nahu.launchlibrary.entities.event.EventType;
import me.nahu.launchlibrary.entities.launch.LaunchQuery;
import me.nahu.launchlibrary.entities.launch.LaunchStatus;
import me.nahu.launchlibrary.entities.location.LocationQuery;
import me.nahu.launchlibrary.entities.location.PadQuery;
import me.nahu.launchlibrary.entities.mission.MissionQuery;
import me.nahu.launchlibrary.entities.mission.MissionType;
import me.nahu.launchlibrary.entities.rocket.RocketQuery;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.Date;
import java.util.List;

import static me.nahu.launchlibrary.util.Utils.DATE_FORMAT;

public interface LaunchService {
    /*
     *  AGENCY CALLS
     */

    /**
     * Fetch an Agency.
     * @param param ambiguous parameter, could be id, abbreviation or name.
     * @return {@link Call} of type {@link AgencyQuery.Agency}
     */
    @GET("agency/{param}")
    Call<AgencyQuery> getAgency(@Path("param") String param);

    /**
     * Function that wraps {@link #getAgency(String)} providing ease of use.
     * @param id {@link Integer} id.
     * @return {@link Call} of type {@link AgencyQuery.Agency}.
     */
    default Call<AgencyQuery> getAgencyById(int id) {
        return getAgency(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getAgency(String)} providing ease of use.
     * @param abbr {@link String} abbreviation.
     * @return {@link Call} of type {@link AgencyQuery.Agency}.
     */
    default Call<AgencyQuery> getAgencyByAbbreviation(String abbr) {
        return getAgency(abbr);
    }

    /**
     * Function that returns a list of all agencies with that name.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link AgencyQuery.Agency}.
     */
    @GET("agency/")
    Call<AgencyQuery> getAgenciesByName(@Query("name") String name);

    /*
     *  AGENCY TYPE CALLS
     */

    /**
     * Fetch an AgencyType.
     * @param param ambiguous parameter, could be id, abbreviation or name.
     * @return {@link Call} of type {@link AgencyType}.
     */
    @GET("agencytype/{param}")
    Call<TypeQuery<AgencyType>> getAgencyType(@Path("param") String param);

    /**
     * Function that wraps {@link #getAgencyType(String)} providing ease of use.
     * @param id {@link Integer} id.
     * @return {@link Call} of type {@link AgencyType}.
     */
    default Call<TypeQuery<AgencyType>> getAgencyTypeById(int id) {
        return getAgencyType(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getAgencyType(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link AgencyType}.
     */
    default Call<TypeQuery<AgencyType>> getAgencyTypesByName(String name) {
        return getAgencyType(name);
    }

    /*
     *  EVENT TYPE CALLS
     */

    /**
     * Fetch an EventType
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link EventType}
     */
    @GET("eventtype/{param}")
    Call<TypeQuery<EventType>> getEventType(@Path("param") String param);

    /**
     * Function that wraps {@link #getEventType(String)} providing ease of use.
     * @param id {@link Integer} id.
     * @return {@link Call} of type {@link EventType}
     */
    default Call<TypeQuery<EventType>> getEventTypeById(int id) {
        return getEventType(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getEventType(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link EventType}.
     */
    default Call<TypeQuery<EventType>> getEventTypesByName(String name) {
        return getEventType(name);
    }

    /*
     *  LAUNCH CALLS
     */

    /**
     * Fetch a Launch
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link LaunchQuery.Launch}
     */
    @GET("launch/{param}")
    Call<LaunchQuery> getLaunch(@Path("param") String param);

    /**
     * Function that wraps {@link #getLaunch(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link LaunchQuery.Launch}
     */
    default Call<LaunchQuery> getLaunchById(int id) {
        return getLaunch(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getLaunch(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link LaunchQuery.Launch}.
     */
    default Call<LaunchQuery> getLaunchesByName(String name) {
        return getLaunch(name);
    }

    /**
     * Get next amount of launches.
     * @param amount {@link Integer} amount of wanted launches.
     * @return {@link Call} of type {@link List} of {@link LaunchQuery.Launch}.
     */
    @GET("launch/next/{amount}")
    Call<LaunchQuery> getNextLaunches(@Path("amount") int amount);

    /**
     * Get launches after a provided ISO date.
     * @param moment {@link String} formatted YYYY-MM-DD.
     * @return {@link Call} of type {@link List} of {@link LaunchQuery.Launch}.
     */
    @GET("launch/{moment}")
    Call<LaunchQuery> getLaunchesAfter(@Path("moment") String moment);

    /**
     * Get launches after a provided convenient {@link Date} class.
     * @param moment {@link Date} date.
     * @return {@link Call} of type {@link List} of {@link LaunchQuery.Launch}.
     */
    default Call<LaunchQuery> getLaunchesAfter(Date moment) {
        return getLaunchesAfter(DATE_FORMAT.format(moment));
    }

    /**
     * Get launches between two ISO dates.
     * @param from {@link String} formatted YYYY-MM-DD.
     * @param to {@link String} formatted YYYY-MM-DD.
     * @return {@link Call} of type {@link List} of {@link LaunchQuery.Launch}.
     */
    @GET("launch/{from}/{to}")
    Call<LaunchQuery> getLaunchesBetween(@Path("from") String from, @Path("to") String to);

    /**
     * Get launches after convenient {@link Date} classes.
     * @param from {@link Date} date.
     * @param to {@link Date} to.
     * @return {@link Call} of type {@link List} of {@link LaunchQuery.Launch}.
     */
    default Call<LaunchQuery> getLaunchesBetween(Date from, Date to) {
        return getLaunchesBetween(DATE_FORMAT.format(from), DATE_FORMAT.format(to));
    }

    /*
     *  LAUNCH STATUS CALLS
     */

    /**
     * Fetch a Launch Status
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link LaunchStatus}
     */
    @GET("launchstatus/{param}")
    Call<TypeQuery<LaunchStatus>> getLaunchStatus(@Path("param") String param);

    /**
     * Function that wraps {@link #getLaunchStatus(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link LaunchStatus}
     */
    default Call<TypeQuery<LaunchStatus>> getLaunchStatusById(int id) {
        return getLaunchStatus(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getLaunchStatus(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link LaunchStatus}.
     */
    default Call<TypeQuery<LaunchStatus>> getLaunchStatusesByName(String name) {
        return getLaunchStatus(name);
    }

    /*
     *  LOCATION CALLS
     */

    /**
     * Fetch a Location
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link LocationQuery.Location}
     */
    @GET("location/{param}")
    Call<LocationQuery> getLocation(@Path("param") String param);

    /**
     * Function that wraps {@link #getLocation(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link LocationQuery.Location}
     */
    default Call<LocationQuery> getLocationById(int id) {
        return getLocation(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getLocation(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link LocationQuery.Location}.
     */
    default Call<LocationQuery> getLocationsByName(String name) {
        return getLocation(name);
    }

    /**
     * Get location by three letter country code the Location's country of origin.
     * @param countryCode {@link String} three letter country code.
     * @return {@link Call} of type {@link List} of {@link LocationQuery.Location}.
     */
    @GET("location/")
    Call<LocationQuery> getLocationsByCountryCode(@Query("countryCode") String countryCode);

    /*
     *  MISSION CALLS
     */

    /**
     * Fetch a Mission
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link MissionQuery.Mission}
     */
    @GET("mission/{param}")
    Call<MissionQuery> getMission(@Path("param") String param);

    /**
     * Function that wraps {@link #getMission(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link MissionQuery.Mission}
     */
    default Call<MissionQuery> getMissionById(int id) {
        return getMission(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getMission(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link MissionQuery.Mission}.
     */
    default Call<MissionQuery> getMissionsByName(String name) {
        return getMission(name);
    }

    /*
     *  MISSION TYPE CALLS
     */

    /**
     * Fetch a Mission Type
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link MissionType}
     */
    @GET("missiontype/{param}")
    Call<TypeQuery<MissionType>> getMissionType(@Path("param") String param);

    /**
     * Function that wraps {@link #getMissionType(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link MissionType}
     */
    default Call<TypeQuery<MissionType>> getMissionTypeById(int id) {
        return getMissionType(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getMissionType(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link MissionType}.
     */
    default Call<TypeQuery<MissionType>> getMissionTypesByName(String name) {
        return getMissionType(name);
    }

    /*
     *  PAD CALLS
     */

    /**
     * Fetch a Pad
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link PadQuery.Pad}
     */
    @GET("pad/{param}")
    Call<PadQuery> getPad(@Path("param") String param);

    /**
     * Function that wraps {@link #getPad(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link PadQuery.Pad}
     */
    default Call<PadQuery> getPadById(int id) {
        return getPad(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getPad(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link PadQuery.Pad}.
     */
    default Call<PadQuery> getPadsByName(String name) {
        return getPad(name);
    }

    /**
     * Get pad by {@link LocationQuery.Location}'s id.
     * @param locationId {@link Integer} id.
     * @return {@link Call} of type {@link PadQuery.Pad}.
     */
    @GET("pad/")
    Call<PadQuery> getPadsByLocationId(@Query("locationid") int locationId);

    /**
     * Get pad by passing a {@link LocationQuery.Location}.
     * @param location {@link LocationQuery.Location} location.
     * @return {@link Call} of type {@link PadQuery.Pad}.
     */
    default Call<PadQuery> getPadByLocation(LocationQuery.Location location) {
        return getPadsByLocationId(location.getId());
    }

    /*
     *  ROCKET CALLS
     */

    /**
     * Fetch a Rocket
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link RocketQuery.Rocket}
     */
    @GET("rocket/{param}")
    Call<RocketQuery> getRocket(@Path("param") String param);

    /**
     * Function that wraps {@link #getRocket(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link RocketQuery.Rocket}
     */
    default Call<RocketQuery> getRocketById(int id) {
        return getRocket(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getRocket(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link RocketQuery.Rocket}.
     */
    default Call<RocketQuery> getRocketsByName(String name) {
        return getRocket(name);
    }
}
