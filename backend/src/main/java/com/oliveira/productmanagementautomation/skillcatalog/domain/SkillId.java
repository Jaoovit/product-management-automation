package com.oliveira.productmanagementautomation.skillcatalog.domain;

import java.util.UUID;

public record SkillId(UUID id) {
    public static SkillId generate() {
        return new SkillId(UUID.randomUUID());
    }
}
