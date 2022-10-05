package com.byulstudy.model.monster;

import com.byulstudy.model.character.ExperiencePoint;
import com.byulstudy.model.common.*;
import com.byulstudy.model.item.armor.Armor;
import com.byulstudy.model.item.weapon.Weapon;

public abstract class Monster {
    private final Name name;
    private HealthPoint hp;
    private ExperiencePoint exp;
    private MonsterStatus status;
    protected Weapon weapon;
    protected Armor armor;

    public Monster(final MonsterType monsterType, final Weapon weapon, final Armor armor) {
        this.name = new Name(monsterType.getName());
        this.hp = HealthPoint.of(monsterType.getHp());
        this.exp = ExperiencePoint.of(monsterType.getExp());
        this.status = MonsterStatus.ALIVE;
        this.weapon = weapon;
        this.armor = armor;
    }

    public int attack() {
        checkMonsterAlive();
        return this.weapon.attack();
    }

    public void defend(final int damage) {
        checkMonsterAlive();
        final int damagePoint = this.armor.defend(damage);
        try {
            this.hp = this.hp.subtract(HealthPoint.of(damagePoint));
        } catch (IllegalArgumentException e) {
            this.status = MonsterStatus.DIE;
        }
    }

    private void checkMonsterAlive() {
        if(isDie())
            throw new IllegalStateException("이미 사망한 몬스터입니다.");
    }

    private boolean isDie() {
        return this.status.isDie();
    }

    public boolean isAlive() {
        return this.status.isAlive();
    }

    public ExperiencePoint getExp() {
        return this.exp;
    }

    public String getName() {
        return this.getFieldName() + this.name;
    }

    protected abstract String getFieldName();
}
