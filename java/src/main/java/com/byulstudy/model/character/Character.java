package com.byulstudy.model.character;

import com.byulstudy.model.common.*;
import com.byulstudy.model.item.armor.Armor;
import com.byulstudy.model.item.armor.DefaultArmor;
import com.byulstudy.model.item.weapon.DefaultWeapon;
import com.byulstudy.model.item.weapon.Weapon;

public class Character {
    private static final int INIT_HP = 100;
    private final Name name;

    private Level level;
    private ExperiencePoint exp;
    private HealthPoint hp;
    private CharacterStatus characterStatus;
    private Weapon weapon;
    private Armor armor;

    public Character(final String name) {
        this.name = new Name(name);
        this.level = Level.init();
        this.exp = ExperiencePoint.init();
        this.hp = HealthPoint.of(INIT_HP);
        this.characterStatus = CharacterStatus.ALIVE;
        this.weapon = new DefaultWeapon();
        this.armor = new DefaultArmor();
    }

    public boolean isAlive() {
        return characterStatus.isAlive();
    }

    public boolean isLevelMax() {
        return this.level.isMax();
    }

    public int attack() {
        return weapon.attack();
    }

    public void defend(final int damage) {
        final int damagePoint = armor.defend(damage);
        try {
            this.hp = this.hp.subtract(HealthPoint.of(damagePoint));
        } catch (IllegalArgumentException e) {
            this.characterStatus = CharacterStatus.DIE;
        }
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void changeArmor(Armor armor) {
        this.armor = armor;
    }
}
