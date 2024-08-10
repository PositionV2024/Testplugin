package com.clarence.test;

public enum Permission {

    FLY_USE ("fly.use"),
    TURN_FLY_OFF("fly.use.off"),
    SET_OTHER_FLY("fly.use.set");

    private String name;
    Permission(String name) { this.name = name; }

    public String getName() { return name; }

}
