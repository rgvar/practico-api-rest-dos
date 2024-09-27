package com.example.inicial1.services.implementations;

import com.example.inicial1.entities.Libro;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.LibroRepository;
import com.example.inicial1.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImplementation extends BaseServiceImplementation<Libro, Long> implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImplementation(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }

}
