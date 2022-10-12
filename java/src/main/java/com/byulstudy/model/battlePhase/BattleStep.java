package com.byulstudy.model.battlePhase;

import java.util.HashMap;
import java.util.Map;

public class BattleStep implements Phase {
    private static BattleStep battleStep;
    private final Map<Integer, Step> steps = new HashMap<>();

    private BattleStep() {
        // FIXME 미구현
//        steps.put(1, Step.ATTACK);
//        steps.put(2, Step.CHANGE_WEAPON);
//        steps.put(3, Step.TALK);
//        steps.put(4, Step.RUN);
    }

    public static BattleStep getInstance() {
        if(battleStep == null) {
            battleStep = new BattleStep();
        }
        return battleStep;
    }

    @Override
    public Step selectedStep(int selection) {
        return this.steps.get(selection);
    }

    @Override
    public Phase next() {
        return getInstance();
    }

    @Override
    public Phase prev() {
        return StoryStep.getInstance();
    }

    @Override
    public PhaseType current() {
        return PhaseType.BATTLE;
    }

}
