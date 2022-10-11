package com.byulstudy.model.battlePhase;

public enum Step {
    STANDBY, STORY, HEAL, CHANGE_WEAPON, EXIT, MOVE_FOREST, MOVE_DUNGEON, MOVE_RANDOM, BACK, BATTLE, ATTACK, TALK, RUN;

    public Step next() {
        if (isStandby()) {
            return STORY;
        }
        if (isStory()) {
            return BATTLE;
        }
        return this;
    }


    public Step previous() {
        if (isBattle()) {
            return STORY;
        }
        if (isStory()) {
            return STANDBY;
        }
        return this;
    }
    public boolean isStandby() {
        return this.equals(STANDBY);
    }
    public boolean isStory() {
        return this.equals(STORY);
    }
    public boolean isHeal() {
        return this.equals(HEAL);
    }
    public boolean isChangeWeapon() {
        return this.equals(CHANGE_WEAPON);
    }
    public boolean isNotExit() {
        return !this.equals(EXIT);
    }
    public boolean isMoveForest() {
        return this.equals(MOVE_FOREST);
    }
    public boolean isMoveDungeon() {
        return this.equals(MOVE_DUNGEON);
    }
    public boolean isMoveRandom() {
        return this.equals(MOVE_RANDOM);
    }
    public boolean isBack() {
        return this.equals(BACK);
    }
    public boolean isBattle() {
        return this.equals(BATTLE);
    }
    public boolean isAttack() {
        return this.equals(ATTACK);
    }
    public boolean isTalk() {
        return this.equals(TALK);
    }
    public boolean isRun() {
        return this.equals(RUN);
    }

}
