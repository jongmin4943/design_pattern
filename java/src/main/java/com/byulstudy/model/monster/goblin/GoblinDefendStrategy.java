package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.common.DefendStrategy;
import com.byulstudy.utils.RandomUtils;

public class GoblinDefendStrategy implements DefendStrategy {

    private static final int MINIMUM_DAMAGE = 0;
    private static final int PROBABILITY = 10;
    public static final int ARMOR = 2;

    @Override
    public int defend(final int damage) {
        if(RandomUtils.getBooleanByPercentage(PROBABILITY)) {
            return MINIMUM_DAMAGE;
        }
        return damage - RandomUtils.getNumberInRange(0, ARMOR);
    }
}
