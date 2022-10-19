package com.byulstudy.model.monster;

import com.byulstudy.model.battlefield.Battlefield;
import com.byulstudy.model.common.ExperiencePoint;
import com.byulstudy.model.common.Creature;
import com.byulstudy.model.item.Item;
import com.byulstudy.model.item.armor.Armor;
import com.byulstudy.model.item.weapon.Weapon;

public abstract class Monster extends Creature {
    private final MonsterExperiencePoint exp;
    private final Item item;

    public Monster(final MonsterType monsterType, final Weapon weapon, final Armor armor, final Item item) {
        super(monsterType.getName(), monsterType.getHp());
        this.exp = new MonsterExperiencePoint(monsterType.getExp());
        this.weapon = weapon;
        this.armor = armor;
        this.item = item;
    }


    public ExperiencePoint getExp(Battlefield battlefield) {
        return this.exp.gain(battlefield.getFieldExtraExp());
    }

    @Override
    public String getName() {
        return this.getFieldName() + this.name;
    }

    protected abstract String getFieldName();

    public Item getItem() {
        return this.item;
    }

    public boolean hasItem() {
        return this.item != null;
    }
}
