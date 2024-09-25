package com.example.inicial1.dtos;


import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class AutorDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String biografia;
}
