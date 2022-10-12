package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.item.Item;
import com.byulstudy.model.item.armor.Armor;
import com.byulstudy.model.item.weapon.Weapon;
import com.byulstudy.model.monster.Monster;

import static com.byulstudy.model.monster.MonsterType.GOBLIN;

public abstract class Goblin extends Monster {
    public Goblin(final Weapon weapon, final Armor armor, final Item item) {
        super(GOBLIN, weapon, armor, item);
    }

}
