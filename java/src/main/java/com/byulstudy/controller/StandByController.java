package com.byulstudy.controller;

import com.byulstudy.model.character.Character;
import com.byulstudy.model.item.Item;
import com.byulstudy.model.item.Items;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

public class StandByController extends Controller {

    public StandByController(final Input input, final Output output, final Character character, final FrontController controller) {
        super(input, output, character, controller);
        processors.put(1, () -> this.changeState(ControllerType.STORY));
        processors.put(2, () -> output.heal(character.getName(), character.heal(20)));
        processors.put(3, this::changeItem);
        processors.put(4, () -> this.changeState(ControllerType.EXIT));
    }

    private void changeItem() {
        try {
            Items items = character.getItems();
            output.items(items);
            if (items.isEmpty()) {
                return;
            }
            int selection = input.getNumberInRange(1, items.size() + 1);
            Item selectedItem = items.get(selection - 1);
            character.changeItem(selectedItem);
            output.changeItem(selectedItem);
        } catch (NumberFormatException e) {
            changeItem();
        }
    }

}
