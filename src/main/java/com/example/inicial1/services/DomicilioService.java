package com.example.inicial1.services;

import com.example.inicial1.entities.Domicilio;

import java.util.List;

public interface DomicilioService extends BaseService<Domicilio, Long> {

    List<Domicilio> searchXCalle(String calle) throws Exception;

    Domicilio searchXCalleYNumero(String calle, int numero) throws Exception;

}
