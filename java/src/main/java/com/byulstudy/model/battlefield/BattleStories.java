package com.byulstudy.model.battlefield;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BattleStories implements Iterable<BattleStory> {
    private final List<BattleStory> battleStories;

    public BattleStories() {
        this.battleStories = new ArrayList<>();
    }

    public void add(final BattleStory battleStory) {
        this.battleStories.add(battleStory);
    }

    @Override
    public Iterator<BattleStory> iterator() {
        return battleStories.iterator();
    }
}
