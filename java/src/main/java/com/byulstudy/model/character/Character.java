package com.byulstudy.model.character;

import com.byulstudy.model.common.ExperiencePoint;
import com.byulstudy.model.common.HealthPoint;
import com.byulstudy.model.common.Level;
import com.byulstudy.model.common.Name;

public abstract class Character {
    private final Name name;
    private Level level;
    private ExperiencePoint exp;
    private HealthPoint hp;
    private CharacterStatus characterStatus;

    public Character(String name) {
        this.name = new Name(name);
        this.level = Level.init();
        this.exp = ExperiencePoint.init();
        this.hp = HealthPoint.init();
        this.characterStatus = CharacterStatus.ALIVE;
    }
}
