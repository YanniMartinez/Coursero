package com.marInc.cursero_platform.controllers;

import com.marInc.cursero_platform.models.Calificacion;
import com.marInc.cursero_platform.services.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calificaciones")
public class CalificacionController {
    @Autowired
    private CalificacionService calificacionService;

    @GetMapping
    public List<Calificacion> obtenerTodasLasCalificaciones() {
        return calificacionService.obtenerTodasLasCalificaciones();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calificacion> obtenerCalificacionPorId(@PathVariable Long id) {
        Calificacion calificacion = calificacionService.obtenerCalificacionPorId(id);
        return ResponseEntity.ok(calificacion);
    }

    @PostMapping
    public Calificacion crearCalificacion(@RequestBody Calificacion calificacion) {
        return calificacionService.crearCalificacion(calificacion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Calificacion> actualizarCalificacion(@PathVariable Long id, @RequestBody Calificacion detallesCalificacion) {
        Calificacion calificacionActualizada = calificacionService.actualizarCalificacion(id, detallesCalificacion);
        return ResponseEntity.ok(calificacionActualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCalificacion(@PathVariable Long id) {
        calificacionService.eliminarCalificacion(id);
        return ResponseEntity.noContent().build();
    }
}
