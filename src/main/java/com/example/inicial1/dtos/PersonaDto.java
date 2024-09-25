package com.example.inicial1.dtos;


import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.entities.Libro;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class PersonaDto {
    private Long id;
    private String nombre;
    private String apellido;
    private Domicilio domicilio;
    private Set<Libro> libros;
}
