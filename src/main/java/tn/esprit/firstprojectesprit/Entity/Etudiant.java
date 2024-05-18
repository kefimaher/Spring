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
public class Etudiant {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idetudinat ;
    String nomet ;
    String prebomet ;
    Long cin ;
    String ecole  ;
    Date datenaissanse ;
    @ManyToMany
    private Set<Reservation> reservations = new HashSet<>();
}
