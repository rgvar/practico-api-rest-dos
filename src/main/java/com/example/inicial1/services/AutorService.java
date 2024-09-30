package com.example.inicial1.services;

import com.example.inicial1.entities.Autor;

import java.util.List;

public interface AutorService extends BaseService<Autor, Long>{

    List<Autor> searchXNombre(String nombre) throws Exception;

}
