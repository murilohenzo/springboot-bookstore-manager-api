package com.murilohenzo.bookstoremanager.repositories;

import com.murilohenzo.bookstoremanager.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {
}
