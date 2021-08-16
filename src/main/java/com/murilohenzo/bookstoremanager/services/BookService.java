package com.murilohenzo.bookstoremanager.services;

import com.murilohenzo.bookstoremanager.entities.Book;
import com.murilohenzo.bookstoremanager.repositories.BooksRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BooksRepository booksRepository;

    public BookService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> findAll() {
        return booksRepository.findAll();
    }

}
