package tn.esprit.firstprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.firstprojectesprit.Entity.Foyer;

import java.util.List;

@Repository
public interface FoyerRepo extends JpaRepository<Foyer, Long> {
    Foyer findByNomfoyer(String nom);
   @Query ("select foyer from Foyer foyer where foyer.nomfoyer=:nom")
    Foyer chercherParnomFoyer(@Param("nom") String nomFoyer) ;

}
