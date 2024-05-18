package tn.esprit.firstprojectesprit.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idfilm ;
    String nom ;
    Date dateproduction ;
    @Enumerated(EnumType.STRING)
    Typefilm typefilm ;


    /*
    @ManyToMany
    private Set<Salle> salles = new HashSet<>();
      */
}
