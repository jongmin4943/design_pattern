package com.byulstudy.model.monster.troll;

import com.byulstudy.model.item.Item;
import com.byulstudy.model.item.armor.Armor;
import com.byulstudy.model.item.weapon.Weapon;
import com.byulstudy.model.monster.Monster;

import static com.byulstudy.model.monster.MonsterType.TROLL;

public abstract class Troll extends Monster {
    public Troll(final Weapon weapon, final Armor armor, final Item item) {
        super(TROLL, weapon, armor, item);
    }
}
