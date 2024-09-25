package com.example.inicial1.dtos;


import com.example.inicial1.entities.Autor;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class LibroDto {
    private Long id;
    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;
    private Autor autor;
}
