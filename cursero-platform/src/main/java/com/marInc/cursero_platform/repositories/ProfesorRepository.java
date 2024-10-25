package com.marInc.cursero_platform.repositories;

import com.marInc.cursero_platform.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
    Profesor findById(String id);
    Profesor findByEmail(String email);
}