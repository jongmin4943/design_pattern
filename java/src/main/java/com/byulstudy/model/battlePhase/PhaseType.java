package com.byulstudy.model.battlePhase;

public enum PhaseType {
    STANDBY, STORY, BATTLE;

    public boolean isStandby() {
        return this.equals(STANDBY);
    }

    public boolean isStory() {
        return this.equals(STORY);
    }

    public boolean isBattle() {
        return this.equals(BATTLE);
    }
}
