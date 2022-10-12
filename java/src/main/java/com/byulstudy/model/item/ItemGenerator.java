package com.byulstudy.model.item;

import com.byulstudy.model.item.armor.DefaultArmor;
import com.byulstudy.model.item.armor.LeatherArmor;
import com.byulstudy.model.item.armor.PlateArmor;
import com.byulstudy.model.item.weapon.DefaultWeapon;
import com.byulstudy.model.item.weapon.IronSword;
import com.byulstudy.model.item.weapon.WoodenSword;
import com.byulstudy.utils.RandomUtils;

public class ItemGenerator {
    private static ItemGenerator itemGenerator;

    private ItemGenerator() {
    }

    public static ItemGenerator getInstance() {
        if(itemGenerator == null) {
            itemGenerator = new ItemGenerator();
        }
        return itemGenerator;
    }

    public Item generateItemByPercentage(final double percentage) {
        if(RandomUtils.getBooleanByPercentage(50)) {
            return generateWeaponByPercentage(percentage);
        }
        return generateArmorByPercentage(percentage);
    }
    public Item generateWeaponByPercentage(final double percentage) {
        if(RandomUtils.getBooleanByPercentage(percentage)) {
            return new WoodenSword(new DefaultWeapon());
        } else if(RandomUtils.getBooleanByPercentage(percentage/5)) {
            return new IronSword(new DefaultWeapon());
        }
        return null;
    }

    public Item generateArmorByPercentage(final double percentage) {
        if(RandomUtils.getBooleanByPercentage(percentage)) {
            return new LeatherArmor(new DefaultArmor());
        } else if(RandomUtils.getBooleanByPercentage(percentage/5)) {
            return new PlateArmor(new DefaultArmor());
        }
        return null;
    }
}
