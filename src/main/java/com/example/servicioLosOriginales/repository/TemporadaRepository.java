package com.example.servicioLosOriginales.repository;

import com.example.servicioLosOriginales.model.Serie;
import com.example.servicioLosOriginales.model.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TemporadaRepository extends JpaRepository<Temporada, Long> {
    List<Temporada> findBySerieId(Long serieId);
}