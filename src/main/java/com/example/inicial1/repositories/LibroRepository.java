package com.example.inicial1.repositories;

import com.example.inicial1.entities.Autor;
import com.example.inicial1.entities.Libro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {

    @Query(value = "SELECT l FROM Libro l WHERE l.titulo LIKE %:titulo%")
    List<Libro> searchXTitulo(@Param("titulo") String titulo);

    @Query(value = "SELECT l FROM Libro l WHERE l.genero LIKE %:genero%")
    List<Libro> searchXGenero(@Param("genero") String genero);

    @Query(value = "SELECT l FROM Libro l JOIN l.autores a WHERE a.nombre LIKE %:nombreAutor% OR a.apellido LIKE %:nombreAutor%")
    List<Libro> searchXAutor(@Param("nombreAutor") String nombreAutor);

}
