package com.marInc.cursero_platform.services;

import com.marInc.cursero_platform.models.Profesor;
import com.marInc.cursero_platform.repositories.ProfesorRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Data
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    // Obtener todos los profesores
    public List<Profesor> obtenerTodosLosProfesores() {
        return profesorRepository.findAll();
    }

    // Crear o actualizar un profesor
    public Profesor guardarProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    // Obtener un profesor por ID
    public Profesor obtenerProfesorPorId(Long id) {
        return profesorRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Profesor no encontrado con id: " + id));
    }

    // Eliminar un profesor
    public void eliminarProfesor(Long id) {
        profesorRepository.deleteById(id);
    }
}