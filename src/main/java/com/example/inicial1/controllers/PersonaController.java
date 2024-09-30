package com.example.inicial1.controllers;

import com.example.inicial1.controllers.implementations.BaseControllerImplementation;
import com.example.inicial1.entities.Persona;
import com.example.inicial1.services.implementations.PersonaServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/personas")
public class PersonaController extends BaseControllerImplementation<Persona, PersonaServiceImplementation> {

    @GetMapping("/search/nombre")
    public ResponseEntity<?> search(@RequestParam String nombre) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.searchXNombre(nombre));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("error: " + e.getMessage());
        }
    }

}