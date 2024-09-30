package com.example.inicial1.services;

import com.example.inicial1.entities.Libro;

import java.util.List;

public interface LibroService extends BaseService<Libro, Long>{

    List<Libro> searchXTitulo(String titulo) throws Exception;

    List<Libro> searchXGenero(String genero) throws Exception;

    List<Libro> searchXAutor(String nombreAutor) throws Exception;


}
