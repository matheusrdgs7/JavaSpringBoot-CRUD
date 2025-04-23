package com.projeto.mapper;

import com.projeto.domain.Cidade;
import com.projeto.dto.CidadeDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CidadeMapper {
    CidadeDto toDto(Cidade cidade);
    Cidade toEntity (CidadeDto cidadeDto);
}
