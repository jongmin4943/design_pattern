package com.byulstudy.model.item.weapon;

import com.byulstudy.model.common.Attackable;
import com.byulstudy.model.item.Item;

public abstract class Weapon extends Item implements Attackable {
    public Weapon(final String name) {
        super(name);
    }
}
