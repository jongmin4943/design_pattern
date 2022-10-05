package com.byulstudy.model.monster.troll;

import com.byulstudy.model.battlefield.Forest;

public class ForestTroll extends Troll {
    @Override
    protected String getFieldName() {
        return Forest.FIELD_NAME;
    }
}
