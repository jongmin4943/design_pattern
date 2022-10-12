package com.byulstudy.controller;

import com.byulstudy.model.battlePhase.*;
import com.byulstudy.model.battlefield.BattleResult;
import com.byulstudy.model.battlefield.Battlefield;
import com.byulstudy.model.battlefield.Dungeon;
import com.byulstudy.model.battlefield.Forest;
import com.byulstudy.model.character.Character;
import com.byulstudy.model.item.Item;
import com.byulstudy.model.item.Items;
import com.byulstudy.model.monster.RandomMonsterGenerator;
import com.byulstudy.utils.RandomUtils;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

public class GameController {
    private final Input input;
    private final Output output;

    private Character character;
    private Phase phase;
    private boolean running;

    public GameController() {
        this.input = Input.getInstance();
        this.output = Output.getInstance();
    }

    public void start() {
        initGame();
        while (canContinue()) {
            processPhase();
        }
        endGame();
        replay();
        output.printEnd();
    }

    private void initGame() {
        this.running = true;
        output.printAskName();
        String name = input.getInput();
        this.character = new Character(name);
        output.printStart(name);
        phase = new StandbyStep();
    }

    private void endGame() {
        if (this.character.isDie()) {
            output.printCharacterDie();
        }
        if (this.character.isLevelMax()) {
            output.printEnding(character.getName());
        }
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
            Step step = phase.selectedStep(input.getNumberInputInRange(1, 5));
            processStep(step);
        } catch (NumberFormatException e) {
            processPhase();
        }
    }

    private void processStep(Step step) {
        if (step.isStandby()) {
            phase = new StandbyStep();
        }
        if (step.isStory()) {
            phase = new StoryStep();
        }
        if (step.isBattle()) {
            phase = new BattleStep();
        }
        if (step.isHeal()) {
            output.printHeal(character.getName(), character.heal(20));
        }
        if (step.isChangeWeapon()) {
            changeItem();
        }
        if (step.isMoveForest()) {
            output.printStory(startStory(new Forest(character)));
        }
        if (step.isMoveDungeon()) {
            output.printStory(startStory(new Dungeon(character)));
        }
        if (step.isMoveRandom()) {
            output.printStory(startStory(RandomUtils.getBooleanByPercentage(50) ? new Forest(character) : new Dungeon(character)));
        }
        if (step.isBack()) {
            phase = phase.prev();
        }
        if (step.isExit()) {
            this.running = false;
        }
    }

    private void changeItem() {
        try {
            Items items = character.getItems();
            output.printItems(items);
            if (items.isEmpty()) {
                return;
            }
            int selection = input.getNumberInputInRange(1, items.size() + 1);
            Item selectedItem = items.get(selection - 1);
            character.changeItem(selectedItem);
            output.printChangeItem(selectedItem);
        } catch (NumberFormatException e) {
            changeItem();
        }
    }

    private boolean canContinue() {
        return this.running && this.character.isAlive() && !this.character.isLevelMax();
    }

    private BattleResult startStory(final Battlefield field) {
        output.printEnter(field.getFieldName());
        return field.fight(RandomMonsterGenerator.generate());
    }

}
