package com.byulstudy.model.battlePhase;

public class BattleStep extends Phase {
    private static BattleStep battleStep;

    private BattleStep() {
        super(PhaseType.BATTLE);
//        steps.put(1, Step.ATTACK);
//        steps.put(2, Step.CHANGE_WEAPON);
//        steps.put(3, Step.TALK);
//        steps.put(4, Step.RUN);
    }

    public static BattleStep getInstance() {
        if (battleStep == null) {
            battleStep = new BattleStep();
        }
        return battleStep;
    }

    @Override
    public Phase next() {
        return getInstance();
    }

    @Override
    public Phase prev() {
        return StoryStep.getInstance();
    }

}
