package tn.esprit.firstprojectesprit.services;

import tn.esprit.firstprojectesprit.Entity.Etudiant;
import tn.esprit.firstprojectesprit.repositories.EtudiantRepo;


public class EtudinatServicesImpl implements IEtudiantService{
    EtudiantRepo etudiantRepo ;
    public Etudiant ajouterEtudiant(Etudiant etudiant) {

        return etudiantRepo.save(etudiant) ;
    }
    public Etudiant supprimeEtudiant(Etudiant etudiant) {
        etudiantRepo.delete(etudiant);
        return etudiantRepo.findById(etudiant.getIdetudinat()).orElse(null);
    }
    public Etudiant modifierEtudiant(Etudiant etudiant) {

        return etudiantRepo.save(etudiant);
    }

    public Etudiant chercherEtudiant(long id) {
        return etudiantRepo.findById(id).orElse(null);
    }
}
