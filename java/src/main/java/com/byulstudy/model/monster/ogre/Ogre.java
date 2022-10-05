package com.byulstudy.model.monster.ogre;

import com.byulstudy.model.monster.Monster;

import static com.byulstudy.model.monster.MonsterType.OGRE;

public abstract class Ogre extends Monster {
    public Ogre() {
        super(OGRE,  new OgreWeapon(), new OgreArmor());
    }
}
