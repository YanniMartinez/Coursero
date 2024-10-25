package com.marInc.cursero_platform.models;

import com.marInc.cursero_platform.enums.Rol;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data  //Loombooook :D
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol; // Puede ser MAESTRO o ALUMNO

    // Getters y Setters
}
