package com.jordigarcia.hospital.controller;

import com.jordigarcia.hospital.entities.Persona;
import com.jordigarcia.hospital.persistence.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaRepository personaRepository;

    @PostMapping("/")
    public void createPersona(@RequestBody Persona persona){
        personaRepository.save(persona);
    }

    @DeleteMapping("/{id}")
    public void deletePersona(@PathVariable("id") Integer id) {
        Persona p = new Persona();
        p.setPersonaId(id);
        personaRepository.delete(p);
    }

    @GetMapping
    public List<Persona> selectPersona() {
        return personaRepository.findAll();
    }

    @PutMapping("/{id}")
    public void updatePeople(@RequestBody Persona persona, @PathVariable("id") Integer id) {
        persona.setPersonaId(id);
        personaRepository.save(persona);
    }
}
