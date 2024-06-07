package tn.esprit.firstprojectesprit.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstprojectesprit.Entity.Bloc;
import tn.esprit.firstprojectesprit.repositories.BlocRepo;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {

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
}
