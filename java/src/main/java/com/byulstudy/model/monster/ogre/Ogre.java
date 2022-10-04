package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.monster.Monster;

public class Ogre extends Monster {
    private static final String NAME = "오우거";
    private static final int EXP = 20;
    private static final int HP = 20;

    public Ogre() {
        super(NAME, EXP, HP,  new OgreAttackStrategy(), new OgreDefendStrategy());
    }
}
