package com.marInc.cursero_platform.controllers;

import com.marInc.cursero_platform.models.Curso;
import com.marInc.cursero_platform.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping("/{id}")
    public ResponseEntity<Curso> getCurso(@PathVariable Long id) {
        return ResponseEntity.ok(cursoService.obtenerCursoPorId(id));
    }

    @PostMapping
    public ResponseEntity<Curso> crearCurso(@RequestBody Curso curso) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoService.crearCurso(curso));
    }
}
