package com.marInc.cursero_platform.services;

import com.marInc.cursero_platform.models.Calificacion;
import com.marInc.cursero_platform.repositories.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CalificacionService {
    @Autowired
    private CalificacionRepository calificacionRepository;

    public List<Calificacion> obtenerTodasLasCalificaciones() {
        return calificacionRepository.findAll();
    }

    public Calificacion obtenerCalificacionPorId(Long id) {
        return calificacionRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Calificación no encontrada"));
    }

    public Calificacion crearCalificacion(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    public Calificacion actualizarCalificacion(Long id, Calificacion detallesCalificacion) {
        Calificacion calificacionExistente = obtenerCalificacionPorId(id);
        calificacionExistente.setNota(detallesCalificacion.getNota());
        calificacionExistente.setComentario(detallesCalificacion.getComentario());
        // Puedes actualizar otras propiedades si es necesario
        return calificacionRepository.save(calificacionExistente);
    }

    public void eliminarCalificacion(Long id) {
        Calificacion calificacionExistente = obtenerCalificacionPorId(id);
        calificacionRepository.delete(calificacionExistente);
    }
}
