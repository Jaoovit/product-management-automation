package com.oliveira.productmanagementautomation.developer.domain;

import com.oliveira.productmanagementautomation.skillcatalog.domain.SkillId;

import java.util.HashMap;
import java.util.Map;

public class Developer {
    private final DeveloperId developerId;
    private String name;
    private String email;
    private Seniority seniority;
    private final Map<SkillId, Proficiency> skills;

    private Developer(DeveloperId developerId, String name, String email, Seniority seniority) {
        this.developerId = developerId;
        this.name = name;
        this.email = email;
        this.seniority = seniority;
        this.skills = new HashMap<>();
    }

    public static Developer register(String name, String email, Seniority seniority) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Developer name cannot be null or blank");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Developer email cannot be null or blank");
        }
        if (seniority == null) {
            throw new IllegalArgumentException("Developer seniority cannot be null");
        }

        return new Developer(
                DeveloperId.generate(),
                name.trim(),
                email.trim(),
                seniority
        );
    }

    public void addSkill(SkillId skillId, Proficiency proficiency) {
        if (skillId == null) {
            throw new IllegalArgumentException("Skill ID cannot be null");
        }

        if (skills.containsKey(skillId)) {
            throw new IllegalArgumentException("Skill already exists for this developer");
        }

        if (proficiency == null) {
            throw new IllegalArgumentException("Proficiency cannot be null");
        }

        skills.put(skillId, proficiency);
    }

    public void updateSkillProficiency(SkillId skillId, Proficiency proficiency) {
        if (skillId == null) {
            throw new IllegalArgumentException("Skill ID cannot be null");
        }
        if (proficiency == null) {
            throw new IllegalArgumentException("Proficiency cannot be null");
        }
        if (!skills.containsKey(skillId)) {
            throw new IllegalArgumentException("Skill not found for this developer");
        }

        skills.put(skillId, proficiency);
    }

    public void updateSeniority(Seniority seniority) {
        if (seniority == null) {
            throw new IllegalArgumentException("Seniority cannot be null");
        }
        this.seniority = seniority;
    }
}
