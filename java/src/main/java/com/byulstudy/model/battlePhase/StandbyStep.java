package com.byulstudy.model.battlePhase;

import java.util.HashMap;
import java.util.Map;

public class StandbyStep implements Phase {
    private final Map<Integer, Step> steps = new HashMap<>();

    public StandbyStep() {
        steps.put(1, Step.STORY);
        steps.put(2, Step.HEAL);
        steps.put(3, Step.CHANGE_WEAPON);
        steps.put(4, Step.EXIT);
    }

    @Override
    public Step selectedStep(int selection) {
        return this.steps.get(selection);
    }

    @Override
    public Phase next() {
        return Phases.getInstance().get(PhaseType.STORY);
    }

    @Override
    public Phase prev() {
        return Phases.getInstance().get(PhaseType.STANDBY);
    }

    @Override
    public PhaseType current() {
        return PhaseType.STANDBY;
    }
}
