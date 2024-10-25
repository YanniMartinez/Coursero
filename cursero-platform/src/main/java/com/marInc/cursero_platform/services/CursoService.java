package com.marInc.cursero_platform.services;

import com.marInc.cursero_platform.models.Curso;
import com.marInc.cursero_platform.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CursoService {

    //Dependencia del repository para hacer uso de JPA con inyeccionde dependencias
    @Autowired
    private CursoRepository cursoRepository;

    //Creacion de un curso usando el método save de JPA
    public Curso crearCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    //Haciendo uso del método fin para encontrar en base al ID
    public Curso obtenerCursoPorId(Long id) {
        return cursoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Curso no encontrado"));
    }
}

