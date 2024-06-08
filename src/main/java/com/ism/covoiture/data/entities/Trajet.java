package com.ism.covoiture.data.entities;

import com.ism.covoiture.security.data.entity.Personne;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "trajet")
public class Trajet extends AbstractEntity{
    private Double prix;
    private Date date;
    @ManyToOne
    private Personne conducteur;
    @ManyToMany
    private List<Personne> passagers;
    @ManyToOne
    private Lieu depart;
    @ManyToOne
    private Lieu destination;
    @OneToMany
    private List<Lieu> arrets = new ArrayList<>();
    private Double pourboire;
    private Integer notation;
    private String commentaire;
}
