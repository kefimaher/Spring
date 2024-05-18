package tn.esprit.firstprojectesprit.Entity;
import jakarta.persistence.*;
import java.util.Date;
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idfilm ;
    String nom ;
    Date dateproduction ;
    @Enumerated(EnumType.STRING)
    Typefilm typefilm ;
}
