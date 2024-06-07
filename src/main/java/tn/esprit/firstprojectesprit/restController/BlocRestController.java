package tn.esprit.firstprojectesprit.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstprojectesprit.Entity.Bloc;
import tn.esprit.firstprojectesprit.services.IBlocService;

@RestController
@AllArgsConstructor
public class BlocRestController {
    IBlocService blocService ;
@PostMapping("/bloc-foyer")
    Bloc ajouterBlocetFoyerParCascade(@RequestBody Bloc bloc){
    return blocService.ajouterBloc(bloc) ;
    }
    @PutMapping("/bloc-deaffecter-foyer/{id-bloc}")
    Bloc desacffecterBF(@PathVariable("id-bloc") long idbloc){
    return blocService.desacffecterBF(idbloc) ;

    }
}
