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
public class Reservation {
    @Id
    String idreservation ;
    String anneeuniversitaire ;
    boolean estvalide ;


    @OneToMany (mappedBy = "chambre")
    private Set<Chambre> chambres;

}