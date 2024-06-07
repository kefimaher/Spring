package tn.esprit.firstprojectesprit.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.firstprojectesprit.Entity.Bloc;
import tn.esprit.firstprojectesprit.Entity.Foyer;
import tn.esprit.firstprojectesprit.repositories.BlocRepo;
import tn.esprit.firstprojectesprit.repositories.FoyerRepo;

import java.util.Optional;

@AllArgsConstructor
@Service
@Slf4j
public class FoyerServiceImpl implements  IFoyerService{
    FoyerRepo foyerRepo ;
    BlocRepo blocRepo ;

    @Override

   public Foyer ajouterFoyer(Foyer foyer) {
        return foyerRepo.save(foyer) ;
    }
    @Override
    public Foyer supprimeFoyer(Foyer foyer) {
        foyerRepo.delete(foyer);
        log.info(foyer.toString());
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

    @Override
    public Foyer affecteroyerABloc(String nomfoyer, Bloc bloc) {
        // recupuration
        Foyer foyer  = foyerRepo.findFoyersByNomfoyer(nomfoyer);
      // affectatipn
        bloc.setFoyer(foyer);
        // save
       blocRepo.save(bloc) ;
        return foyerRepo.findByNomfoyer(nomfoyer);
    }

    @Override
    public Foyer AjouterFoyeraffecterabloc(Foyer foyer) {
        for  (Bloc bloc:foyer.getBlocs()){
            bloc.setFoyer(foyer) ;
        }
        return foyerRepo.save(foyer);
    }


}
