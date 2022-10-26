package com.byulstudy.model.battlePhase;

import com.byulstudy.model.character.Character;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

public class BattleState extends State {
    public BattleState(final Input input, final Output output, final Character character, final Phase phase) {
        super(input, output, character, phase);

    }
}
