package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.item.armor.Armor;

public class DungeonGoblinArmor extends Armor {
    private static final String ARMOR_NAME = "낡은 천옷";

    public DungeonGoblinArmor() {
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
