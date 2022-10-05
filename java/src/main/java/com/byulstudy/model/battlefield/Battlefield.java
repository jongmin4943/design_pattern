package com.byulstudy.model.battlefield;

import com.byulstudy.model.character.Character;
import com.byulstudy.model.monster.Monster;
import com.byulstudy.model.monster.MonsterType;

public abstract class Battlefield {
    public void fight(MonsterType monsterType, Character character) {
        Monster monster = generateMonster(monsterType);

        monster.defend(character.attack());
        while(this.canFight(character, monster)) {
            monster.defend(character.attack());
            character.defend(monster.attack());
        }
    }

    private boolean canFight(final Character character, final Monster monster) {
        return monster.isAlive() && character.isAlive();
    }

    protected abstract Monster generateMonster(final MonsterType monsterType);

}
