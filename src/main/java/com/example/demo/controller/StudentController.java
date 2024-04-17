package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import lombok.AllArgsConstructor;
import lombok.Builder;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
	private StudentService service;
	
	@GetMapping
	public List<Student> findAllStudents(){
		return service.findAllStudents();
	}
	@PostMapping("save_student")
	public String saveStudent(@RequestBody Student student) {
		service.saveStudent(student);
		return "Student saved";
	}
	@GetMapping("find_student/{email}")
	public Student findStudentByEmail(@PathVariable("email") String email) {
		return service.findByEmail(email);
	}
	@PutMapping("update_student")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	@DeleteMapping("delete_student/{email}")
	public void deleteStudent(@PathVariable("email") String email) {
		service.deleStudent(email);
	}
}
