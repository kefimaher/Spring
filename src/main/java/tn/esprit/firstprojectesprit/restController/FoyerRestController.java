package tn.esprit.firstprojectesprit.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.firstprojectesprit.Entity.Foyer;
import tn.esprit.firstprojectesprit.services.IFoyerService;

@RestController
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService foyerService ;

    @PostMapping(path = "/foyer")
    public Foyer ajouterFoyer(@RequestBody Foyer foyer)
    {
        return foyerService.ajouterFoyer(foyer) ;
    }


    public Foyer supprimeFoyer(Foyer foyer) {
       return foyerService.supprimeFoyer(foyer);

    }

    public Foyer modifierFoyer(Foyer foyer) {

        return foyerService.modifierFoyer(foyer);
    }

    public Foyer chercherFoyer(long id) {
        return foyerService.chercherFoyer(id) ;
    }


}
