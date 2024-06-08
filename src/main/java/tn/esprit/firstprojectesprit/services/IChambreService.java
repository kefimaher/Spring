package tn.esprit.firstprojectesprit.services;

import tn.esprit.firstprojectesprit.Entity.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre ajouterChambre(Chambre chambre);
    Chambre supprimeChambre(Chambre chambre);
    Chambre modifierChambre(Chambre chambre);
    Chambre chercherChambre(long chambre);

    //  void verifierChambres(List<Long> numChambres);
    // Chambre  affecterlistblocachambre(List<Long> numChambres, Long idbloc) ;
}
