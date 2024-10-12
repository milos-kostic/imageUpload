package com.tarun.imageUpload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tarun.imageUpload.entity.Student;
import com.tarun.imageUpload.service.StudentService;

@RestController
public class HomeController {

	@Autowired
	private StudentService studentService;
	
	// Api for testing
	@GetMapping("/")
	public String home() {
		return "imageUpload app in Spring Boot.";
	}
	
	// Saving to database
	@PostMapping("/saveData")
	public Student saveStudent(@RequestBody Student student) {
		Student savedStudentData = studentService.saveStudentData(student);
		
		// System.out.println(student.getName());
		
		return savedStudentData; // "Student data saved successfully";
	}
}
