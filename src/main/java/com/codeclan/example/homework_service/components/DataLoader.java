package com.codeclan.example.homework_service.components;


import com.codeclan.example.homework_service.models.File;
import com.codeclan.example.homework_service.models.Folder;
import com.codeclan.example.homework_service.models.User;
import com.codeclan.example.homework_service.repository.FileRepository;
import com.codeclan.example.homework_service.repository.FolderRepository;
import com.codeclan.example.homework_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {

        Folder folder1 = new Folder("Example");
        folderRepository.save(folder1);
        User jack = new User("Jack");
        userRepository.save(jack);
        File file1 = new File("Homework", "txt", 100, folder1);
        fileRepository.save(file1);


    }
}
