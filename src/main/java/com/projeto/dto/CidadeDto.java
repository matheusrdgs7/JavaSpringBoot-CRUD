package com.projeto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CidadeDto {

    private Long id;

    private String nome;

    private String estado;

    private String pais;
}
