package com.murilohenzo.bookstoremanager.exceptions;

import javax.persistence.EntityExistsException;

public class AuthorAlreadyExistsException extends EntityExistsException {
    public AuthorAlreadyExistsException(String name) {
        super("User with name %s already exists");
    }
}
