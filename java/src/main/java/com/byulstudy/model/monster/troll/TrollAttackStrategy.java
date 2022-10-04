package com.byulstudy.model.monster.troll;

import com.byulstudy.model.common.AttackStrategy;
import com.byulstudy.utils.RandomUtils;

public class TrollAttackStrategy implements AttackStrategy {
    private static final int ATTACK_STRENGTH = 5;
    private static final int PROBABILITY = 40;

    @Override
    public int attack() {
        if(RandomUtils.getBooleanByPercentage(PROBABILITY)) {
            return 0;
        }
        return ATTACK_STRENGTH;
    }
}
