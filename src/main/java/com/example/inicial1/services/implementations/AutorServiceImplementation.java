package com.example.inicial1.services.implementations;


import com.example.inicial1.entities.Autor;
import com.example.inicial1.repositories.AutorRepository;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImplementation extends BaseServiceImplementation<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImplementation(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Autor> searchXNombre(String nombre) throws Exception {
        try {
            return autorRepository.searchXNombre(nombre);

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }


    }

}
