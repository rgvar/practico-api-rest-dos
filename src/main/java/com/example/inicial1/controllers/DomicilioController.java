package com.example.inicial1.controllers;


import com.example.inicial1.controllers.implementations.BaseControllerImplementation;
import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.services.implementations.DomicilioServiceImplementation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseControllerImplementation<Domicilio, DomicilioServiceImplementation> {

}
