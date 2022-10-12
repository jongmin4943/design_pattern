package com.byulstudy.model.battlePhase;

import java.util.HashMap;
import java.util.Map;

public class BattleStep implements Phase {
    private final Map<Integer, Step> steps = new HashMap<>();

    public BattleStep() {
        // FIXME 미구현
//        steps.put(1, Step.ATTACK);
//        steps.put(2, Step.CHANGE_WEAPON);
//        steps.put(3, Step.TALK);
//        steps.put(4, Step.RUN);
    }

    @Override
    public Step selectedStep(int selection) {
        return this.steps.get(selection);
    }

    @Override
    public Phase next() {
        return Phases.getInstance().get(PhaseType.BATTLE);
    }

    @Override
    public Phase prev() {
        return Phases.getInstance().get(PhaseType.STORY);
    }

    @Override
    public PhaseType current() {
        return PhaseType.BATTLE;
    }

}
