package com.oliveira.productmanagementautomation.developer.domain;

import java.util.UUID;

public record DeveloperId(UUID id) {
    public static DeveloperId generate() {
        return new DeveloperId(UUID.randomUUID());
    }
}
