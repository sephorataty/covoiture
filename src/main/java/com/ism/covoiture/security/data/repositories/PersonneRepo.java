package com.ism.covoiture.security.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ism.covoiture.security.data.entity.Personne;

public interface PersonneRepo extends JpaRepository<Personne, Long> {
    Personne findByUsername(String username);
    
}
