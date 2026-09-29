package com.oliveira.productmanagementautomation.developer.application;

import com.oliveira.productmanagementautomation.developer.domain.Developer;
import com.oliveira.productmanagementautomation.developer.domain.Seniority;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class RegisterDeveloperTest {

    @Test
    void registersAndSavesDeveloper() {
        InMemoryDeveloperRepository repository = new InMemoryDeveloperRepository();
        RegisterDeveloper useCase = new RegisterDeveloper(repository);

        Developer result = useCase.execute(
                "John Doe",
                "john_doe@example.com",
                Seniority.JUNIOR
        );

        assertSame(result, repository.savedDevelopers.getFirst());
        assertEquals("John Doe", result.getName());
        assertEquals("john_doe@example.com", result.getEmail());
    }

    private static class InMemoryDeveloperRepository implements DeveloperRepository {
        private final List<Developer> savedDevelopers = new ArrayList<>();

        @Override
        public boolean existsByName(String name) {
            return savedDevelopers.stream()
                    .anyMatch(developer -> developer.getName().equals(name));
        }

        @Override
        public boolean existsByEmail(String email) {
            return savedDevelopers.stream()
                    .anyMatch(developer -> developer.getEmail().equals(email));
        }

        @Override
        public void save(Developer developer) {
            savedDevelopers.add(developer);
        }
    }
}