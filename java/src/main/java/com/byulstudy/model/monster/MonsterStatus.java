package com.byulstudy.model.monster;

public enum MonsterStatus {
    ALIVE, DIE;

    public boolean isAlive() {
        return this.equals(ALIVE);
    }

    public boolean isDie() {
        return this.equals(DIE);
    }

}
