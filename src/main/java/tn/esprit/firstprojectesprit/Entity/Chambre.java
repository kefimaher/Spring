package tn.esprit.firstprojectesprit.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idchambre ;
    Long numerochambre ;
    @Enumerated (EnumType.STRING)
    TypeChambre typec ;
    @ManyToOne
    private Bloc blocs;
    @OneToMany(mappedBy = "chambre")
    private Set<Reservation> reservations;

}