package com.example.inicial1.controllers;

import com.example.inicial1.controllers.implementations.BaseControllerImplementation;
import com.example.inicial1.entities.Autor;
import com.example.inicial1.services.implementations.AutorServiceImplementation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autores")
public class AutorController extends BaseControllerImplementation<Autor, AutorServiceImplementation> {

}
