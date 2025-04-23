package com.projeto.rest;

import com.projeto.dto.PessoaDto;
import com.projeto.service.PessoaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PessoaResource {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/pessoa")
    public ResponseEntity<PessoaDto> save(@RequestBody @Valid PessoaDto pessoaDto){
        return ResponseEntity.ok().body(pessoaService.save(pessoaDto));
    }

    @PostMapping("/pessoa-list")
    public ResponseEntity<List<PessoaDto>> saveAll(@RequestBody @Valid List<PessoaDto> pessoaDtoList){
        return ResponseEntity.ok().body(pessoaService.saveAll(pessoaDtoList));
    }

    @GetMapping("/pessoa/{idPessoa}")
    public ResponseEntity<Optional<PessoaDto>> buscarPessoaPorID(@PathVariable Long idPessoa){
        return ResponseEntity.ok(pessoaService.buscarPessoaPorID(idPessoa));
    }

    @PutMapping("/pessoa")
    public ResponseEntity<PessoaDto> update(@RequestBody PessoaDto pessoaDto) throws Exception {
        return ResponseEntity.ok().body(pessoaService.update(pessoaDto));
    }

    @DeleteMapping("/pessoa/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception {
        pessoaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/pessoa")
    public ResponseEntity<List<PessoaDto>> buscarTodos() throws Exception {
        return ResponseEntity.ok(pessoaService.buscarTodos());
    }

}
