package com.byulstudy.model.character;

import com.byulstudy.model.common.ExperiencePoint;

public class CharacterExperiencePoint extends ExperiencePoint {
    private static final int INIT_MAX_EXP = 20;

    public CharacterExperiencePoint() {
        super(0);
    }

    public boolean isMax(final int level) {
        return this.exp >= getGoalExp(level);
    }

    public void remainExpAfterLevelUp(final int level) {
        this.exp -= getGoalExp(level);
    }

    public int getGoalExp(final int level) {
        return INIT_MAX_EXP * level;
    }
}
