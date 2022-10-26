package com.byulstudy.model.battlePhase;

import com.byulstudy.model.character.Character;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

import java.util.HashMap;
import java.util.Map;

public abstract class State {
    protected final Input input;
    protected final Output output;
    protected final Character character;
    protected final Phase phase;
    protected final Map<Integer, StepProcessor> processors;

    public State(final Input input, final Output output, final Character character, final Phase phase) {
        this.input = input;
        this.output = output;
        this.character = character;
        this.phase = phase;
        this.processors = new HashMap<>();
    }

    protected void changeState(PhaseType phaseType) {
        phase.setState(phaseType);
    }

    public void process(final int selection) {
        processors.getOrDefault(selection, () -> {}).process();
    }
}
