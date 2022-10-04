package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.item.weapon.Weapon;
import com.byulstudy.utils.RandomUtils;

public class GoblinWeapon extends Weapon {
    private static final String WEAPON_NAME = "몽둥이";
    private static final int ATTACK_STRENGTH = 1;
    private static final int PROBABILITY = 60;

    public GoblinWeapon() {
        super(WEAPON_NAME);
    }

    @Override
    public int attack() {
        if(RandomUtils.getBooleanByPercentage(PROBABILITY)) {
            return 0;
        }
        return ATTACK_STRENGTH;
    }
}
