package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.item.weapon.Weapon;

public class DungeonGoblinWeapon extends Weapon {
    private static final String WEAPON_NAME = "날카로운 몽둥이";

    public DungeonGoblinWeapon() {
        super(WEAPON_NAME);
    }

    @Override
    public int getDamage() {
        return 2;
    }

    @Override
    public int getCriticalProbability() {
        return 8;
    }
}
