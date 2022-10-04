package com.byulstudy.model.item.armor;

import com.byulstudy.model.common.Defendable;
import com.byulstudy.model.item.Item;

public abstract class Armor extends Item implements Defendable {
    public Armor(final String name) {
        super(name);
    }
}
