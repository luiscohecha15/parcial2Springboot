package com.example.servicioLosOriginales.repository;


import java.util.List;

import com.example.servicioLosOriginales.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SerieRepository extends JpaRepository<Serie, Long> {

    // Ejemplo de consulta personalizada para buscar por nombre
    List<Serie> findByNombre(String nombre);

    // Consulta con JPQL para obtener todas las series con una clasificación específica
    @Query("SELECT s FROM Serie s WHERE s.clasificacion = ?1")
    List<Serie> findByClasificacion(Double clasificacion);
}

