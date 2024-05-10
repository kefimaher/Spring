package tn.esprit.firstprojectesprit.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

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
}
