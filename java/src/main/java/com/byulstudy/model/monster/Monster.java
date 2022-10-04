package com.byulstudy.model.monster;

import com.byulstudy.model.common.*;

public abstract class Monster {
    private final Name name;
    private HealthPoint hp;
    private ExperiencePoint exp;
    private MonsterStatus status;
    protected AttackStrategy attackStrategy;
    protected DefendStrategy defendStrategy;

    public Monster(final String name, final int hp, final int exp, final AttackStrategy attackStrategy, DefendStrategy defendStrategy) {
        this.name = new Name(name);
        this.hp = HealthPoint.of(hp);
        this.exp = ExperiencePoint.of(exp);
        this.status = MonsterStatus.ALIVE;
        this.attackStrategy = attackStrategy;
        this.defendStrategy = defendStrategy;
    }

    public int attack() {
        checkMonsterAlive();
        return attackStrategy.attack();
    }

    public void defend(final int damage) {
        checkMonsterAlive();
        final int damagePoint = defendStrategy.defend(damage);
        try {
            this.hp = this.hp.subtract(HealthPoint.of(damagePoint));
        } catch (IllegalArgumentException e) {
            this.status = MonsterStatus.DIE;
        }
    }

    private void checkMonsterAlive() {
        if(this.status.isDie())
            throw new IllegalStateException("이미 사망한 몬스터입니다.");
    }

    public ExperiencePoint getExp() {
        return this.exp;
    }
}
