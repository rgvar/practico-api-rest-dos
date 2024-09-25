package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements BaseService<Persona> {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    @Transactional
    public List<Persona> findAll() throws Exception {
        try {
            return personaRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona findById(Long id) throws Exception {
        try {
            Optional<Persona> personaOptional = personaRepository.findById(id);
            if (personaOptional.isPresent()) {
                return personaOptional.get();
            } else {
                throw new Exception("No se encontró ninguna persona con id:" + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona save(Persona entity) throws Exception {
        try {
            return personaRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona update(Long id, Persona entity) throws Exception {
        try {
            Optional<Persona> entityOptional = personaRepository.findById(id);
            if (entityOptional.isPresent()) {
                Persona persona = entityOptional.get();
                persona.setNombre(entity.getNombre());
                persona.setApellido(entity.getApellido());
                persona.setDomicilio(entity.getDomicilio());
                return personaRepository.save(persona);
            } else {
                throw new Exception("Persona no encontrada. ");
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            Optional<Persona> personaOptional = personaRepository.findById(id);
            if (personaOptional.isPresent()) {
                personaRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("Persona no encontrada. ");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
