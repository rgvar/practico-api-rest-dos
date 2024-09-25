package com.example.inicial1.controllers;

import com.example.inicial1.entities.Autor;
import com.example.inicial1.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(autorService.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Error, no se pudo completar la operación. ");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(autorService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Error, no se encontró el autor. ");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Autor autor) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(autorService.save(autor));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error, no se pudo guardar el autor. ");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Autor autor) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(autorService.update(id, autor));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Error, no se pudo actualizar el autor. ");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(autorService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Error, no se pudo eliminar el autor. ");
        }
    }

}
