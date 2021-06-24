package com.github.gabrielpadilh4;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Logger {

    private static SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");

    public static void info(String message) {
        System.out.println("[INFO] " + sdf.format(new Date()) + " -> " + message);
    }

    public static void error(String message) {
        System.out.println("[ERROR] " + sdf.format(new Date()) + " -> " + message);
    }
}
