package com.oliveira.productmanagementautomation.developer.domain;

public enum Seniority {
    JUNIOR(1),
    MID_LEVEL(2),
    SENIOR(3);

    private final int level;

    Seniority(int level) {
        this.level = level;
    }

    public boolean isAtLeast(Seniority other) {
        return level >= other.level;
    }

    public Seniority nextLevel() {
        return switch (this) {
            case JUNIOR -> MID_LEVEL;
            case MID_LEVEL -> SENIOR;
            case SENIOR -> throw new IllegalStateException(
                    "Senior is already the highest level");
        };
    }
}
