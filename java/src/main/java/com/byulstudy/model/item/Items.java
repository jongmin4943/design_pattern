package com.byulstudy.model.item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Items {
    private final List<Item> items;

    public Items() {
        this.items = new ArrayList<>();
    }

    public Item get(final int i) {
        return this.items.get(i);
    }

    public void add(final Item... items) {
        this.items.addAll(Arrays.asList(items));
    }

    public void remove(final Item item) {
        this.items.remove(item);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public int size() {
        return this.items.size();
    }
}
