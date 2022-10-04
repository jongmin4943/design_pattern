package com.byulstudy.model.common;

public class Level {
    private static final int DEFAULT_INIT_LEVEL = 1;
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

}
