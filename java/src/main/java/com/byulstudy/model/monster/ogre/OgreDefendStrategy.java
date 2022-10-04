package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.common.DefendStrategy;
import com.byulstudy.utils.RandomUtils;

public class OgreDefendStrategy implements DefendStrategy {
    private static final int MINIMUM_DAMAGE = 0;
    private static final int PROBABILITY = 10;
    public static final int ARMOR = 3;

    @Override
    public int defend(final int damage) {
        if(RandomUtils.getBooleanByPercentage(PROBABILITY)) {
            return MINIMUM_DAMAGE;
        }
        return damage - RandomUtils.getNumberInRange(0, ARMOR);
    }
}
