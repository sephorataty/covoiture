package com.ism.covoiture.security.data.fixtures;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ism.covoiture.security.services.Service;

@Component
public class PersonneFixtures implements CommandLineRunner  {
    private Service services;

    @Override
    public void run(String... args) throws Exception {
        services.saveUser("wane","wane@gmail.com","774114114","passer");
        services.addRoleToUser("wane", "conducteur");
        services.addRoleToUser("bbw", "Admin");
        services.saveUser("benrnado","benrnado@gmail.com","774114114","passer");
        services.addRoleToUser("carlos", "passager");
        services.addRoleToUser("Admin", "Admin");
        services.saveUser("Admin","admin@gmail.com","774114114","passer");
        services.saveUser("carolos","carolos@gmail.com","774114114","passer");
        services.addRoleToUser("Him", "passager");
    
    }
    
}
