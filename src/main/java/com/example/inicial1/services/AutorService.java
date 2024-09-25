package com.example.inicial1.services;

import com.example.inicial1.entities.Autor;
import com.example.inicial1.repositories.AutorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService implements BaseService<Autor> {

    @Autowired
    private AutorRepository autorRepository;


    @Override
    @Transactional
    public List<Autor> findAll() throws Exception {
        try {
            return autorRepository.findAll();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Autor findById(Long id) throws Exception {
        try {
            Optional<Autor> autorOptional = autorRepository.findById(id);
            if (autorOptional.isPresent()) {
                return autorOptional.get();
            } else {
                throw new Exception("No se encontró el autor con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Autor save(Autor entity) throws Exception {
        try {
            return autorRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Autor update(Long id, Autor entity) throws Exception {
        try {
            Optional<Autor> autorOptional = autorRepository.findById(id);
            if (autorOptional.isPresent()) {
                Autor autor = autorOptional.get();
                autor.setApellido(entity.getApellido());
                autor.setNombre(entity.getNombre());
                autor.setBiografia(entity.getBiografia());
                return autor;
            } else {
                throw new Exception("No se encontró el autor con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            Optional<Autor> autorOptional = autorRepository.findById(id);
            if (autorOptional.isPresent()) {
                autorRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No se encontró el autor con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
