package com.example.inicial1.controllers;

import com.example.inicial1.controllers.implementations.BaseControllerImplementation;
import com.example.inicial1.entities.Persona;
import com.example.inicial1.services.implementations.PersonaServiceImplementation;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/personas")
public class PersonaController extends BaseControllerImplementation<Persona, PersonaServiceImplementation> {


}