package com.byulstudy.model.battlefield;

import com.byulstudy.model.monster.Monster;
import com.byulstudy.model.monster.MonsterType;
import com.byulstudy.model.monster.goblin.ForestGoblin;
import com.byulstudy.model.monster.ogre.ForestOgre;
import com.byulstudy.model.monster.troll.ForestTroll;

public class Forest extends Battlefield {

    public static final String FIELD_NAME = "숲";
    @Override
    protected Monster generateMonster(final MonsterType monsterType) {
        if(monsterType.isGoblin()) {
            return new ForestGoblin();
        } else if (monsterType.isOgre()) {
            return new ForestOgre();
        } else if (monsterType.isTroll()) {
            return new ForestTroll();
        }
        throw new IllegalArgumentException("존재하지 않는 몬스터 타입입니다. " + monsterType.getName());
    }
}
