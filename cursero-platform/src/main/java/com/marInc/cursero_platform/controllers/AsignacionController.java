package com.marInc.cursero_platform.controllers;

import com.marInc.cursero_platform.models.Asignacion;
import com.marInc.cursero_platform.services.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asignaciones")
public class AsignacionController {
    @Autowired
    private AsignacionService asignacionService;

    @GetMapping
    public List<Asignacion> obtenerTodasLasAsignaciones() {
        return asignacionService.obtenerTodasLasAsignaciones();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asignacion> obtenerAsignacionPorId(@PathVariable Long id) {
        Asignacion asignacion = asignacionService.obtenerAsignacionPorId(id);
        return ResponseEntity.ok(asignacion);
    }

    @PostMapping
    public Asignacion crearAsignacion(@RequestBody Asignacion asignacion) {
        return asignacionService.crearAsignacion(asignacion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Asignacion> actualizarAsignacion(@PathVariable Long id, @RequestBody Asignacion detallesAsignacion) {
        Asignacion asignacionActualizada = asignacionService.actualizarAsignacion(id, detallesAsignacion);
        return ResponseEntity.ok(asignacionActualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAsignacion(@PathVariable Long id) {
        asignacionService.eliminarAsignacion(id);
        return ResponseEntity.noContent().build();
    }
}
