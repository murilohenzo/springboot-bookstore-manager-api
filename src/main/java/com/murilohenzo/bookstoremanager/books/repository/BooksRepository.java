package com.murilohenzo.bookstoremanager.books.repository;

import com.murilohenzo.bookstoremanager.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {
}
