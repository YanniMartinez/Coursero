package com.marInc.cursero_platform.controllers;

import com.marInc.cursero_platform.models.Entrega;
import com.marInc.cursero_platform.services.EntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entregas")
public class EntregaController {
    @Autowired
    private EntregaService entregaService;

    @GetMapping
    public List<Entrega> obtenerTodasLasEntregas() {
        return entregaService.obtenerTodasLasEntregas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entrega> obtenerEntregaPorId(@PathVariable Long id) {
        Entrega entrega = entregaService.obtenerEntregaPorId(id);
        return ResponseEntity.ok(entrega);
    }

    @PostMapping
    public Entrega crearEntrega(@RequestBody Entrega entrega) {
        return entregaService.crearEntrega(entrega);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Entrega> actualizarEntrega(@PathVariable Long id, @RequestBody Entrega detallesEntrega) {
        Entrega entregaActualizada = entregaService.actualizarEntrega(id, detallesEntrega);
        return ResponseEntity.ok(entregaActualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEntrega(@PathVariable Long id) {
        entregaService.eliminarEntrega(id);
        return ResponseEntity.noContent().build();
    }
}
