package com.clarence.test;

import org.bukkit.plugin.java.JavaPlugin;

public class Testplugin extends JavaPlugin {
    @Override
    public void onEnable(){
        new Configuration(this);
        getCommand("fly").setExecutor(new Flycmd(this));
    }
}
