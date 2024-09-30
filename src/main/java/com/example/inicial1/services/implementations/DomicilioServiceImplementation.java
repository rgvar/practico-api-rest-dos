package com.example.inicial1.services.implementations;


import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.DomicilioRepository;
import com.example.inicial1.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioServiceImplementation extends BaseServiceImplementation<Domicilio, Long> implements DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImplementation(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }


    @Override
    public List<Domicilio> searchXCalle(String calle) throws Exception {
        try {
            return domicilioRepository.searchXCalle(calle);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Domicilio searchXCalleYNumero(String calle, int numero) throws Exception{
        try {
            return domicilioRepository.searchXCalleYNumero(calle, numero);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
