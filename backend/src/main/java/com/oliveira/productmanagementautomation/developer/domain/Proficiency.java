package com.oliveira.productmanagementautomation.developer.domain;

public enum Proficiency {
    NEWBIE(1),
    BEGINNER(2),
    INTERMEDIATE(3),
    ADVANCED(4),
    EXPERT(5);

    private final int level;

    Proficiency(int level) {
        this.level = level;
    }

    public boolean isAtLeast(Proficiency other) {
        return level >= other.level;
    }
}
