package com.example.servicioLosOriginales.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Capitulo {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private String titulo;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "temporada_id")
    private Temporada temporada;

    // Getters y setters
}