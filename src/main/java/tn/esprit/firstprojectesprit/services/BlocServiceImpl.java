package tn.esprit.firstprojectesprit.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import tn.esprit.firstprojectesprit.Entity.Bloc;
import tn.esprit.firstprojectesprit.Entity.Chambre;
import tn.esprit.firstprojectesprit.repositories.BlocRepo;
import tn.esprit.firstprojectesprit.repositories.ChambreRepo;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j

public class BlocServiceImpl implements IBlocService {
    ChambreRepo chambreRepo ;
    BlocRepo blocRepo ;
    @Override
    public Bloc ajouterBloc(Bloc bloc) {

        return blocRepo.save(bloc) ;
    }

    @Override
    public Bloc supprimeBloc(Bloc bloc) {
        blocRepo.delete(bloc);
        return blocRepo.findById(bloc.getIdbloc()).orElse(null);
    }

    @Override
    public Bloc modifierBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc chercherBloc(long id) {
        return blocRepo.findById(id).orElse(null);
    }



    public Bloc desacffecterBF(long idbloc) {
        Bloc bloc=blocRepo.findById(idbloc).orElse(null) ;
        bloc.setFoyer(null);
      return   blocRepo.save(bloc);
    }


@Scheduled(fixedRate = 60000) // toutes les 60 seconde
// @Scheduled(fixedDelay = 5000)    toutes les 60 seconde + temp de reponce
// @Scheduled(cron = "5 * * * * *"); // date fixe 5 eme de chaqque
void recette () {
        log.info("Relance automatiquemnt ") ;

}

}
