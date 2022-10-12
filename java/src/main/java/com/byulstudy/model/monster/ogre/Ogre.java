package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.item.Item;
import com.byulstudy.model.item.armor.Armor;
import com.byulstudy.model.item.weapon.Weapon;
import com.byulstudy.model.monster.Monster;

import static com.byulstudy.model.monster.MonsterType.OGRE;

public abstract class Ogre extends Monster {
    public Ogre(final Weapon weapon, final Armor armor, final Item item) {
        super(OGRE,  weapon, armor, item);
    }
}
