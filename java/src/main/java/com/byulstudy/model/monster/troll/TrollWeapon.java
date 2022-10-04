package com.byulstudy.model.monster.troll;

import com.byulstudy.model.item.weapon.Weapon;
import com.byulstudy.utils.RandomUtils;

public class TrollWeapon extends Weapon {
    private static final String WEAPON_NAME = "거대 몽둥이";
    private static final int ATTACK_STRENGTH = 5;
    private static final int PROBABILITY = 40;

    public TrollWeapon() {
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
