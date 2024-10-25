package com.marInc.cursero_platform.models;

import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    private Profesor profesor;

    @ManyToMany
    @JoinTable( //Llaves primarias de los compas
            name = "curso_alumno",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "alumno_id")
    )
    private List<Alumno> alumnos;

    @OneToMany(mappedBy = "curso")
    private List<Asignacion> asignaciones;

    // Getters y Setters
}

