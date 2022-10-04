package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.item.armor.Armor;
import com.byulstudy.utils.RandomUtils;

public class OgreArmor extends Armor {
    public static final String ARMOR_NAME = "단단한 갑옷";
    private static final int MINIMUM_DAMAGE = 0;
    private static final int PROBABILITY = 10;
    public static final int ARMOR = 3;

    public OgreArmor() {
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
