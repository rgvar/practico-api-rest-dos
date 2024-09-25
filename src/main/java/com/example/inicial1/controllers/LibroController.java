package com.example.inicial1.controllers;

import com.example.inicial1.entities.Libro;
import com.example.inicial1.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(libroService.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error, no se pudo completar la operación findAll. ");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(libroService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Error, no se pudo encontrar el libro. ");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Libro libro) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(libroService.save(libro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error, no se pudo guardar el libro. ");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Libro libro) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(libroService.update(id, libro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Error, no se pudo actualizar el libro. ");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(libroService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Error, no se pudo eliminar el libro. ");
        }
    }

}
