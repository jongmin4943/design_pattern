package com.byulstudy.model.item.armor;

public class DefaultArmor extends Armor {
    private static final String DEFAULT_ARMOR_NAME = "맨몸";

    public DefaultArmor() {
        super(DEFAULT_ARMOR_NAME);
    }

    @Override
    public int getDefense() {
        return 0;
    }

    @Override
    public int getDodgeProbability() {
        return 10;
    }
}
