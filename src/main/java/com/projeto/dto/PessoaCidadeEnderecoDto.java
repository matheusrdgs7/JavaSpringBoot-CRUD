package com.projeto.dto;

import ENUM.SexoEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaCidadeEnderecoDto {

    private Long pessoaId;

    private String nome;

    private String sobrenome;

    private String email;

    @Enumerated(EnumType.STRING)
    private SexoEnum sexo;

    private Long enderecoId;

    private String cep;

    private String logradouro;

    private String bairro;

    private Long numero;

    private String complemento;

    private Long cidadeId;

    private String nomeCidade;

    private String estado;

    private String pais;
}
