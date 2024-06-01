package tn.esprit.firstprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.firstprojectesprit.Entity.Foyer;
import tn.esprit.firstprojectesprit.Entity.Universite;
import tn.esprit.firstprojectesprit.Entity.User;
@Repository
public interface UniversiteRepo extends JpaRepository<Universite,Long> {
   // Universite numuniversite(String numuniversite);
    @Query("select universite from Universite universite where universite.numuniversite=:numuniversite")
 //   Universite chercherParnomFoyer(@Param("nom") String nomFoyer) ;


    Universite findByNumuniversite(String nom) ;

}
