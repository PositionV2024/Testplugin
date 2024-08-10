package com.clarence.test;

public class Errors {

    private static String ERROR_COLOR = "&7";
    private final static String COMMAND_USAGE = "&7 Command usage: /fly set <player> <amount>\n"+ "&7 Command usage: /fly off <player>";
    private final static String CONFIGURATION_USAGE = "Command usage: /fly config set <message> <new_message>\nCommand usage: /fly config display";

    private static String NO_CONSOLE_USAGE = "You can't use this via console.";
    private static String NO_PERMISSION = "You do not have permission to use this.";
    private static String NO_TARGET_FOUND = "The targeted player does not exist or is offline.";
    private static String INVALID_NUMBER = "You can only set the targeted player's flying speed from 0.0 - 1.0";
    private static String PLAYER_NOT_FLYING = "The targeted player is not flying.";

    public static String getCommandUsage() { return COMMAND_USAGE; }
    public static String getNoPermission() { return NO_PERMISSION; }
    public static String getNoConsoleUsage() { return NO_CONSOLE_USAGE; }
    public static String getNoTargetFound() { return NO_TARGET_FOUND; }
    public static String getErrorColor() { return ERROR_COLOR; }
    public static String getInvalidNumber() { return INVALID_NUMBER; }
    public static String getPlayerNotFlying() { return PLAYER_NOT_FLYING; }
    public static String getConfigurationUsage() { return CONFIGURATION_USAGE; }

    public static void setErrorColor(String _ERROR_COLOR) { ERROR_COLOR = _ERROR_COLOR; }
    public static void setNoPermission(String _NO_PERMISSION) { NO_PERMISSION = _NO_PERMISSION; }
    public static void setNoTargetFound(String _NO_TARGET_FOUND) { NO_TARGET_FOUND = _NO_TARGET_FOUND; }
    public static void setInvalidNumber(String _INVALID_NUMBER) { INVALID_NUMBER = _INVALID_NUMBER; }
    public static void setPlayerNotFlying(String _PLAYER_NOT_FLYING) { PLAYER_NOT_FLYING = _PLAYER_NOT_FLYING; }
}
