package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.battlefield.Dungeon;

public class DungeonGoblin extends Goblin {
    @Override
    protected String getFieldName() {
        return Dungeon.FIELD_NAME;
    }
}
