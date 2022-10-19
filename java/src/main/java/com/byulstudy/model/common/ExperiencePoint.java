package com.byulstudy.model.common;

public abstract class ExperiencePoint {
    protected int exp;

    protected ExperiencePoint(final int exp) {
        this.exp = exp;
    }

    public ExperiencePoint gain(final ExperiencePoint exp) {
        this.exp += exp.exp;
        return this;
    }
    @Override
    public String toString() {
        return this.exp + "";
    }
}
