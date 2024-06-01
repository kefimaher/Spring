package tn.esprit.firstprojectesprit.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Foyer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idfoyer ;
    String nomfoyer ;
    Long capacitefoyer ;
    @OneToOne
    private Universite universite;

    @OneToMany (mappedBy = "foyer")
    private Set<Bloc> blocs;
}


