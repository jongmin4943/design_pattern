package com.byulstudy.model.monster;

import com.byulstudy.utils.RandomUtils;

public class RandomMonsterGenerator {
    public static MonsterType generate() {
        int number = RandomUtils.getNumberInRange(0, 1000);
        if(0 <= number && number <855) {
            return MonsterType.GOBLIN;
        } else if (855 <= number && number < 975) {
            return MonsterType.OGRE;
        }
        return MonsterType.TROLL;
    }
}
