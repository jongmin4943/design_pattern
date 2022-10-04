package com.byulstudy.model.character;

public class Level {
    private static final int DEFAULT_INIT_LEVEL = 1;
    private static final int MAXIMUM_LEVEL = 10;
    private final int level;

    public Level(final int level) {
        this.level = level;
    }

    public static Level init() {
        return new Level(DEFAULT_INIT_LEVEL);
    }

    public Level up() {
        return new Level(level + 1);
    }

    public boolean isMax() {
        return this.level == MAXIMUM_LEVEL;
    }
}
