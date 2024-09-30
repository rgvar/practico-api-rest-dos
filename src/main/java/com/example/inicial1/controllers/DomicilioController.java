package com.example.inicial1.controllers;


import com.example.inicial1.controllers.implementations.BaseControllerImplementation;
import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.services.implementations.DomicilioServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseControllerImplementation<Domicilio, DomicilioServiceImplementation> {

    @GetMapping("/search/calle")
    public ResponseEntity<?> searchXCalle(@RequestParam String calle) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.searchXCalle(calle));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{ error: " + e.getMessage() + " }");
        }
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchXCalleYNumero(@RequestParam String calle, @RequestParam int numero) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.searchXCalleYNumero(calle, numero));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{ error: " + e.getMessage() + " }");
        }
    }

}
