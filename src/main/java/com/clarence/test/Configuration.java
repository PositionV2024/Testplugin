package com.clarence.test;

public class Configuration {
    private static final String classPrefix = "[Configuration]";

    private final Testplugin testplugin;

    Configuration(Testplugin testplugin) {
        this.testplugin = testplugin;
        if (testplugin == null) {
            System.out.println(classPrefix + " Can't hook onto " + testplugin.getName());
            return;
        }
        testplugin.getConfig().options().copyDefaults();
        testplugin.saveDefaultConfig();

        System.out.println(classPrefix + " class has successfully hook onto " + testplugin.getName());

        Errors.setErrorColor(testplugin.getConfig().getString("SET_ERROR_COLOR"));
        Errors.setNoPermission(testplugin.getConfig().getString("NO_PERMISSION_ERROR_MESSAGE"));
        Errors.setNoTargetFound(testplugin.getConfig().getString("NO_TARGET_FOUND"));
        Errors.setInvalidNumber(testplugin.getConfig().getString("INVALID_NUMBER"));
        Errors.setPlayerNotFlying(testplugin.getConfig().getString("PLAYER_NOT_FLYING"));
        Util.setPluginPrefixColor(testplugin.getConfig().getString("PLUGIN_PREFIX_COLOR"));
    }
}
