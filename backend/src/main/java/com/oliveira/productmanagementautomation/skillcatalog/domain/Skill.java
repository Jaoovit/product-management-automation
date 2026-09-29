package com.oliveira.productmanagementautomation.skillcatalog.domain;

import java.util.Locale;

public class Skill {
    private final SkillId skillId;
    private String name;
    private String description;

    private Skill (SkillId skillId) {
        this.skillId = skillId;
    }

    public static Skill create(String name, String description) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Skill name cannot be null or blank");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Skill description cannot be null or blank");
        }

        Skill skill = new Skill(SkillId.generate());
        skill.name = name.trim().toLowerCase();
        skill.description = description.trim();
        return skill;
    }
}
