package com.example.inicial1.services;

import com.example.inicial1.entities.Libro;
import com.example.inicial1.repositories.LibroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements BaseService<Libro> {


    @Autowired
    private LibroRepository libroRepository;

    @Override
    @Transactional
    public List<Libro> findAll() throws Exception {
        try {
            return libroRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Libro findById(Long id) throws Exception {
        try {
            Optional<Libro> libroOptional = libroRepository.findById(id);
            if (libroOptional.isPresent()) {
                return libroOptional.get();
            } else {
                throw new Exception("No se encontró el libro con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Libro save(Libro entity) throws Exception {
        try {
            return libroRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Libro update(Long id, Libro entity) throws Exception {
        try {
            Optional<Libro> libroOptional = libroRepository.findById(id);
            if (libroOptional.isPresent()) {
                Libro libro = libroOptional.get();
                libro.setTitulo(entity.getTitulo());
                libro.setFecha(entity.getFecha());
                libro.setGenero(entity.getGenero());
                libro.setPaginas(entity.getPaginas());
                libro.setAutores(entity.getAutores());
                return libro;
            } else {
                throw new Exception("No se encontró el libro con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            Optional<Libro> libroOptional = libroRepository.findById(id);
            if (libroOptional.isPresent()) {
                libroRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No se encontró el libro con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
