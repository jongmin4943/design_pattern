package com.byulstudy.application;

import com.byulstudy.controller.FrontController;
import com.byulstudy.model.character.Character;
import com.byulstudy.view.input.ConsoleInput;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.ConsoleOutput;
import com.byulstudy.view.output.Output;

public class RPGGame implements Game {
    private final Input input;
    private final Output output;

    private Character character;
    private FrontController controller;
    private boolean running;

    public RPGGame() {
        this.input = ConsoleInput.getInstance();
        this.output = ConsoleOutput.getInstance();
    }

    @Override
    public void start() {
        initGame();
        while (canContinue()) {
            processPhase();
        }
        endGame();
        replay();
    }

    private void initGame() {
        this.running = true;
        output.askName();
        String name = input.get();
        this.character = new Character(name);
        output.start(name);
        controller = new FrontController(input, output, character);
    }

    private void endGame() {
        if (this.character.isDie()) {
            output.characterDie();
        }
        if (this.character.isLevelMax()) {
            output.achieve(character.getName());
        }
        output.end();
    }

    private void replay() {
        if(!running) return;
        try {
            output.playAgain();
            int numberInputInRange = input.getNumberInRange(1, 3);
            if (numberInputInRange == 1) {
                start();
            }
        } catch (NumberFormatException e) {
            replay();
        }
    }

    private void processPhase() {
        try {
            output.select(controller.current());
            this.running = controller.process(input.getNumber());
        } catch (NumberFormatException e) {
            processPhase();
        }
    }

    private boolean canContinue() {
        return this.running && this.character.isAlive() && !this.character.isLevelMax();
    }


}
