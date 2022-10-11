package com.byulstudy.model.character;

import com.byulstudy.model.common.Creature;
import com.byulstudy.model.common.HealthPoint;
import com.byulstudy.model.item.Items;
import com.byulstudy.model.item.armor.DefaultArmor;
import com.byulstudy.model.item.weapon.DefaultWeapon;
import com.byulstudy.model.item.weapon.Weapon;

import java.util.List;

public class Character extends Creature {
    private static final int INIT_HP = 100;
    private Level level;
    private ExperiencePoint exp;

    private Items items;

    public Character(final String name) {
        super(name, INIT_HP);
        this.level = Level.init();
        this.exp = ExperiencePoint.init();
        this.weapon = new DefaultWeapon();
        this.armor = new DefaultArmor();
    }

    public boolean isLevelMax() {
        return this.level.isMax();
    }

    @Override
    public String getName() {
        return this.name.toString();
    }

    public int heal() {
        HealthPoint healAmount = HealthPoint.of(20);
        this.hp.add(healAmount);
        return healAmount.getHp();
    }

    public List<Weapon> getWeapons() {
        return this.items.getWeapons();
    }
}
