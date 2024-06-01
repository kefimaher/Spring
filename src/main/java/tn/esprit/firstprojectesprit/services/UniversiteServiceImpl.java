package tn.esprit.firstprojectesprit.services;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.firstprojectesprit.Entity.Foyer;
import tn.esprit.firstprojectesprit.Entity.Universite;
import tn.esprit.firstprojectesprit.repositories.FoyerRepo;
import tn.esprit.firstprojectesprit.repositories.UniversiteRepo;

@AllArgsConstructor
@Service
@Slf4j
public class UniversiteServiceImpl implements  IUniversite {
    UniversiteRepo universiteRepo;
    FoyerRepo foyerRepo;

    @Override
    public Universite affecterFoyerAuniversite(long idFoyer, String nomUniversite) {
        // Recherche
        Universite universite = universiteRepo.findByNumuniversite(nomUniversite);
        Foyer foyer = foyerRepo.findById(idFoyer).orElse(null);
        // Affectatin
           if (universite != null && foyer != null) {
             universite.setFoyer(foyer);
            universiteRepo.save(universite);
            return universite;
        } else {
            log.error("Foyer or Universite not found");
        }
        return universite;
    }


}
