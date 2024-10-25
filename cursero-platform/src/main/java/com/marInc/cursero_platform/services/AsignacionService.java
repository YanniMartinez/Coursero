package com.marInc.cursero_platform.services;

import com.marInc.cursero_platform.models.Asignacion;
import com.marInc.cursero_platform.repositories.AsignacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AsignacionService {
    @Autowired
    private AsignacionRepository asignacionRepository;

    public List<Asignacion> obtenerTodasLasAsignaciones() {
        return asignacionRepository.findAll();
    }

    public Asignacion obtenerAsignacionPorId(Long id) {
        return asignacionRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Asignación no encontrada"));
    }

    public Asignacion crearAsignacion(Asignacion asignacion) {
        return asignacionRepository.save(asignacion);
    }

    public Asignacion actualizarAsignacion(Long id, Asignacion detallesAsignacion) {
        Asignacion asignacionExistente = obtenerAsignacionPorId(id);
        asignacionExistente.setTitulo(detallesAsignacion.getTitulo());
        asignacionExistente.setDescripcion(detallesAsignacion.getDescripcion());
        asignacionExistente.setFechaEntrega(detallesAsignacion.getFechaEntrega());
        // Puedes actualizar otras propiedades si es necesario
        return asignacionRepository.save(asignacionExistente);
    }

    public void eliminarAsignacion(Long id) {
        Asignacion asignacionExistente = obtenerAsignacionPorId(id);
        asignacionRepository.delete(asignacionExistente);
    }
}