package com.byulstudy.model.character;

public class ExperiencePoint {
    private static final int DEFAULT_INIT_EXP = 0;
    private final int exp;

    private ExperiencePoint(final int exp) {
        this.exp = exp;
    }

    public static ExperiencePoint init() {
        return new ExperiencePoint(DEFAULT_INIT_EXP);
    }

    public static ExperiencePoint of(final int exp) {
        return new ExperiencePoint(exp);
    }

    public ExperiencePoint gain(final ExperiencePoint exp) {
        return new ExperiencePoint(this.exp + exp.exp);
    }
}