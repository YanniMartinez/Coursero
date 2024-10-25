package com.marInc.cursero_platform.repositories;

import com.marInc.cursero_platform.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    //Definiendo el método para buscar un profesor por ID
    List<Curso> findByProfesorId(Long profesorId);
}