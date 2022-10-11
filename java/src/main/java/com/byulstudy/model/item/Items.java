package com.byulstudy.model.item;

import com.byulstudy.model.item.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.byulstudy.model.item.ItemType.WEAPON;

public abstract class Items {
    private final List<Item> items;

    public Items() {
        this.items = new ArrayList<>();
    }

    public List<Weapon> getWeapons() {
        return items.stream().filter(item -> item.isType(WEAPON)).map(Weapon.class::cast).collect(Collectors.toList());
    }
    public Weapon get(final int i) {
        return getWeapons().get(i);
    }
}
