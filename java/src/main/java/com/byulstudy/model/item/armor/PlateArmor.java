package com.byulstudy.model.item.armor;

public class PlateArmor extends ArmorEnhancement {

    public static final String ARMOR_NAME = "철제갑옷";

    public PlateArmor(final Armor armor) {
        super(ARMOR_NAME);
        this.armor = armor;
    }

    @Override
    public int getDefense() {
        return armor.getDefense() + 2;
    }

    @Override
    public int getDodgeProbability() {
        return 5;
    }
}
