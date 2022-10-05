package com.byulstudy.model.item.armor;

public class LeatherArmor extends ArmorEnhancement {
    private static final String ARMOR_NAME = "가죽갑옷";

    public LeatherArmor(Armor armor) {
        super(ARMOR_NAME);
        this.armor = armor;
    }

    @Override
    public int getDefense() {
        return armor.getDefense() + 1;
    }

    @Override
    public int getDodgeProbability() {
        return 8;
    }
}
