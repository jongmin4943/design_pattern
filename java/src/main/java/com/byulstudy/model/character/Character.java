package com.byulstudy.model.character;

import com.byulstudy.model.common.ExperiencePoint;
import com.byulstudy.model.common.HealthPoint;
import com.byulstudy.model.common.Level;
import com.byulstudy.model.common.Name;

public class Character {
    private static final int INIT_HP = 100;
    private final Name name;

    private Level level;
    private ExperiencePoint exp;
    private HealthPoint hp;
    private CharacterStatus characterStatus;

    public Character(final String name) {
        this.name = new Name(name);
        this.level = Level.init();
        this.exp = ExperiencePoint.init();
        this.hp = HealthPoint.of(INIT_HP);
        this.characterStatus = CharacterStatus.ALIVE;
    }

    public boolean isAlive() {
        return characterStatus.isAlive();
    }
}
