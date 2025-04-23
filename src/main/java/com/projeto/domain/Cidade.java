package com.projeto.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "cidade")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cidade {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "nome")
    private String nome;

    @Column(name= "estado")
    private String estado;

    @Column(name= "pais")
    private String pais;
}
