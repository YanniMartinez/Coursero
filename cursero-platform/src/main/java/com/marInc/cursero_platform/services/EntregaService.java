package com.marInc.cursero_platform.services;

import com.marInc.cursero_platform.models.Entrega;
import com.marInc.cursero_platform.repositories.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EntregaService {
    @Autowired
    private EntregaRepository entregaRepository;

    public List<Entrega> obtenerTodasLasEntregas() {
        return entregaRepository.findAll();
    }

    public Entrega obtenerEntregaPorId(Long id) {
        return entregaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Entrega no encontrada"));
    }

    public Entrega crearEntrega(Entrega entrega) {
        return entregaRepository.save(entrega);
    }

    public Entrega actualizarEntrega(Long id, Entrega detallesEntrega) {
        Entrega entregaExistente = obtenerEntregaPorId(id);
        entregaExistente.setArchivoUrl(detallesEntrega.getArchivoUrl());
        entregaExistente.setFechaEntrega(detallesEntrega.getFechaEntrega());
        entregaExistente.setAprobado(detallesEntrega.getAprobado());
        // Puedes actualizar otras propiedades si es necesario
        return entregaRepository.save(entregaExistente);
    }

    public void eliminarEntrega(Long id) {
        Entrega entregaExistente = obtenerEntregaPorId(id);
        entregaRepository.delete(entregaExistente);
    }
}
