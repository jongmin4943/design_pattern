package com.byulstudy.model.common;

public enum CreatureStatus {
    ALIVE, DIE;

    public boolean isAlive() {
        return this.equals(ALIVE);
    }

    public boolean isDie() {
        return this.equals(DIE);
    }


}
