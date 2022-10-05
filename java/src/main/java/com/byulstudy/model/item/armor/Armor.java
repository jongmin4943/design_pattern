package com.byulstudy.model.item.armor;

import com.byulstudy.model.common.Defendable;
import com.byulstudy.model.item.Item;
import com.byulstudy.utils.RandomUtils;

public abstract class Armor extends Item implements Defendable {
    public Armor(final String name) {
        super(name);
    }

    public abstract int getDefense();
    public abstract int getDodgeProbability();

    @Override
    public int defend(int damage) {
        if(RandomUtils.getBooleanByPercentage(this.getDodgeProbability())) {
            return 0;
        }
        return damage - this.getDefense();
    }
}
