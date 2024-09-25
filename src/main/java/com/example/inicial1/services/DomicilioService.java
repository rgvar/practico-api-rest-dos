package com.example.inicial1.services;

import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.repositories.DomicilioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomicilioService implements BaseService<Domicilio> {

    @Autowired
    private DomicilioRepository domicilioRepository;

    @Override
    @Transactional
    public List<Domicilio> findAll() throws Exception {
        try {
            return domicilioRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Domicilio findById(Long id) throws Exception {
        try {
            Optional<Domicilio> domicilioOptional = domicilioRepository.findById(id);
            if (domicilioOptional.isPresent()) {
                return domicilioOptional.get();
            } else {
                throw new Exception("No se encontró el domicilio con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Domicilio save(Domicilio entity) throws Exception {
        try {
            return domicilioRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Domicilio update(Long id, Domicilio entity) throws Exception {
        try {
            Optional<Domicilio> domicilioOptional = domicilioRepository.findById(id);
            if (domicilioOptional.isPresent()) {
                Domicilio domicilio = domicilioOptional.get();
                domicilio = entity;
                return domicilioRepository.save(domicilio);
            } else {
                throw new Exception("No se encontró el domicilio con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            Optional<Domicilio> domicilioOptional = domicilioRepository.findById(id);
            if (domicilioOptional.isPresent()) {
                domicilioRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No se encontró el domicilio con id:" + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
