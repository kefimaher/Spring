package tn.esprit.firstprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstprojectesprit.Entity.Foyer;

@Repository
public interface FoyerRepo extends JpaRepository<Foyer,Long> {

}
