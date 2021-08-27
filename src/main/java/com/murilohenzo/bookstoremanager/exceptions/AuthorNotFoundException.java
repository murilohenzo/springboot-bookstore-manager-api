package com.murilohenzo.bookstoremanager.exceptions;

import javax.persistence.EntityNotFoundException;

public class AuthorNotFoundException extends EntityNotFoundException {
    public AuthorNotFoundException(Long id) {
        super("Author with id %s not exists!");
    }
}
