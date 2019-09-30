package me.nahu.launchlibrary.util;

public class Utils {
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36";
    /*
        0 = false
        1+ = true
     */
    public static boolean getBoolean(int binary) {
        return binary != 0;
    }
}
