package com.example.servicioLosOriginales.service;

import com.example.servicioLosOriginales.model.Serie;
import com.example.servicioLosOriginales.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SerieService {

    @Autowired
    private SerieRepository serieRepository;

    public Optional<Serie> getSerieById(Long id) {
        return serieRepository.findById(id);
    }
}

