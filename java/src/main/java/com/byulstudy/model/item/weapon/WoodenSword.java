package com.byulstudy.model.item.weapon;

import com.byulstudy.utils.RandomUtils;

public class WoodenSword extends WeaponEnhancement {
    private static final String WEAPON_NAME = "목검";
    private static final int MINIMUM_DAMAGE = 2;
    private static final int MAXIMUM_DAMAGE = 3;

    public WoodenSword(Weapon weapon) {
        super(WEAPON_NAME);
        this.weapon = weapon;
    }

    @Override
    public int getDamage() {
        return weapon.getDamage() +
                RandomUtils.getNumberInRange(MINIMUM_DAMAGE, MAXIMUM_DAMAGE + 1);
    }

    @Override
    public int getCriticalProbability() {
        return weapon.getCriticalProbability() + 2;
    }
}
