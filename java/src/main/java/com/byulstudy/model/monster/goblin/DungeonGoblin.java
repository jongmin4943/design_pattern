package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.battlefield.Dungeon;
import com.byulstudy.model.item.ItemGenerator;

public class DungeonGoblin extends Goblin {
    public DungeonGoblin() {
        super(new DungeonGoblinWeapon(), new DungeonGoblinArmor(), ItemGenerator.getInstance().generateArmorByPercentage(20));
    }

    @Override
    protected String getFieldName() {
        return Dungeon.FIELD_NAME;
    }
}
