package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public class InMemoryStudentDAO {
	private final List<Student> STUDENTS = new ArrayList<Student>();
	
	public List<Student> findAllStudents() {
		return STUDENTS;
	}

	public Student saveStudent(Student student) {
		STUDENTS.add(student);
		return student;
	}

	public Student updateStudent(Student student) {
		var studentIndex = IntStream.range(0, STUDENTS.size())
				.filter(index -> STUDENTS.get(index).getEmail().equals(student.getEmail()))
				.findFirst().orElse(-1);
		if(studentIndex > -1) {
			STUDENTS.set(studentIndex, student);
			return student;
		}
		return null;
	}

	public Student findByEmail(String email) {
		return STUDENTS.stream().filter(element -> element.getEmail().equals(email)).findFirst().orElse(null);
	}

	public void deleStudent(String email) {
		var student = findByEmail(email);
		STUDENTS.remove(student);
		
	}
}
