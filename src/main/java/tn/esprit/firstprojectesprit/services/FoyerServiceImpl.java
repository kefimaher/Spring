package tn.esprit.firstprojectesprit.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstprojectesprit.Entity.Foyer;
import tn.esprit.firstprojectesprit.repositories.FoyerRepo;

import java.util.Optional;

@AllArgsConstructor
@Service
public class FoyerServiceImpl implements  IFoyerService{
    FoyerRepo foyerRepo ;
    @Override
   public Foyer ajouterFoyer(Foyer foyer) {
        return foyerRepo.save(foyer) ;
    }
    @Override
    public Foyer supprimeFoyer(Foyer foyer) {
        foyerRepo.delete(foyer);
        return foyerRepo.findById(foyer.getIdfoyer()).orElse(null);
    }
    @Override
    public Foyer modifierFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public Foyer chercherFoyer(long id) {
        return foyerRepo.findById(id).orElse(null);
    }

}
