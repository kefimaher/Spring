package tn.esprit.firstprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstprojectesprit.Entity.Chambre;
import tn.esprit.firstprojectesprit.Entity.Etudiant;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {
}
