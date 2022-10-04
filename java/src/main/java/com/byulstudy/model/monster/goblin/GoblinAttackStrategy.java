package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.common.AttackStrategy;
import com.byulstudy.utils.RandomUtils;

public class GoblinAttackStrategy implements AttackStrategy {
    private static final int ATTACK_STRENGTH = 1;
    private static final int PROBABILITY = 60;

    @Override
    public int attack() {
        if(RandomUtils.getBooleanByPercentage(PROBABILITY)) {
            return 0;
        }
        return ATTACK_STRENGTH;
    }
}
