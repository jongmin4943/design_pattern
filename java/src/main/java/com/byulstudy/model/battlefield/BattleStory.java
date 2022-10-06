package com.byulstudy.model.battlefield;

public class BattleStory {
    private final String attacker;
    private final String defender;
    private final int damage;

    private final int remainHp;
    public BattleStory(final String attacker, final String defender, final int damage, final int remainHp) {
        this.attacker = attacker;
        this.defender = defender;
        this.damage = damage;
        this.remainHp = remainHp;
    }

    public String getAttacker() {
        return this.attacker;
    }

    public String getDefender() {
        return this.defender;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getDefenderRemainHp() {
        return this.remainHp;
    }
}
