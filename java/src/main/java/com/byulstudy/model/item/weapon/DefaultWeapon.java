package com.byulstudy.model.item.weapon;

import com.byulstudy.utils.RandomUtils;

public class DefaultWeapon extends Weapon {
    private static final String DEFAULT_WEAPON_NAME = "주먹";
    private static final int MINIMUM_DAMAGE = 1;
    private static final int MAXIMUM_DAMAGE = 2;

    public DefaultWeapon() {
        super(DEFAULT_WEAPON_NAME);
    }
    @Override
    public int getDamage() {
        return RandomUtils.getNumberInRange(MINIMUM_DAMAGE, MAXIMUM_DAMAGE + 1);
    }

    @Override
    public int getCriticalProbability() {
        return 5;
    }
}
