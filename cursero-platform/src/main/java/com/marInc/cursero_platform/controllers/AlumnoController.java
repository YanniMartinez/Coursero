package com.marInc.cursero_platform.controllers;

import com.marInc.cursero_platform.models.Alumno;
import com.marInc.cursero_platform.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> obtenerTodosLosAlumnos() {
        return alumnoService.obtenerTodosLosAlumnos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> obtenerAlumnoPorId(@PathVariable Long id) {
        Alumno alumno = alumnoService.obtenerAlumnoPorId(id);
        return ResponseEntity.ok(alumno);
    }

    @PostMapping
    public Alumno crearAlumno(@RequestBody Alumno alumno) {
        return alumnoService.crearAlumno(alumno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Alumno> actualizarAlumno(@PathVariable Long id, @RequestBody Alumno detallesAlumno) {
        Alumno alumnoActualizado = alumnoService.actualizarAlumno(id, detallesAlumno);
        return ResponseEntity.ok(alumnoActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAlumno(@PathVariable Long id) {
        alumnoService.eliminarAlumno(id);
        return ResponseEntity.noContent().build();
    }
}
