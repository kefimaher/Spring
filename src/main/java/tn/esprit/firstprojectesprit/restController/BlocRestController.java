package tn.esprit.firstprojectesprit.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
}
