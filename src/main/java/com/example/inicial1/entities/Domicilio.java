package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String calle;
    private int numero;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;

}
