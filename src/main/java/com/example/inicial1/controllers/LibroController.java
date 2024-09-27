package com.example.inicial1.controllers;

import com.example.inicial1.controllers.implementations.BaseControllerImplementation;
import com.example.inicial1.entities.Libro;
import com.example.inicial1.services.implementations.LibroServiceImplementation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libros")
public class LibroController extends BaseControllerImplementation<Libro, LibroServiceImplementation> {

}
