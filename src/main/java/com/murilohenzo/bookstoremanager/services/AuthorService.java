package com.murilohenzo.bookstoremanager.services;

import com.murilohenzo.bookstoremanager.dtos.AuthorDTO;
import com.murilohenzo.bookstoremanager.entities.Author;
import com.murilohenzo.bookstoremanager.exceptions.AuthorAlreadyExistsException;
import com.murilohenzo.bookstoremanager.mappers.AuthorMapper;
import com.murilohenzo.bookstoremanager.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final static AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public Optional<Author> findById(Long id) {
        return authorRepository.findById(id);
    }

    public AuthorDTO create(AuthorDTO authorDTO) {
        existsAuthor(authorDTO.getName());
        Author authorToCreate = authorMapper.toModel(authorDTO);
        Author createdAuthor = authorRepository.save(authorToCreate);
        return authorMapper.toDTO(createdAuthor);
    }

    private void existsAuthor(String authorName) {
        authorRepository.findByName(authorName)
                .ifPresent(author -> {
                    throw new AuthorAlreadyExistsException(authorName);
                });
    }
}
