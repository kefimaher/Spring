package tn.esprit.firstprojectesprit.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idcinema ;
    String nom ;
    String adresse ;
    int telephone ;



    @OneToMany (mappedBy = "cinema")
    private Set<Salle> salles;
}
