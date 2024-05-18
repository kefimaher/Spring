package tn.esprit.firstprojectesprit.services;

import tn.esprit.firstprojectesprit.Entity.Chambre;

public interface IChambreService {
    Chambre ajouterChambre(Chambre chambre);
    Chambre supprimeChambre(Chambre chambre);
    Chambre modifierChambre(Chambre chambre);
    Chambre chercherChambre(long chambre);
}
