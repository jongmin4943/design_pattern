package com.byulstudy.model.character;

public enum CharacterStatus {
    ALIVE, DIE;

    public boolean isAlive() {
        return this.equals(ALIVE);
    }

    public boolean isDie() {
        return this.equals(DIE);
    }

}
