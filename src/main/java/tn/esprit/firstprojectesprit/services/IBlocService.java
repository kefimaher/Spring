package tn.esprit.firstprojectesprit.services;

import tn.esprit.firstprojectesprit.Entity.Bloc;
import tn.esprit.firstprojectesprit.Entity.Etudiant;

public interface IBlocService {
    Bloc ajouterBloc(Bloc bloc);
    Bloc supprimeBloc(Bloc bloc);
    Bloc modifierBloc(Bloc bloc);
    Bloc chercherBloc(long id);
    Bloc desacffecterBF(long id) ;
}
