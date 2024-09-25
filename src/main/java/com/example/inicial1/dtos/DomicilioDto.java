package com.example.inicial1.dtos;

import com.example.inicial1.entities.Localidad;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class DomicilioDto {
    private Long id;
    private String calle;
    private int numero;
    private Localidad localidad;
}
