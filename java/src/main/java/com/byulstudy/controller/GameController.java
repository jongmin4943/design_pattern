package com.byulstudy.controller;

import com.byulstudy.model.battlefield.BattleResult;
import com.byulstudy.model.battlefield.Battlefield;
import com.byulstudy.model.battlefield.Forest;
import com.byulstudy.model.character.Character;
import com.byulstudy.model.monster.RandomMonsterGenerator;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

public class GameController {
    private final Input input;
    private final Output output;

    private Character character;

    public GameController() {
        this.input = new Input();
        this.output = new Output();
    }

    public void start() {
        initGame();
        while(canContinue()) {
            output.printStory(startStory());
        }
        endGame();
    }

    private void initGame() {
        output.printAskName();
        String name = input.getInput();
        this.character = new Character(name);
        output.printStart(name);
    }

    private void endGame() {
        output.printEnd();
    }

    private boolean canContinue() {
        return this.character.isAlive() || this.character.isLevelMax();
    }

    private BattleResult startStory() {
        Battlefield battlefield = new Forest(character);
        return battlefield.fight(RandomMonsterGenerator.generate());
    }

}
