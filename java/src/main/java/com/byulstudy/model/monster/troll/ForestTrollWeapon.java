package com.byulstudy.model.monster.troll;

import com.byulstudy.model.item.weapon.Weapon;

public class ForestTrollWeapon extends Weapon {
    private static final String WEAPON_NAME = "거대 몽둥이";

    public ForestTrollWeapon() {
        super(WEAPON_NAME);
    }

    @Override
    public int getDamage() {
        return 5;
    }

    @Override
    public int getCriticalProbability() {
        return 10;
    }
}
