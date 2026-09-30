package com.oliveira.productmanagementautomation.developer.application;

import com.oliveira.productmanagementautomation.developer.domain.DeveloperId;
import com.oliveira.productmanagementautomation.developer.domain.Proficiency;
import com.oliveira.productmanagementautomation.developer.domain.Seniority;
import com.oliveira.productmanagementautomation.skillcatalog.domain.SkillId;

import java.util.Map;

public record DeveloperProfile(
        DeveloperId id,
        String name,
        String email,
        Seniority seniority,
        Map<SkillId, Proficiency> skills
) {
    public DeveloperProfile {
        skills = Map.copyOf(skills);
    }
}
