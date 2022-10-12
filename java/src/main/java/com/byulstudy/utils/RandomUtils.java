package com.byulstudy.utils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    private static final ThreadLocalRandom RANDOM = ThreadLocalRandom.current();

    public static int getNumberInRange(final int inclusiveBegin, final int exclusiveEnd) {
        return RANDOM.nextInt(inclusiveBegin, exclusiveEnd);
    }

    public static boolean getBooleanByPercentage(final double percentage) {
        validatePercentage(percentage);
        return Math.random() <  percentage / 100;
    }

    private static void validatePercentage(final double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("percentage must be less than 100 and greater than 0");
        }
    }
}
