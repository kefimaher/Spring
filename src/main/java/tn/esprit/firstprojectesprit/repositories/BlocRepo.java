package tn.esprit.firstprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstprojectesprit.Entity.Bloc;
@Repository
public interface BlocRepo extends JpaRepository <Bloc,Long> {
}
