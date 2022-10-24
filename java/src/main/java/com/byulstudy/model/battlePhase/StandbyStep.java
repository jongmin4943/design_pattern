package com.byulstudy.model.battlePhase;

public class StandbyStep extends Phase {
    private static StandbyStep standbyStep;

    public StandbyStep() {
        super(PhaseType.STANDBY);
        steps.put(1, Step.STORY);
        steps.put(2, Step.HEAL);
        steps.put(3, Step.CHANGE_WEAPON);
        steps.put(4, Step.EXIT);
    }

    public static Phase getInstance() {
        if (standbyStep == null) {
            standbyStep = new StandbyStep();
        }
        return standbyStep;
    }

    @Override
    public Phase next() {
        return StoryStep.getInstance();
    }

    @Override
    public Phase prev() {
        return getInstance();
    }

}
