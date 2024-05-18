package tn.esprit.firstprojectesprit.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idsalle ;
    String  nom ;
    int capacitesalle ;
}
