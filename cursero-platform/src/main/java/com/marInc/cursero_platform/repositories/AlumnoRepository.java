package com.marInc.cursero_platform.repositories;

import com.marInc.cursero_platform.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    // Puedes definir métodos adicionales si es necesario
}

