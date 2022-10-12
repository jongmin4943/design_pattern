package com.byulstudy.model.monster.troll;

import com.byulstudy.model.battlefield.Dungeon;
import com.byulstudy.model.item.ItemGenerator;

public class DungeonTroll extends Troll {

    public DungeonTroll() {
        super(new DungeonTrollWeapon(), new DungeonTrollArmor(), ItemGenerator.getInstance().generateWeaponByPercentage(70));
    }

    @Override
    protected String getFieldName() {
        return Dungeon.FIELD_NAME;
    }
}
