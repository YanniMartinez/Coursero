package com.marInc.cursero_platform.models;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Profesor extends Usuario {
    @OneToMany(mappedBy = "profesor")
    private List<Curso> cursos;

    // Getters y Setters

}

