package com.byulstudy.model.monster;

import com.byulstudy.model.character.ExperiencePoint;
import com.byulstudy.model.common.Creature;
import com.byulstudy.model.item.armor.Armor;
import com.byulstudy.model.item.weapon.Weapon;

public abstract class Monster extends Creature {
    private ExperiencePoint exp;

    public Monster(final MonsterType monsterType, final Weapon weapon, final Armor armor) {
        super(monsterType.getName(), monsterType.getHp());
        this.exp = ExperiencePoint.of(monsterType.getExp());
        this.weapon = weapon;
        this.armor = armor;
    }


    public ExperiencePoint getExp() {
        return this.exp;
    }

    @Override
    public String getName() {
        return this.getFieldName() + this.name;
    }

    protected abstract String getFieldName();
}
