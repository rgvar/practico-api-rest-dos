package com.example.inicial1.repositories;

import com.example.inicial1.entities.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long> {

    @Query(value = "SELECT l FROM Localidad l WHERE l.denominacion LIKE %:denominacion%")
    List<Localidad> searchXDenominacion(@Param("denominacion") String denominacion);

}
