package com.example.inicial1.controllers;

import com.example.inicial1.controllers.implementations.BaseControllerImplementation;
import com.example.inicial1.entities.Autor;
import com.example.inicial1.services.implementations.AutorServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autores")
public class AutorController extends BaseControllerImplementation<Autor, AutorServiceImplementation> {

    @GetMapping("/search/nombre")
    public ResponseEntity<?> searchXNombre(@RequestParam String nombre) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.searchXNombre(nombre));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{ error: " + e.getMessage() + " }");
        }


    }

}
