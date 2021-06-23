package com.murilohenzo.bookstoremanager.publishers.repository;

import com.murilohenzo.bookstoremanager.publishers.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
