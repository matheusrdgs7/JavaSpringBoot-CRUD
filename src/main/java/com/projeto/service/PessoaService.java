package com.projeto.service;

import com.projeto.domain.Pessoa;
import com.projeto.dto.PessoaDto;
import com.projeto.mapper.PessoaMapper;
import com.projeto.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private PessoaMapper pessoaMapper;

//    public PessoaService(PessoaRepository pessoaRepository, PessoaMapper pessoaMapper) {
//        this.pessoaRepository = pessoaRepository;
//        this.pessoaMapper = pessoaMapper;
//    }

    public Optional<PessoaDto> buscarPessoaPorID(Long idPessoa){
        return pessoaRepository.findById(idPessoa).map(pessoaMapper::toDto);
    }

    public PessoaDto save(PessoaDto pessoaDto){
        Pessoa pessoa = pessoaMapper.toEntity(pessoaDto);
        pessoa = pessoaRepository.save(pessoa);
        return pessoaMapper.toDto(pessoa);
    }

    public List<PessoaDto> saveAll (List<PessoaDto> pessoaDtoList){
        List<Pessoa> pessoaList = pessoaMapper.toEntityList(pessoaDtoList);
        pessoaList = pessoaRepository.saveAll(pessoaList);
        return pessoaMapper.toDtoList(pessoaList);
    }

    public PessoaDto update(PessoaDto pessoaDto) throws Exception {
        Pessoa pessoa = new Pessoa(pessoaDto);
        if(pessoaDto.getId() != null){
            if(pessoaRepository.existsById(pessoaDto.getId())){
                pessoa = pessoaRepository.save(pessoa);
            }else{
                throw new Exception("ID do usuario não encontrado!!");
            }
        }else{
            throw new Exception("ID não informado !!");
        }
        return new PessoaDto(pessoa);
    }

    public void delete(Long idPessoa) throws Exception {
        if(!pessoaRepository.existsById(idPessoa)){
            throw new Exception("ID do usuario não encontrado!!");
        }
        pessoaRepository.deleteById(idPessoa);
    }

    public List<PessoaDto> buscarTodos() throws Exception {
        List<Pessoa> pessoaList = pessoaRepository.findAll();
        if (pessoaList.isEmpty()) {
            //throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Lista de pessoas está vazia"); //sem precisar colocar o return
            return new ArrayList<>();
        }
        //todo oque fazer quando a lista for vazia
        return pessoaList.stream().map(PessoaDto::new).toList();
    }
    //todo como usar o dbeaver com o banco h2
}
