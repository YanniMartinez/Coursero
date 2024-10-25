package com.marInc.cursero_platform.models;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Alumno extends Usuario {
    @ManyToMany(mappedBy = "alumnos")
    private List<Curso> cursos;

    @OneToMany(mappedBy = "alumno")
    private List<Asignacion> asignaciones;

    // Getters y Setters NO NEEDED CAUSE LOOMBOK FILL THE DETAILS

}
