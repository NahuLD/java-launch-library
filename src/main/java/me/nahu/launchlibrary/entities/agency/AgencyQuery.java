package me.nahu.launchlibrary.entities.agency;

import me.nahu.launchlibrary.entities.Query;
import me.nahu.launchlibrary.entities.SourceableEntity;
import me.nahu.launchlibrary.util.Utils;

import java.util.List;

/**
 * Agency entity class.
 * {@code https://launchlibrary.net/docs/1.4/api.html#agency} for more information.
 */
public class AgencyQuery extends Query {
    private List<Agency> agencies;

    /**
     * API forces us to list all queries.
     * @return {@link List} of type {@link Agency}
     */
    public List<Agency> getAgencies() {
        return agencies;
    }

    public static class Agency extends SourceableEntity {
        private String abbrev;
        private int type;

        private String countryCode;

        /*
            0 = no
            1 = yes
         */
        private int islsp;

        /**
         * Abbreviated {@link Agency}'s name.
         * @return {@link String} abbreviation of the {@link Agency}'s name.
         */
        public String getAbbreviation() {
            return abbrev;
        }

        /**
         * Integer as the {@link Agency} type. You can query the type using {@link AgencyType}, look into it for more information.
         * @return {@link Integer} {@link AgencyType} type.
         */
        public int getType() {
            return type;
        }

        /**
         * Abbreviation of the {@link Agency}'s country.
         * @return {@link String} abbreviation.
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Check if the {@link Agency} provides the service of rocket launches.
         * @return {@link Boolean} is the {@link Agency} a launch service provider.
         */
        public boolean isLaunchServiceProvider() {
            return Utils.getBoolean(islsp);
        }
    }
}
