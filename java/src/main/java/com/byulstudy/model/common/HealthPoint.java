package com.byulstudy.model.common;

public class HealthPoint {
    private static final int MINIMUM_HP = 0;
    private static final int MAXIMUM_HP = 100;
    public static HealthPoint Zero = new HealthPoint(0);
    private final int hp;
    private HealthPoint(final int hp) {
        this.hp = hp;
    }

    public static HealthPoint of(final int hp) {
        return new HealthPoint(hp);
    }

    public HealthPoint add(final HealthPoint healthPoint) {
        final int estimateHp = this.hp + healthPoint.hp;
        if(estimateHp > MAXIMUM_HP)
            throw new IllegalArgumentException("hp 는 " + MAXIMUM_HP + "를 초과할 수 없습니다.");
        return new HealthPoint(estimateHp);
    }

    public HealthPoint subtract(final HealthPoint healthPoint) throws IllegalArgumentException {
        final int estimateHp = this.hp - healthPoint.hp;
        if(estimateHp <= MINIMUM_HP)
            throw new IllegalArgumentException("hp 는 " + MINIMUM_HP + "미만으로 내려갈 수 없습니다.");
        return new HealthPoint(estimateHp);
    }

    @Override
    public String toString() {
        return String.valueOf(hp);
    }

    public int getHp() {
        return this.hp;
    }

}
