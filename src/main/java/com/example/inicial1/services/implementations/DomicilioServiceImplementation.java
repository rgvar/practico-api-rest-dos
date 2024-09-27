package com.example.inicial1.services.implementations;


import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.DomicilioRepository;
import com.example.inicial1.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImplementation extends BaseServiceImplementation<Domicilio, Long> implements DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImplementation(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }

}
