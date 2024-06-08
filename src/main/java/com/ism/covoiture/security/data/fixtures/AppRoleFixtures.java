package com.ism.covoiture.security.data.fixtures;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ism.covoiture.security.services.Service;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AppRoleFixtures implements CommandLineRunner {
    private final Service service;
    
    @Override
    public void run(String... args) throws Exception {
        service.saveRole("conducteur");
        service.saveRole("passager");
        service.saveRole("admin");
    }
    
}
