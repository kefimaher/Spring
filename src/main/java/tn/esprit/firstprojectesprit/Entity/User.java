package tn.esprit.firstprojectesprit.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// @EqualsAndHashCode
// @ToString
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long Iduser ;
    String firstname ;
    String lastname ;
    LocalDate datebirth ;
    @Enumerated (EnumType.STRING)
    Role role ;


}
