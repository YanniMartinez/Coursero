package com.marInc.cursero_platform.repositories;

import com.marInc.cursero_platform.models.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
    // Puedes definir métodos adicionales si es necesario
}
