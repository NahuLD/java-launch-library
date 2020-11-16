package me.nahu.launchlibrary.util;

import org.jetbrains.annotations.Nullable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36";

    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    public static final Date FALLBACK_DATE = new Date(0L);

    public static @Nullable Date parseDate(String input) {
        try {
            return DATE_FORMAT.parse(input);
        } catch (ParseException exception) {
            return null;
        }
    }
}
