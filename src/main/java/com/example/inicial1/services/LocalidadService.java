package com.example.inicial1.services;

import com.example.inicial1.entities.Localidad;

import java.util.List;

public interface LocalidadService extends BaseService<Localidad, Long> {

    List<Localidad> searchXDenominacion(String denominacion) throws Exception;

}
