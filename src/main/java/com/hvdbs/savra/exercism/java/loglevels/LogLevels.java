package com.hvdbs.savra.exercism.java.loglevels;

public class LogLevels {
    private static final java.util.regex.Pattern p = java.util.regex.Pattern.compile("^(\\[(ERROR|WARNING|INFO)]):\\s+");

    public static String message(String logLine) {
        return logLine.replaceAll(p.pattern(), "").trim();
    }

    public static String logLevel(String logLine) {
        java.util.regex.Matcher m = p.matcher(logLine);

        return m.find() ? m.group(2).toLowerCase() : "";
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
