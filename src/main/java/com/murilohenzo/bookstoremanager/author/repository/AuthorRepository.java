package com.murilohenzo.bookstoremanager.author.repository;

import com.murilohenzo.bookstoremanager.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
