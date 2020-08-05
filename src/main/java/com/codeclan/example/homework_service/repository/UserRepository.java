package com.codeclan.example.homework_service.repository;
import com.codeclan.example.homework_service.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
