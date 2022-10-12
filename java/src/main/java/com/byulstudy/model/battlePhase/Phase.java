package com.byulstudy.model.battlePhase;

public interface Phase {
    Step selectedStep(int selection);
    Phase next();
    Phase prev();
    PhaseType current();

}
