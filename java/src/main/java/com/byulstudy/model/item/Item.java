package com.byulstudy.model.item;

import com.byulstudy.model.common.Name;

public abstract class Item {
    private final Name name;

    public Item(final String name) {
        this.name = new Name(name);
    }
}
