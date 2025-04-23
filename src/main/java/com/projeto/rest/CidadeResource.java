package com.projeto.rest;

import com.projeto.dto.CidadeDto;
import com.projeto.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadeResource {

    @Autowired
    private CidadeService cidadeService;

    @PostMapping("/cidade")
    public ResponseEntity<CidadeDto> saveCidade(@RequestBody CidadeDto cidadeDto){
        return ResponseEntity.ok().body(cidadeService.saveCidade(cidadeDto));
    }

    @GetMapping("/cidade/{id}")
    public ResponseEntity<Void> deleteCidade(@PathVariable Long id) throws Exception{
        cidadeService.deleteCidade(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/cidade")
    public ResponseEntity<CidadeDto> update(@RequestBody CidadeDto cidadeDto) throws Exception {
        return ResponseEntity.ok().body(cidadeService.updateCidade(cidadeDto));
    }

    @GetMapping("/cidade")
    public ResponseEntity<List<CidadeDto>> buscarTodasCidades() throws Exception {
        return ResponseEntity.ok(cidadeService.buscarTodasCidades());
    }

    @GetMapping("/cidade/{idCidade}")
    public ResponseEntity<Optional<CidadeDto>> buscarCidadePorID(@PathVariable Long idCidade){
        return ResponseEntity.ok(cidadeService.buscarCidadePorID(idCidade));
    }
}
