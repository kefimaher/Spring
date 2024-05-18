package tn.esprit.firstprojectesprit.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idsalle ;
    String  nom ;
    int capacitesalle ;
}
