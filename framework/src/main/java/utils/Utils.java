package utils;

import static java.lang.Thread.sleep;

public class Utils {
    public static void sleep(int seconds)
            throws Exception {
        try {
            Thread.sleep(seconds);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }    }
}
