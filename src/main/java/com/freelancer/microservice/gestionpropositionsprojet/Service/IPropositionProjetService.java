package com.freelancer.microservice.gestionpropositionsprojet.Service;

import com.freelancer.microservice.gestionpropositionsprojet.Entity.PropositionProjet;

import java.util.List;

public interface IPropositionProjetService {
    public PropositionProjet createPropositionProjet(PropositionProjet propositionProjet) ;

    public PropositionProjet getPropositionProjetById(Long id) ;
    public PropositionProjet updatePropositionProjet( Long id,PropositionProjet propositionProjet) ;


    public void deletePropositionProjet(Long id);

    public List<PropositionProjet> getPropositionsProjets() ;
}
