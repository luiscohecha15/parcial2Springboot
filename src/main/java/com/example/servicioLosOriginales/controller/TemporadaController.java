package com.example.servicioLosOriginales.controller;

import com.example.servicioLosOriginales.model.Temporada;
import com.example.servicioLosOriginales.repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/temporadas")
public class TemporadaController {

    @Autowired
    private TemporadaRepository temporadaRepository;

    @GetMapping
    public List<Temporada> getAllTemporadas() {
        return temporadaRepository.findAll();
    }
}

