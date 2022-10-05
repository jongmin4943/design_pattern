package com.byulstudy.model.monster.goblin;

import com.byulstudy.model.monster.Monster;

import static com.byulstudy.model.monster.MonsterType.GOBLIN;

public abstract class Goblin extends Monster {
    public Goblin() {
        super(GOBLIN, new GoblinWeapon(), new GoblinArmor());
    }

}
