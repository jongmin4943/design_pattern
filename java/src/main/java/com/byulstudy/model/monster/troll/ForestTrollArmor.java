package com.byulstudy.model.monster.troll;

import com.byulstudy.model.item.armor.Armor;

public class ForestTrollArmor extends Armor {
    private static final String ARMOR_NAME = "철제 갑옷";

    public ForestTrollArmor() {
        super(ARMOR_NAME);
    }

    @Override
    public int getDefense() {
        return 5;
    }

    @Override
    public int getDodgeProbability() {
        return 10;
    }
}
