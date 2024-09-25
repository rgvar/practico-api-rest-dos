package com.example.inicial1.controllers;


import com.example.inicial1.entities.Localidad;
import com.example.inicial1.services.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/localidades")
public class LocalidadController {

    @Autowired
    LocalidadService localidadService;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(localidadService.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Error, no se pudo completar la operación. ");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(localidadService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se encontró la localidad con id:" + id);
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Localidad localidad) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(localidadService.save(localidad));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se pudo guardar la localidad. ");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Localidad localidad) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(localidadService.update(id, localidad));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se pudo actualizar la localidad. ");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(localidadService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se pudo remover la localidad. ");
        }
    }
}
