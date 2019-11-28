package me.nahu.launchlibrary.entities.launch;

import me.nahu.launchlibrary.entities.Query;
import me.nahu.launchlibrary.entities.SourceableEntity;
import me.nahu.launchlibrary.entities.agency.AgencyQuery;
import me.nahu.launchlibrary.entities.location.LocationQuery;
import me.nahu.launchlibrary.entities.mission.MissionQuery;
import me.nahu.launchlibrary.entities.rocket.RocketQuery;
import me.nahu.launchlibrary.util.Utils;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 * Launch entity class.
 * {@code https://launchlibrary.net/docs/1.4/api.html#launch} for more information.
 */
public class LaunchQuery extends Query {
    private List<Launch> launches;

    /**
     * API forces us to list all queries.
     * @return {@link List} of type {@link LaunchQuery.Launch}
     */
    public List<Launch> getLaunches() {
        return launches;
    }

    public static class Launch extends SourceableEntity {
        private String net;

        private int tbddate;
        private int tbdtime;

        private int status;
        private int inhold;

        private String windowstart;
        private String windowend;

        private String isostart;
        private String isoend;
        private String isonet;

        private long wsstamp;
        private long westamp;
        private long netstamp;

        private String vidURL;
        private List<String> vidURLs;

        private String holdreason;
        private String failreason;

        private int probability;

        private String hashtag;

        private AgencyQuery.Agency lsp;

        private LocationQuery location;
        private RocketQuery.Rocket rocket;

        private List<MissionQuery.Mission> missions;

        /**
         * Check whether the date is determined or not.
         * @return {@link Boolean} determined.
         */
        public boolean isDateDetermined() {
            return !Utils.getBoolean(tbddate);
        }

        /**
         * Check whether the time is determined or not.
         * @return {@link Boolean} determined.
         */
        public boolean isTimeDetermined() {
            return !Utils.getBoolean(tbdtime);
        }

        /**
         * Get the status for this {@link Launch}.
         * @return {@link Status} status.
         */
        public Status getStatus() {
            return Stream.of(Status.values()).filter(id -> status == id.getId()).findFirst().orElse(Status.GREEN);
        }

        /**
         * Check if the {@link Launch} is set in hold.
         * Deprecated, please use {@link this.getStatus()}.
         * @return {@link Boolean} in hold.
         */
        @Deprecated
        public boolean isInHold() {
            return Utils.getBoolean(inhold);
        }

        /**
         * Get the window start formatted in a convenient text.
         * @return {@link String} window start text (formatted as Month, dd, yyyy hh24:mi:ss UTC).
         */
        public String getWindowStartText() {
            return windowstart;
        }

        /**
         * Get the window end formatted in a convenient text.
         * @return {@link String} window end text (formatted as Month, dd, yyyy hh24:mi:ss UTC).
         */
        public String getWindowEndText() {
            return windowend;
        }

        /**
         * Get scheduled date for the net of the {@link Launch}.
         * @return {@link String} (formatted as Month, dd, yyyy hh24:mi:ss UTC)
         */
        public String getNetText() {
            return net;
        }

        /**
         * Get the ISO start.
         * @return {@link String} iso start.
         */
        public String getIsoStart() {
            return isostart;
        }

        /**
         * Get the ISO end.
         * @return {@link String} iso end.
         */
        public String getIsoEnd() {
            return isoend;
        }

        /**
         * Get the ISO net.
         * @return {@link String} iso net.
         */
        public String getIsoNet() {
            return isonet;
        }

        /**
         * Get the window start in a convenient timestamp.
         * @return {@link Long} timestamp.
         */
        public long getWindowStartTimestamp() {
            return wsstamp;
        }


        /**
         * Get the window end in a convenient timestamp.
         * @return {@link Long} timestamp.
         */
        public long getWindowEndTimestamp() {
            return wsstamp;
        }
        /**
         * Get the net in a convenient timestamp.
         * @return {@link Long} timestamp.
         */
        public long getNetTimestamp() {
            return wsstamp;
        }

        /**
         * Get the window start in a convenient to use {@link Date}.
         * @return {@link Date} with the window start.
         */
        public Date getWindowStart() {
            return Date.from(Instant.ofEpochSecond(getWindowStartTimestamp()));
        }

        /**
         * Get the window end in a convenient to use {@link Date}.
         * @return {@link Date} with the window end.
         */
        public Date getWindowEnd() {
            return Date.from(Instant.ofEpochSecond(getWindowEndTimestamp()));
        }

        /**
         * Get the net in a convenient to use {@link Date}.
         * @return {@link Date} with the net.
         */
        public Date getNet() {
            return Date.from(Instant.ofEpochSecond(getNetTimestamp()));
        }

        /**
         * Get a link for the live streaming/recap of the {@link Launch}.
         * Please consider this method is being discontinued in future released and it should be avoided.
         * @return {@link String} video url.
         */
        @Deprecated
        public String getVideoUrl() {
            return vidURL;
        }

        /**
         * Get an array of links with live streaming/recaps of the {@link Launch}.
         * @return {@link List<String>} video urls.
         */
        public List<String> getVidUrls() {
            return vidURLs;
        }

        /**
         * Will return a reason if the {@link Launch} has been put on hold.
         * @return {@link String} reason.
         */
        public String getHoldReason() {
            return holdreason;
        }

        /**
         * Will return a reason if the {@link Launch} has been cancelled.
         * @return {@link String} fail.
         */
        public String getFailReason() {
            return failreason;
        }

        /**
         * Get the probability for the {@link Launch} to take place.
         * It will be '-1' if unknown.
         * @return {@link Integer} probability, from 0% to 100%
         */
        public int getProbability() {
            return probability;
        }

        /**
         * Get the Twitter hashtag for this {@link Launch}.
         * @return {@link String} hashtag.
         */
        public String getHashtag() {
            return hashtag;
        }

        /**
         * Get the launch service provider that is hosting this {@link Launch}.
         * @return {@link AgencyQuery.Agency} launch service provider.
         */
        public AgencyQuery.Agency getLaunchServiceProvider() {
            return lsp;
        }

        /**
         * Get the {@link LocationQuery} where this {@link Launch} is taking place.
         * @return {@link LocationQuery} location.
         */
        public LocationQuery getLocation() {
            return location;
        }

        /**
         * Get the {@link RocketQuery.Rocket} that is performing this {@link MissionQuery.Mission}.
         * @return {@link RocketQuery.Rocket} rocket.
         */
        public RocketQuery.Rocket getRocket() {
            return rocket;
        }

        /**
         * Get the array of {@link MissionQuery.Mission} for this {@link Launch}.
         * @return {@link List<MissionQuery.Mission>} missions.
         */
        public List<MissionQuery.Mission> getMissions() {
            return missions;
        }

        enum Status {
            GREEN(0),
            RED(1),
            SUCCESS(2),
            FAILED(3);

            private int id;

            Status(int id) {
                this.id = id;
            }

            public int getId() {
                return id;
            }
        }
    }
}
