package com.byulstudy.model.monster.troll;

import com.byulstudy.model.battlefield.Forest;
import com.byulstudy.model.item.ItemGenerator;

public class ForestTroll extends Troll {
    public ForestTroll() {
        super(new ForestTrollWeapon(), new ForestTrollArmor(), ItemGenerator.getInstance().generateArmorByPercentage(50));
    }

    @Override
    protected String getFieldName() {
        return Forest.FIELD_NAME;
    }
}
