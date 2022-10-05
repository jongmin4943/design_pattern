package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.battlefield.Forest;

public class ForestGoblin extends Goblin {
    @Override
    protected String getFieldName() {
        return Forest.FIELD_NAME;
    }
}
