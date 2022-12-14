package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.item.armor.Armor;

public class ForestOgreArmor extends Armor {
    public static final String ARMOR_NAME = "단단한 갑옷";

    public ForestOgreArmor() {
        super(ARMOR_NAME);
    }

    @Override
    public int getDefense() {
        return 2;
    }

    @Override
    public int getDodgeProbability() {
        return 10;
    }
}
