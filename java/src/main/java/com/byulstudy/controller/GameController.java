package com.byulstudy.controller;

import com.byulstudy.model.character.Character;
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
            startStory();
        }
        output.printEnd();
    }

    private void initGame() {
        output.printStart();
        String name = input.getInput();
        this.character = new Character(name);
        output.printStory(name);
    }

    private boolean canContinue() {
        return this.character.isAlive() || this.character.isLevelMax();
    }

    private void startStory() {
        System.out.println("사냥 ㄱ");
    }

}
