package com.example.inicial1.services.implementations;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.PersonaRepository;
import com.example.inicial1.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImplementation extends BaseServiceImplementation<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImplementation(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }

}
