package com.byulstudy.model.monster.troll;

import com.byulstudy.model.monster.Monster;

import static com.byulstudy.model.monster.MonsterType.TROLL;

public abstract class Troll extends Monster {
    public Troll() {
        super(TROLL, new TrollWeapon(), new TrollArmor());
    }
}
