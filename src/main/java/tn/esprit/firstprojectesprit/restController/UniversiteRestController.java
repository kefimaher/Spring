package tn.esprit.firstprojectesprit.restController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstprojectesprit.Entity.Bloc;
import tn.esprit.firstprojectesprit.Entity.Foyer;
import tn.esprit.firstprojectesprit.Entity.Universite;
import tn.esprit.firstprojectesprit.services.IFoyerService;
import tn.esprit.firstprojectesprit.services.IUniversite;

@RestController
@AllArgsConstructor
@RequestMapping("/universite-rest-controller")
public class UniversiteRestController {
    IUniversite universiteService ;
    @PostMapping(path = "/universite")
    public Universite affecterFoyerAuniversite(@PathVariable long idFoyer, @PathVariable String nomUniversite) {
        {
            return universiteService.affecterFoyerAuniversite(idFoyer, nomUniversite);
        }
    }
}
