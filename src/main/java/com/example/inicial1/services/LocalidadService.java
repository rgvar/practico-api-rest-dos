package com.example.inicial1.services;

import com.example.inicial1.entities.Localidad;
import com.example.inicial1.repositories.LocalidadRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadService implements BaseService<Localidad> {

    @Autowired
    private LocalidadRepository localidadRepository;

    @Override
    @Transactional
    public List<Localidad> findAll() throws Exception {
        try {
            return localidadRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Localidad findById(Long id) throws Exception {
        try {
            Optional<Localidad> localidadOptional = localidadRepository.findById(id);
            if (localidadOptional.isPresent()) {
                return localidadOptional.get();
            } else {
                throw new Exception("No se encontró localidad con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Localidad save(Localidad entity) throws Exception {
        try {
            return localidadRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Localidad update(Long id, Localidad entity) throws Exception {
        try {
            Optional<Localidad> localidadOptional = localidadRepository.findById(id);
            if (localidadOptional.isPresent()) {
                Localidad localidad = localidadOptional.get();
                localidad = entity;
                return localidadRepository.save(localidad);
            } else {
                throw new Exception("No se encontró localidad con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            Optional<Localidad> localidadOptional = localidadRepository.findById(id);
            if (localidadOptional.isPresent()) {
                localidadRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No se encontró localidad con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
