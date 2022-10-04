package com.byulstudy.model.monster.troll;

import com.byulstudy.model.monster.Monster;

public class Troll extends Monster {
    private static final String NAME = "트롤";
    private static final int EXP = 30;
    private static final int HP = 50;
    public Troll() {
        super(NAME, EXP, HP, new TrollAttackStrategy(), new TrollDefendStrategy());
    }
}
