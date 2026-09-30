package com.oliveira.productmanagementautomation.developer.application;

import com.oliveira.productmanagementautomation.developer.domain.Developer;
import com.oliveira.productmanagementautomation.developer.domain.DeveloperId;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class GetDeveloperProfileTest {

    @Test
    void getDeveloperProfileTest() {
        InMemoryDeveloperRepository repository = new InMemoryDeveloperRepository();
        GetDeveloperProfile useCase = new GetDeveloperProfile(repository);
    }

    private static class InMemoryDeveloperRepository implements DeveloperRepository {
        @Override
        public boolean existsByName(String name) {
            return false;
        }

        @Override
        public boolean existsByEmail(String email) {
            return false;
        }

        @Override
        public void save(Developer developer) {

        }

        @Override
        public Optional<Developer> findById(DeveloperId developerId) {
            return Optional.empty();
        }


    }
}
