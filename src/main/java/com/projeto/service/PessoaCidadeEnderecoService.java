package com.projeto.service;

import com.projeto.dto.CidadeDto;
import com.projeto.dto.EnderecoDto;
import com.projeto.dto.PessoaCidadeEnderecoDto;
import com.projeto.dto.PessoaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PessoaCidadeEnderecoService {

    @Autowired
    private PessoaService pessoaService;

    @Autowired
    private CidadeService cidadeService;

    @Autowired
    private EnderecoService enderecoService;

    public PessoaCidadeEnderecoDto saveDadosCompletos(PessoaCidadeEnderecoDto pessoaCidadeEnderecoDto){
        PessoaDto pessoa = new PessoaDto();
        pessoa.setNome(pessoaCidadeEnderecoDto.getNome());
        pessoa.setSobrenome(pessoaCidadeEnderecoDto.getSobrenome());
        pessoa.setEmail(pessoaCidadeEnderecoDto.getEmail());
        pessoa.setSexo(pessoaCidadeEnderecoDto.getSexo());

        EnderecoDto enderecoDto = new EnderecoDto(pessoaCidadeEnderecoDto.getCep(), pessoaCidadeEnderecoDto.getBairro(),
                                                pessoaCidadeEnderecoDto.getLogradouro(), pessoaCidadeEnderecoDto.getNumero(),
                                                pessoaCidadeEnderecoDto.getComplemento());

        CidadeDto cidadeDto = new CidadeDto(null, pessoaCidadeEnderecoDto.getNomeCidade(), pessoaCidadeEnderecoDto.getEstado(),
                                            pessoaCidadeEnderecoDto.getPais());

        cidadeDto = cidadeService.saveCidade(cidadeDto);

        enderecoDto.setCidadeId(cidadeDto.getId());
        enderecoDto = enderecoService.save(enderecoDto);

        pessoa.setEnderecoId(enderecoDto.getId());
        pessoa = pessoaService.save(pessoa);

        pessoaCidadeEnderecoDto.setEnderecoId(enderecoDto.getId());
        pessoaCidadeEnderecoDto.setCidadeId(cidadeDto.getId());
        pessoaCidadeEnderecoDto.setPessoaId(pessoa.getId());

        return pessoaCidadeEnderecoDto;
    }

}
