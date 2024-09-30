package com.example.inicial1.services.implementations;

import com.example.inicial1.entities.Libro;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.LibroRepository;
import com.example.inicial1.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImplementation extends BaseServiceImplementation<Libro, Long> implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImplementation(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Libro> searchXTitulo(String titulo) throws Exception {
        try {
            return libroRepository.searchXTitulo(titulo);

        } catch (Exception e) {
            throw new Exception(e.getMessage());

        }
    }

    @Override
    public List<Libro> searchXGenero(String genero) throws Exception {
        try {
            return libroRepository.searchXGenero(genero);

        } catch (Exception e) {
            throw new Exception(e.getMessage());

        }
    }

    @Override
    public List<Libro> searchXAutor(String nombreAutor) throws Exception {
        try {
            return libroRepository.searchXAutor(nombreAutor);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }



}
