package com.byulstudy.model.character;

import com.byulstudy.model.common.Creature;
import com.byulstudy.model.common.HealthPoint;
import com.byulstudy.model.item.Item;
import com.byulstudy.model.item.Items;
import com.byulstudy.model.item.armor.Armor;
import com.byulstudy.model.item.armor.DefaultArmor;
import com.byulstudy.model.item.weapon.DefaultWeapon;
import com.byulstudy.model.item.weapon.Weapon;

public class Character extends Creature {
    private static final int INIT_HP = 100;
    private final Level level;
    private final Items items;

    public Character(final String name) {
        super(name, INIT_HP);
        this.level = Level.init();
        this.weapon = new DefaultWeapon();
        this.armor = new DefaultArmor();
        this.items = new Items();
    }

    public boolean isLevelMax() {
        return this.level.isMax();
    }

    @Override
    public String getName() {
        return this.name.toString();
    }

    public int heal(int amount) {
        int currentHp = hp.getHp();
        hp = this.hp.add(HealthPoint.of(amount));
        return hp.getHp() - currentHp;
    }

    public void gainItem(Item item) {
        this.items.add(item);
    }

    public void changeWeapon(Weapon weapon) {
        items.add(this.weapon);
        items.remove(weapon);
        this.weapon = weapon;
    }

    public void changeArmor(Armor armor) {
        items.add(this.armor);
        items.remove(armor);
        this.armor = armor;
    }

    public boolean gainExp(ExperiencePoint exp) {
        return this.level.gainExp(exp);
    }

    public Items getItems() {
        return this.items;
    }

    public void changeItem(final Item selectedItem) {
        if(selectedItem instanceof Weapon) {
            this.changeWeapon((Weapon) selectedItem);
        }
        if(selectedItem instanceof Armor) {
            this.changeArmor((Armor) selectedItem);
        }
    }
}
