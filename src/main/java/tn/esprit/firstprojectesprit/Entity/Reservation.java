package tn.esprit.firstprojectesprit.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String idreservation ;
    String anneeuniversitaire ;
    boolean estvalide ;
    @ManyToOne
    @JoinColumn(name = "idchambre")
    private Chambre chambre;
    @ManyToMany(mappedBy = "reservations")
    private Set<Etudiant> etudiants = new HashSet<>();
}