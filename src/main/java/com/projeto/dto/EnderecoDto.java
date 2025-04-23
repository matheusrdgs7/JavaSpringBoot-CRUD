package com.projeto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDto {

    private Long id;

    private String cep;

    private String logradouro;

    private String bairro;

    private Long numero;

    private String complemento;

    private Long cidadeId;

    public EnderecoDto(String cep, String bairro, String logradouro, Long numero, String complemento) {
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }
}

//todo como usar anotações na entidade e no dto, para obrigatoriedade do objeto
//todo criar crud para endereço (criar, atualizar, deletar e buscar)
