package com.byulstudy.model.monster.troll;

import com.byulstudy.model.item.armor.Armor;

public class DungeonTrollArmor extends Armor {
    private static final String ARMOR_NAME = "어두운 철제 갑옷";

    public DungeonTrollArmor() {
        super(ARMOR_NAME);
    }

    @Override
    public int getDefense() {
        return 4;
    }

    @Override
    public int getDodgeProbability() {
        return 15;
    }
}
