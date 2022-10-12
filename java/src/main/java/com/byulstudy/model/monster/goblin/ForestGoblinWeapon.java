package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.item.weapon.Weapon;

public class ForestGoblinWeapon extends Weapon {
    private static final String WEAPON_NAME = "몽둥이";

    public ForestGoblinWeapon() {
        super(WEAPON_NAME);
    }

    @Override
    public int getDamage() {
        return 1;
    }

    @Override
    public int getCriticalProbability() {
        return 5;
    }
}
