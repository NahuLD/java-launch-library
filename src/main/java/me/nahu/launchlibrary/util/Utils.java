package me.nahu.launchlibrary.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Utils {
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36";

    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    /*
        0 = false
        1+ = true
     */
    public static boolean getBoolean(int binary) {
        return binary != 0;
    }
}
