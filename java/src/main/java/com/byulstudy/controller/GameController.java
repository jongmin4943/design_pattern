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
        while(this.character.isAlive()) {
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

    private void startStory() {
        System.out.println("사냥 ㄱ");
    }

}
