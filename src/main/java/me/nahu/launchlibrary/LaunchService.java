package me.nahu.launchlibrary;

import me.nahu.launchlibrary.entities.agency.Agency;
import me.nahu.launchlibrary.entities.agency.AgencyType;
import me.nahu.launchlibrary.entities.event.EventType;
import me.nahu.launchlibrary.entities.launch.Launch;
import me.nahu.launchlibrary.entities.launch.LaunchStatus;
import me.nahu.launchlibrary.entities.location.Location;
import me.nahu.launchlibrary.entities.location.Pad;
import me.nahu.launchlibrary.entities.mission.Mission;
import me.nahu.launchlibrary.entities.mission.MissionType;
import me.nahu.launchlibrary.entities.rocket.Rocket;
import me.nahu.launchlibrary.entities.rocket.RocketFamily;
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
     * @return {@link Call} of type {@link Agency}
     */
    @GET("agency/{param}")
    Call<Agency> getAgency(@Path("param") String param);

    /**
     * Function that wraps {@link #getAgency(String)} providing ease of use.
     * @param id {@link Integer} id.
     * @return {@link Call} of type {@link Agency}.
     */
    default Call<Agency> getAgencyById(int id) {
        return getAgency(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getAgency(String)} providing ease of use.
     * @param abbr {@link String} abbreviation.
     * @return {@link Call} of type {@link Agency}.
     */
    default Call<Agency> getAgencyByAbbreviation(String abbr) {
        return getAgency(abbr);
    }

    /**
     * Function that returns a list of all agencies with that name.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link Agency}.
     */
    @GET("agency/")
    Call<List<Agency>> getAgenciesByName(@Query("name") String name);

    /*
     *  AGENCY TYPE CALLS
     */

    /**
     * Fetch an AgencyType.
     * @param param ambiguous parameter, could be id, abbreviation or name.
     * @return {@link Call} of type {@link AgencyType}.
     */
    @GET("agencytype/{param}")
    Call<AgencyType> getAgencyType(@Path("param") String param);

    /**
     * Function that wraps {@link #getAgencyType(String)} providing ease of use.
     * @param id {@link Integer} id.
     * @return {@link Call} of type {@link AgencyType}.
     */
    default Call<AgencyType> getAgencyTypeById(int id) {
        return getAgencyType(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getAgencyType(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link AgencyType}.
     */
    default Call<AgencyType> getAgencyTypeByName(String name) {
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
    Call<EventType> getEventType(@Path("param") String param);

    /**
     * Function that wraps {@link #getEventType(String)} providing ease of use.
     * @param id {@link Integer} id.
     * @return {@link Call} of type {@link EventType}
     */
    default Call<EventType> getEventTypeById(int id) {
        return getEventType(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getEventType(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link EventType}.
     */
    default Call<EventType> getEventTypeByName(String name) {
        return getEventType(name);
    }

    /*
     *  LAUNCH CALLS
     */

    /**
     * Fetch a Launch
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link Launch}
     */
    @GET("launch/{param}")
    Call<Launch> getLaunch(@Path("param") String param);

    /**
     * Function that wraps {@link #getLaunch(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link Launch}
     */
    default Call<Launch> getLaunchById(int id) {
        return getLaunch(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getLaunch(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link Launch}.
     */
    default Call<Launch> getLaunchByName(String name) {
        return getLaunch(name);
    }

    /**
     * Get next amount of launches.
     * @param amount {@link Integer} amount of wanted launches.
     * @return {@link Call} of type {@link List} of {@link Launch}.
     */
    @GET("launch/next/{amount}")
    Call<List<Launch>> getNextLaunches(@Path("amount") int amount);

    /**
     * Get launches after a provided ISO date.
     * @param moment {@link String} formatted YYYY-MM-DD.
     * @return {@link Call} of type {@link List} of {@link Launch}.
     */
    @GET("launch/{moment}")
    Call<List<Launch>> getLaunchesAfter(@Path("moment") String moment);

    /**
     * Get launches after a provided convenient {@link Date} class.
     * @param moment {@link Date} date.
     * @return {@link Call} of type {@link List} of {@link Launch}.
     */
    default Call<List<Launch>> getLaunchesAfter(Date moment) {
        return getLaunchesAfter(DATE_FORMAT.format(moment));
    }

    /**
     * Get launches between two ISO dates.
     * @param from {@link String} formatted YYYY-MM-DD.
     * @param to {@link String} formatted YYYY-MM-DD.
     * @return {@link Call} of type {@link List} of {@link Launch}.
     */
    @GET("launch/{from}/{to}")
    Call<List<Launch>> getLaunchesBetween(@Path("from") String from, @Path("to") String to);

    /**
     * Get launches after convenient {@link Date} classes.
     * @param from {@link Date} date.
     * @param to {@link Date} to.
     * @return {@link Call} of type {@link List} of {@link Launch}.
     */
    default Call<List<Launch>> getLaunchesBetween(Date from, Date to) {
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
    Call<LaunchStatus> getLaunchStatus(@Path("param") String param);

    /**
     * Function that wraps {@link #getLaunchStatus(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link LaunchStatus}
     */
    default Call<LaunchStatus> getLaunchStatusById(int id) {
        return getLaunchStatus(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getLaunchStatus(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link LaunchStatus}.
     */
    default Call<LaunchStatus> getLaunchStatusByName(String name) {
        return getLaunchStatus(name);
    }

    /*
     *  LOCATION CALLS
     */

    /**
     * Fetch a Location
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link Location}
     */
    @GET("location/{param}")
    Call<Location> getLocation(@Path("param") String param);

    /**
     * Function that wraps {@link #getLocation(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link Location}
     */
    default Call<Location> getLocationById(int id) {
        return getLocation(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getLocation(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link Location}.
     */
    default Call<Location> getLocationByName(String name) {
        return getLocation(name);
    }

    /**
     * Get location by three letter country code the Location's country of origin.
     * @param countryCode {@link String} three letter country code.
     * @return {@link Call} of type {@link List} of {@link Location}.
     */
    @GET("location/")
    Call<List<Location>> getLocationByCountryCode(@Query("countryCode") String countryCode);

    /*
     *  MISSION CALLS
     */

    /**
     * Fetch a Mission
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link Mission}
     */
    @GET("mission/{param}")
    Call<Mission> getMission(@Path("param") String param);

    /**
     * Function that wraps {@link #getMission(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link Mission}
     */
    default Call<Mission> getMissionById(int id) {
        return getMission(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getMission(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link Mission}.
     */
    default Call<Mission> getMissionByName(String name) {
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
    Call<MissionType> getMissionType(@Path("param") String param);

    /**
     * Function that wraps {@link #getMissionType(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link MissionType}
     */
    default Call<MissionType> getMissionTypeById(int id) {
        return getMissionType(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getMissionType(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link MissionType}.
     */
    default Call<MissionType> getMissionTypeByName(String name) {
        return getMissionType(name);
    }

    /*
     *  PAD CALLS
     */

    /**
     * Fetch a Pad
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link Pad}
     */
    @GET("pad/{param}")
    Call<Pad> getPad(@Path("param") String param);

    /**
     * Function that wraps {@link #getPad(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link Pad}
     */
    default Call<Pad> getPadById(int id) {
        return getPad(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getPad(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link Pad}.
     */
    default Call<Pad> getPadByName(String name) {
        return getPad(name);
    }

    /**
     * Get pad by {@link Location}'s id.
     * @param locationId {@link Integer} id.
     * @return {@link Call} of type {@link Pad}.
     */
    @GET("pad/")
    Call<Pad> getPadByLocationId(@Query("locationid") int locationId);

    /**
     * Get pad by passing a {@link Location}.
     * @param location {@link Location} location.
     * @return {@link Call} of type {@link Pad}.
     */
    default Call<Pad> getPadByLocation(Location location) {
        return getPadByLocationId(location.getId());
    }

    /*
     *  ROCKET CALLS
     */

    /**
     * Fetch a Rocket
     * @param param ambiguous parameter, could be id, abbreviation or name
     * @return {@link Call} of type {@link Rocket}
     */
    @GET("rocket/{param}")
    Call<Rocket> getRocket(@Path("param") String param);

    /**
     * Function that wraps {@link #getRocket(String)} providing ease of use.
     * @param id {@link Integer} id
     * @return {@link Call} of type {@link Rocket}
     */
    default Call<Rocket> getRocketById(int id) {
        return getRocket(String.valueOf(id));
    }

    /**
     * Function that wraps {@link #getRocket(String)} providing ease of use.
     * @param name {@link String} name.
     * @return {@link Call} of type {@link Rocket}.
     */
    default Call<Rocket> getRocketByName(String name) {
        return getRocket(name);
    }

    /*
     *  ROCKET FAMILY CALLS
     */

    /**
     * Get a rocket family by passing their id.
     * @param id {@link Integer} id.
     * @return {@link Call} of type {@link RocketFamily}.
     */
    @GET("rocketfamily/{id}")
    Call<RocketFamily> getRocketFamilyById(@Path("id") int id);
}
