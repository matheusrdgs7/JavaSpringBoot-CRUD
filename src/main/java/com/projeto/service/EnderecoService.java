package com.projeto.service;

import com.projeto.domain.Endereco;
import com.projeto.dto.EnderecoDto;
import com.projeto.mapper.EnderecoMapper;
import com.projeto.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private EnderecoMapper enderecoMapper;

    @Transactional
    public EnderecoDto save(EnderecoDto enderecoDto){
        Endereco endereco = enderecoMapper.toEntity(enderecoDto);
        endereco = enderecoRepository.save(endereco);
        return  enderecoMapper.toDto(endereco);
    }

    public void delete(Long idEndereco) throws Exception {
        if(!enderecoRepository.existsById(idEndereco)){
            throw new Exception("ID do endereco não encontrado!!");
        }
        enderecoRepository.deleteById(idEndereco);
    }

    public Optional<EnderecoDto> buscarEnderecoPorID(Long idEndereco){
        return enderecoRepository.findById(idEndereco).map(enderecoMapper::toDto);
    }

    public List<EnderecoDto> buscarTodos () throws Exception{
        List<Endereco> enderecoList = enderecoRepository.findAll();
        if(enderecoList.isEmpty()){
            return new ArrayList<>();
        }
        return enderecoList.stream().map(enderecoMapper::toDto).toList();
    }

    public EnderecoDto update(EnderecoDto enderecoDto) throws Exception {
        Endereco endereco = enderecoMapper.toEntity(enderecoDto);
        if(enderecoDto.getId() != null){
            if(enderecoRepository.existsById(enderecoDto.getId())){
               endereco = enderecoRepository.save(endereco);
            }else{
                throw new Exception("ID do usuario não encontrado!!");
            }
        }else{
            throw new Exception("ID não informado !!");
        }
        return enderecoMapper.toDto(endereco);
    }
}
