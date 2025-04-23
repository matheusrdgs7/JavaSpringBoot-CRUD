package com.projeto.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name= "endereco")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "cep")
    private String cep;

    @Column(name= "logradouro")
    private String logradouro;

    @Column(name= "bairro")
    private String bairro;

    @Column(name= "numero" )
    private Long numero;

    @Column(name= "complemento")
    private String complemento;

    @Column(name= "cidade_id")
    private Long cidadeId;
}


