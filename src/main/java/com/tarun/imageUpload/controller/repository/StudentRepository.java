package com.tarun.imageUpload.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tarun.imageUpload.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
