package com.marInc.cursero_platform.services;

import com.marInc.cursero_platform.models.Curso;
import com.marInc.cursero_platform.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> obtenerTodosLosCursos() {
        return cursoRepository.findAll();
    }

    public Curso obtenerCursoPorId(Long id) {
        return cursoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Curso no encontrado"));
    }

    public Curso crearCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso actualizarCurso(Long id, Curso detallesCurso) {
        Curso cursoExistente = obtenerCursoPorId(id);
        cursoExistente.setNombre(detallesCurso.getNombre());
        cursoExistente.setDescripcion(detallesCurso.getDescripcion());
        cursoExistente.setProfesor(detallesCurso.getProfesor()); // Puede que quieras actualizar el profesor
        // Puedes actualizar otras propiedades si es necesario
        return cursoRepository.save(cursoExistente);
    }

    public void eliminarCurso(Long id) {
        Curso cursoExistente = obtenerCursoPorId(id);
        cursoRepository.delete(cursoExistente);
    }
}

