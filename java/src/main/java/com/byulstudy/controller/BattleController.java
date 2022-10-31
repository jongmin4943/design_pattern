package com.byulstudy.controller;

import com.byulstudy.model.character.Character;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

public class BattleController extends Controller {
    public BattleController(final Input input, final Output output, final Character character, final FrontController controller) {
        super(input, output, character, controller);

    }
}
