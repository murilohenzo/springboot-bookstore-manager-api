package com.murilohenzo.bookstoremanager.repositories;

import com.murilohenzo.bookstoremanager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
