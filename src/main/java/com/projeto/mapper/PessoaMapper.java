package com.projeto.mapper;

import com.projeto.domain.Pessoa;
import com.projeto.dto.PessoaDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PessoaMapper {
    PessoaDto toDto(Pessoa pessoa);
    Pessoa toEntity (PessoaDto pessoaDto);

    List<PessoaDto> toDtoList(List<Pessoa> pessoaList);
    List<Pessoa> toEntityList(List<PessoaDto> pessoaDtoList);
}