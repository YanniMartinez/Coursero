package com.marInc.cursero_platform.services;

import com.marInc.cursero_platform.models.Alumno;
import com.marInc.cursero_platform.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> obtenerTodosLosAlumnos() {
        return alumnoRepository.findAll();
    }

    public Alumno obtenerAlumnoPorId(Long id) {
        return alumnoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Alumno no encontrado"));
    }

    public Alumno crearAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    public Alumno actualizarAlumno(Long id, Alumno detallesAlumno) {
        Alumno alumnoExistente = obtenerAlumnoPorId(id);
        alumnoExistente.setNombre(detallesAlumno.getNombre());
        alumnoExistente.setEmail(detallesAlumno.getEmail());
        alumnoExistente.setMatricula(detallesAlumno.getMatricula());
        alumnoExistente.setCarrera(detallesAlumno.getCarrera());
        // Puedes actualizar otras propiedades si es necesario
        return alumnoRepository.save(alumnoExistente);
    }

    public void eliminarAlumno(Long id) {
        Alumno alumnoExistente = obtenerAlumnoPorId(id);
        alumnoRepository.delete(alumnoExistente);
    }
}