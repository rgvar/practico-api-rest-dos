package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="libro_autor",
            joinColumns = @JoinColumn(name="libro_id"),
            inverseJoinColumns = @JoinColumn(name="autor_id"))
    @Builder.Default
    private Set<Autor> autores = new HashSet<>();

}
