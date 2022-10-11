package com.byulstudy.model.item;

import com.byulstudy.model.common.Name;

public abstract class Item {
    private final Name name;
    private final ItemType itemType;

    public Item(final String name, final ItemType itemType) {
        this.name = new Name(name);
        this.itemType = itemType;
    }

    public boolean isType(final ItemType type) {
        return itemType.equals(type);
    }

    public String getName() {
        return name.toString();
    }
}
