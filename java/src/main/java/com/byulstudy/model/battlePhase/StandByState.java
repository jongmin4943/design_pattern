package com.byulstudy.model.battlePhase;

import com.byulstudy.model.character.Character;
import com.byulstudy.model.item.Item;
import com.byulstudy.model.item.Items;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

public class StandByState extends State {

    public StandByState(final Input input, final Output output, final Character character, final Phase phase) {
        super(input, output, character, phase);
        processors.put(1, () -> this.changeState(PhaseType.STORY));
        processors.put(2, () -> output.printHeal(character.getName(), character.heal(20)));
        processors.put(3, this::changeItem);
        processors.put(4, () -> this.changeState(PhaseType.EXIT));
    }

    private void changeItem() {
        try {
            Items items = character.getItems();
            output.printItems(items);
            if (items.isEmpty()) {
                return;
            }
            int selection = input.getNumberInputInRange(1, items.size() + 1);
            Item selectedItem = items.get(selection - 1);
            character.changeItem(selectedItem);
            output.printChangeItem(selectedItem);
        } catch (NumberFormatException e) {
            changeItem();
        }
    }

}
