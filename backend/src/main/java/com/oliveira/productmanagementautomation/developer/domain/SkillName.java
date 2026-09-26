package com.oliveira.productmanagementautomation.developer.domain;

public record SkillName(String name) {

    public SkillName {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Skill name cannot be null or blank");
        if (name.length() > 50) throw new IllegalArgumentException("Skill name cannot be longer than 50 characters");
        name = name.trim();
    }
}
