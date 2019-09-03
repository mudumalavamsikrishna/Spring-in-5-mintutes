package com.vamsi.SecureApp.repository;

import com.vamsi.SecureApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String Username);
}
