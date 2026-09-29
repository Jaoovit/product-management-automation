package com.oliveira.productmanagementautomation.developer.application;

import com.oliveira.productmanagementautomation.developer.domain.Developer;

public interface DeveloperRepository {
    boolean existsByName(String name);
    boolean existsByEmail(String email);
    void save(Developer developer);
}
