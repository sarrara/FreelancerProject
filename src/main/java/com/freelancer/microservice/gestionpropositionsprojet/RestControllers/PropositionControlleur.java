package com.freelancer.microservice.gestionpropositionsprojet.RestControllers;

import com.freelancer.microservice.gestionpropositionsprojet.Entity.PropositionProjet;
import com.freelancer.microservice.gestionpropositionsprojet.Service.PropositionProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/proposition")
public class PropositionControlleur {



    @GetMapping("/ListePropositionsProjets")
    List<PropositionProjet> getPropositionsProjets() {
        return propositionProjetService.getPropositionsProjets();
    }





    @Autowired
    private PropositionProjetService propositionProjetService;

    // Create (Insert) a New Proposition Projet
    @PostMapping("/add")
    public PropositionProjet createPropositionProjet(@RequestBody PropositionProjet propositionProjet) {
        return propositionProjetService.createPropositionProjet(propositionProjet);
    }

    // Read (Retrieve) a Proposition Projet by ID
    @GetMapping("getbyid/{id}")
    public PropositionProjet getPropositionProjetById(@PathVariable Long id) {
        return propositionProjetService.getPropositionProjetById(id);
    }

    // Update a Proposition Projet
    @PutMapping("update/{id}")
    public PropositionProjet updatePropositionProjet(@PathVariable Long id, @RequestBody PropositionProjet propositionProjet) {
        propositionProjet.setId(id);
        return propositionProjetService.updatePropositionProjet(id,propositionProjet);
    }


    // Delete a Proposition Projet by ID
    @DeleteMapping("/delete/{id}")
    public void deletePropositionProjet(@PathVariable Long id) {
        propositionProjetService.deletePropositionProjet(id);
    }
}
