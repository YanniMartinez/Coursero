package com.marInc.cursero_platform.repositories;

import com.marInc.cursero_platform.models.Asignacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignacionRepository extends JpaRepository<Asignacion, Long> {
    // Puedes definir métodos adicionales si es necesario
}
