package com.example.servicioLosOriginales.controller;

import com.example.servicioLosOriginales.model.Serie;
import com.example.servicioLosOriginales.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/serie")
public class SerieController {

    @Autowired
    private SerieRepository serieRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Serie> getSerieById(@PathVariable Long id) {
        Optional<Serie> serie = serieRepository.findById(id);
        return serie.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}


