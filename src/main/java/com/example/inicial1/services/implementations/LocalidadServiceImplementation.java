package com.example.inicial1.services.implementations;


import com.example.inicial1.entities.Localidad;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.LocalidadRepository;
import com.example.inicial1.services.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImplementation extends BaseServiceImplementation<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImplementation(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

}
