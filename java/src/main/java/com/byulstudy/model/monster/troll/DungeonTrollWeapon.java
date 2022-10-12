package com.byulstudy.model.monster.troll;

import com.byulstudy.model.item.weapon.Weapon;

public class DungeonTrollWeapon extends Weapon {
    private static final String WEAPON_NAME = "어두운 거대 몽둥이";

    public DungeonTrollWeapon() {
        super(WEAPON_NAME);
    }

    @Override
    public int getDamage() {
        return 12;
    }

    @Override
    public int getCriticalProbability() {
        return 20;
    }
}
