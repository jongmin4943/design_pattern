package com.byulstudy.model.monster.troll;

import com.byulstudy.model.battlefield.Dungeon;

public class DungeonTroll extends Troll {
    @Override
    protected String getFieldName() {
        return Dungeon.FIELD_NAME;
    }
}
