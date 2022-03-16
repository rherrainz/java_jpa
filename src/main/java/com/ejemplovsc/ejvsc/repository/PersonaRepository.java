package com.ejemplovsc.ejvsc.repository;

import com.ejemplovsc.ejvsc.model.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonaRepository extends JpaRepository<Persona, Long> {

    

    
}
