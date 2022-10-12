package com.byulstudy.model.battlePhase;

import java.util.HashMap;
import java.util.Map;

public class StandbyStep implements Phase {
    private static StandbyStep standbyStep;
    private final Map<Integer, Step> steps = new HashMap<>();

    public StandbyStep() {
        steps.put(1, Step.STORY);
        steps.put(2, Step.HEAL);
        steps.put(3, Step.CHANGE_WEAPON);
        steps.put(4, Step.EXIT);
    }

    public static Phase getInstance() {
        if(standbyStep == null) {
            standbyStep = new StandbyStep();
        }
        return standbyStep;
    }

    @Override
    public Step selectedStep(int selection) {
        return this.steps.get(selection);
    }

    @Override
    public Phase next() {
        return StoryStep.getInstance();
    }

    @Override
    public Phase prev() {
        return getInstance();
    }

    @Override
    public PhaseType current() {
        return PhaseType.STANDBY;
    }
}
