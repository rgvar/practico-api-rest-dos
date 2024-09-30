package com.example.inicial1.controllers;

import com.example.inicial1.controllers.implementations.BaseControllerImplementation;
import com.example.inicial1.entities.Libro;
import com.example.inicial1.services.implementations.LibroServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController extends BaseControllerImplementation<Libro, LibroServiceImplementation> {

    @GetMapping("/search/titulo")
    public ResponseEntity<?> searchXTitulo(@RequestParam String titulo) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.searchXTitulo(titulo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{ error: " + e.getMessage() + " }");
        }
    }

    @GetMapping("/search/genero")
    public ResponseEntity<?> searchXGenero(@RequestParam String genero) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.searchXGenero(genero));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{ error: " + e.getMessage() + " }");
        }
    }

    @GetMapping("/search/autor")
    public ResponseEntity<?> searchXAutor(@RequestParam String nombreAutor) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.searchXAutor(nombreAutor));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{ error: " + e.getMessage() + " }");
        }
    }


}
