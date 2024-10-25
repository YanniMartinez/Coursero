package com.marInc.cursero_platform.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer nota; // Puntuación dada
    private String comentario;

    @OneToOne
    private Entrega entrega;

    // Getters y Setters
}
