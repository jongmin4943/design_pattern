package com.byulstudy.model.battlePhase;

import com.byulstudy.model.character.Character;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

import java.util.Map;

public class Phase {
    private State state;
    private PhaseType phaseType;
    protected final Map<PhaseType, State> states;

    public Phase(final Input input, final Output output, final Character character) {
        StandByState standByState = new StandByState(input, output, character, this);
        this.phaseType = PhaseType.STANDBY;
        this.state = standByState;
        this.states = Map.of(
                PhaseType.STANDBY, standByState,
                PhaseType.STORY, new StoryState(input, output, character, this),
                PhaseType.BATTLE, new BattleState(input, output, character, this)
        );
    }

    public boolean processSelection(int selection) {
        state.process(selection);
        return !phaseType.isExit();
    }

    public void setState(final PhaseType phaseType) {
        this.phaseType = phaseType;
        this.state = states.get(phaseType);
    }

    public PhaseType current() {
        return this.phaseType;
    }
}
