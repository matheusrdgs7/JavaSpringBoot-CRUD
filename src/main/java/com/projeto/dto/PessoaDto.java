package com.projeto.dto;

import ENUM.SexoEnum;
import com.projeto.domain.Pessoa;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDto {

    private Long id;

    private String nome;

    private String sobrenome;

    private String email;

    @Enumerated(EnumType.STRING)
    private SexoEnum sexo;

    private Long enderecoId;

    public PessoaDto(Pessoa pessoa) {
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.sobrenome = pessoa.getSobrenome();
        this.email = pessoa.getEmail();
        this.sexo = pessoa.getSexo();
        this.enderecoId = pessoa.getEnderecoId();
    }
}

//todo como usar anotações na entidade e no dto, para obrigatoriedade do objeto
