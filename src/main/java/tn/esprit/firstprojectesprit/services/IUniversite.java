package tn.esprit.firstprojectesprit.services;

import tn.esprit.firstprojectesprit.Entity.Bloc;
import tn.esprit.firstprojectesprit.Entity.Foyer;
import tn.esprit.firstprojectesprit.Entity.Universite;

public interface IUniversite {
    Universite affecterFoyerAuniversite(long idFoyer, String nomUniversite);

   Universite desacffecterfoyerauniversite(long iduniversite) ;
}
