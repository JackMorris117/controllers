package com.codeclan.example.homework_service.repository;

import com.codeclan.example.homework_service.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
