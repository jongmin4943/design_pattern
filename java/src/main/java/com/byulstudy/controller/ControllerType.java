package com.byulstudy.controller;

public enum ControllerType {
    STANDBY, STORY, BATTLE, EXIT;

    public boolean isStandby() {
        return this.equals(STANDBY);
    }

    public boolean isStory() {
        return this.equals(STORY);
    }

    public boolean isBattle() {
        return this.equals(BATTLE);
    }

    public boolean isExit() {
        return this.equals(EXIT);
    }
}
