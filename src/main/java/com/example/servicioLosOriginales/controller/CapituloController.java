package com.example.servicioLosOriginales.controller;

import com.example.servicioLosOriginales.model.Capitulo;
import com.example.servicioLosOriginales.repository.CapituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/capitulos")
public class CapituloController {

    @Autowired
    private CapituloRepository capituloRepository;

    @GetMapping("/temporada/{temporadaId}")
    public List<Capitulo> getCapitulosByTemporada(@PathVariable Long temporadaId) {
        return capituloRepository.findByTemporadaId(temporadaId);
    }
}
