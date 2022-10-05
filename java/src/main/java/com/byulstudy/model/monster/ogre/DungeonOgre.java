package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.battlefield.Dungeon;

public class DungeonOgre extends Ogre {
    @Override
    protected String getFieldName() {
        return Dungeon.FIELD_NAME;
    }
}
