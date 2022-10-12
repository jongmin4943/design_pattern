package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.battlefield.Forest;
import com.byulstudy.model.item.ItemGenerator;

public class ForestGoblin extends Goblin {
    public ForestGoblin() {
        super(new ForestGoblinWeapon(), new ForestGoblinArmor(), ItemGenerator.getInstance().generateWeaponByPercentage(20));
    }

    @Override
    protected String getFieldName() {
        return Forest.FIELD_NAME;
    }
}
