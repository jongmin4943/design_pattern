package com.byulstudy.controller;

import com.byulstudy.model.character.Character;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

import java.util.Map;

public class FrontController {
    private Controller controller;
    private ControllerType controllerType;
    protected final Map<ControllerType, Controller> controllers;

    public FrontController(final Input input, final Output output, final Character character) {
        StandByController standByController = new StandByController(input, output, character, this);
        this.controllerType = ControllerType.STANDBY;
        this.controller = standByController;
        this.controllers = Map.of(
                ControllerType.STANDBY, standByController,
                ControllerType.STORY, new StoryController(input, output, character, this),
                ControllerType.BATTLE, new BattleController(input, output, character, this)
        );
    }

    public boolean process(int selection) {
        controller.process(selection);
        return !controllerType.isExit();
    }

    public void setController(final ControllerType stateType) {
        this.controllerType = stateType;
        this.controller = controllers.get(stateType);
    }

    public ControllerType current() {
        return this.controllerType;
    }

}
