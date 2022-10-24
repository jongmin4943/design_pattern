package com.byulstudy.model.battlePhase;

public class StoryStep extends Phase {
    private static StoryStep storyStep;

    public StoryStep() {
        super(PhaseType.STORY);
        steps.put(1, Step.MOVE_FOREST);
        steps.put(2, Step.MOVE_DUNGEON);
        steps.put(3, Step.MOVE_RANDOM);
        steps.put(4, Step.BACK);
    }

    public static Phase getInstance() {
        if (storyStep == null) {
            storyStep = new StoryStep();
        }
        return storyStep;
    }

    @Override
    public Phase next() {
        return BattleStep.getInstance();
    }

    @Override
    public Phase prev() {
        return StandbyStep.getInstance();
    }
}
