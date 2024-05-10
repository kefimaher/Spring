package tn.esprit.firstprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstprojectesprit.Entity.Chambre;

@Repository
public interface ChambreRepo  extends JpaRepository<Chambre,Long> {
}
