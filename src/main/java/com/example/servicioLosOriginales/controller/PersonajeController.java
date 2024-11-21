package com.example.servicioLosOriginales.controller;

import com.example.servicioLosOriginales.model.Personaje;
import com.example.servicioLosOriginales.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personajes")
public class PersonajeController {

    @Autowired
    private PersonajeRepository personajeRepository;

    @GetMapping
    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }
}
