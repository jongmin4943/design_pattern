package com.byulstudy.controller;

import com.byulstudy.model.character.Character;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

import java.util.HashMap;
import java.util.Map;

public abstract class Controller {
    protected final Input input;
    protected final Output output;
    protected final Character character;
    protected final FrontController controller;
    protected final Map<Integer, Processor> processors;

    public Controller(final Input input, final Output output, final Character character, final FrontController controller) {
        this.input = input;
        this.output = output;
        this.character = character;
        this.controller = controller;
        this.processors = new HashMap<>();
    }

    protected void changeState(ControllerType controllerType) {
        controller.setController(controllerType);
    }

    public void process(final int selection) {
        processors.getOrDefault(selection, output::selectAgain).process();
    }
}
