package com.byulstudy.view.output;

import com.byulstudy.controller.ControllerType;
import com.byulstudy.model.battlefield.BattleResult;
import com.byulstudy.model.item.Item;

public interface Output {

    void askName();

    void start(String name);

    void end();

    void story(BattleResult battleResult);

    void select(ControllerType controllerType);

    void heal(String name, int healAmount);

    <E extends Item> void items(Iterable<E> items);

    void enterField(String fieldName);

    void changeItem(Item selectedItem);

    void characterDie();

    void playAgain();

    void achieve(String name);

    void selectAgain();
}
