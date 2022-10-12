package com.byulstudy.model.battlePhase;

import java.util.HashMap;
import java.util.Map;

public class Phases {

    private static Phases phases;
    private final Map<PhaseType, Phase> phaseMap = new HashMap<>();

    public Phases() {
        phaseMap.put(PhaseType.STANDBY, new StandbyStep());
        phaseMap.put(PhaseType.STORY, new StoryStep());
        phaseMap.put(PhaseType.BATTLE, new BattleStep());
    }

    public static Phases getInstance() {
        if(phases == null) {
            phases = new Phases();
        }
        return phases;
    }

    public Phase get(PhaseType phaseType) {
        return this.phaseMap.get(phaseType);
    }
}
