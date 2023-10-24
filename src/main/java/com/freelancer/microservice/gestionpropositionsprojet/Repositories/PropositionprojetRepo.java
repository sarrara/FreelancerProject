package com.freelancer.microservice.gestionpropositionsprojet.Repositories;

import com.freelancer.microservice.gestionpropositionsprojet.Entity.PropositionProjet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropositionprojetRepo extends JpaRepository<PropositionProjet, Long> {
}

