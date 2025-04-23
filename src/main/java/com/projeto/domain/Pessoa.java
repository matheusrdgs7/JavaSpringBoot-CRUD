package com.projeto.domain;

import ENUM.SexoEnum;
import com.projeto.dto.PessoaDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name= "pessoa")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "nome")
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @Column(name= "sobrenome")
    private String sobrenome;

    @Column(name= "email")
    @Email(message = "O e-mail é inválido")
    @NotNull(message = "O e-mail é obrigatorio ")
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name="sexo")
    private SexoEnum sexo;

    @Column(name="endereco_id")
    private Long enderecoId;

    public Pessoa(PessoaDto pessoaDto) {
        this.id = pessoaDto.getId();
        this.nome = pessoaDto.getNome();
        this.sobrenome = pessoaDto.getSobrenome();
        this.email = pessoaDto.getEmail();
        this.sexo = pessoaDto.getSexo();
        this.enderecoId =pessoaDto.getEnderecoId();
    }

}
