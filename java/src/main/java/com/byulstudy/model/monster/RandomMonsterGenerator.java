package com.byulstudy.model.monster;

import com.byulstudy.utils.RandomUtils;

public class RandomMonsterGenerator {
    public static MonsterType generate() {
        int number = RandomUtils.getNumberInRange(0, 10);
        if(0 <= number && number <8) {
            return MonsterType.GOBLIN;
        } else if (8 <= number && number < 10) {
            return MonsterType.OGRE;
        }
        return MonsterType.TROLL;
    }
}
