package com.byulstudy.model.battlefield;

import com.byulstudy.model.character.Character;
import com.byulstudy.model.common.ExperiencePoint;
import com.byulstudy.model.monster.Monster;
import com.byulstudy.model.monster.MonsterExperiencePoint;
import com.byulstudy.model.monster.MonsterType;
import com.byulstudy.model.monster.goblin.ForestGoblin;
import com.byulstudy.model.monster.ogre.ForestOgre;
import com.byulstudy.model.monster.troll.ForestTroll;

public class Forest extends Battlefield {

    public static final String FIELD_NAME = "숲";
    public static final int FIELD_EXP = 10;

    public Forest(final Character character) {
        super(character);
    }

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

    @Override
    public String getFieldName() {
        return FIELD_NAME;
    }

    @Override
    public ExperiencePoint getFieldExtraExp() {
        return new MonsterExperiencePoint(FIELD_EXP);
    }
}
