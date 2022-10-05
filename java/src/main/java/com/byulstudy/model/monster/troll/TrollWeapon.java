package com.byulstudy.model.monster.troll;

import com.byulstudy.model.item.weapon.Weapon;

public class TrollWeapon extends Weapon {
    private static final String WEAPON_NAME = "거대 몽둥이";

    public TrollWeapon() {
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
