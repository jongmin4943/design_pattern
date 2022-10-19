package com.byulstudy.model.character;

import com.byulstudy.model.common.ExperiencePoint;

public class Level {
    private static final int DEFAULT_INIT_LEVEL = 1;
    private static final int MAXIMUM_LEVEL = 10;
    private int level;
    private final CharacterExperiencePoint exp;

    public Level(final int level) {
        this.level = level;
        this.exp = new CharacterExperiencePoint();
    }

    public static Level init() {
        return new Level(DEFAULT_INIT_LEVEL);
    }

    public void up() {
        this.exp.remainExpAfterLevelUp(this.level);
        this.level++;
    }

    public boolean isMax() {
        return this.level == MAXIMUM_LEVEL;
    }

    private boolean canLevelUp() {
        return this.exp.isMax(this.level);
    }

    public boolean gainExp(final ExperiencePoint exp) {
        this.exp.gain(exp);
        if(canLevelUp()) {
            up();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "현재 레벨 : " + this.level + "\n경험치 : (" + this.exp + "/" + this.exp.getGoalExp(this.level) + ")";
    }
}
