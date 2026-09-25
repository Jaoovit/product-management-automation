package com.oliveira.productmanagementautomation.developer.domain;

import java.util.UUID;

public class Skill {
    private UUID id;
    private String name;
    private String description;

    Skill(UUID id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
