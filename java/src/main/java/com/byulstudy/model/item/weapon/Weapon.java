package com.byulstudy.model.item.weapon;

import com.byulstudy.model.common.Attackable;
import com.byulstudy.model.item.Item;
import com.byulstudy.model.item.ItemType;
import com.byulstudy.utils.RandomUtils;

import static com.byulstudy.model.item.ItemType.WEAPON;

public abstract class Weapon extends Item implements Attackable {
    public Weapon(final String name) {
        super(name, WEAPON);
    }

    @Override
    public int attack() {
        if(RandomUtils.getBooleanByPercentage(this.getCriticalProbability())) {
            return this.getDamage() * 2;
        }
        return this.getDamage();
    }

    public abstract int getDamage();
    public abstract int getCriticalProbability();
}
