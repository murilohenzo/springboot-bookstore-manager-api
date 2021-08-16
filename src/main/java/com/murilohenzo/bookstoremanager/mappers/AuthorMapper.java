package com.murilohenzo.bookstoremanager.mappers;

import com.murilohenzo.bookstoremanager.dtos.AuthorDTO;
import com.murilohenzo.bookstoremanager.entities.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDTO authorDTO);

    AuthorDTO toDTO(Author author);
}