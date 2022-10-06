package com.byulstudy.model.monster;

import lombok.Getter;

@Getter
public enum MonsterType {
    GOBLIN("고블린",10,10),
    OGRE("오우거",20,20),
    TROLL("트롤",50,40);

    private final String name;
    private final int exp;
    private final int hp;

    MonsterType(final String name, final int exp, final int hp) {
        this.name = name;
        this.exp = exp;
        this.hp = hp;
    }

    public boolean isGoblin() {
        return this.equals(GOBLIN);
    }
    public boolean isOgre() {
        return this.equals(OGRE);
    }
    public boolean isTroll() {
        return this.equals(TROLL);
    }
}
