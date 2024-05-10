package tn.esprit.firstprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstprojectesprit.Entity.Bloc;

public interface BlocRepo extends JpaRepository <Bloc,Long> {
}
