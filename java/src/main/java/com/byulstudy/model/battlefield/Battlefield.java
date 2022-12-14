package com.byulstudy.model.battlefield;

import com.byulstudy.model.character.Character;
import com.byulstudy.model.common.ExperiencePoint;
import com.byulstudy.model.item.Item;
import com.byulstudy.model.monster.Monster;
import com.byulstudy.model.monster.MonsterType;

public abstract class Battlefield {
    private final Character character;
    private Monster monster;

    public Battlefield(final Character character) {
        this.character = character;
    }

    public BattleResult fight(MonsterType monsterType) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        monster = this.generateMonster(monsterType);
        BattleResult battleResult = new BattleResult(character, monster);
        int damagePoint;
        while (true) {
            if (defeated()) break;
            damagePoint = monster.defend(character.attack());
            battleResult.addStory(new BattleStory(character.getName(), monster.getName(), damagePoint, monster.getHp()));
            if (defeated()) break;
            damagePoint = character.defend(monster.attack());
            battleResult.addStory(new BattleStory(monster.getName(), character.getName(), damagePoint, character.getHp()));
        }
        if(battleResult.isWinnerCharacter()) {
            ExperiencePoint exp = monster.getExp(this);
            boolean isLevelUp = character.gainExp(exp);
            if(monster.hasItem()) {
                Item item = monster.getItem();
                character.gainItem(item);
                battleResult.gainedItem(item);
            }
            battleResult.gainedExp(exp);
            battleResult.levelUp(isLevelUp);
        }
        return battleResult;
    }

    private boolean defeated() {
        return monster.isDie() || character.isDie();
    }

    protected abstract Monster generateMonster(final MonsterType monsterType);
    public abstract String getFieldName();
    public abstract ExperiencePoint getFieldExtraExp();
}
