package com.hhy.server.log;

public class LoggerName {

    public static String FILE = "File";

    public static String CONSOLE = "Console";

    public static String auto() {
        return Boolean.parseBoolean(System.getProperty("serverMode")) ? FILE : CONSOLE;
    }
}
