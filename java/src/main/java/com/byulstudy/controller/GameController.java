package com.byulstudy.controller;

import com.byulstudy.model.battlePhase.Phase;
import com.byulstudy.model.battlefield.BattleResult;
import com.byulstudy.model.battlefield.Battlefield;
import com.byulstudy.model.battlefield.Dungeon;
import com.byulstudy.model.battlefield.Forest;
import com.byulstudy.model.character.Character;
import com.byulstudy.model.item.weapon.Weapon;
import com.byulstudy.model.monster.RandomMonsterGenerator;
import com.byulstudy.utils.RandomUtils;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

import java.util.List;

public class GameController {
    private final Input input;
    private final Output output;

    private Character character;
    private Phase phase;
    private Battlefield battlefield;

    public GameController() {
        this.input = new Input();
        this.output = new Output();
    }

    public void start() {
        initGame();
        while(canContinue()) {
            output.printSelection(phase.current());
            phase.apply(input.getNumberInputInRange(1,5));
            processPhase();
        }
        endGame();
    }

    private void processPhase() {
        if(phase.current().isHeal()) {
            output.printHeal(character.getName(), character.heal());
        }
        if(phase.current().isChangeWeapon()) {
            List<Weapon> weapons = character.getWeapons();
            output.printItems(weapons);
            int selection = input.getNumberInputInRange(1, weapons.size() + 1);
            character.changeWeapon(weapons.get(selection-1));
        }
        if(phase.current().isMoveForest()) {
            battlefield = new Forest(character);
            output.printEnter(battlefield.getFieldName());
        }
        if(phase.current().isMoveDungeon()) {
            battlefield = new Dungeon(character);
            output.printEnter(battlefield.getFieldName());
        }
        if(phase.current().isMoveRandom()) {
            battlefield = RandomUtils.getBooleanByPercentage(50) ? new Forest(character) : new Dungeon(character);
            output.printEnter(battlefield.getFieldName());
        }
        if(phase.current().isBack()) {
            phase.previous();
        }
        if(phase.current().isAttack()) {
            battlefield.fight(RandomMonsterGenerator.generate());
        }
        if(phase.current().isTalk()) {
            output.talkWithMonster();
        }
        if(phase.current().isRun()) {
            boolean result = battlefield.run();
            if(result) {
                output.printRunSuccess();
                phase.previous();
            } else {
                output.printRunFail();
            }
        }
    }

    private void initGame() {
        output.printAskName();
        String name = input.getInput();
        this.character = new Character(name);
        output.printStart(name);
        phase = new Phase();
    }

    private void endGame() {
        output.printEnd();
    }

    private boolean canContinue() {
        return phase.current().isNotExit() || this.character.isAlive() || this.character.isLevelMax();
    }

    private BattleResult startStory() {
        battlefield = new Forest(character);
        return battlefield.fight(RandomMonsterGenerator.generate());
    }

}
