package tn.esprit.firstprojectesprit.services;

import tn.esprit.firstprojectesprit.Entity.Foyer;

public interface IFoyerService {
    Foyer ajouterFoyer(Foyer foyer);
    Foyer supprimeFoyer(Foyer foyer);
    Foyer modifierFoyer(Foyer foyer);
    Foyer chercherFoyer(Foyer foyer);
  }
