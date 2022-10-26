package com.byulstudy.controller;

import com.byulstudy.model.battlePhase.Phase;
import com.byulstudy.model.character.Character;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

public class RPGGameController implements GameController {
    private final Input input;
    private final Output output;

    private Character character;
    private Phase phase;
    private boolean running;

    public RPGGameController() {
        this.input = Input.getInstance();
        this.output = Output.getInstance();
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
        output.printAskName();
        String name = input.getInput();
        this.character = new Character(name);
        output.printStart(name);
        phase = new Phase(input, output, character);
    }

    private void endGame() {
        if (this.character.isDie()) {
            output.printCharacterDie();
        }
        if (this.character.isLevelMax()) {
            output.printEnding(character.getName());
        }
        output.printEnd();
    }

    private void replay() {
        if(!running) return;
        try {
            output.printPlayAgain();
            int numberInputInRange = input.getNumberInputInRange(1, 3);
            if (numberInputInRange == 1) {
                start();
            }
        } catch (NumberFormatException e) {
            replay();
        }
    }

    private void processPhase() {
        try {
            output.printPhase(phase.current());
            this.running = phase.processSelection(input.getNumberInputInRange(1, 5));
        } catch (NumberFormatException e) {
            processPhase();
        }
    }

    private boolean canContinue() {
        return this.running && this.character.isAlive() && !this.character.isLevelMax();
    }


}
