package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.item.armor.Armor;

public class ForestGoblinArmor extends Armor {
    private static final String ARMOR_NAME = "거죽데기";

    public ForestGoblinArmor() {
        super(ARMOR_NAME);
    }

    @Override
    public int getDefense() {
        return 1;
    }

    @Override
    public int getDodgeProbability() {
        return 10;
    }
}
