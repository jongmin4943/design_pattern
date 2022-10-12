package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.item.weapon.Weapon;

public class DungeonOgreWeapon extends Weapon {
    private static final String WEAPON_NAME = "가시박힌 몽둥이";

    public DungeonOgreWeapon() {
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
