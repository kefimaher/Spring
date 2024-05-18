package tn.esprit.firstprojectesprit.services;

import tn.esprit.firstprojectesprit.Entity.Etudiant;
import tn.esprit.firstprojectesprit.Entity.Foyer;

public interface IEtudiantService {
    Etudiant ajouterEtudiant(Etudiant etudiant);
    Etudiant supprimeEtudiant(Etudiant etudiant);
    Etudiant modifierEtudiant(Etudiant etudiant);
    Etudiant chercherEtudiant(long id);
}
