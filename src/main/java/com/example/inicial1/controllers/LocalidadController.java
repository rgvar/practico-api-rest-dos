package com.example.inicial1.controllers;


import com.example.inicial1.controllers.implementations.BaseControllerImplementation;
import com.example.inicial1.entities.Localidad;
import com.example.inicial1.services.implementations.LocalidadServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseControllerImplementation<Localidad, LocalidadServiceImplementation> {


    @GetMapping("/search/denominacion")
    public ResponseEntity<?> searchXDenominacion(@RequestParam String denominacion) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.searchXDenominacion(denominacion));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{ error: " + e.getMessage() + " }");
        }
    }

}
