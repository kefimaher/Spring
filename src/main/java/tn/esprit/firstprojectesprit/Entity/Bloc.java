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
public class Bloc {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idbloc ;
    Long numerochambre ;
    Long capacitebloc ;


    @ManyToOne
    Foyer foyer ;

    @OneToMany
    private Set<Chambre> chambres;

}
