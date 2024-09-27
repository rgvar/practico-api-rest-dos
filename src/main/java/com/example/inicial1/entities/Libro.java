package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Libro extends BaseEntity {

    private String titulo;
    private LocalDate fecha;
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
