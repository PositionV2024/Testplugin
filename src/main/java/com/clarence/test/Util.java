package com.clarence.test;

import net.md_5.bungee.api.ChatColor;

public class Util {
    private static String PluginPrefix = "[Fly]";
    private static String PLUGIN_PREFIX_COLOR = "&9";
    public static String getPluginPrefix() { return PluginPrefix; }
    private static String getPluginPrefixColor() { return PLUGIN_PREFIX_COLOR; }
    public static void setPluginPrefixColor(String _PluginPrefixColor) { PLUGIN_PREFIX_COLOR = _PluginPrefixColor; }
    public static String Color(String message) { return ChatColor.translateAlternateColorCodes('&',  message); }
}
