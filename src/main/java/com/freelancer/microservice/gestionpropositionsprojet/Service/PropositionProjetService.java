package com.freelancer.microservice.gestionpropositionsprojet.Service;

import com.freelancer.microservice.gestionpropositionsprojet.Entity.PropositionProjet;
import com.freelancer.microservice.gestionpropositionsprojet.Repositories.PropositionprojetRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j

public class PropositionProjetService implements IPropositionProjetService {
    @Autowired
    private PropositionprojetRepo propositionProjetRepository;

    public PropositionProjet createPropositionProjet(PropositionProjet propositionProjet) {
        return propositionProjetRepository.save(propositionProjet);
    }

    public PropositionProjet getPropositionProjetById(Long id) {
        return propositionProjetRepository.findById(id).orElse(null);
    }
    public PropositionProjet updatePropositionProjet( Long id,PropositionProjet propositionProjet) {
        propositionProjet.setId(id);
        return propositionProjetRepository.save(propositionProjet);
    }

    public void deletePropositionProjet(Long id) {
        propositionProjetRepository.deleteById(id);
    }

    public List<PropositionProjet> getPropositionsProjets() {
        return  propositionProjetRepository.findAll();
    }
}
