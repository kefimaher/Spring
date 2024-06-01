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
public class UniversiteServiceImpl implements  IUniversite{
    UniversiteRepo universiteRepo ;
    FoyerRepo foyerRepo ;
    public Universite affecterFoyerAuniversite ( long idFoyer , String nomUniversite)
    {
        Universite universite = universiteRepo.findByNumuniversite(nomUniversite) ;
        Foyer foyer =foyerRepo.chercherFoyer(long idFoyer) ;
    }
        
}
