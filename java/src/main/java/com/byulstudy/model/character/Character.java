package com.byulstudy.model.character;

import com.byulstudy.model.common.Creature;
import com.byulstudy.model.item.armor.DefaultArmor;
import com.byulstudy.model.item.weapon.DefaultWeapon;

public class Character extends Creature {
    private static final int INIT_HP = 100;
    private Level level;
    private ExperiencePoint exp;

    public Character(final String name) {
        super(name, INIT_HP);
        this.level = Level.init();
        this.exp = ExperiencePoint.init();
        this.weapon = new DefaultWeapon();
        this.armor = new DefaultArmor();
    }

    public boolean isLevelMax() {
        return this.level.isMax();
    }

    @Override
    public String getName() {
        return this.name.toString();
    }
}
