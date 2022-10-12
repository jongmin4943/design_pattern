package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.battlefield.Forest;
import com.byulstudy.model.item.ItemGenerator;

public class ForestOgre extends Ogre {
    public ForestOgre() {
        super(new ForestOgreWeapon(), new ForestOgreArmor(), ItemGenerator.getInstance().generateArmorByPercentage(25));
    }

    @Override
    protected String getFieldName() {
        return Forest.FIELD_NAME;
    }
}
