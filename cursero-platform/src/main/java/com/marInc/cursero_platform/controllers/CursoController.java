package com.marInc.cursero_platform.controllers;

import com.marInc.cursero_platform.models.Curso;
import com.marInc.cursero_platform.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> obtenerTodosLosCursos() {
        return cursoService.obtenerTodosLosCursos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> obtenerCursoPorId(@PathVariable Long id) {
        Curso curso = cursoService.obtenerCursoPorId(id);
        return ResponseEntity.ok(curso);
    }

    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso) {
        return cursoService.crearCurso(curso);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> actualizarCurso(@PathVariable Long id, @RequestBody Curso detallesCurso) {
        Curso cursoActualizado = cursoService.actualizarCurso(id, detallesCurso);
        return ResponseEntity.ok(cursoActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCurso(@PathVariable Long id) {
        cursoService.eliminarCurso(id);
        return ResponseEntity.noContent().build();
    }
}
