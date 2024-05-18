package tn.esprit.firstprojectesprit.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
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

   @DeleteMapping (path = "/foyer")
    public Foyer supprimeFoyer(@RequestBody Foyer foyer) {
       return foyerService.supprimeFoyer(foyer);

    }

    @GetMapping(path = "/foyer")
    public Foyer modifierFoyer(Foyer foyer) {

        return foyerService.modifierFoyer(foyer);
    }
    @GetMapping(path = "/foyer/{id-foyer}")
    public Foyer chercherFoyer(@PathVariable("id-foyer") long id) {
        return foyerService.chercherFoyer(id) ;
    }


}
