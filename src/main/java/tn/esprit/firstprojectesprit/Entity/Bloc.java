package tn.esprit.firstprojectesprit.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
   private Long idbloc ;
   private String  nombloc ;
   private Long capacitebloc ;
    @ManyToOne (cascade =  CascadeType.ALL )
         //   @JsonIgnore
    Foyer foyer ;
    @OneToMany(mappedBy = "blocs")
    private Set<Chambre> chambres;
}
