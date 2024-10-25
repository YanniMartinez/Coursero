package com.marInc.cursero_platform.repositories;

import com.marInc.cursero_platform.models.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {
    // Puedes definir métodos adicionales si es necesario
}
