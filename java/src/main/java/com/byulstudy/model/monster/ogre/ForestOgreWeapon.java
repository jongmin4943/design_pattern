package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.item.weapon.Weapon;

public class ForestOgreWeapon extends Weapon {
    private static final String WEAPON_NAME = "단단한 몽둥이";

    public ForestOgreWeapon() {
        super(WEAPON_NAME);
    }

    @Override
    public int getDamage() {
        return 3;
    }

    @Override
    public int getCriticalProbability() {
        return 7;
    }
}
