package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.monster.Monster;

public class Goblin extends Monster {

    private static final String NAME = "고블린";
    private static final int EXP = 10;
    static final int HP = 10;

    public Goblin() {
        super(NAME, EXP, HP, new GoblinAttackStrategy(), new GoblinDefendStrategy());
    }

}
