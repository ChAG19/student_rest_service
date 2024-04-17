package com.example.demo.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.InMemoryStudentDAO;
import com.example.demo.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InMemoryStudentServiseImpl implements StudentService{

	private final InMemoryStudentDAO repository;
	@Override
	public List<Student> findAllStudents() {
		return repository.findAllStudents();
	}

	@Override
	public Student saveStudent(Student student) {
		return repository.saveStudent(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return repository.updateStudent(student);
	}

	@Override
	public Student findByEmail(String email) {
		return repository.findByEmail(email);
	}

	@Override
	public void deleStudent(String email) {
		repository.deleStudent(email);
		
	}
	
}
