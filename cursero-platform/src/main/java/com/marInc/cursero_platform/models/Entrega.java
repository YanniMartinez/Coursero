package com.marInc.cursero_platform.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String archivoUrl; // URL del archivo subido
    private LocalDate fechaEntrega;

    @ManyToOne
    private Asignacion asignacion;

    @ManyToOne
    private Alumno alumno;

    @OneToOne(mappedBy = "entrega")
    private Calificacion calificacion;

    // Getters y Setters
}
