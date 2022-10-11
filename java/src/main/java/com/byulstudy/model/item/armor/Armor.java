package com.byulstudy.model.item.armor;

import com.byulstudy.model.common.Defendable;
import com.byulstudy.model.item.Item;
import com.byulstudy.model.item.ItemType;
import com.byulstudy.utils.RandomUtils;

import static com.byulstudy.model.item.ItemType.ARMOR;

public abstract class Armor extends Item implements Defendable {
    public Armor(final String name) {
        super(name, ARMOR);
    }

    public abstract int getDefense();
    public abstract int getDodgeProbability();

    @Override
    public int defend(int damage) {
        if(RandomUtils.getBooleanByPercentage(this.getDodgeProbability())) {
            return 0;
        }
        int totalDamage = damage - this.getDefense();
        return Math.max(totalDamage, 0);
    }
}
