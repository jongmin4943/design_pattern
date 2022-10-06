package com.byulstudy.model.battlefield;

import com.byulstudy.model.character.Character;
import com.byulstudy.model.monster.Monster;
import com.byulstudy.model.monster.MonsterType;
import com.byulstudy.model.monster.goblin.DungeonGoblin;
import com.byulstudy.model.monster.ogre.DungeonOgre;
import com.byulstudy.model.monster.troll.DungeonTroll;

public class Dungeon extends Battlefield {
    public static final String FIELD_NAME = "던전";

    public Dungeon(final Character character) {
        super(character);
    }

    @Override
    protected Monster generateMonster(final MonsterType monsterType) {
        if(monsterType.isGoblin()) {
            return new DungeonGoblin();
        } else if (monsterType.isOgre()) {
            return new DungeonOgre();
        } else if (monsterType.isTroll()) {
            return new DungeonTroll();
        }
        throw new IllegalArgumentException("존재하지 않는 몬스터 타입입니다. " + monsterType.getName());
    }
}
