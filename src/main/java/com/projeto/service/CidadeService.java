package com.projeto.service;

import com.projeto.domain.Cidade;
import com.projeto.dto.CidadeDto;
import com.projeto.mapper.CidadeMapper;
import com.projeto.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private CidadeMapper cidadeMapper;

    public CidadeDto saveCidade(CidadeDto cidadeDto){
        Cidade cidade = cidadeMapper.toEntity(cidadeDto);
        cidade = cidadeRepository.save(cidade);
        return cidadeMapper.toDto(cidade);
    }

    public void deleteCidade(Long idCidade) throws Exception {
        if(!cidadeRepository.existsById(idCidade)){
            throw new Exception("ID da cidade não encontrado!!");
        }
        cidadeRepository.deleteById(idCidade);
    }

    public Optional<CidadeDto> buscarCidadePorID(Long idCidade){
        return cidadeRepository.findById(idCidade).map(cidadeMapper::toDto);
    }

    public List<CidadeDto> buscarTodasCidades () throws Exception{
        List<Cidade> cidadeList = cidadeRepository.findAll();
        if(cidadeList.isEmpty()){
            return new ArrayList<>();
        }
        return cidadeList.stream().map(cidadeMapper::toDto).toList();
    }

    public CidadeDto updateCidade(CidadeDto cidadeDto) throws Exception {
        Cidade cidade = cidadeMapper.toEntity(cidadeDto);
        if(cidadeDto.getId() != null){
            if(cidadeRepository.existsById(cidadeDto.getId())){
                cidade = cidadeRepository.save(cidade);
            }else{
                throw new Exception("ID da cidade não encontrado!!");
            }
        }else{
            throw new Exception("ID não informado !!");
        }
        return cidadeMapper.toDto(cidade);
    }
}
