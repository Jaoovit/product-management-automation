package com.oliveira.productmanagementautomation.developer.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Developer {
    private UUID id;
    private String name;
    private String email;
    private Seniority seniority;
    private Map<Skill, Proficiency> skills;

    Developer(UUID id, String name, String email, Seniority seniority) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.seniority = seniority;
        this.skills = new HashMap<>();
    }
}
