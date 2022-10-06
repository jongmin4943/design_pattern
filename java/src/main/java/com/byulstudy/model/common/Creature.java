package com.byulstudy.model.common;

import com.byulstudy.model.item.armor.Armor;
import com.byulstudy.model.item.weapon.Weapon;

public abstract class Creature {
    protected final Name name;
    protected HealthPoint hp;
    protected CreatureStatus creatureStatus;

    protected Weapon weapon;
    protected Armor armor;

    protected Creature(final String name, int hp) {
        this.name = new Name(name);
        this.hp = HealthPoint.of(hp);
        this.creatureStatus = CreatureStatus.ALIVE;
    }

    public boolean isAlive() {
        return creatureStatus.isAlive();
    }

    public boolean isDie() {
        return creatureStatus.isDie();
    }

    public int attack() {
        checkAlive();
        return weapon.attack();
    }

    public int defend(final int damage) {
        checkAlive();
        final int damagePoint = armor.defend(damage);
        try {
            this.hp = this.hp.subtract(HealthPoint.of(damagePoint));
            return damagePoint;
        } catch (IllegalArgumentException e) {
            this.creatureStatus = CreatureStatus.DIE;
            this.hp = HealthPoint.Zero;
            return this.hp.getHp();
        }
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void changeArmor(Armor armor) {
        this.armor = armor;
    }

    public abstract String getName();

    private void checkAlive() {
        if(isDie())
            throw new IllegalStateException("이미 사망한 몬스터입니다.");
    }

    public int getHp() {
        return hp.getHp();
    }
}
