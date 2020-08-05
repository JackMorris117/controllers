package com.codeclan.example.homework_service;

import com.codeclan.example.homework_service.models.File;
import com.codeclan.example.homework_service.models.Folder;
import com.codeclan.example.homework_service.models.User;
import com.codeclan.example.homework_service.repository.FileRepository;
import com.codeclan.example.homework_service.repository.FolderRepository;
import com.codeclan.example.homework_service.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HomeworkServiceApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolderThenSave(){
		Folder folder1 = new Folder("Example");
		folderRepository.save(folder1);
		File file1 = new File("Homework", "txt", 100, folder1);
		fileRepository.save(file1);

	}
	@Test
	public void createFileAndFolderAndUserThenSave(){
		Folder folder1 = new Folder("Example");
		folderRepository.save(folder1);
		File file1 = new File("Homework", "txt", 100, folder1);
		fileRepository.save(file1);

		User jack = new User("Jack");
		userRepository.save(jack);

		jack.addFolder(folder1);
		folder1.addFile(file1);
		userRepository.save(jack);



	}

}
