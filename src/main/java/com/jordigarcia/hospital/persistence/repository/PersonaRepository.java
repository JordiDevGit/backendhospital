package com.jordigarcia.hospital.persistence.repository;

import com.jordigarcia.hospital.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
