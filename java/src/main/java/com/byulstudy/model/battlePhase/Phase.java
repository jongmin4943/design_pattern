package com.byulstudy.model.battlePhase;

import com.byulstudy.view.output.Output;

import java.util.HashMap;
import java.util.Map;

public abstract class Phase {
    private final PhaseType type;
    protected final Map<Integer, Step> steps = new HashMap<>();

    protected final Output output;

    public Phase(final PhaseType type) {
        this.type = type;
        this.output = Output.getInstance();
    }

    public Step selectStep(int selection) {
        return this.steps.get(selection);
    }

    public abstract Phase next();

    public abstract Phase prev();

    public PhaseType current() {
        return this.type;
    }

}
