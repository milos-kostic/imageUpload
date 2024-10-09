package com.tarun.imageUpload.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarun.imageUpload.controller.repository.StudentRepository;
import com.tarun.imageUpload.entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student saveStudentData(Student student) {

		Student savedStudent = studentRepository.save(student);
		return savedStudent;
		
	}
}
