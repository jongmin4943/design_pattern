package com.byulstudy.model.monster.troll;

import com.byulstudy.model.item.armor.Armor;
import com.byulstudy.utils.RandomUtils;

public class TrollArmor extends Armor {
    private static final String ARMOR_NAME = "철제 갑옷";
    private static final int MINIMUM_DAMAGE = 0;
    private static final int PROBABILITY = 10;
    public static final int ARMOR = 5;

    public TrollArmor() {
        super(ARMOR_NAME);
    }

    @Override
    public int defend(final int damage) {
        if(RandomUtils.getBooleanByPercentage(PROBABILITY)) {
            return MINIMUM_DAMAGE;
        }
        return damage - RandomUtils.getNumberInRange(0, ARMOR);
    }
}
