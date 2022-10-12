package com.byulstudy.model.battlefield;

import com.byulstudy.model.character.Character;
import com.byulstudy.model.character.ExperiencePoint;
import com.byulstudy.model.item.Item;
import com.byulstudy.model.monster.Monster;


public class BattleResult {

    private final Character character;
    private final Monster monster;

    private final BattleStories battleStories;

    private String gainedExp;
    private String gainedItem;
    private boolean levelUp;

    public BattleResult(final Character character, final Monster monster) {
        this.character = character;
        this.monster = monster;
        this.battleStories = new BattleStories();
    }

    public void addStory(BattleStory battleStory) {
        this.battleStories.add(battleStory);
    }

    public String getCharacterName() {
        return this.character.getName();
    }

    public String getMonsterName() {
        return this.monster.getName();
    }

    public BattleStories getBattleStories() {
        return this.battleStories;
    }

    public boolean isWinnerCharacter() {
        return character.isAlive();
    }

    public void gainedExp(final ExperiencePoint exp) {
        this.gainedExp = exp.toString();
    }

    public void gainedItem(final Item item) {
        this.gainedItem = item.getName();
    }

    public void levelUp(final boolean isLevelUp) {
        this.levelUp = isLevelUp;
    }

    public String getGainedExp() {
        return gainedExp;
    }

    public String getGainedItem() {
        return gainedItem;
    }

    public boolean isLevelUp() {
        return levelUp;
    }
}
