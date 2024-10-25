package com.marInc.cursero_platform.controllers;

import com.marInc.cursero_platform.models.Profesor;
import com.marInc.cursero_platform.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    // Obtener todos los profesores
    @GetMapping
    public ResponseEntity<List<Profesor>> obtenerTodosLosProfesores() {
        List<Profesor> profesores = profesorService.obtenerTodosLosProfesores();
        return ResponseEntity.ok(profesores);
    }

    // Obtener profesor por ID
    @GetMapping("/{id}")
    public ResponseEntity<Profesor> obtenerProfesorPorId(@PathVariable Long id) {
        Profesor profesor = profesorService.obtenerProfesorPorId(id);
        return ResponseEntity.ok(profesor);
    }

    // Crear o actualizar un profesor
    @PostMapping
    public ResponseEntity<Profesor> crearProfesor(@RequestBody Profesor profesor) {
        Profesor nuevoProfesor = profesorService.guardarProfesor(profesor);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoProfesor);
    }

    // Actualizar un profesor
    @PutMapping("/{id}")
    public ResponseEntity<Profesor> actualizarProfesor(@PathVariable Long id, @RequestBody Profesor profesorDetalles) {
        Profesor profesorExistente = profesorService.obtenerProfesorPorId(id);
        profesorExistente.setNombre(profesorDetalles.getNombre());
        profesorExistente.setEmail(profesorDetalles.getEmail());
        // Otros campos que quieras actualizar...

        Profesor profesorActualizado = profesorService.guardarProfesor(profesorExistente);
        return ResponseEntity.ok(profesorActualizado);
    }

    // Eliminar un profesor
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProfesor(@PathVariable Long id) {
        profesorService.eliminarProfesor(id);
        return ResponseEntity.noContent().build();
    }
}
