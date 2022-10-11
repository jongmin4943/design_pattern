package com.byulstudy.model.battlePhase;

import static com.byulstudy.model.battlePhase.Step.*;

public class Phase {
    private Step step;

    public Phase() {
        this.step = STANDBY;
    }

    public void next() {
        step = step.next();
    }

    public void previous() {
        step = step.previous();
    }

    public Step current() {
        return step;
    }

    public void apply(final int selection) {
        if (this.step.isStandby()) {
            processStepStandBy(selection);
        }
        if (this.step.isStory()) {
            processStepStory(selection);
        }
        if (this.step.isBattle()) {
            processStepBattle(selection);
        }
    }

    private void processStepStandBy(final int selection) {
        if (selection == 1) {
            this.step = STORY;
        }
        if (selection == 2) {
            this.step = HEAL;
        }
        if (selection == 3) {
            this.step = CHANGE_WEAPON;
        }
        if (selection == 4) {
            this.step = EXIT;
        }
    }

    private void processStepStory(final int selection) {
        if (selection == 1) {
            this.step = MOVE_FOREST;
        }
        if (selection == 2) {
            this.step = MOVE_DUNGEON;
        }
        if (selection == 3) {
            this.step = MOVE_RANDOM;
        }
        if (selection == 4) {
            this.step = BACK;
        }
    }

    private void processStepBattle(final int selection) {
        if (selection == 1) {
            this.step = ATTACK;
        }
        if (selection == 2) {
            this.step = CHANGE_WEAPON;
        }
        if (selection == 3) {
            this.step = TALK;
        }
        if (selection == 4) {
            this.step = RUN;
        }
    }

}
