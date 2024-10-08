package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {

    List<Persona> searchXNombre(String nombre) throws Exception;
}