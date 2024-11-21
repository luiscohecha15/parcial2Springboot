package com.example.servicioLosOriginales.repository;

import com.example.servicioLosOriginales.model.Capitulo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CapituloRepository extends JpaRepository<Capitulo, Long> {
    List<Capitulo> findByTemporadaId(Long temporadaId);
}
