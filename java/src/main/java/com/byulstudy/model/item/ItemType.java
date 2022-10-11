package com.byulstudy.model.item;

public enum ItemType {
    WEAPON, ARMOR;

    public boolean isWeapon() {
        return this.equals(WEAPON);
    }
    public boolean isArmor() {
        return this.equals(ARMOR);
    }
}
