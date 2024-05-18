package tn.esprit.firstprojectesprit.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

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

    @ManyToOne
    Cinema cinema ;



    @ManyToMany
    private Set<Film> films = new HashSet<>();


}
