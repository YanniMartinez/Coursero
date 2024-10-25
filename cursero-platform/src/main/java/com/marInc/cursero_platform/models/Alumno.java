package com.marInc.cursero_platform.models;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Alumno extends Usuario {

    private String matricula;
    private String carrera;

    @ManyToMany(mappedBy = "alumnos")
    private List<Curso> cursos;

    @OneToMany(mappedBy = "alumno")
    private List<Asignacion> asignaciones;

    // Getters y Setters NO NEEDED CAUSE LOOMBOK FILL THE DETAILS

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
}
