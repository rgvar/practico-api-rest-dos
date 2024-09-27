package com.example.inicial1.controllers;


import com.example.inicial1.controllers.implementations.BaseControllerImplementation;
import com.example.inicial1.entities.Localidad;
import com.example.inicial1.services.implementations.LocalidadServiceImplementation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseControllerImplementation<Localidad, LocalidadServiceImplementation> {


}
