package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.item.armor.Armor;

public class DungeonOgreArmor extends Armor {
    public static final String ARMOR_NAME = "단단한 철갑옷";

    public DungeonOgreArmor() {
        super(ARMOR_NAME);
    }

    @Override
    public int getDefense() {
        return 3;
    }

    @Override
    public int getDodgeProbability() {
        return 15;
    }
}
