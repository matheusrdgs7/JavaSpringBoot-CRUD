package com.projeto.rest;

import com.projeto.dto.EnderecoDto;
import com.projeto.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnderecoResource {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/endereco")
    public ResponseEntity<EnderecoDto> save(@RequestBody EnderecoDto enderecoDto){
        return ResponseEntity.ok().body(enderecoService.save(enderecoDto));
    }

    @GetMapping("/endereco/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception{
            enderecoService.delete(id);
            return ResponseEntity.noContent().build();
    }

    @PutMapping("/endereco")
    public ResponseEntity<EnderecoDto> update(@RequestBody EnderecoDto enderecoDto) throws Exception {
        return ResponseEntity.ok().body(enderecoService.update(enderecoDto));
    }

    @GetMapping("/endereco")
    public ResponseEntity<List<EnderecoDto>> buscarTodos() throws Exception {
        return ResponseEntity.ok(enderecoService.buscarTodos());
    }

    @GetMapping("/endereco/{idEndereco}")
    public ResponseEntity<Optional<EnderecoDto>> buscarEnderecoPorID(@PathVariable Long idEndereco){
        return ResponseEntity.ok(enderecoService.buscarEnderecoPorID(idEndereco));
    }
}
