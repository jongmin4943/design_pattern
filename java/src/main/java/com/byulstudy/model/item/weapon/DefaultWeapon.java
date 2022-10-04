package com.byulstudy.model.item.weapon;

import com.byulstudy.utils.RandomUtils;

public class DefaultWeapon extends Weapon {
    private static final String DEFAULT_WEAPON_NAME = "주먹";
    private static final int MINIMUM_DAMAGE = 1;
    private static final int MAXIMUM_DAMAGE = 2;
    public static final int CRITICAL_PROBABILITY = 10;

    public DefaultWeapon() {
        super(DEFAULT_WEAPON_NAME);
    }

    @Override
    public int attack() {
        int attackDamage = RandomUtils.getNumberInRange(MINIMUM_DAMAGE, MAXIMUM_DAMAGE + 1);
        if(RandomUtils.getBooleanByPercentage(CRITICAL_PROBABILITY))
            return attackDamage * 2;
        return attackDamage;
    }
}
