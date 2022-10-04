package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.item.weapon.Weapon;
import com.byulstudy.utils.RandomUtils;

public class OgreWeapon extends Weapon {
    private static final String WEAPON_NAME = "단단한 몽둥이";
    private static final int ATTACK_STRENGTH = 3;
    private static final int PROBABILITY = 50;

    public OgreWeapon() {
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
