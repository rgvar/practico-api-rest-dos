package com.example.inicial1.repositories;

import com.example.inicial1.entities.Autor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {

    @Query(value = "SELECT a FROM Autor a WHERE a.nombre LIKE %:nombre% OR a.apellido LIKE %:nombre%")
    List<Autor> searchXNombre(@Param("nombre") String nombre);

}
