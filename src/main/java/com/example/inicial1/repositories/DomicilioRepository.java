package com.example.inicial1.repositories;

import com.example.inicial1.entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long> {

    @Query(value = "SELECT d FROM Domicilio d WHERE d.calle LIKE %:calle%")
    List<Domicilio> searchXCalle(@Param("calle") String calle);

    @Query(value = "SELECT d FROM Domicilio d WHERE d.calle LIKE %:calle% AND d.numero = :numero")
    Domicilio searchXCalleYNumero(@Param("calle") String calle, @Param("numero") int numero);

}
