package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.common.AttackStrategy;
import com.byulstudy.utils.RandomUtils;

public class OgreAttackStrategy implements AttackStrategy {
    private static final int ATTACK_STRENGTH = 3;
    private static final int PROBABILITY = 50;

    @Override
    public int attack() {
        if(RandomUtils.getBooleanByPercentage(PROBABILITY)) {
            return 0;
        }
        return ATTACK_STRENGTH;
    }
}
