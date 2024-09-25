package com.example.inicial1.controllers;


import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {

    @Autowired
    private DomicilioService domicilioService;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(domicilioService.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Error, no se pudo completar la operación findAll. ");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(domicilioService.findById(id));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Error, no se pudo encontrar el domicilio. ");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Domicilio domicilio) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(domicilioService.save(domicilio));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error, no se pudo guardar el domicilio. ");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Domicilio domicilio) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(domicilioService.update(id, domicilio));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error, no se pudo actualizar el domicilio. ");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(domicilioService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error, no se pudo remover el domicilio. ");
        }
    }

}
