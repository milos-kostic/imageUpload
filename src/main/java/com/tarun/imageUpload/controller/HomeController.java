package com.tarun.imageUpload.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tarun.imageUpload.entity.Student;
import com.tarun.imageUpload.service.StudentService;

@RestController
public class HomeController {

	@Autowired
	private StudentService studentService;
	
	public static String uploadDirectory = 
			System.getProperty("user.dir") + "/src/main/webapp/images";	
	
	// Api for testing
	@GetMapping("/")
	public String home() {
		return "imageUpload app in Spring Boot.";
	}
	
	// Saving to database
	@PostMapping("/saveData")
	// public Student saveStudent(@RequestBody Student student, 
	public Student saveStudent(@ModelAttribute Student student,
			@RequestParam ("image") MultipartFile file) throws IOException {
		
		String originalFilename = file.getOriginalFilename();
		Path fileNameAndPath = Paths.get(uploadDirectory, originalFilename);
		Files.write(fileNameAndPath, file.getBytes());
		student.setProfileImage(originalFilename);
		
		Student savedStudentData = studentService.saveStudentData(student);
		
		// System.out.println(student.getName());
		
		return savedStudentData; // "Student data saved successfully";
	}
}
