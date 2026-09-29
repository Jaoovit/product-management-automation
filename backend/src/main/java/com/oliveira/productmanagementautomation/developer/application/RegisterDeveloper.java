package com.oliveira.productmanagementautomation.developer.application;

import com.oliveira.productmanagementautomation.developer.domain.Developer;
import com.oliveira.productmanagementautomation.developer.domain.Seniority;

public class RegisterDeveloper {
    private final DeveloperRepository developerRepository;

    public RegisterDeveloper(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    public Developer execute(String name, String email, Seniority seniority) {
        Developer developer = Developer.register(name, email, seniority);

        if (developerRepository.existsByName(developer.getName())) {
            throw new IllegalArgumentException(
                    "Developer with name " + developer.getName() + " already exists");
        }
        if (developerRepository.existsByEmail(developer.getEmail())) {
            throw new IllegalArgumentException(
                    "Developer with email " + developer.getEmail() + " already exists");
        }

        developerRepository.save(developer);
        return developer;
    }
}
