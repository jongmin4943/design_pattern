package com.byulstudy.model.battlePhase;

import java.util.HashMap;
import java.util.Map;

public class StoryStep implements Phase {
    private static StoryStep storyStep;
    private final Map<Integer, Step> steps = new HashMap<>();

    public StoryStep() {
        steps.put(1, Step.MOVE_FOREST);
        steps.put(2, Step.MOVE_DUNGEON);
        steps.put(3, Step.MOVE_RANDOM);
        steps.put(4, Step.BACK);
    }

    public static Phase getInstance() {
        if(storyStep == null) {
            storyStep = new StoryStep();
        }
        return storyStep;
    }

    @Override
    public Step selectedStep(int selection) {
        return this.steps.get(selection);
    }

    @Override
    public Phase next() {
        return BattleStep.getInstance();
    }

    @Override
    public Phase prev() {
        return StandbyStep.getInstance();
    }

    @Override
    public PhaseType current() {
        return PhaseType.STORY;
    }
}
