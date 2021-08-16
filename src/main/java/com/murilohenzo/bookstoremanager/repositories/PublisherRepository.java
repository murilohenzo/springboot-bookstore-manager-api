package com.murilohenzo.bookstoremanager.repositories;

import com.murilohenzo.bookstoremanager.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
