package com.oliveira.productmanagementautomation.developer.application;

import com.oliveira.productmanagementautomation.developer.domain.Developer;
import com.oliveira.productmanagementautomation.developer.domain.DeveloperId;

public class GetDeveloperProfile {

    private final DeveloperRepository developerRepository;

    public GetDeveloperProfile(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    public DeveloperProfile execute(DeveloperId developerId) {
        Developer developer = developerRepository.findById(developerId)
                .orElseThrow(() -> new RuntimeException("Developer not found"));

        return new DeveloperProfile(
                developer.getDeveloperId(),
                developer.getName(),
                developer.getEmail(),
                developer.getSeniority(),
                developer.getSkills()
        );
    }
}
