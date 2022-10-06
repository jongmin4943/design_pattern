package com.byulstudy.model.battlefield;

import com.byulstudy.model.character.Character;
import com.byulstudy.model.monster.Monster;


public class BattleResult {

    private final Character character;
    private final Monster monster;

    private BattleStories battleStories;

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
}
