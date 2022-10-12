package com.byulstudy.model.character;

public class Level {
    private static final int DEFAULT_INIT_LEVEL = 1;
    private static final int MAXIMUM_LEVEL = 10;
    private int level;

    private ExperiencePoint exp;

    public Level(final int level) {
        this.level = level;
        this.exp = ExperiencePoint.init();
    }

    public static Level init() {
        return new Level(DEFAULT_INIT_LEVEL);
    }

    public void up() {
        this.exp = ExperiencePoint.of(this.exp.remainExpAfterLevelUp(this.level));
        this.level++;
    }

    public boolean isMax() {
        return this.level == MAXIMUM_LEVEL;
    }

    private boolean canLevelUp() {
        return this.exp.isMax(this.level);
    }

    public boolean gainExp(final ExperiencePoint exp) {
        this.exp = this.exp.gain(exp);
        if(canLevelUp()) {
            up();
            return true;
        }
        return false;
    }
}
