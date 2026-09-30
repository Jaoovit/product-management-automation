package com.oliveira.productmanagementautomation.developer.application;

import com.oliveira.productmanagementautomation.developer.domain.Developer;
import com.oliveira.productmanagementautomation.developer.domain.DeveloperId;

import java.util.Optional;

public interface DeveloperRepository {
    boolean existsByName(String name);
    boolean existsByEmail(String email);
    void save(Developer developer);


    Optional<Developer> findById(DeveloperId developerId);
}
