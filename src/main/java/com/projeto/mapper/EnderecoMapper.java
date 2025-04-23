package com.projeto.mapper;

import com.projeto.domain.Endereco;
import com.projeto.dto.EnderecoDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {
    EnderecoDto toDto(Endereco endereco);
    Endereco toEntity (EnderecoDto enderecoDto);
}
