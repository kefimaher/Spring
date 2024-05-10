package tn.esprit.firstprojectesprit.Entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long iduniversite ;
    String numuniversite ;
    String adresse ;

    @OneToOne
    private Foyer foyer;
}
