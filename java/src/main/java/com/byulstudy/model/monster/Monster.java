package com.byulstudy.model.monster;

import com.byulstudy.model.common.ExperiencePoint;
import com.byulstudy.model.common.HealthPoint;
import com.byulstudy.model.common.Name;

public abstract class Monster {
    private final Name name;
    private HealthPoint hp;
    private ExperiencePoint exp;

    public Monster(final String name, final int exp) {
        this.name = new Name(name);
        this.hp = HealthPoint.init();
        this.exp = ExperiencePoint.of(exp);
    }
}
