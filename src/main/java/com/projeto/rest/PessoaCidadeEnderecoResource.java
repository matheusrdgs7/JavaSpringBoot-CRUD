package com.projeto.rest;

import com.projeto.dto.PessoaCidadeEnderecoDto;
import com.projeto.service.PessoaCidadeEnderecoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa/cidade/endereco")
public class PessoaCidadeEnderecoResource {

    @Autowired
    private PessoaCidadeEnderecoService pessoaCidadeEnderecoService;

    @PostMapping("/save")
    public ResponseEntity<PessoaCidadeEnderecoDto> pessoaCidadeEnderecoSave(@Valid @RequestBody PessoaCidadeEnderecoDto pessoaCidadeEnderecoDto){
        return ResponseEntity.ok().body(pessoaCidadeEnderecoService.saveDadosCompletos(pessoaCidadeEnderecoDto));
    }
}
