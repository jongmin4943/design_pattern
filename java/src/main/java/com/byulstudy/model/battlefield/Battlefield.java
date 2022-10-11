package com.byulstudy.model.battlefield;

import com.byulstudy.model.character.Character;
import com.byulstudy.model.monster.Monster;
import com.byulstudy.model.monster.MonsterType;
import com.byulstudy.utils.RandomUtils;

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
        return battleResult;
    }

    private boolean defeated() {
        return monster.isDie() || character.isDie();
    }

    protected abstract Monster generateMonster(final MonsterType monsterType);
    public abstract String getFieldName();

    public boolean run() {
        boolean runProbability = RandomUtils.getBooleanByPercentage(30);
        // TODO 도망 액션
        return runProbability;
    }
}
