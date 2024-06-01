package tn.esprit.firstprojectesprit.restController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstprojectesprit.Entity.Universite;
import tn.esprit.firstprojectesprit.services.IUniversite;

@RestController
@AllArgsConstructor
@RequestMapping("/universite-rest-controller")
public class UniversiteRestController {
   // IUniversite universiteService ;
    private final IUniversite universiteService;

    @PostMapping(path = "/universite/{idFoyer}/{nomUniversite}")
    public Universite affecterFoyerAuniversite(@PathVariable long idFoyer, @PathVariable String nomUniversite) {
        {
            return universiteService.affecterFoyerAuniversite(idFoyer, nomUniversite);
        }
    }
}
