package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.battlefield.Dungeon;
import com.byulstudy.model.item.ItemGenerator;

public class DungeonOgre extends Ogre {
    public DungeonOgre() {
        super(new DungeonOgreWeapon(), new DungeonOgreArmor(), ItemGenerator.getInstance().generateWeaponByPercentage(30));
    }

    @Override
    protected String getFieldName() {
        return Dungeon.FIELD_NAME;
    }
}
