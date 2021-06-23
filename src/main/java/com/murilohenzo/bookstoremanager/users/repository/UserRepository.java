package com.murilohenzo.bookstoremanager.users.repository;

import com.murilohenzo.bookstoremanager.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
