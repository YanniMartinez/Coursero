package com.marInc.cursero_platform.models;

import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Asignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descripcion;
    private LocalDate fechaEntrega;

    @ManyToOne
    private Curso curso;

    @OneToMany(mappedBy = "asignacion")
    private List<Entrega> entregas;

    @ManyToOne
    private Alumno alumno;
    // Getters y Setters
}
