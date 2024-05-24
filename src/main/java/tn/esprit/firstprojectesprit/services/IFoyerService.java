package tn.esprit.firstprojectesprit.services;

import tn.esprit.firstprojectesprit.Entity.Bloc;
import tn.esprit.firstprojectesprit.Entity.Foyer;

public interface IFoyerService {
    Foyer ajouterFoyer(Foyer foyer);
    Foyer supprimeFoyer(Foyer foyer);
    Foyer modifierFoyer(Foyer foyer);
    Foyer chercherFoyer(long id);
     Foyer affecteroyerABloc (String nomfoyer , Bloc bloc) ;
  }
