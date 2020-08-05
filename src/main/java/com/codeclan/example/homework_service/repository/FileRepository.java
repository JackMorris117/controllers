package com.codeclan.example.homework_service.repository;

import com.codeclan.example.homework_service.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
