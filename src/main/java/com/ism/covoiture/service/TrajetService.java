package com.ism.covoiture.service;

import com.ism.covoiture.data.entities.Trajet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TrajetService {
    Trajet getTrajetById(long id);
    Page<Trajet> getAllTrajetsByDestination(String destination, Pageable pageable);
    Page<Trajet> getAllTrajetsByDepart(String depart, Pageable pageable);
}
