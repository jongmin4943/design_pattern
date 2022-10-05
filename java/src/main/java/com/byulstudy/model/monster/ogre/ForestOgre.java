package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.battlefield.Forest;

public class ForestOgre extends Ogre {
    @Override
    protected String getFieldName() {
        return Forest.FIELD_NAME;
    }
}
