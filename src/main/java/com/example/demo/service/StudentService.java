package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

public interface StudentService {
	List<Student> findAllStudents();
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	Student findByEmail(String email);
	void deleStudent(String email);
}
